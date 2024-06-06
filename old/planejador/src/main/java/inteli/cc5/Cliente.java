package inteli.cc5;

// cria a classe Cliente, que se refere aos clientes no modelo da empresa parceira, trazendo também as propriedades de nó
public class Cliente extends No {
    private String codigoCalendario; // define o codigo do calendario
    private String codigoCliente; // define o codigo do cliente
    private String codigoEscritorio; // define o codigo do escritorio
    private String codigoMercado; // define o codigo do mercado
    private String codigoPais; // define o codigo do pais
    private String codigoRegiao; // define o codigo da região
    private String grupoCliente; // define o grupo do cliente
    private int indicadorPrioridadeAtendimento; // define o indicador de prioridade de atendimento
    private int tempoPadraoOperacao; // define o tempo padrão de operação
    private String unidadeFederativa; // define a unidade federativa

    public String getCodigoCalendario() { // demonstra o codigo do calendario como String
        return codigoCalendario;
    }

    public void setCodigoCalendario(String codigoCalendario) { // altera o valor do codigo do calendario
        this.codigoCalendario = codigoCalendario;
    }

    public String getCodigoCliente() { // demonstra o codigo do cliente como String
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) { // altera o valor do codigo do cliente
        this.codigoCliente = codigoCliente;
    }

    public String getCodigoEscritorio() { // demonstra o codigo do escritorio como String
        return codigoEscritorio;
    }

    public void setCodigoEscritorio(String codigoEscritorio) { // altera o valor do codigo do escritorio
        this.codigoEscritorio = codigoEscritorio;
    }

    public String getCodigoMercado() { // demonstra o codigo do mercado como String
        return codigoMercado;
    }

    public void setCodigoMercado(String codigoMercado) { // altera o valor do codigo do mercado
        this.codigoMercado = codigoMercado;
    }

    public String getCodigoPais() { // demonstra o codigo do pais como String
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) { // altera o valor do codigo do pais
        this.codigoPais = codigoPais;
    }

    public String getCodigoRegiao() { // demonstra o codigo da região como String
        return codigoRegiao;
    }

    public void setCodigoRegiao(String codigoRegiao) { // altera o valor do codigo da região
        this.codigoRegiao = codigoRegiao;
    }

    public String getGrupoCliente() { // demonstra o grupo do cliente como String
        return grupoCliente;
    }

    public void setGrupoCliente(String grupoCliente) { // altera o valor do grupo do cliente
        this.grupoCliente = grupoCliente;
    }

    public int getIndicadorPrioridadeAtendimento() { // demonstra o indicador de prioridade de atendimento como Inteiro
        return indicadorPrioridadeAtendimento;
    }

    public void setIndicadorPrioridadeAtendimento(int indicadorPrioridadeAtendimento) { // altera o valor do indicador de prioridade de atendimento
        this.indicadorPrioridadeAtendimento = indicadorPrioridadeAtendimento;
    }

    public int getTempoPadraoOperacao() { // demonstra o tempo padrão de operação como Inteiro
        return tempoPadraoOperacao;
    }

    public void setTempoPadraoOperacao(int tempoPadraoOperacao) { // altera o valor do tempo padrão de operação
        this.tempoPadraoOperacao = tempoPadraoOperacao;
    }

    public String getUnidadeFederativa() { // demonstra a unidade federativa como String
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(String unidadeFederativa) { // altera o valor da unidade federativa
        this.unidadeFederativa = unidadeFederativa;
    }

    public static void main(String[] args) {

    }
}
