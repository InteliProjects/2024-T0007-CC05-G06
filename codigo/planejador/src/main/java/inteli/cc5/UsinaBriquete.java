package inteli.cc5;

/**
 * Define a classe UsinaBriquete, que se refere às usinas de briquete do sistema da empresa parceira. Também estende No.
 */
public class UsinaBriquete extends No {

    private String codigoBriquete; // Define o código da usina de briquete.
    private boolean consideraFeed; // Define se a usina considera ou não feed.
    private int idEmpresaProprietaria; // Define o id da empresa proprietária pela usina.
    private int minimoObrigatorio; // Define o valor mínimo de produção esperado.
    private int percentualVale; // Define o percentual da empresa correspondente à Vale.
    private int codigoNumerico; // Define o seu código numérico.

    /**
     * Construtor da classe UsinaBriquete.
     *
     * @param id                 O id da usina de briquete.
     * @param descricao          A descrição da usina de briquete.
     * @param tipoElo            O tipo de elo da usina de briquete.
     * @param codigoSiteProduto  O código do site do produto associado à usina de briquete.
     * @param codigoBriquete     O código da usina de briquete.
     * @param idEmpresaProprietaria O id da empresa proprietária da usina.
     * @param minimoObrigatorio  O valor mínimo de produção esperado.
     */
    public UsinaBriquete(int id, String descricao, String tipoElo, String codigoSiteProduto, String codigoBriquete, int idEmpresaProprietaria, int minimoObrigatorio) {
        super(id, descricao, tipoElo, codigoSiteProduto);
        setCodigoDeBriquete(codigoBriquete);
        setIdEmpresaProprietaria(idEmpresaProprietaria);
        setMinimoObrigatorio(minimoObrigatorio);
    }

    /**
     * Construtor vazio da classe UsinaBriquete.
     */
    public UsinaBriquete() {
        super();
    }

    /**
     * Define o código do briquete da usina de briquete.
     * 
     * @param codigoDeBriquete O novo código do briquete a ser definido.
     */
    public void setCodigoDeBriquete(String codigoDeBriquete) {
        this.codigoBriquete = codigoDeBriquete;
    }

    /**
     * Verifica se a usina de briquete considera ou não feed.
     * 
     * @return true se a usina considera feed, false caso contrário.
     */
    public boolean isConsideraFeed() {
        return consideraFeed;
    }

    /**
     * Define se a usina de briquete considera ou não feed.
     * 
     * @param consideraFeed O novo valor para consideração de feed.
     */
    public void setConsideraFeed(boolean consideraFeed) {
        this.consideraFeed = consideraFeed;
    }

    /**
     * Obtém o ID da empresa proprietária da usina de briquete.
     * 
     * @return O ID da empresa proprietária como inteiro.
     */
    public int getIdEmpresaProprietaria() {
        return idEmpresaProprietaria;
    }

    /**
     * Define o ID da empresa proprietária da usina de briquete.
     * 
     * @param idEmpresaProprietaria O novo ID da empresa proprietária a ser
     *                              definido.
     */
    public void setIdEmpresaProprietaria(int idEmpresaProprietaria) {
        this.idEmpresaProprietaria = idEmpresaProprietaria;
    }

    /**
     * Obtém o valor mínimo de produção esperado pela usina de briquete.
     * 
     * @return O valor mínimo de produção esperado como inteiro.
     */
    public int getMinimoObrigatorio() {
        return minimoObrigatorio;
    }

    /**
     * Define o valor mínimo de produção esperado pela usina de briquete.
     * 
     * @param minimoObrigatorio O novo valor mínimo de produção esperado a ser
     *                          definido.
     */
    public void setMinimoObrigatorio(int minimoObrigatorio) {
        this.minimoObrigatorio = minimoObrigatorio;
    }

    /**
     * Obtém o percentual correspondente à Vale na empresa proprietária da usina de
     * briquete.
     * 
     * @return O percentual correspondente à Vale como inteiro.
     */
    public int getPercentualVale() {
        return percentualVale;
    }

    /**
     * Define o percentual correspondente à Vale na empresa proprietária da usina de
     * briquete.
     * 
     * @param percentualVale O novo percentual correspondente à Vale a ser definido.
     */
    public void setPercentualVale(int percentualVale) {
        this.percentualVale = percentualVale;
    }

    /**
     * Obtém o código numérico da empresa proprietária da usina de briquete.
     * 
     * @return O código numérico da empresa como inteiro.
     */
    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    /**
     * Define o código numérico da empresa proprietária da usina de briquete.
     * 
     * @param codigoNumerico O novo código numérico da empresa a ser definido.
     */
    public void setCodigoNumerico(int codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }
}