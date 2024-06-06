package inteli.algoritmo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DiGraph representa um grafo direcionado.
 */
public class DiGraph {
    private int V; // Número de vértices
    private int E; // Número de arestas
    private Bag<Edge>[] adj; // Lista de adjacência

    /**
     * Constrói um grafo direcionado com o número especificado de vértices.
     * @param V o número de vértices no grafo
     * @throws IllegalArgumentException se o número de vértices for negativo
     */
    public DiGraph(int V) {
        if (V < 0) {
            throw new IllegalArgumentException("Número de vértices deve ser um inteiro não negativo");
        }
        this.V = V;
        this.E = 0;
        adj = (Bag<Edge>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Edge>();
        }
    }

    /**
     * Retorna o número de vértices no grafo.
     * @return o número de vértices no grafo
     */
    public int V() {
        return V;
    }

    /**
     * Retorna o número de arestas no grafo.
     * @return o número de arestas no grafo
     */
    public int E() {
        return E;
    }

    /**
     * Adiciona uma aresta ao grafo.
     * @param e a aresta a ser adicionada
     */
    /**
     * Adiciona uma aresta ao grafo.
     * @param e a aresta a ser adicionada
     */
    public void addEdge(Edge e) {
        int v = e.getOrigem();
        adj[v].add(e); // Adiciona a aresta apenas na lista de adjacência do vértice de origem
        E++;
    }


    /**
     * Retorna um iterável das arestas adjacentes ao vértice especificado.
     * @param v o vértice
     * @return um iterável das arestas adjacentes ao vértice especificado
     */
    public Iterable<Edge> adj(int v) {
        return adj[v];
    }

    /**
     * Retorna um iterável de todas as arestas no grafo.
     * @return um iterável de todas as arestas no grafo
     */
    public Iterable<Edge> edges() {
        Bag<Edge> lista = new Bag<Edge>();
        for (int v = 0; v < V; v++) {
            for (Edge e : adj(v)) {
                if (e.getDestino() != v) {
                    lista.add(e);
                }
            }
        }
        return lista;
    }

    /**
     * Retorna uma representação em string do grafo.
     * @return uma representação em string do grafo
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int v = 0; v < V; v++) {
            stringBuilder.append("Vértice ").append(v).append(": ");
            for (Edge e : adj[v]) {
                stringBuilder.append(e.getDestino()).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    /**
     * Converte os dados do grafo em uma representação JSON.
     * Cada vértice é representado como um nó de origem, com seus vértices adjacentes como alvos.
     * O formato JSON resultante é uma lista de mapas, onde cada mapa representa uma aresta.
     *
     * @return Uma lista de mapas representando as arestas do grafo no formato JSON.
     */
    public List<Map<String, Object>> toJson() {
        List<Map<String, Object>> listEdges = new ArrayList<>();
        for (int v = 0; v < V(); v++) {
            List<Integer> destinations = new ArrayList<>();
            List<Double> capacidades = new ArrayList<>();
            List<Double> fluxo = new ArrayList<>();
            for (Edge e : adj[v]) {
                destinations.add(e.getDestino());
                capacidades.add(e.getCapacidade());
                fluxo.add(e.getFluxo());
            }
            Map<String, Object> obj = new HashMap<>();
            obj.put("target", destinations);
            obj.put("source", v);
            obj.put("capacities", capacidades);
            obj.put("flow", fluxo);
            listEdges.add(obj);
        }
        return listEdges;
    }


    /**
     * Retorna o grau de incidência do vértice especificado.
     * @param v o vértice
     * @return o grau de incidência do vértice especificado
     */
    public int inDegree(int v) {
        int degree = 0;
        for (int i = 0; i < V; i++) {
            for (Edge e : adj(i)) {
                if (e.getDestino() == v) {
                    degree++;
                }
            }
        }
        return degree;
    }

    /**
     * Retorna uma lista de vértices com grau de incidência zero.
     * @return uma lista de vértices com grau de incidência zero
     */
    public List<Integer> verticesWithZeroInDegree() {
        List<Integer> verticesWithZeroInDegree = new ArrayList<>();
        int[] inDegrees = new int[V];
        for (int v = 0; v < V; v++) {
            for (Edge e : adj[v]) {
                inDegrees[e.getDestino()]++;
            }
        }
        for (int v = 0; v < V; v++) {
            if (inDegrees[v] == 0) {
                verticesWithZeroInDegree.add(v);
            }
        }
        return verticesWithZeroInDegree;
    }

    /**
     * Retorna o grau de saída do vértice especificado.
     * @param v o vértice
     * @return o grau de saída do vértice especificado
     */
    public int outDegree(int v) {
        return adj[v].size();
    }

    /**
     * Retorna uma lista de vértices com grau de saída zero.
     * @return uma lista de vértices com grau de saída zero
     */
    public List<Integer> verticesWithZeroOutDegree() {
        List<Integer> verticesWithZeroOutDegree = new ArrayList<>();
        for (int v = 0; v < V; v++) {
            if (adj[v].size() == 0) {
                verticesWithZeroOutDegree.add(v);
            }
        }
        return verticesWithZeroOutDegree;
    }

    /**
     * Método principal (main) para testar a classe DiGraph.
     * @param args os argumentos de linha de comando (não utilizado)
     */
    public static void main(String[] args) {
        // Testa a classe DiGraph
        DiGraph grafo = new DiGraph(5);
        Edge aresta1 = new Edge(0, 1, 10);
        Edge aresta2 = new Edge(1, 2, 10);
        Edge aresta3 = new Edge(2, 3, 10);
        Edge aresta4 = new Edge(3, 4, 10);
        grafo.addEdge(aresta1);
        grafo.addEdge(aresta2);
        grafo.addEdge(aresta3);
        grafo.addEdge(aresta4);

        System.out.println("Número de vértices: " + grafo.V());
        System.out.println("Número de arestas: " + grafo.E());

        List<Map<String, Object>> lista = grafo.toJson();
        for (Map<String, Object> item : lista) {
            System.out.print(item.get("source") + ": ");
            System.out.println(item.get("target"));
            System.out.println(item.get("capacities"));
            System.out.println(item.get("flow"));
        }

        System.out.println("Arestas adjacentes do vértice 2:");
        for (Edge e : grafo.adj(2)) {
            System.out.println(e);
        }

        System.out.println("Todas as arestas no grafo:");
        for (Edge e : grafo.edges()) {
            System.out.println(e);
        }
    }
}