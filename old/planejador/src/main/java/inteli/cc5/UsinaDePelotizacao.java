package inteli.cc5;
// define a classe  UsinaDePelotizacao, que se resume Às usinas de pelotização do sistema da empresa parceira. Também extende nó.

public class UsinaDePelotizacao extends No {
    
    private String codigoDePelotizacao;// define o codigo da usina de pelotização
    private boolean cosideraFeed;// define se a usina considera ou não feed
    private int idEmpresaProprietaria; // define o id da empresa proprietaria pela usina
    private int minimoObrigatorio; // define o valor minimo de produção esperado
    private int percentualVale; // define o percentual da empresa correspondente à Vale
    private int codigoNumerico; // define o seu código numérico

    public String getCodigoDeBriquete() {// demonstra o codigo da usina de pelotização como String
        return codigoDePelotizacao;
    }

    public void setCodigoDePelotizacao(String codigoDePelotizacao) {// altera o codigo da usina de pelotização 
        this.codigoDePelotizacao = codigoDePelotizacao;
    }

    public boolean isCosideraFeed() {  // demonstra se a usina considera ou não feed como booleano
        return cosideraFeed;
    }

    public void setCosideraFeed(boolean cosideraFeed) {// altera o dado sobre a consideração de feed's
        this.cosideraFeed = cosideraFeed;
    }

    public int getIdEmpresaProprietaria() {// demonstra o id da empresa dona da usina como inteiro
        return idEmpresaProprietaria;
    }

    public void setIdEmpresaProprietaria(int idEmpresaProprietaria) {// altera o id da empresa dona da usina
        this.idEmpresaProprietaria = idEmpresaProprietaria;
    }

    public int getMinimoObrigatorio() { // demonstra o valor minimo de produção esperado como inteiro
        return minimoObrigatorio;
    }

    public void setMinimoObrigatorio(int minimoObrigatorio) { // altera o valor minimo de produção esperado 
        this.minimoObrigatorio = minimoObrigatorio;
    }

    public int getPercentualVale() { // demonstra o percentual da empresa correspondente à vale como inteiro
        return percentualVale;
    }

    public void setPercentualVale(int percentualVale) { // altera o percentual da empresa correspondente à vale 
        this.percentualVale = percentualVale;
    }

    public int getCodigoNumerico() {  // demonstra o código numerico da empresa como inteiro 
        return codigoNumerico;
    }

    public void setCodigoNumerico(int codigoNumerico) {  // altera o valor do codigo numerico da empresa
        this.codigoNumerico = codigoNumerico;
    }
}