package inteli.cc5;
import java.util.Date;

// cria a classe Porto, que se refere aos portos no modelo da empresa parceira, estendendo as propriedades de nó
public class Porto extends No {

    private int codigoPorto; // define o codigo do porto
    private int capacidadeMinima; // define a capacidade minima do porto
    private boolean lotes; // define se o porto opera com lotes
    private boolean centroDistribuicao; // define se o porto é um centro de distribuição
    private boolean isChina; // define se o porto está localizado na China
    private String codigoInternacional; // define o codigo internacional do porto
    private String codigoPais; // define o codigo do pais do porto
    private boolean restricaoHabilitada; // define se existe restricao habilitada no porto
    private int idProprietarioCliente; // define o id do proprietario cliente do porto
    private int grupoPorto; // define o grupo do porto
    private int quantidadeDisponivelRebocadores; // define a quantidade disponivel de rebocadores
    private int intervaloTempoAtracao; // define o intervalo de tempo de atracação
    private int tempoDesatracagemCarregamento; // define o tempo de desatracagem e carregamento
    private int tempoOperacionalPadrao; // define o tempo operacional padrão
    private Date horarioFinalDPC; // define o horario final DPC
    private Date horarioInicialDPC; // define o horario inicial DPC
    private int tempoChegadaAntecipada; // define o tempo de chegada antecipada
    private int tamanhoExcesso; // define o tamanho do excesso
    private int tamanhoSublote; // define o tamanho do sublote
    private int ultimaSequencia; // define a ultima sequencia
    private String descricao; // define a descricao do porto
    private boolean codigoNumerico; // define se o codigo é numerico
    private boolean ativo; // define se o porto está ativo
    
    public int getCodigoPorto() { // demonstra o codigo do porto como Inteiro
        return codigoPorto;
    }

    public void setCodigoPorto(int codigoPorto) { // altera o valor do codigo do porto
        this.codigoPorto = codigoPorto;
    }

    public int getCapacidadeMinima() { // demonstra a capacidade minima como Inteiro
        return capacidadeMinima;
    }

    public void setCapacidadeMinima(int capacidadeMinima) { // altera o valor da capacidade minima
        this.capacidadeMinima = capacidadeMinima;
    }

    public boolean isLotes() { // demonstra se opera com lotes como Boolean
        return lotes;
    }

    public void setLotes(boolean lotes) { // altera o funcionamento com lotes
        this.lotes = lotes;
    }

    public boolean isCentroDistribuicao() { // demonstra se é centro de distribuição como Boolean
        return centroDistribuicao;
    }

    public void setCentroDistribuicao(boolean centroDistribuicao) { // altera se é centro de distribuição
        this.centroDistribuicao = centroDistribuicao;
    }

    public boolean isisChina() { // demonstra se está na China como Boolean
        return isChina;
    }

    public void setisChina(boolean isChina) { // altera se está localizado na China
        this.isChina = isChina;
    }

    public String getCodigoInternacional() { // demonstra o codigo internacional como String
        return codigoInternacional;
    }

    public void setCodigoInternacional(String codigoInternacional) { // altera o valor do codigo internacional
        this.codigoInternacional = codigoInternacional;
    }

    public String getCodigoPais() { // demonstra o codigo do pais como String
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) { // altera o valor do codigo do pais
        this.codigoPais = codigoPais;
    }

    public boolean isRestricaoHabilitada() { // demonstra se a restrição está habilitada como Boolean
        return restricaoHabilitada;
    }

    public void setRestricaoHabilitada(boolean restricaoHabilitada) { // altera se a restrição está habilitada
        this.restricaoHabilitada = restricaoHabilitada;
    }

    public int getIdProprietarioCliente() { // demonstra o id do proprietario cliente como Inteiro
        return idProprietarioCliente;
    }

    public void setIdProprietarioCliente(int idProprietarioCliente) { // altera o id do proprietario cliente
        this.idProprietarioCliente = idProprietarioCliente;
    }

    public int getGrupoPorto() { // demonstra o grupo do porto como Inteiro
        return grupoPorto;
    }

