// SearchBar.jsx
import React, { useState } from 'react';

const SearchBar = ({ data}) => {
  const [query, setQuery] = useState('');
  const [filteredData, setFilteredData] = useState([]);
  const [selectedItem, setSelectedItem] = useState(null);

  const [sourceData, setSourceData] = useState([]);
  const [selectedData, setSelectedData] = useState(null);

  const handleInputChange = (event) => {
    const value = event.target.value;
    setQuery(value);
    // const filtered = data?.message.filter(item =>
    //   item.source.toLowerCase().includes(value.toLowerCase())
    // );
    // setFilteredData(filtered);

    const filtered = (data[0]?.message).filter(item =>
      item.descricao.toString().toLowerCase().includes(value.toLowerCase())
    );
    setFilteredData(filtered);
  };

  

  const handleItemClick = (item) => {
    setSelectedItem(item);
  };

  const handleClosePopup = () => {
    setSelectedItem(null);
  };


  return (
    <div className="search-bar">
      <input
        type="text"
        placeholder="Digite o id do nó"
        value={query}
        onChange={handleInputChange}
      />
      {query && (
        <ul className="search-items">
          {filteredData.map((item, index) => (
            <li key={index} onClick={() => handleItemClick(item)} className="search-item">
              {item.descricao}
            </li>
          ))}
        </ul>
      )}
      {selectedItem && (
        <div className="popup">
          <div className="popup-content">
            <h2>{selectedItem.descricao}</h2>
            <p>ID: {selectedItem.id}</p>
            <p>ID Elo: {selectedItem.idElo}</p>
            <p>Tipo: {selectedItem.tipo}</p>
            <button onClick={handleClosePopup}>Fechar</button>
          </div>
        </div>
      )}
    </div>
  );
};

export default SearchBar;