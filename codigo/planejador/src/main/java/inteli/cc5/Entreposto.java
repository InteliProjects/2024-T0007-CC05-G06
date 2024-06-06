package inteli.cc5;

/**
 * Define a classe Entreposto, que corresponde às arestas dos grafos e correlaciona os outros nós.
 */
public class Entreposto extends No {
    private int capacidadeMaxima; // Define a capacidade máxima como um inteiro
    private String codigoPatio; // Define o código do pátio como uma string
    private String codigoTipoPatio; // Define o código do tipo de pátio como uma string
    private boolean habilitarRestricao; // Define a habilitação de restrição como um booleano
    private String indicadorVinculado; // Define o indicador vinculado como uma string
    private boolean operacional; // Define a operacionalidade como um booleano
    private int tempoPadrao; // Define o tempo padrão como um inteiro
    private String tipoRecuperacao; // Define o tipo de recuperação como uma string

    /**
     * Construtor da classe Entreposto.
     *
     * @param id                   O ID do entreposto.
     * @param descricao            A descrição do entreposto.
     * @param tipoElo              O tipo de elo.
     * @param codigoSiteProduto    O código do site do produto.
     * @param codigoPatio          O código do pátio.
     */
    public Entreposto(int id, String descricao, String tipoElo, String codigoPatio, String codigoSiteProduto){
        super(id, descricao, tipoElo, codigoSiteProduto);
        setCodigoPatio(codigoPatio);
        setCodigoTipoPatio(codigoTipoPatio);
        setIndicadorVinculado(indicadorVinculado);
    }

    /**
     * Construtor padrão da classe Entreposto.
     */
    public Entreposto() {
    }

    /**
     * Obtém a capacidade máxima.
     *
     * @return A capacidade máxima.
     */
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    /**
     * Define a capacidade máxima.
     *
     * @param capacidadeMaxima A capacidade máxima.
     */
    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    /**
     * Obtém o código do pátio.
     *
     * @return O código do pátio.
     */
    public String getCodigoPatio() {
        return codigoPatio;
    }

    /**
     * Define o código do pátio.
     *
     * @param codigoPatio O código do pátio.
     */
    public void setCodigoPatio(String codigoPatio) {
        this.codigoPatio = codigoPatio;
    }

    /**
     * Obtém o código do tipo de pátio.
     *
     * @return O código do tipo de pátio.
     */
    public String getCodigoTipoPatio() {
        return codigoTipoPatio;
    }

    /**
     * Define o código do tipo de pátio.
     *
     * @param codigoTipoPatio O código do tipo de pátio.
     */
    public void setCodigoTipoPatio(String codigoTipoPatio) {
        this.codigoTipoPatio = codigoTipoPatio;
    }

    /**
     * Verifica se a restrição está habilitada.
     *
     * @return true se a restrição está habilitada, false caso contrário.
     */
    public boolean isHabilitarRestricao() {
        return habilitarRestricao;
    }

    /**
     * Define se a restrição está habilitada.
     *
     * @param habilitarRestricao true para habilitar a restrição, false caso contrário.
     */
    public void setHabilitarRestricao(boolean habilitarRestricao) {
        this.habilitarRestricao = habilitarRestricao;
    }

    /**
     * Obtém o indicador vinculado.
     *
     * @return O indicador vinculado.
     */
    public String getIndicadorVinculado() {
        return indicadorVinculado;
    }

    /**
     * Define o indicador vinculado.
     *
     * @param indicadorVinculado O indicador vinculado.
     */
    public void setIndicadorVinculado(String indicadorVinculado) {
        this.indicadorVinculado = indicadorVinculado;
    }

    /**
     * Verifica se o entreposto está operacional.
     *
     * @return true se o entreposto está operacional, false caso contrário.
     */
    public boolean isOperacional() {
        return operacional;
    }

    /**
     * Define se o entreposto está operacional.
     *
     * @param operacional true para definir o entreposto como operacional, false caso contrário.
     */
    public void setOperacional(boolean operacional) {
        this.operacional = operacional;
    }

    /**
     * Obtém o tempo padrão.
     *
     * @return O tempo padrão.
     */
    public int getTempoPadrao() {
        return tempoPadrao;
    }

    /**
     * Define o tempo padrão.
     *
     * @param tempoPadrao O tempo padrão.
     */
    public void setTempoPadrao(int tempoPadrao) {
        this.tempoPadrao = tempoPadrao;
    }

    /**
     * Obtém o tipo de recuperação.
     *
     * @return O tipo de recuperação.
     */
    public String getTipoRecuperacao() {
        return tipoRecuperacao;
    }

    /**
     * Define o tipo de recuperação.
     *
     * @param tipoRecuperacao O tipo de recuperação.
     */
    public void setTipoRecuperacao(String tipoRecuperacao) {
        this.tipoRecuperacao = tipoRecuperacao;
    }

    /**
     * Método principal. Utilizado apenas para testes.
     *
     * @param args Os argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Método principal da classe Entreposto
    }
}
