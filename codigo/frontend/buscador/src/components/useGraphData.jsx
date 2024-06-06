import { useState, useEffect, useRef } from 'react';

const useGraphData = (nodesUrl, edgesUrl) => {
  const [elements, setElements] = useState([]);
  const [dataReady, setDataReady] = useState(false);
  const [error, setError] = useState(null);
  const isMounted = useRef(false);

  useEffect(() => {
    isMounted.current = true;

    const fetchData = async () => {
      try {
        const nodesResponse = await fetch(nodesUrl);
        const nodesData = await nodesResponse.json();

        const edgesResponse = await fetch(edgesUrl);
        const edgesData = await edgesResponse.json();

        const nodeIds = new Set(nodesData.message.map(node => String(node.id)));

        const formattedNodes = nodesData.message.map(node => ({
          data: {
            id: String(node.id),
            label: node.descricao.trim(),
            tipo: node.tipo,
            weight: 1, // Mantenha ou ajuste conforme necessário
          }
        }));

        const formattedEdges = edgesData.message.flatMap(edge => (
          edge.target.map(targetId => {
            if (nodeIds.has(String(edge.source)) && nodeIds.has(String(targetId))) {
              return {
                data: {
                  id: `e-${edge.source}-${targetId}`,
                  source: String(edge.source),
                  target: String(targetId),
                }
              };
            }
            return null;
          }).filter(edge => edge !== null)
        ));

        if (isMounted.current) {
          setElements([...formattedNodes, ...formattedEdges]);
          setDataReady(true);
        }
      } catch (err) {
        if (isMounted.current) {
          setError(err);
        }
      }
    };

    fetchData();

    return () => {
      isMounted.current = false;
    };
  }, [nodesUrl, edgesUrl]);

  return { elements, dataReady, error };
};

export default useGraphData;
