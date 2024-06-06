package inteli.algoritmo;

/**
 * FlowEdge representa uma aresta em um grafo direcionado com capacidades e fluxos.
 */
public class FlowEdge {
    private int v; // de
    private int w; // para
    private double capacidade; // capacidade
    private double fluxo; // fluxo

    /**
     * Inicializa uma aresta de um vértice v para um vértice w com a capacidade e fluxo fornecidos.
     * @param v o vértice de origem
     * @param w o vértice de destino
     * @param capacidade a capacidade da aresta
     * @throws IllegalArgumentException se o índice do vértice for negativo ou se a capacidade for negativa
     */
    public FlowEdge(int v, int w, double capacidade) {
        if (v < 0) throw new IllegalArgumentException("O índice do vértice deve ser um inteiro não negativo");
        if (w < 0) throw new IllegalArgumentException("O índice do vértice deve ser um inteiro não negativo");
        if (!(capacidade >= 0)) throw new IllegalArgumentException("A capacidade da aresta deve ser não negativa");
        this.v         = v;
        this.w         = w;
        this.capacidade  = capacidade;
        this.fluxo      = 0.0;
    }

    /**
     * Inicializa uma aresta de um vértice v para um vértice w com a capacidade e fluxo fornecidos.
     * @param v o vértice de origem
     * @param w o vértice de destino
     * @param capacidade a capacidade da aresta
     * @param fluxo o fluxo atual na aresta
     * @throws IllegalArgumentException se o índice do vértice for negativo ou se a capacidade for negativa
     */
    public FlowEdge(int v, int w, double capacidade, double fluxo) {
        if (v < 0) throw new IllegalArgumentException("O índice do vértice deve ser um inteiro não negativo");
        if (w < 0) throw new IllegalArgumentException("O índice do vértice deve ser um inteiro não negativo");
        if (!(capacidade >= 0)) throw new IllegalArgumentException("A capacidade da aresta deve ser não negativa");
        if (fluxo < 0) throw new IllegalArgumentException("O fluxo deve ser não negativo");
        if (fluxo > capacidade) throw new IllegalArgumentException("O fluxo não pode exceder a capacidade da aresta");
        this.v = v;
        this.w = w;
        this.capacidade = capacidade;
        this.fluxo = fluxo;
    }


    /**
     * Inicializa uma aresta de um objeto Edge.
     * @param e a aresta a ser inicializada
     */
    public FlowEdge(Edge e) {
        this.v = e.getOrigem();
        this.w = e.getDestino();
        this.capacidade = e.getCapacidade();
        this.fluxo = e.getFluxo();
    }

    /**
     * Retorna o vértice de origem desta aresta.
     * @return o vértice de origem desta aresta
     */
    public int from() {
        return v;
    }

    /**
     * Retorna o vértice de destino desta aresta.
     * @return o vértice de destino desta aresta
     */
    public int to() {
        return w;
    }

    /**
     * Retorna a capacidade desta aresta.
     * @return a capacidade desta aresta
     */
    public double capacity() {
        return capacidade;
    }

    /**
     * Retorna o fluxo desta aresta.
     * @return o fluxo desta aresta
     */
    public double flow() {
        return fluxo;
    }

    /**
     * Retorna o outro vértice conectado por esta aresta.
     * @param vertex o vértice
     * @return o outro vértice conectado por esta aresta
     * @throws IllegalArgumentException se o vértice não for um dos extremos da aresta
     */
    public int other(int vertex) {
        if      (vertex == v) return w;
        else if (vertex == w) return v;
        else throw new IllegalArgumentException("Ponto final inválido");
    }

    /**
     * Retorna a capacidade residual desta aresta para o vértice especificado.
     * @param vertex o vértice
     * @return a capacidade residual desta aresta para o vértice especificado
     * @throws IllegalArgumentException se o vértice não for um dos extremos da aresta
     */
    public double residualCapacityTo(int vertex) {
        if      (vertex == v) return fluxo;              // aresta de volta
        else if (vertex == w) return capacidade - fluxo; // aresta direta
        else throw new IllegalArgumentException("Ponto final inválido");
    }

    /**
     * Adiciona um fluxo residual para o vértice especificado.
     * @param vertex o vértice
     * @param delta a mudança no fluxo
     * @throws IllegalArgumentException se o vértice não for um dos extremos da aresta
     */
    public void addResidualFlowTo(int vertex, double delta) {
        if      (vertex == v) fluxo -= delta;           // aresta de volta
        else if (vertex == w) fluxo += delta;           // aresta direta
        else throw new IllegalArgumentException("Ponto final inválido");
        if (Double.isNaN(delta)) throw new IllegalArgumentException("Mudança no fluxo = NaN");
        if (!(fluxo >= 0))      throw new IllegalArgumentException("O fluxo é negativo");
        if (!(fluxo <= capacidade)) throw new IllegalArgumentException("O fluxo excede a capacidade");
    }

    /**
     * Retorna uma representação em string desta aresta.
     * @return uma representação em string desta aresta
     */
    public String toString() {
        return v + "->" + w + " " + fluxo + "/" + capacidade;
    }

    /**
     * Método principal (main) para testar a classe FlowEdge.
     * @param args os argumentos de linha de comando (não utilizado)
     */
    public static void main(String[] args) {
        // Teste da classe FlowEdge
    }
}
