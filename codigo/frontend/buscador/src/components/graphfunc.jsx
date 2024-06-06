import React, { useState } from 'react';
import CytoscapeComponent from 'react-cytoscapejs';
import useGraphData from './useGraphData';
import {
  nodeStyle,
  edgeStyle,
  labelStyle,
  highlightedEdgeStyle,
  nodeTypeColorMap,
} from './graphStyles';

const GraphDiagram = () => {
  const { elements: loadedElements, dataReady, error } = useGraphData(
    'http://localhost:8080/nodes',
    'http://localhost:8080/edges'
  );

  async function fetchData() {
    try {
      const response = await fetch('http://localhost:8080/flow-edges');
      if (!response.ok) {
        throw new Error('Erro ao buscar dados');
      }
      const data = await response.json();
      return data.message;
    } catch (error) {
      console.error('Erro ao buscar dados:', error);
      return null;
    }
  }

  const [maxFlowResult, setMaxFlowResult] = useState(null);
  const [calculatingMaxFlow, setCalculatingMaxFlow] = useState(false);

  const downloadCSV = async () => {
    try {
      const dataFlow = await fetchData();
      const csvRows = ['source,target,capacity,flow'];
  
      dataFlow.forEach((element) => {
        if (element && element.source !== undefined) {
          const source = element.source;
          const target = Array.isArray(element.target) ? element.target.join('/') : element.target;
          const capacities = Array.isArray(element.capacities) ? element.capacities.join('/') : element.capacities;
          const flow = Array.isArray(element.flow) ? element.flow.join('/') : element.flow;
          const row = `${source},${target},${capacities},${flow}`;
          csvRows.push(row);
        }
      });
  
      const csvString = csvRows.join('\n');
      const blob = new Blob([csvString], { type: 'text/csv;charset=utf-8;' });
      const url = URL.createObjectURL(blob);
      const a = document.createElement('a');
      a.setAttribute('href', url);
      a.setAttribute('download', 'graphData.csv');
      document.body.appendChild(a);
      a.click();
      document.body.removeChild(a);
    } catch (error) {
      console.error('Erro ao baixar CSV:', error);
    }
  };
  

  const calculateMaxFlow = async () => {
    try {
      setCalculatingMaxFlow(true);
      const response = await fetch('http://localhost:8080/flow');
      const data = await response.json();
      setMaxFlowResult(data.fluxo);
    } catch (error) {
      console.error('Erro ao calcular o fluxo máximo:', error);
    } finally {
      setCalculatingMaxFlow(false);
    }
  };

  if (error) {
    return <div>Erro ao carregar dados: {error.message}</div>;
  }

  if (!dataReady) {
    return <div>Carregando dados...</div>;
  }

  return (
    <>
      <button
        onClick={calculateMaxFlow}
        disabled={calculatingMaxFlow}
        className="button-custom"
      >
        {calculatingMaxFlow ? 'Calculando...' : 'Calcular Fluxo Máximo'}
      </button>
      <button onClick={downloadCSV} className="button-custom">
        Download CSV
      </button>
      {maxFlowResult && (
        <div>Resultado do Fluxo Máximo: {maxFlowResult} toneladas</div>
      )}

      <CytoscapeComponent
        elements={loadedElements.map(element => ({
          ...element,
          data: {
            ...element.data,
            // Aplica a cor com base no tipo do nó
            color: nodeTypeColorMap[element.data.tipo] || '#2e86c1',
          },
        }))}
        style={{ width: '100%', height: '800px' }}
        layout={{
          name: 'grid',
          idealEdgeLength: (edge) => 120,
          nodeRepulsion: (node) => 10000,
          nodeOverlap: 10,
          refresh: 20,
          fit: true,
          padding: 30,
          avoidOverlapPadding: 10,
        }}
        stylesheet={[
          { selector: 'node', style: nodeStyle },
          { selector: 'edge', style: edgeStyle },
          { selector: 'node[label]', style: labelStyle },
          { selector: 'edge.highlighted', style: highlightedEdgeStyle },
        ]}
        cy={(cy) => {
          cy.nodes().forEach((node) => {
            let weight = node.connectedEdges().length;
            node.data('weight', weight);
            node.style({
              width: 60 + node.data('weight') * 2,
              height: 60 + node.data('weight') * 2,
            });
          });
          cy.on('tap', 'node', function (evt) {
            const node = evt.target;
            cy.elements().removeClass('highlighted');
            node.connectedEdges().addClass('highlighted');
          });
          cy.on('tap', function (evt) {
            if (evt.target === cy) {
              cy.elements().removeClass('highlighted');
            }
          });
        }}
      />
    </>
  );
};

export default GraphDiagram;
