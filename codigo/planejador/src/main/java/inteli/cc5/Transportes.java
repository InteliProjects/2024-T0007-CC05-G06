package inteli.cc5;

/**
 * Define a classe Transportes, que corresponde às arestas dos grafos e correlacionam os outros nós.
 */
public class Transportes {
    private Integer id; // Define o inteiro id.
    private String descricao; // Define uma string com a descrição do caminho da aresta (ex: PortoTubarao - Salesópolis).
    private String tipoElo; // Define o tipo de elo do ponto x.
    private String codigoSiteProduto; // Define o código do produto transportado.
    private String codigoSubModal; // Define o modo de transporte esperado.
    private int idCadeiaDestino; // Define o destino da aresta.
    private int idCadeiaOrigem; // Define a origem da aresta.
    private int idRedeSubTransporte; // Define a cadeia de transporte esperada.
    private String codigoTipoModal; // Define o tipo de modal esperado.
    private int quantidade; // Define a quantidade esperada.

    /**
     * Construtor da classe Transportes.
     *
     * @param id                O id da aresta.
     * @param descricao         A descrição do caminho da aresta.
     * @param codigoSubModal    O modo de transporte esperado.
     * @param codigoTipoModal   O tipo de modal esperado.
     * @param quantidade        A quantidade esperada.
     */
    public Transportes(Integer id, String descricao, String codigoSubModal, String codigoTipoModal, int quantidade, int idCadeiaOrigem, int idCadeiaDestino) {
        setId(id);
        setDescricao(descricao);
        setCodigoSubModal(codigoSubModal);
        setCodigoTipoModal(codigoTipoModal);
        setQuantidade(quantidade);
        setIdCadeiaOrigem(idCadeiaOrigem);
        setIdCadeiaDestino(idCadeiaDestino);
    }

    /**
     * Construtor vazio da classe Transportes.
     */
    public Transportes() {
    }

    /**
     * Obtém o identificador do produto.
     * 
     * @return O identificador como inteiro.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador do produto.
     * 
     * @param id O novo identificador a ser definido.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtém a descrição do produto.
     * 
     * @return A descrição como string.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do produto.
     * 
     * @param descricao A nova descrição a ser definida.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o tipo de elo do produto.
     * 
     * @return O tipo de elo como string.
     */
    public String getTipoElo() {
        return tipoElo;
    }

    /**
     * Define o tipo de elo do produto.
     * 
     * @param tipoElo O novo tipo de elo a ser definido.
     */
    public void setTipoElo(String tipoElo) {
        this.tipoElo = tipoElo;
    }

    /**
     * Obtém o código do site do produto.
     * 
     * @return O código do site do produto como string.
     */
    public String getCodigoSiteProduto() {
        return codigoSiteProduto;
    }

    /**
     * Define o código do site do produto.
     * 
     * @param codigoSiteProduto O novo código do site do produto a ser definido.
     */
    public void setCodigoSiteProduto(String codigoSiteProduto) {
        this.codigoSiteProduto = codigoSiteProduto;
    }

    /**
     * Obtém o código do submodal do produto.
     * 
     * @return O código do submodal como string.
     */
    public String getCodigoSubModal() {
        return codigoSubModal;
    }

    /**
     * Define o código do submodal do produto.
     * 
     * @param codigoSubModal O novo código do submodal a ser definido.
     */
    public void setCodigoSubModal(String codigoSubModal) {
        this.codigoSubModal = codigoSubModal;
    }

    /**
     * Obtém o identificador da cadeia de destino do produto.
     * 
     * @return O identificador da cadeia de destino como inteiro.
     */
    public int getIdCadeiaDestino() {
        return idCadeiaDestino;
    }

    /**
     * Define o identificador da cadeia de destino do produto.
     * 
     * @param idCadeiaDestino O novo identificador da cadeia de destino a ser
     *                        definido.
     */
    public void setIdCadeiaDestino(int idCadeiaDestino) {
        this.idCadeiaDestino = idCadeiaDestino;
    }

    /**
     * Obtém o identificador da cadeia de origem do produto.
     * 
     * @return O identificador da cadeia de origem como inteiro.
     */
    public int getIdCadeiaOrigem() {
        return idCadeiaOrigem;
    }

    /**
     * Define o identificador da cadeia de origem do produto.
     * 
     * @param idCadeiaOrigem O novo identificador da cadeia de origem a ser
     *                       definido.
     */
    public void setIdCadeiaOrigem(int idCadeiaOrigem) {
        this.idCadeiaOrigem = idCadeiaOrigem;
    }

    /**
     * Obtém o identificador da rede de transporte do produto.
     * 
     * @return O identificador da rede de transporte como inteiro.
     */
    public int getIdRedeSubTransporte() {
        return idRedeSubTransporte;
    }

    /**
     * Define o identificador da rede de transporte do produto.
     * 
     * @param idRedeSubTransporte O novo identificador da rede de transporte a ser
     *                            definido.
     */
    public void setIdRedeSubTransporte(int idRedeSubTransporte) {
        this.idRedeSubTransporte = idRedeSubTransporte;
    }

    /**
     * Obtém o código do tipo de modal do produto.
     * 
     * @return O código do tipo de modal como string.
     */
    public String getCodigoTipoModal() {
        return codigoTipoModal;
    }

    /**
     * Define o código do tipo de modal do produto.
     * 
     * @param codigoTipoModal O novo código do tipo de modal a ser definido.
     */
    public void setCodigoTipoModal(String codigoTipoModal) {
        this.codigoTipoModal = codigoTipoModal;
    }

    /**
     * Obtém a quantidade do produto.
     * 
     * @return A quantidade como inteiro.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade do produto.
     * 
     * @param quantidade A nova quantidade a ser definida.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}