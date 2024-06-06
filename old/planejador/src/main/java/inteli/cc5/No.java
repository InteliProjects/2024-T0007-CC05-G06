package inteli.cc5;

// cria a classe No, que se refere aos nós em um grafo, representando pontos de conexão e informações sobre produtos
public class No {

    private int idX; // define o identificador X do nó
    private int idY; // define o identificador Y do nó
    private String descricao; // define a descrição do nó
    private String tipoEloX; // define o tipo de elo X associado ao nó
    private String tipoEloY; // define o tipo de elo Y associado ao nó
    private String codigoSiteProduto; // define o código do site do produto associado ao nó

    public int getIdX() { // demonstra o identificador X do nó como Inteiro
        return idX;
    }

    public void setIdX(int idX) { // altera o valor do identificador X do nó
        this.idX = idX;
    }

    public int getIdY() { // demonstra o identificador Y do nó como Inteiro
        return idY;
    }

    public void setIdY(int idY) { // altera o valor do identificador Y do nó
        this.idY = idY;
    }

    public String getDescricao() { // demonstra a descrição do nó como String
        return descricao;
    }

    public void setDescricao(String descricao) { // altera o valor da descrição do nó
        this.descricao = descricao;
    }

    public String getTipoEloX() { // demonstra o tipo de elo X associado ao nó como String
        return tipoEloX;
    }

    public void setTipoEloX(String tipoEloX) { // altera o valor do tipo de elo X associado ao nó
        this.tipoEloX = tipoEloX;
    }

    public String getTipoEloY() { // demonstra o tipo de elo Y associado ao nó como String
        return tipoEloY;
    }

    public void setTipoEloY(String tipoEloY) { // altera o valor do tipo de elo Y associado ao nó
        this.tipoEloY = tipoEloY;
    }

    public String getCodigoSiteProduto() { // demonstra o código do site do produto associado ao nó como String
        return codigoSiteProduto;
    }

    public void setCodigoSiteProduto(String codigoSiteProduto) { // altera o valor do código do site do produto associado ao nó
        this.codigoSiteProduto = codigoSiteProduto;
    }

    public static void main(String[] args) {
        // Aqui pode-se inserir código para testar a classe No, como criar instâncias e imprimir valores.
    }
}
