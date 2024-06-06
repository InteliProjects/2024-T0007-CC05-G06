package inteli.cc6;

import static org.junit.Assert.assertEquals;

import inteli.algoritmo.*;
import org.junit.Test;

/**
 * TesteAlgoritmo contém métodos de teste para os algoritmos de fluxo máximo.
 */
public class AlgoritmoTest {

    /**
     * Testa o algoritmo de Dinic para encontrar o fluxo máximo em um grafo.
     */
    @Test
    public void testFluxoMaximoDinic() {
        // Criar um grafo de fluxo
        FlowNetwork G = new FlowNetwork(4);
        G.addEdge(new FlowEdge(0, 1, 2));
        G.addEdge(new FlowEdge(0, 2, 3));
        G.addEdge(new FlowEdge(1, 2, 1));
        G.addEdge(new FlowEdge(1, 3, 1));
        G.addEdge(new FlowEdge(2, 3, 2));

        // Calcular o fluxo máximo
        Dinic dinic = new Dinic(G, 0, 3);
        double maxFlow = dinic.valor();

        // O fluxo máximo deve ser 3
        assertEquals(3.0, maxFlow, 0.001);
    }

    /**
     * Testa o algoritmo de Dinic para encontrar o fluxo máximo em um grafo pequeno.
     */
    @Test
    public void testFluxoMaximoGrafoPequenoDinic() {
        // Criar um grafo de fluxo pequeno
        FlowNetwork G = new FlowNetwork(2);
        G.addEdge(new FlowEdge(0, 1, 5));

        // Calcular o fluxo máximo
        Dinic dinic = new Dinic(G, 0, 1);
        double maxFlow = dinic.valor();

        // O fluxo máximo deve ser 5
        assertEquals(5.0, maxFlow, 0.001);
    }

    /**
     * Testa o algoritmo de Dinic para encontrar o fluxo máximo em um grafo vazio.
     */
    @Test
    public void testFluxoMaximoGrafoVazioDinic() {
        // Criar um grafo de fluxo vazio
        FlowNetwork G = new FlowNetwork(3);

        // Calcular o fluxo máximo
        Dinic dinic = new Dinic(G, 0, 2);
        double maxFlow = dinic.valor();

        // O fluxo máximo deve ser 0 em um grafo vazio
        assertEquals(0.0, maxFlow, 0.001);
    }

    /**
     * Testa o algoritmo de Ford-Fulkerson para encontrar o fluxo máximo em um grafo pequeno.
     */
    @Test
    public void testFluxoMaximoFordFulkersonGrafoPequeno() {
        // Criar um grafo de fluxo pequeno
        DiGraph G = new DiGraph(2);
        G.addEdge(new Edge(0, 1, 5));

        // Calcular o fluxo máximo usando Ford-Fulkerson
        FordFulkerson fordFulkerson = new FordFulkerson(G, 0, 1);
        double maxFlow = fordFulkerson.valor();

        // O fluxo máximo deve ser 5
        assertEquals(5.0, maxFlow, 0.001);
    }

    /**
     * Testa o algoritmo de Ford-Fulkerson para encontrar o fluxo máximo em um grafo vazio.
     */
    @Test
    public void testFluxoMaximoFordFulkersonGrafoVazio() {
        // Criar um grafo de fluxo vazio
        DiGraph G = new DiGraph(3);

        // Calcular o fluxo máximo usando Ford-Fulkerson
        FordFulkerson fordFulkerson = new FordFulkerson(G, 0, 2);
        double maxFlow = fordFulkerson.valor();

        // O fluxo máximo deve ser 0 em um grafo vazio
        assertEquals(0.0, maxFlow, 0.001);
    }

    /**
     * Testa o algoritmo de Ford-Fulkerson para encontrar o fluxo máximo em um grafo completo.
     */
    @Test
    public void testFluxoMaximoFordFulkersonGrafoCompleto() {
        // Criar um grafo completo
        int numVertices = 5;
        DiGraph G = new DiGraph(numVertices);
        for (int i = 0; i < numVertices; i++) {
            for (int j = i + 1; j < numVertices; j++) {
                G.addEdge(new Edge(i, j, 10)); // Arestas com capacidade 10
                G.addEdge(new Edge(j, i, 10)); // Arestas com capacidade 10 (bidirecionais)
            }
        }

        // Calcular o fluxo máximo usando Ford-Fulkerson
        FordFulkerson fordFulkerson = new FordFulkerson(G, 0, numVertices - 1);
        double maxFlow = fordFulkerson.valor();

        // O fluxo máximo em um grafo completo com arestas de capacidade 10 deve ser (numVertices - 1) * 10
        assertEquals((numVertices - 1) * 10.0, maxFlow, 0.001);
    }


}
