package inteli.algoritmo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

/**
 * FordFulkerson representa o algoritmo Ford-Fulkerson para encontrar o fluxo máximo em uma rede de fluxo.
 */
public class FordFulkerson {
    private static final int EPSILON_PONTO_FLUTUANTE = 0;
    private final int V;          // número de vértices
    private boolean[] marcado;     // marcado[v] = true se existe um caminho s->v no grafo residual
    private FlowEdge[] edgeTo;    // edgeTo[v] = última aresta no caminho mais curto residual s->v
    private double valor;         // valor atual do fluxo máximo
    private FlowNetwork fluxoAtualizado; // Estrutura auxiliar para armazenar o fluxo atualizado

    /**
     * Inicializa o algoritmo Ford-Fulkerson e encontra o fluxo máximo em uma rede de fluxo.
     * @param G a rede de fluxo
     * @param s o vértice de origem
     * @param t o vértice de destino
     * @throws IllegalArgumentException se o vértice de origem for igual ao vértice de destino ou se o fluxo inicial for inviável
     */
    public FordFulkerson(FlowNetwork G, int s, int t) {
        V = G.V();
        validar(s);
        validar(t);
        if (s == t) throw new IllegalArgumentException("Fonte é igual ao sumidouro");
        if (!éViável(G, s, t)) throw new IllegalArgumentException("O fluxo inicial é inviável");

        // enquanto existir um caminho aumentador, utilize-o
        valor = excesso(G, t);
        while (temCaminhoAumentador(G, s, t)) {

            // calcular a capacidade de gargalo
            double gargalo = Double.POSITIVE_INFINITY;
            for (int v = t; v != s; v = edgeTo[v].other(v)) {
                gargalo = Math.min(gargalo, edgeTo[v].residualCapacityTo(v));
            }

            // aumentar o fluxo
            for (int v = t; v != s; v = edgeTo[v].other(v)) {
                edgeTo[v].addResidualFlowTo(v, gargalo);
            }

            valor += gargalo;
        }
        fluxoAtualizado = G;

        // verificar condições de otimalidade
        assert verificar(G, s, t);
    }

    /**
     * Inicializa o algoritmo Ford-Fulkerson e encontra o fluxo máximo em um grafo direcionado.
     * @param grafo o grafo direcionado
     * @param s o vértice de origem
     * @param t o vértice de destino
     * @throws IllegalArgumentException se o vértice de origem for igual ao vértice de destino ou se o fluxo inicial for inviável
     */
    public FordFulkerson(DiGraph grafo, int s, int t) {
        // Cria uma rede de fluxo com V vértices e E arestas
        FlowNetwork G = new FlowNetwork(grafo.V());
        for (Edge e : grafo.edges()) {
            G.addEdge(new FlowEdge(e.getOrigem(), e.getDestino(), e.getCapacidade()));
        }
        V = G.V();
        validar(s);
        validar(t);
        if (s == t) throw new IllegalArgumentException("Fonte é igual ao sumidouro");
        if (!éViável(G, s, t)) throw new IllegalArgumentException("O fluxo inicial é inviável");

        // Executar o algoritmo Ford-Fulkerson
        valor = excesso(G, t);
        while (temCaminhoAumentador(G, s, t)) {
            double gargalo = Double.POSITIVE_INFINITY;
            for (int v = t; v != s; v = edgeTo[v].other(v)) {
                gargalo = Math.min(gargalo, edgeTo[v].residualCapacityTo(v));
            }
            for (int v = t; v != s; v = edgeTo[v].other(v)) {
                edgeTo[v].addResidualFlowTo(v, gargalo);
            }
            valor += gargalo;
        }
        fluxoAtualizado = G;
        assert verificar(G, s, t);
    }

    /**
     * Retorna o valor do fluxo máximo encontrado.
     * @return o valor do fluxo máximo
     */
    public double valor() {
        return valor;
    }

    /**
     * Verifica se o vértice está no corte mínimo.
     * @param v o vértice a ser verificado
     * @return true se o vértice estiver no corte mínimo, caso contrário false
     */
    public boolean noCorte(int v) {
        validar(v);
        return marcado[v];
    }

    /**
     * Verifica se um vértice está dentro dos limites válidos.
     * @param v o vértice a ser validado
     * @return true se o vértice estiver dentro dos limites válidos, caso contrário false
     */
    private boolean validar(int v) {
        if (v < 0 || v >= V) throw new IllegalArgumentException("vértice " + v + " não está entre 0 e " + (V-1));
        return true;
    }

    /**
     * Verifica se existe um caminho aumentador na rede de fluxo.
     * @param G a rede de fluxo
     * @param s o vértice de origem
     * @param t o vértice de destino
     * @return true se existe um caminho aumentador, caso contrário false
     */
    private boolean temCaminhoAumentador(FlowNetwork G, int s, int t) {
        edgeTo = new FlowEdge[G.V()];
        marcado = new boolean[G.V()];

        // busca em largura
        Queue<Integer> fila = new LinkedList<Integer>();
        fila.add(s);
        marcado[s] = true;
        while (!fila.isEmpty() && !marcado[t]) {
            int v = fila.poll();
            for (FlowEdge e : G.adj(v)) {
                int w = e.other(v);

                // se há capacidade residual de v para w
                if (e.residualCapacityTo(w) > 0) {
                    if (!marcado[w]) {
                        edgeTo[w] = e;
                        marcado[w] = true;
                        fila.add(w);
                    }
                }
            }
        }

        // há um caminho aumentador?
        return marcado[t];
    }

