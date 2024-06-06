package inteli.cc5;

//define a classe Fornecedor, que corresponde às arestas dos grafos e correlacionam os outros nós
public class Fornecedores {


    private int id; // Define o identificador único do fornecedor como um inteiro.
    private String codigoFornecedor; // Armazena o código do fornecedor como uma String.
    private boolean ativo = true; // Indica se o fornecedor está ativo (true) ou não (false).

    public int getId() {// demonstra o id como int
        return id;
    }

    public void setId(int id) {//altera id
        this.id = id;
    }

    public String getCodigoFornecedor() {//demostra o codigo de fornecedor como string
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(String codigoForncedor) {//alatera o codigo de fornecedor
        this.codigoFornecedor = codigoForncedor;
    }

    public boolean isAtivo() {//demostra o ativo como boolean
        return ativo;
    }

    public void setAtivo(boolean ativo) {//altera o ativvo
        this.ativo = ativo;
    }

}
