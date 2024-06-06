package inteli.cc5;

/**
 * Cria a classe No, que se refere aos nós em um grafo, representando pontos de conexão e informações sobre produtos.
 */
public class No {

    private int id; // Define o identificador X do nó.
    private String descricao; // Define a descrição do nó.
    private String tipoElo; // Define o tipo de elo X associado ao nó.
    private String codigoSiteProduto; // Define o código do site do produto associado ao nó.

    /**
     * Construtor da classe No.
     *
     * @param id                O ID do nó.
     * @param descricao         A descrição do nó.
     * @param tipoElo           O tipo de elo X associado ao nó.
     * @param codigoSiteProduto O código do site do produto associado ao nó.
     */
    public No(int id, String descricao, String tipoElo, String codigoSiteProduto) {
        setIdX(id);
        setDescricao(descricao);
        setTipoEloX(tipoElo);
        setCodigoSiteProduto(codigoSiteProduto);
    }

    /**
     * Construtor padrão da classe No.
     */
    public No() {
    }

    /**
     * Obtém o ID do nó.
     *
     * @return O ID do nó.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o ID do nó.
     *
     * @param id O ID do nó.
     */
    public void setIdX(int id) {
        this.id = id;
    }

    /**
     * Obtém a descrição do nó.
     *
     * @return A descrição do nó.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do nó.
     *
     * @param descricao A descrição do nó.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém o tipo de elo X associado ao nó.
     *
     * @return O tipo de elo X associado ao nó.
     */
    public String getTipoEloX() {
        return tipoElo;
    }

    /**
     * Define o tipo de elo X associado ao nó.
     *
     * @param tipoEloX O tipo de elo X associado ao nó.
     */
    public void setTipoEloX(String tipoEloX) {
        this.tipoElo = tipoEloX;
    }

    /**
     * Obtém o código do site do produto associado ao nó.
     *
     * @return O código do site do produto associado ao nó.
     */
    public String getCodigoSiteProduto() {
        return codigoSiteProduto;
    }

    /**
     * Define o código do site do produto associado ao nó.
     *
     * @param codigoSiteProduto O código do site do produto associado ao nó.
     */
    public void setCodigoSiteProduto(String codigoSiteProduto) {
        this.codigoSiteProduto = codigoSiteProduto;
    }

    /**
     * Método principal. Utilizado apenas para testes.
     *
     * @param args Os argumentos da linha de comando.
     */
    public static void main(String[] args) {
        // Aqui pode-se inserir código para testar a classe No, como criar instâncias e imprimir valores.
    }
}
