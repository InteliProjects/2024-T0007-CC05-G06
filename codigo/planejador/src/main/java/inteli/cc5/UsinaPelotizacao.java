package inteli.cc5;

/**
 * Define a classe UsinaPelotizacao, que se refere às usinas de pelotização do sistema da empresa parceira. Também estende No.
 */
public class UsinaPelotizacao extends No {

    private String codigoPelotizacao; // Define o código da usina de pelotização.
    private boolean consideraFeed; // Define se a usina considera ou não feed.
    private int idEmpresaProprietaria; // Define o id da empresa proprietária pela usina.
    private int minimoObrigatorio; // Define o valor mínimo de produção esperado.
    private int percentualVale; // Define o percentual da empresa correspondente à Vale.
    private int codigoNumerico; // Define o seu código numérico.

    /**
     * Construtor da classe UsinaPelotizacao.
     *
     * @param id                O id da usina de pelotização.
     * @param descricao         A descrição da usina de pelotização.
     * @param tipoElo           O tipo de elo da usina de pelotização.
     * @param codigoSiteProduto O código do site do produto associado à usina de pelotização.
     * @param idEmpresaProprietaria O id da empresa proprietária da usina.
     * @param codigoPelotizacao O código da usina de pelotização.
     * @param minimoObrigatorio O valor mínimo de produção esperado.
     */
    public UsinaPelotizacao(int id, String descricao, String tipoElo, String codigoSiteProduto, int idEmpresaProprietaria, String codigoPelotizacao, int minimoObrigatorio) {
        super(id, descricao, tipoElo, codigoSiteProduto);
        setCodigoDePelotizacao(codigoPelotizacao);
        setIdEmpresaProprietaria(idEmpresaProprietaria);
        setMinimoObrigatorio(minimoObrigatorio);
    }

    /**
     * Construtor vazio da classe UsinaPelotizacao.
     */
    public UsinaPelotizacao() {
        super();
    }

    /**
     * Obtém o código de pelotização da usina de pelotização.
     * 
     * @return O código de pelotização como String.
     */
    public String getCodigoDePelotizacao() {
        return codigoPelotizacao;
    }

    /**
     * Define o código de pelotização da usina de pelotização.
     * 
     * @param codigoDePelotizacao O novo código de pelotização a ser definido.
     */
    public void setCodigoDePelotizacao(String codigoDePelotizacao) {
        this.codigoPelotizacao = codigoDePelotizacao;
    }

    /**
     * Verifica se a usina de pelotização considera ou não feed.
     * 
     * @return true se a usina considera feed, false caso contrário.
     */
    public boolean isConsideraFeed() {
        return consideraFeed;
    }

    /**
     * Define se a usina de pelotização considera ou não feed.
     * 
     * @param consideraFeed O novo valor para consideração de feed.
     */
    public void setConsideraFeed(boolean consideraFeed) {
        this.consideraFeed = consideraFeed;
    }

    /**
     * Obtém o ID da empresa proprietária da usina de pelotização.
     * 
     * @return O ID da empresa proprietária como inteiro.
     */
    public int getIdEmpresaProprietaria() {
        return idEmpresaProprietaria;
    }

    /**
     * Define o ID da empresa proprietária da usina de pelotização.
     * 
     * @param idEmpresaProprietaria O novo ID da empresa proprietária a ser
     *                              definido.
     */
    public void setIdEmpresaProprietaria(int idEmpresaProprietaria) {
        this.idEmpresaProprietaria = idEmpresaProprietaria;
    }

    /**
     * Obtém o valor mínimo de produção esperado pela usina de pelotização.
     * 
     * @return O valor mínimo de produção esperado como inteiro.
     */
    public int getMinimoObrigatorio() {
        return minimoObrigatorio;
    }

    /**
     * Define o valor mínimo de produção esperado pela usina de pelotização.
     * 
     * @param minimoObrigatorio O novo valor mínimo de produção esperado a ser
     *                          definido.
     */
    public void setMinimoObrigatorio(int minimoObrigatorio) {
        this.minimoObrigatorio = minimoObrigatorio;
    }

    /**
     * Obtém o percentual correspondente à Vale na empresa proprietária da usina de
     * pelotização.
     * 
     * @return O percentual correspondente à Vale como inteiro.
     */
    public int getPercentualVale() {
        return percentualVale;
    }

    /**
     * Define o percentual correspondente à Vale na empresa proprietária da usina de
     * pelotização.
     * 
     * @param percentualVale O novo percentual correspondente à Vale a ser definido.
     */
    public void setPercentualVale(int percentualVale) {
        this.percentualVale = percentualVale;
    }

    /**
     * Obtém o código numérico da empresa proprietária da usina de pelotização.
     * 
     * @return O código numérico da empresa como inteiro.
     */
    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    /**
     * Define o código numérico da empresa proprietária da usina de pelotização.
     * 
     * @param codigoNumerico O novo código numérico da empresa a ser definido.
     */
    public void setCodigoNumerico(int codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }
}