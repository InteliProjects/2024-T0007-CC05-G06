package inteli.algoritmo;

import java.util.LinkedList;

/**
 * Dinic representa o algoritmo de Dinic para encontrar o fluxo máximo em uma rede de fluxo.
 */
public class Dinic {
    private static final double EPSILON_PONTO_FLUTUANTE = 1E-10;
    private final int V; // número de vértices
    private final int fonte;
    private final int sumidouro;
    private int[] nivel; // nível de cada vértice
    private final FlowEdge[] edgeTo; // aresta para cada vértice
    private double valor; // valor atual do fluxo

    /**
     * Inicializa o algoritmo de Dinic e encontra o fluxo máximo em uma rede de fluxo.
     * @param G a rede de fluxo
     * @param fonte o vértice de origem
     * @param sumidouro o vértice de destino
     * @throws IllegalArgumentException se o vértice de origem for igual ao vértice de destino
     */
    public Dinic(FlowNetwork G, int fonte, int sumidouro) {
        this.V = G.V();
        this.fonte = fonte;
        this.sumidouro = sumidouro;
        validarVertice(fonte);
        validarVertice(sumidouro);
        if (fonte == sumidouro) throw new IllegalArgumentException("Fonte é igual ao sumidouro");

        edgeTo = new FlowEdge[V]; // Inicializa edgeTo

        valor = 0;
        while (BFS(G)) {
            double garrafa = enviarFluxo(G, fonte, Double.POSITIVE_INFINITY);
            if (garrafa <= 0) break;
            valor += garrafa;
        }

        // Verificar condições de otimalidade
        assert verificar(G);
    }
    /**
     * Inicializa o algoritmo de Dinic usando um grafo direcionado e encontra o fluxo máximo em uma rede de fluxo.
     * @param grafo o grafo direcionado
     * @param fonte o vértice de origem
     * @param sumidouro o vértice de destino
     * @throws IllegalArgumentException se o grafo estiver vazio ou se o vértice de origem for igual ao vértice de destino
     */
    public Dinic(DiGraph grafo, int fonte, int sumidouro) {
        this.V = grafo.V();
        this.fonte = fonte;
        this.sumidouro = sumidouro;
        // Cria uma rede de fluxo com V vértices e E arestas
        if (grafo.V() < 0) throw new IllegalArgumentException("Grafo vazio");
        FlowNetwork G = new FlowNetwork(grafo.V());
        for (Edge e : grafo.edges()) {
            G.addEdge(new FlowEdge(e.getOrigem(), e.getDestino(), e.getCapacidade()));
        }
        validarVertice(fonte);
        validarVertice(sumidouro);
        if (fonte == sumidouro) throw new IllegalArgumentException("Fonte é igual ao sumidouro");

        edgeTo = new FlowEdge[V]; // Inicializa edgeTo

        valor = 0;
        while (BFS(G)) {
            double garrafa = enviarFluxo(G, fonte, Double.POSITIVE_INFINITY);
            if (garrafa <= 0) break;
            valor += garrafa;
        }

        // Verificar condições de otimalidade
        assert verificar(G);
    }


    /**
     * Executa uma busca em largura (BFS) na rede de fluxo para determinar os níveis dos vértices.
     * @param G a rede de fluxo
     * @return true se o sumidouro for alcançável a partir da fonte, false caso contrário
     */
    private boolean BFS(FlowNetwork G) {
        nivel = new int[V];
        for (int i = 0; i < V; i++) {
            nivel[i] = -1;
        }
        nivel[fonte] = 0; // Nível do vértice de origem
        LinkedList<Integer> fila = new LinkedList<>();
        fila.add(fonte); // Adiciona a origem à fila
        while (!fila.isEmpty()) {
            int u = fila.poll(); // Remove o primeiro vértice da fila
            for (FlowEdge e : G.adj(u)) {
                int v = e.other(u);
                if (nivel[v] < 0 && e.residualCapacityTo(v) > EPSILON_PONTO_FLUTUANTE) {
                    // Define o nível do vértice atual
                    nivel[v] = nivel[u] + 1;
                    fila.add(v); // Adiciona o vértice à fila
                }
            }
        }
        return nivel[sumidouro] >= 0;
    }

    /**
     * Envia fluxo ao longo do caminho aumentador encontrado usando DFS.
     * @param G a rede de fluxo
     * @param u o vértice atual
     * @param garrafa a capacidade do fluxo
     * @return o fluxo enviado
     */
    private double enviarFluxo(FlowNetwork G, int u, double garrafa) {
        if (u == sumidouro) return garrafa;
        for (FlowEdge e : G.adj(u)) {
            int v = e.other(u);
            if (nivel[v] == nivel[u] + 1 && e.residualCapacityTo(v) > EPSILON_PONTO_FLUTUANTE) {
                double fluxo = enviarFluxo(G, v, Math.min(garrafa, e.residualCapacityTo(v)));
                if (fluxo > EPSILON_PONTO_FLUTUANTE) {
                    e.addResidualFlowTo(v, fluxo);
                    edgeTo[v] = e;
                    return fluxo;
                }
            }
        }
        return 0;
    }

    /**
     * Verifica se o fluxo máximo é viável e satisfaz as condições de otimalidade.
     * @param G a rede de fluxo
     * @return true se o fluxo máximo for viável e satisfazer as condições de otimalidade, false caso contrário
     */
    private boolean verificar(FlowNetwork G) {
        // verificar se o fluxo é viável
        double fluxoTotal = 0.0;
        for (FlowEdge e : G.adj(fonte)) {
            if (e.from() == fonte) fluxoTotal += e.flow();
        }
        if (Math.abs(fluxoTotal - valor) > EPSILON_PONTO_FLUTUANTE) {
            System.err.println("Fluxo não é conservado");
            return false;
        }

        // verificar condições de otimalidade
        for (FlowEdge e : G.edges()) {
            int u = e.from(), v = e.to();
            if (e.flow() < -EPSILON_PONTO_FLUTUANTE || e.flow() > e.capacity() + EPSILON_PONTO_FLUTUANTE) {
                System.err.println("A aresta não satisfaz as restrições de capacidade: " + e);
                return false;
            }
            if (u != fonte && v != sumidouro && e.residualCapacityTo(v) > EPSILON_PONTO_FLUTUANTE && nivel[u] != -1 && nivel[v] == -1) {
                System.err.println("A aresta " + e + " na rede residual não é apertada");
                return false;
            }
        }
        return true;
    }

    /**
     * Retorna o valor do fluxo máximo encontrado.
     * @return o valor do fluxo máximo
     */
    public double valor() {
        return valor;
    }

    /**
     * Valida se um vértice está dentro do intervalo válido.
     * @param v o vértice a ser validado
     * @throws IllegalArgumentException se o vértice estiver fora do intervalo válido
     */
    private void validarVertice(int v) {
        if (v < 0 || v >= V) throw new IllegalArgumentException("vértice " + v + " não está entre 0 e " + (V - 1));
    }

    public static void main(String[] args) {

    }
}
