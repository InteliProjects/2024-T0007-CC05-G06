// Mapeamento de tipo para cor
export const nodeTypeColorMap = {
  cliente: '#2e86c1',
  porto: '#16a085',
  entreposto: '#f1c40f',
  fornecedores: '#e74c3c',
  usina_beneficiamento: '#9b59b6',
};

export const nodeStyle = {
  label: 'data(label)',
  'text-valign': 'center',
  'text-halign': 'center',
  'background-color': 'data(color)',
  color: '#fff',
  'width': 'mapData(weight, 0, 10, 20, 60)',
  'height': 'mapData(weight, 0, 10, 20, 60)',
  'border-width': 2,
  'border-color': '#2980b9',
};

export const edgeStyle = {
  'curve-style': 'bezier',
  'target-arrow-shape': 'triangle',
  'line-color': '#888',
  'target-arrow-color': '#888',
  'width': 2,
};

export const labelStyle = {
  color: '#888',
  'text-outline-color': '#000',
  'text-outline-width': 1,
  'text-outline-opacity': 1,
};

export const highlightedEdgeStyle = {
  'line-color': '#ff5733',
  'target-arrow-color': '#ff5733',
  'width': 4,
};


