package inteli.cc5;

/**
 * A classe Cliente representa os clientes no modelo da empresa parceira, Vale,
 * incluindo as propriedades de um nó.
 */
public class Cliente extends No {
    private String codigoCalendario; // Código do calendário
    private String codigoCliente; // Código do cliente
    private String codigoEscritorio; // Código do escritório
    private String codigoMercado; // Código do mercado
    private String codigoPais; // Código do país
    private String codigoRegiao; // Código da região
    private String grupoCliente; // Grupo do cliente
    private int indicadorPrioridadeAtendimento; // Indicador de prioridade de atendimento
    private int tempoPadraoOperacao; // Tempo padrão de operação
    private String unidadeFederativa; // Unidade federativa

    /**
     * Construtor da classe Cliente.
     *
     * @param id               O ID do cliente.
     * @param descricao        A descrição do cliente.
     * @param tipoElo          O tipo de elo.
     * @param codigoMercado    O código do mercado.
     * @param codigoEscritorio O código do escritório.
     * @param grupoCliente     O grupo do cliente.
     * @param codigoCliente    O código do cliente.
     * @param unidadeFederativa A unidade federativa do cliente.
     */
    public Cliente(int id, String descricao, String tipoElo, String codigoMercado, String codigoEscritorio, String grupoCliente, String codigoCliente, String unidadeFederativa) {
        super(id, descricao, tipoElo, null);
        setCodigoMercado(codigoMercado);
        setCodigoEscritorio(codigoEscritorio);
        setGrupoCliente(grupoCliente);
        setCodigoCliente(codigoCliente);
        setUnidadeFederativa(unidadeFederativa);
    }

    /**
     * Construtor padrão da classe Cliente.
     */
    public Cliente() {
        super();
    }

    /**
     * Obtém o código do calendário do cliente.
     *
     * @return O código do calendário do cliente.
     */
    public String getCodigoCalendario() {
        return codigoCalendario;
    }

    /**
     * Define o código do calendário do cliente.
     *
     * @param codigoCalendario O código do calendário do cliente.
     */
    public void setCodigoCalendario(String codigoCalendario) {
        this.codigoCalendario = codigoCalendario;
    }

    /**
     * Obtém o código do cliente.
     *
     * @return O código do cliente.
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Define o código do cliente.
     *
     * @param codigoCliente O código do cliente.
     */
    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * Obtém o código do escritório.
     *
     * @return O código do escritório.
     */
    public String getCodigoEscritorio() {
        return codigoEscritorio;
    }

    /**
     * Define o código do escritório.
     *
     * @param codigoEscritorio O código do escritório.
     */
    public void setCodigoEscritorio(String codigoEscritorio) {
        this.codigoEscritorio = codigoEscritorio;
    }

    /**
     * Obtém o código do mercado.
     *
     * @return O código do mercado.
     */
    public String getCodigoMercado() {
        return codigoMercado;
    }

    /**
     * Define o código do mercado.
     *
     * @param codigoMercado O código do mercado.
     */
    public void setCodigoMercado(String codigoMercado) {
        this.codigoMercado = codigoMercado;
    }

    /**
     * Obtém o código do país.
     *
     * @return O código do país.
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Define o código do país.
     *
     * @param codigoPais O código do país.
     */
    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    /**
     * Obtém o código da região.
     *
     * @return O código da região.
     */
    public String getCodigoRegiao() {
        return codigoRegiao;
    }

    /**
     * Define o código da região.
     *
     * @param codigoRegiao O código da região.
     */
    public void setCodigoRegiao(String codigoRegiao) {
        this.codigoRegiao = codigoRegiao;
    }

    /**
     * Obtém o grupo do cliente.
     *
     * @return O grupo do cliente.
     */
    public String getGrupoCliente() {
        return grupoCliente;
    }

    /**
     * Define o grupo do cliente.
     *
     * @param grupoCliente O grupo do cliente.
     */
    public void setGrupoCliente(String grupoCliente) {
        this.grupoCliente = grupoCliente;
    }

    /**
     * Obtém o indicador de prioridade de atendimento.
     *
     * @return O indicador de prioridade de atendimento.
     */
    public int getIndicadorPrioridadeAtendimento() {
        return indicadorPrioridadeAtendimento;
    }

    /**
     * Define o indicador de prioridade de atendimento.
     *
     * @param indicadorPrioridadeAtendimento O indicador de prioridade de atendimento.
     */
    public void setIndicadorPrioridadeAtendimento(int indicadorPrioridadeAtendimento) {
        this.indicadorPrioridadeAtendimento = indicadorPrioridadeAtendimento;
    }

    /**
     * Obtém o tempo padrão de operação.
     *
     * @return O tempo padrão de operação.
     */
    public int getTempoPadraoOperacao() {
        return tempoPadraoOperacao;
    }

    /**
     * Define o tempo padrão de operação.
     *
     * @param tempoPadraoOperacao O tempo padrão de operação.
     */
    public void setTempoPadraoOperacao(int tempoPadraoOperacao) {
        this.tempoPadraoOperacao = tempoPadraoOperacao;
    }

    /**
     * Obtém a unidade federativa.
     *
     * @return A unidade federativa.
     */
    public String getUnidadeFederativa() {
        return unidadeFederativa;
    }

    /**
     * Define a unidade federativa.
     *
     * @param unidadeFederativa A unidade federativa.
     */
    public void setUnidadeFederativa(String unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    /**
     * Método principal. Utilizado apenas para testes.
     *
     * @param args Os argumentos da linha de comando.
     */
    public static void main(String[] args) {

    }
}
