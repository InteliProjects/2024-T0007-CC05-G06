package inteli.cc5;

// Define a classe Entreposto, que corresponde às arestas dos grafos e correlacionam os outros nós
public class Entreposto extends No {
    private int capacidadeMaxima; // Define a capacidade máxima como um inteiro
    private int codigoPatio; // Define o código do pátio como um inteiro
    private int codigoTipoPatio; // Define o código do tipo de pátio como um inteiro
    private boolean habilitarRestricao; // Define a habilitação de restrição como um booleano
    private String indicadorVinculado; // Define o indicador vinculado como uma string
    private boolean operacional; // Define a operacionalidade como um booleano
    private int tempoPadrao; // Define o tempo padrão como um inteiro
    private String tipoRecuperacao; // Define o tipo de recuperação como uma string
    private int capacidadeMaximaArmazenamento; // Define a capacidade máxima de armazenamento como um inteiro
    private int codigoNumerico; // Define o código numérico como um inteiro


    public int getCapacidadeMaxima() {// demonstra o capacidade maxima como int
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {//altera capacidade maxima
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getCodigoPatio() {// demonstra o codigo tipo patio como int
        return codigoPatio;
    }

    public void setCodigoPatio(int codigoPatio) {//altera codigo patio
        this.codigoPatio = codigoPatio;
    }

    public int getCodigoTipoPatio() {// demonstra o codigo tipo patio como int
        return codigoTipoPatio;
    }

    public void setCodigoTipoPatio(int codigoTipoPatio) {//altera codigo tipo patio
        this.codigoTipoPatio = codigoTipoPatio;
    }

    public boolean isHabilitarRestricao() {// demonstra o habilitar restrição como boolean
        return habilitarRestricao;
    }

    public void setHabilitarRestricao(boolean habilitarRestricao) {//altera habilitar restrição
        this.habilitarRestricao = habilitarRestricao;
    }

    public String getIndicadorVinculado() {// demonstra o indicador vinculado como string
        return indicadorVinculado;
    }

    public void setIndicadorVinculado(String indicadorVinculado) {//altera indicador vinculado
        this.indicadorVinculado = indicadorVinculado;
    }

    public boolean isOperacional() {// demonstra o operacional como boolena
        return operacional;
    }

    public void setOperacional(boolean operacional) {//altera operacional
        this.operacional = operacional;
    }

    public int getTempoPadrao() {// demonstra o tempo padrão como int
        return tempoPadrao;
    }

    public void setTempoPadrao(int tempoPadrao) {//altera tempo padrão
        this.tempoPadrao = tempoPadrao;
    }

    public String getTipoRecuperacao() {// demonstra o tipo recuperação como int
        return tipoRecuperacao;
    }

    public void setTipoRecuperacao(String tipoRecuperacao) {//altera tipo recuperação
        this.tipoRecuperacao = tipoRecuperacao;
    }

    public int getCapacidadeMaximaArmazenamento() {// demonstra o capacidade maxima armazenamento como int
        return capacidadeMaximaArmazenamento;
    }

    public void setCapacidadeMaximaArmazenamento(int capacidadeMaximaArmazenamento) {//altera capaxidade maixma armazenamento
        this.capacidadeMaximaArmazenamento = capacidadeMaximaArmazenamento;
    }

    public int getCodigoNumerico() {// demonstra o codigo numerico como int
        return codigoNumerico;
    }

    public void setCodigoNumerico(int codigoNumerico) {//altera codigo numerico
        this.codigoNumerico = codigoNumerico;
    }

    public static void main(String[] args) {
        // Método principal da classe Entreposto
    }
}
