package inteli.cc5;
// cria a classe UsinaBeneficiamento, que se refere Às usinas de beneficiamento do modelo da empresa parceira, trazendo também as propriedades de nó
public class UsinaBeneficiamento extends No {

    private String codigoDaUsina; // define o codigo da usina
    private int minimoObrigatorio; // define a quantidade minima produzida

    public String getCodigoDaUsina() { // demonstra o código da usina como String
        return codigoDaUsina;
    }

    public void setCodigoDaUsina(String codigoDaUsina) { // altera o valor do codigo da usina
        this.codigoDaUsina = codigoDaUsina;
    }

    public int getMinimoObrigatorio() { // demonstra a quantidade minima produzida pela usina como Inteiro
        return minimoObrigatorio;
    }

    public void setMinimoObrigatorio(int minimoObrigatorio) { // altera a quantidade minima obrigatoria de produção
        this.minimoObrigatorio = minimoObrigatorio;
    }

    public static void main(String[] args) {

    }
}