    public void setGrupoPorto(int grupoPorto) { // altera o grupo do porto
        this.grupoPorto = grupoPorto;
    }

    public int getQuantidadeDisponivelRebocadores() { // demonstra a quantidade disponivel de rebocadores como Inteiro
        return quantidadeDisponivelRebocadores;
    }

    public void setQuantidadeDisponivelRebocadores(int quantidadeDisponivelRebocadores) { // altera a quantidade disponivel de rebocadores
        this.quantidadeDisponivelRebocadores = quantidadeDisponivelRebocadores;
    }

    public int getIntervaloTempoAtracao() { // demonstra o intervalo de tempo de atracação como Inteiro
        return intervaloTempoAtracao;
    }

    public void setIntervaloTempoAtracao(int intervaloTempoAtracao) { // altera o intervalo de tempo de atracação
        this.intervaloTempoAtracao = intervaloTempoAtracao;
    }

    public int getTempoDesatracagemCarregamento() { // demonstra o tempo de desatracagem e carregamento como Inteiro
        return tempoDesatracagemCarregamento;
    }

    public void setTempoDesatracagemCarregamento(int tempoDesatracagemCarregamento) { // altera o tempo de desatracagem e carregamento
        this.tempoDesatracagemCarregamento = tempoDesatracagemCarregamento;
    }

    public int getTempoOperacionalPadrao() { // demonstra o tempo operacional padrão como Inteiro
        return tempoOperacionalPadrao;
    }

    public void setTempoOperacionalPadrao(int tempoOperacionalPadrao) { // altera o tempo operacional padrão
        this.tempoOperacionalPadrao = tempoOperacionalPadrao;
    }

    public Date getHorarioFinalDPC() { // demonstra o horario final DPC como Date
        return horarioFinalDPC;
    }

    public void setHorarioFinalDPC(Date horarioFinalDPC) { // altera o horario final DPC
        this.horarioFinalDPC = horarioFinalDPC;
    }

    public Date getHorarioInicialDPC() { // demonstra o horario inicial DPC como Date
        return horarioInicialDPC;
    }

    public void setHorarioInicialDPC(Date horarioInicialDPC) { // altera o horario inicial DPC
        this.horarioInicialDPC = horarioInicialDPC;
    }

    public int getTempoChegadaAntecipada() { // demonstra o tempo de chegada antecipada como Inteiro
        return tempoChegadaAntecipada;
    }

    public void setTempoChegadaAntecipada(int tempoChegadaAntecipada) { // altera o tempo de chegada antecipada
        this.tempoChegadaAntecipada = tempoChegadaAntecipada;
    }

    public int getTamanhoExcesso() { // demonstra o tamanho do excesso como Inteiro
        return tamanhoExcesso;
    }

    public void setTamanhoExcesso(int tamanhoExcesso) { // altera o tamanho do excesso
        this.tamanhoExcesso = tamanhoExcesso;
    }

    public int getTamanhoSublote() { // demonstra o tamanho do sublote como Inteiro
        return tamanhoSublote;
    }

    public void setTamanhoSublote(int tamanhoSublote) { // altera o tamanho do sublote
        this.tamanhoSublote = tamanhoSublote;
    }

    public int getUltimaSequencia() { // demonstra a ultima sequencia como Inteiro
        return ultimaSequencia;
    }

    public void setUltimaSequencia(int ultimaSequencia) { // altera a ultima sequencia
        this.ultimaSequencia = ultimaSequencia;
    }

    public String getDescricao() { // demonstra a descricao como String
        return descricao;
    }

    public void setDescricao(String descricao) { // altera a descricao
        this.descricao = descricao;
    }

    public boolean isCodigoNumerico() { // demonstra se o codigo é numerico como Boolean
        return codigoNumerico;
    }

    public void setCodigoNumerico(boolean codigoNumerico) { // altera se o codigo é numerico
        this.codigoNumerico = codigoNumerico;
    }

    public boolean isAtivo() { // demonstra se está ativo como Boolean
        return ativo;
    }

    public void setAtivo(boolean ativo) { // altera se está ativo
        this.ativo = ativo;
    }
}
