package inteli.algoritmo;

/**
 * Edge representa uma aresta em um grafo direcionado com capacidades.
 */
public class Edge {
    private int origem; // Vértice de origem
    private int destino; // Vértice de destino
    private double capacidade; // Capacidade da aresta
    private double fluxo; // Fluxo da aresta

    /**
     * Constrói uma aresta com a origem, destino e capacidade especificados.
     * @param origem o vértice de origem
     * @param destino o vértice de destino
     * @param capacidade a capacidade da aresta
     */
    public Edge(int origem, int destino, double capacidade) {
        validarVertice(origem);
        validarVertice(destino);
        validarCapacidade(capacidade);
        this.origem = origem;
        this.destino = destino;
        this.capacidade = capacidade;
        this.fluxo = 0;
    }

    /**
     * Retorna o vértice de origem desta aresta.
     * @return o vértice de origem desta aresta
     */
    public int getOrigem() {
        return origem;
    }

    /**
     * Retorna o vértice de destino desta aresta.
     * @return o vértice de destino desta aresta
     */
    public int getDestino() {
        return destino;
    }

    /**
     * Retorna a capacidade desta aresta.
     * @return a capacidade desta aresta
     */
    public double getCapacidade() {
        return capacidade;
    }

    /**
     * Retorna o fluxo desta aresta.
     * @return o fluxo desta aresta
     */
    public double getFluxo() {
        return fluxo;
    }

    /**
     * Define o fluxo desta aresta.
     * @param fluxo o novo valor do fluxo
     */
    public void setFluxo(double fluxo) {
        this.fluxo = fluxo;
    }

    /**
     * Retorna a capacidade residual desta aresta para o vértice especificado.
     * @param vertice o vértice para o qual se deseja verificar a capacidade residual
     * @return a capacidade residual desta aresta para o vértice especificado
     */
    public double getCapacidadeResidual(int vertice) {
        if (vertice == origem) {
            return fluxo;
        } else {
            return capacidade - fluxo;
        }
    }

    /**
     * Valida se o vértice é um inteiro não negativo.
     * @param vertice o vértice a ser validado
     * @throws IllegalArgumentException se o vértice for negativo
     */
    public void validarVertice(int vertice) {
        if (vertice < 0) {
            throw new IllegalArgumentException("O vértice deve ser um inteiro não negativo");
        }
    }

    /**
     * Valida se a capacidade é um número não negativo.
     * @param capacidade a capacidade a ser validada
     * @throws IllegalArgumentException se a capacidade for negativa
     */
    public void validarCapacidade(double capacidade) {
        if (capacidade < 0) {
            throw new IllegalArgumentException("A capacidade deve ser um número não negativo");
        }
    }

    /**
     * Retorna uma representação em string desta aresta.
     * @return uma representação em string desta aresta
     */
    public String toString() {
        return origem + " - " + destino;
    }

    /**
     * Método principal (main) para testar a classe Edge.
     * @param args os argumentos de linha de comando (não utilizado)
     */
    public static void main(String[] args) {
        // Método principal usado para testar a classe Edge
    }
}
