package inteli.algoritmo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FlowNetwork representa uma rede de fluxo em um grafo direcionado.
 */
public class FlowNetwork {
    private static final String NOVA_LINHA = System.getProperty("line.separator");

    private final int V; // Número de vértices
    private int E; // Número de arestas
    private Bag<FlowEdge>[] adj; // Lista de adjacência

    /**
     * Constrói uma rede de fluxo com o número especificado de vértices.
     * @param V o número de vértices na rede de fluxo
     * @throws IllegalArgumentException se o número de vértices for negativo
     */
    public FlowNetwork(int V) {
        if (V < 0) throw new IllegalArgumentException("O número de vértices em um Grafo deve ser não negativo");
        this.V = V;
        this.E = 0;
        adj = (Bag<FlowEdge>[]) new Bag[V];
        for (int v = 0; v < V; v++)
            adj[v] = new Bag<FlowEdge>();
    }

    /**
     * Retorna o número de vértices na rede de fluxo.
     * @return o número de vértices na rede de fluxo
     */
    public int V() {
        return V;
    }

    /**
     * Retorna o número de arestas na rede de fluxo.
     * @return o número de arestas na rede de fluxo
     */
    public int E() {
        return E;
    }

    /**
     * Valida se o vértice fornecido está dentro dos limites válidos.
     * @param v o vértice a ser validado
     * @throws IllegalArgumentException se o vértice estiver fora dos limites válidos
     */
    private void validateVertex(int v) {
        if (v < 0 || v >= V)
            throw new IllegalArgumentException("vértice " + v + " não está entre 0 e " + (V-1));
    }

    /**
     * Adiciona uma aresta à rede de fluxo.
     * @param e a aresta a ser adicionada
     */
    public void addEdge(FlowEdge e) {
        int v = e.from();
        int w = e.to();
        validateVertex(v);
        validateVertex(w);
        adj[v].add(e);
        adj[w].add(e);
        E++;
    }

    /**
     * Retorna um iterável das arestas adjacentes ao vértice especificado.
     * @param v o vértice
     * @return um iterável das arestas adjacentes ao vértice especificado
     */
    public Iterable<FlowEdge> adj(int v) {
        validateVertex(v);
        return adj[v];
    }

    /**
     * Retorna um iterável de todas as arestas na rede de fluxo.
     * @return um iterável de todas as arestas na rede de fluxo
     */
    public Iterable<FlowEdge> edges() {
        Bag<FlowEdge> lista = new Bag<FlowEdge>();
        for (int v = 0; v < V; v++)
            for (FlowEdge e : adj(v))
                lista.add(e);
        return lista;
    }

    /**
     * Retorna uma representação em string da rede de fluxo.
     * @return uma representação em string da rede de fluxo
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " " + E + NOVA_LINHA);
        for (int v = 0; v < V; v++) {
            s.append(v + ":  ");
            for (FlowEdge e : adj[v]) {
                if (e.to() != v) s.append(e + "  ");
            }
            s.append(NOVA_LINHA);
        }
        return s.toString();
    }

    /**
     * Converte a rede de fluxo para um formato JSON representando os vértices e as arestas,
     * incluindo informações sobre os destinos, capacidades e fluxos de cada aresta.
     * @return uma lista de mapas representando as arestas em formato JSON
     */

    public List<Map<String, Object>> toJson() {
        List<Map<String, Object>> listEdges = new ArrayList<>();
        for (int v = 0; v < V(); v++) {
            List<Integer> destinations = new ArrayList<>();
            List<Double> capacidades = new ArrayList<>();
            List<Double> fluxo = new ArrayList<>();
            for (FlowEdge e : adj[v]) {
                destinations.add(e.to());
                capacidades.add(e.capacity());
                fluxo.add(e.flow());
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
     * Método principal (main) para testar a classe FlowNetwork.
     * @param args os argumentos de linha de comando (não utilizado)
     */
    public static void main(String[] args) {
        // Teste da classe FlowNetwork
    }
}