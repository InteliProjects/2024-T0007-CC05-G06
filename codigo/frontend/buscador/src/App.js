// App.jsx
import React, { useEffect, useState } from 'react';
import axios from 'axios';
import "./style.css";
import GraphComponent from "./components/graphfunc";

import SearchBar from './components/searchBar';

import useFilterNodes from "./components/filter";


function Tab({ title, isActive, onClick }) {
  return (
    <li className={`tab ${isActive ? "active" : ""}`} onClick={onClick}>
      {title}
    </li>
  );
}



function Dropdown() {
  const [isOpen, setIsOpen] = useState(false);
  const [opcaoSelecionada, setOpcaoSelecionada] = useState("Caminho");

  return (
    <div className="dropdown-button" onClick={() => setIsOpen(!isOpen)}>
      <div className="button-custom">
        <span>{opcaoSelecionada}</span>
      </div>
      <div className={`dropdown-menu ${isOpen ? "show" : ""}`}>
        <button className="filter-button" onClick={() => setOpcaoSelecionada('Caminho')}>Caminho</button>
        <button className="filter-button" onClick={() => setOpcaoSelecionada('Nó')}>Nó</button>
      </div>
    </div>
  );
}

function App() {
  const { nodes, error } = useFilterNodes();
  const [activeTab, setActiveTab] = useState("USINA");


  const [edges, setEdges] = useState([]);

  useEffect(() => {
    const fetchEdges = async () => {
      try {
        // Realiza a requisição GET para o endpoint
        const response = await axios.get('http://localhost:8080/flow-edges');
        // Atualiza o estado com os dados recebidos
        setEdges(response.data);
      } catch (error) {
        // Trata o caso de erro na requisição
        console.error('Houve um erro na requisição:', error);
      }
    };

    fetchEdges();
  }, []);

  const [nodes_p, setNodes] = useState([]);

  useEffect(() => {
    const fetchEdges = async () => {
      try {
        // Realiza a requisição GET para o endpoint
        const response = await axios.get('http://localhost:8080/nodes');
        // Atualiza o estado com os dados recebidos
        setNodes(response.data);
      } catch (error) {
        // Trata o caso de erro na requisição
        console.error('Houve um erro na requisição:', error);
      }
    };

    fetchEdges();
  }, []);

  const tabsContent = []

  const filteredNodes = nodes.filter(node => {
    if (activeTab === "USINA") {
      return ['usina beneficiamento', 'usina pelotizacao', 'usina briqueto'].includes(node.tipo);
    } else if (activeTab === "PÁTIO") {
      return node.tipo === 'entreposto';
    } else if (activeTab === "PORTO") {
      return node.tipo === 'porto';
    }
    return false;
  });


  if (error) {
    return <div>Error: {error.message}</div>;
  }

  return (
    <div className="container">
      <div className="graph-container">
        <h1>Visualização</h1>
        <GraphComponent />
      </div>
      <div className="sidebar">
      <SearchBar data={[nodes_p, edges]} />
        <div className="content-box">
          <div className="mini-tabs">
            <ul>
              {["USINA", "PÁTIO", "PORTO"].map((tab) => (
                <Tab
                  key={tab}
                  title={tab}
                  isActive={activeTab === tab}
                  onClick={() => setActiveTab(tab)}
                />
              ))}
            </ul>
            <div className="tab-content">
              {filteredNodes.map(node => <div key={node.id}>{node.descricao}</div>)}
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

  
export default App;
