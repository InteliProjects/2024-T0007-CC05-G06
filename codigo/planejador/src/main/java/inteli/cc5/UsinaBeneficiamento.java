package inteli.cc5;

/**
 * Cria a classe UsinaBeneficiamento, que se refere às usinas de beneficiamento do modelo da empresa parceira,
 * trazendo também as propriedades de nó.
 */
public class UsinaBeneficiamento extends No {

    private String codigoDaUsina; // Define o código da usina.
    private int minimoObrigatorio; // Define a quantidade mínima produzida.

    /**
     * Construtor da classe UsinaBeneficiamento.
     *
     * @param id                 O id da usina de beneficiamento.
     * @param descricao          A descrição da usina de beneficiamento.
     * @param tipoElo            O tipo de elo da usina de beneficiamento.
     * @param codigoSiteProduto O código do site do produto associado à usina de beneficiamento.
     * @param codigoDaUsina      O código da usina de beneficiamento.
     * @param minimoObrigatorio A quantidade mínima produzida pela usina de beneficiamento.
     */
    public UsinaBeneficiamento(int id, String descricao, String tipoElo, String codigoSiteProduto, String codigoDaUsina, int minimoObrigatorio) {
        super(id, descricao, tipoElo, codigoSiteProduto);
        setCodigoDaUsina(codigoDaUsina);
        setMinimoObrigatorio(minimoObrigatorio);
    }

    /**
     * Construtor vazio da classe UsinaBeneficiamento.
     */
    public UsinaBeneficiamento() {
    }

    /**
     * Obtém o código da usina.
     * 
     * @return O código da usina como string.
     */
    public String getCodigoDaUsina() {
        return codigoDaUsina;
    }

    /**
     * Define o código da usina.
     * 
     * @param codigoDaUsina O novo código da usina a ser definido.
     */
    public void setCodigoDaUsina(String codigoDaUsina) {
        this.codigoDaUsina = codigoDaUsina;
    }

    /**
     * Obtém a quantidade mínima produzida pela usina.
     * 
     * @return A quantidade mínima produzida como inteiro.
     */
    public int getMinimoObrigatorio() {
        return minimoObrigatorio;
    }

    /**
     * Define a quantidade mínima produzida pela usina.
     * 
     * @param minimoObrigatorio A nova quantidade mínima produzida a ser definida.
     */
    public void setMinimoObrigatorio(int minimoObrigatorio) {
        this.minimoObrigatorio = minimoObrigatorio;
    }

    /**
     * Método principal da classe UsinaBeneficiamento.
     * 
     * @param args Argumentos da linha de comando (não utilizado neste momento).
     */
    public static void main(String[] args) {
        // Método principal da classe UsinaBeneficiamento.
    }
}