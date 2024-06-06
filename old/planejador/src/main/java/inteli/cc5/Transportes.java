package inteli.cc5;

//define a classe Transportes, que corresponde às arestas dos grafos e correlacionam os outros nós
public class Transportes {
    private int idX; // define o inteiro idX
    private int idY;// define o inteiro idY
    private String descricao; //define uma string com a descrição do caminho da aresta (ex: PortoTubarao - Salesópolis)
    private String tipoEloX; // define o tipo de elo do ponto x
    private String tipoEloY; // define o tipo de elo do ponto Y
    private String codigoSiteProduto; // define o código do produto transportado
    private String codigoSubModal; // define o modo de transporte esperado
    private int idCadeiaDestino; //define o destino da aresta
    private int idCadeiaOrigem;//define a origem da aresta
    private int idRedeSubTransporte; // define a cadeia de transporte esperada

    public int getIdX() { // demonstra o idX como Inteiro
        return idX;
    }

    public void setIdX(int idX) { //altera o idX
        this.idX = idX;
    }

    public int getIdY() {// demonstra o idY como Inteiro
        return idY;
    }

    public void setIdY(int idY) { // altera o idY
        this.idY = idY;
    }

    public String getDescricao() { // demonstra a descrição como String
        return descricao;
    }

    public void setDescricao(String descricao) { // altera a descrição
        this.descricao = descricao;
    }

    public String getTipoEloX() { //mostra o tipo de elo X como String
        return tipoEloX;
    }

    public void setTipoEloX(String tipoEloX) { //altera o tipo de elo X 
        this.tipoEloX = tipoEloX;
    }

    public String getTipoEloY() { // mostra o tipo de elo Y como String
        return tipoEloY;
    }

    public void setTipoEloY(String tipoEloY) { // altera o tipo de elo Y
        this.tipoEloY = tipoEloY;
    }

    public String getCodigoSiteProduto() { // mostra o código de site produto como String
        return codigoSiteProduto;
    }

    public void setCodigoSiteProduto(String codigoSiteProduto) {// altera o código de site produto
        this.codigoSiteProduto = codigoSiteProduto;
    }

    public String getCodigoSubModal() { // mostra o codigo do sub modal como String
        return codigoSubModal;
    }

    public void setCodigoSubModal(String codigoSubModal) { // altera o codigo do sub modal
        this.codigoSubModal = codigoSubModal; 
    }

    public int getIdCadeiaDestino() { // mostra o id da cadeia de destino  como Inteiro
        return idCadeiaDestino;
    }

    public void setIdCadeiaDestino(int idCadeiaDestino) { // altera o id da cadeia de destino
        this.idCadeiaDestino = idCadeiaDestino;
    }

    public int getIdCadeiaOrigem() {// mostra o id da cadeia de origem como Inteiro
        return idCadeiaOrigem;
    }

    public void setIdCadeiaOrigem(int idCadeiaOrigem) {// altera o id da cadeia de origem
        this.idCadeiaOrigem = idCadeiaOrigem;
    }

    public int getIdRedeSubTransporte() {// mostra o id da rede de transporte como Inteiro
        return idRedeSubTransporte;
    }

    public void setIdRedeSubTransporte(int idRedeSubTransporte) {// altera o id da rede de transporte
        this.idRedeSubTransporte = idRedeSubTransporte;
    }
}