    /**
     * Retorna o excesso de fluxo no vértice especificado.
     * @param G a rede de fluxo
     * @param v o vértice
     * @return o excesso de fluxo no vértice especificado
     */
    private double excesso(FlowNetwork G, int v) {
        double excesso = 0.0;
        for (FlowEdge e : G.adj(v)) {
            if (v == e.from()) excesso -= e.flow();
            else               excesso += e.flow();
        }
        return excesso;
    }

    /**
     * Verifica se o fluxo na rede de fluxo é viável.
     * @param G a rede de fluxo
     * @param s o vértice de origem
     * @param t o vértice de destino
     * @return true se o fluxo for viável, caso contrário false
     */
    private boolean éViável(FlowNetwork G, int s, int t) {

        // verificar se as restrições de capacidade são satisfeitas
        for (int v = 0; v < G.V(); v++) {
            for (FlowEdge e : G.adj(v)) {
                if (e.flow() < -EPSILON_PONTO_FLUTUANTE || e.flow() > e.capacity() + EPSILON_PONTO_FLUTUANTE) {
                    System.err.println("A aresta não satisfaz as restrições de capacidade: " + e);
                    return false;
                }
            }
        }

        // verificar se o fluxo líquido em um vértice é zero, exceto na origem e no destino
        if (Math.abs(valor + excesso(G, s)) > EPSILON_PONTO_FLUTUANTE) {
            System.err.println("Excesso na origem = " + excesso(G, s));
            System.err.println("Fluxo máximo         = " + valor);
            return false;
        }
        if (Math.abs(valor - excesso(G, t)) > EPSILON_PONTO_FLUTUANTE) {
            System.err.println("Excesso no sumidouro   = " + excesso(G, t));
            System.err.println("Fluxo máximo         = " + valor);
            return false;
        }
        for (int v = 0; v < G.V(); v++) {
            if (v == s || v == t) continue;
            else if (Math.abs(excesso(G, v)) > EPSILON_PONTO_FLUTUANTE) {
                System.err.println("Fluxo líquido fora de " + v + " não é igual a zero");
                return false;
            }
        }
        return true;
    }

    /**
     * Verifica as condições de otimalidade.
     * @param G a rede de fluxo
     * @param s o vértice de origem
     * @param t o vértice de destino
     * @return true se as condições de otimalidade forem atendidas, caso contrário false
     */
    private boolean verificar(FlowNetwork G, int s, int t) {

        // verificar se o fluxo é viável
        if (!éViável(G, s, t)) {
            System.err.println("O fluxo é inviável");
            return false;
        }

        // verificar se s está do lado da fonte do corte mínimo e se t não está do lado da fonte
        if (!noCorte(s)) {
            System.err.println("A fonte " + s + " não está do lado da fonte do corte mínimo");
            return false;
        }
        if (noCorte(t)) {
            System.err.println("O sumidouro " + t + " está do lado da fonte do corte mínimo");
            return false;
        }

        // verificar se o valor do corte mínimo é igual ao valor do fluxo máximo
        double valorCorteMínimo = 0.0;
        for (int v = 0; v < G.V(); v++) {
            for (FlowEdge e : G.adj(v)) {
                if ((v == e.from()) && noCorte(e.from()) && !noCorte(e.to()))
                    valorCorteMínimo += e.capacity();
            }
        }

        if (Math.abs(valorCorteMínimo - valor) > EPSILON_PONTO_FLUTUANTE) {
            System.err.println("Valor do fluxo máximo = " + valor + ", valor do corte mínimo = " + valorCorteMínimo);
            return false;
        }

        return true;
    }

    /**
     * Retorna a rede de fluxo atualizada após a execução do algoritmo Dinic.
     * @return a rede de fluxo atualizada
     */

    public FlowNetwork getFluxoAtualizado() {
        return fluxoAtualizado;
    }

    /**
     * Método de teste principal para a classe FordFukerson.
     * @param args os argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        // Teste da classe FordFukerson
        DiGraph graph = new DiGraph(5);
        Edge edge1 = new Edge(0, 1, 10);
        Edge edge2 = new Edge(1, 2, 10);
        Edge edge3 = new Edge(2, 3, 10);
        Edge edge4 = new Edge(3, 4, 10);
        graph.addEdge(edge1);
        graph.addEdge(edge2);
        graph.addEdge(edge3);
        graph.addEdge(edge4);

        FordFulkerson fordFukerson = new FordFulkerson(graph, 0, 4);
        System.out.println("Valor do fluxo máximo: " + fordFukerson.valor());

        FlowNetwork network = fordFukerson.fluxoAtualizado;
        List<Map<String, Object>> json = network.toJson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(json);
        System.out.println(jsonString);
    }
}
