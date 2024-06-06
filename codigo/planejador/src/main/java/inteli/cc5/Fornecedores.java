package inteli.cc5;

/**
 * Define a classe Fornecedores, que corresponde às arestas dos grafos e correlaciona os outros nós.
 */
public class Fornecedores {

    private int id; // Define o identificador único do fornecedor como um inteiro.
    private String tipoElo; // Define o tipo de elo do fornecedor.
    private String codigoFornecedor; // Armazena o código do fornecedor como uma String.
    private boolean ativo = true; // Indica se o fornecedor está ativo (true) ou não (false).
    private String descricao; // Define a descrição do fornecedor.

    /**
     * Construtor da classe Fornecedores.
     *
     * @param id                O ID do fornecedor.
     * @param tipoElo           O tipo de elo do fornecedor.
     * @param codigoFornecedor  O código do fornecedor.
     * @param descricao         A descrição do fornecedor.
     */
    public Fornecedores(int id, String tipoElo, String codigoFornecedor, String descricao) {
        setId(id);
        setTipoElo(tipoElo);
        setCodigoFornecedor(codigoFornecedor);
        setDescricao(descricao);
    }

    /**
     * Construtor padrão da classe Fornecedores.
     */
    public Fornecedores() {
    }

    /**
     * Obtém o ID do fornecedor.
     *
     * @return O ID do fornecedor.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID do fornecedor.
     *
     * @param id O ID do fornecedor.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o tipo de elo do fornecedor.
     *
     * @return O tipo de elo do fornecedor.
     */
    public String getTipoElo() {
        return tipoElo;
    }

    /**
     * Define o tipo de elo do fornecedor.
     *
     * @param tipoElo O tipo de elo do fornecedor.
     */
    public void setTipoElo(String tipoElo) {
        this.tipoElo = tipoElo;
    }

    /**
     * Verifica se o fornecedor está ativo.
     *
     * @return true se o fornecedor está ativo, false caso contrário.
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define se o fornecedor está ativo.
     *
     * @param ativo true para ativar o fornecedor, false caso contrário.
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * Obtém a descrição do fornecedor.
     *
     * @return A descrição do fornecedor.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do fornecedor.
     *
     * @param descricao A descrição do fornecedor.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o código do fornecedor.
     *
     * @return O código do fornecedor.
     */
    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    /**
     * Define o código do fornecedor.
     *
     * @param codigoFornecedor O código do fornecedor.
     */
    public void setCodigoFornecedor(String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

}
