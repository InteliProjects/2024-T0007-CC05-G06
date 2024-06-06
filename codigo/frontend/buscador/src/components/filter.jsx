import React, { useEffect, useState } from 'react';

function useFilterNodes() {
    const [nodes, setNodes] = useState([]);
    const [error, setError] = useState(null);

    useEffect(() => {
        fetch('http://localhost:8080/nodes')
            .then(response => response.json())
            .then(data => {
                if (Array.isArray(data.message)) {
                    setNodes(data.message);
                } else {
                    setError(new Error('Os dados recebidos não estão no formato esperado'));
                }
            })
            .catch(error => {
                setError(error);
            });
    }, []);

    return { nodes, error };
}

export default useFilterNodes;
