package inteli.cc5;

import java.util.Date;

/**
 * Cria a classe Porto, que se refere aos portos no modelo da empresa parceira, estendendo as propriedades de nó.
 */
public class Porto extends No {

    private String codigoPorto; // Define o código do porto.
    private int capacidadeMinimaEstocagem; // Define a capacidade mínima de estocagem do porto.
    private int capacidadeMaximaEstocagem; // Define a capacidade máxima de estocagem do porto.
    private boolean lotes; // Define se o porto opera com lotes.
    private boolean centroDistribuicao; // Define se o porto é um centro de distribuição.
    private boolean isChina; // Define se o porto está localizado na China.
    private String codigoInternacional; // Define o código internacional do porto.
    private String codigoPais; // Define o código do país do porto.
    private boolean restricaoHabilitada; // Define se existe restrição habilitada no porto.
    private int idProprietarioCliente; // Define o ID do proprietário cliente do porto.
    private Integer grupoPorto; // Define o grupo do porto.
    private Integer quantidadeDisponivelRebocadores; // Define a quantidade disponível de rebocadores.
    private int intervaloTempoAtracao; // Define o intervalo de tempo de atração.
    private int tempoDesatracagemCarregamento; // Define o tempo de desatracagem e carregamento.
    private int tempoOperacionalPadrao; // Define o tempo operacional padrão.
    private Date horarioFinalDPC; // Define o horário final DPC.
    private Date horarioInicialDPC; // Define o horário inicial DPC.
    private int tempoChegadaAntecipada; // Define o tempo de chegada antecipada.
    private int tamanhoExcesso; // Define o tamanho do excesso.
    private int tamanhoSublote; // Define o tamanho do sublote.
    private int ultimaSequencia; // Define a última sequência.
    private String descricao; // Define a descrição do porto.
    private boolean codigoNumerico; // Define se o código é numérico.
    private boolean ativo; // Define se o porto está ativo.

    /**
     * Construtor da classe Porto.
     * @param id                           O ID do porto.
     * @param descricao                    A descrição do porto.
     * @param tipoElo                      O tipo de elo do porto.
     * @param codigoSiteProduto            O código do site do produto associado ao porto.
     * @param codigoPorto                  O código do porto.
     * @param capacidadeMinimaEstocagem    A capacidade mínima de estocagem do porto.
     * @param capacidadeMaximaEstocagem    A capacidade máxima de estocagem do porto.
     * @param centroDistribuicao           Indica se o porto é um centro de distribuição.
     * @param codigoInternacional          O código internacional do porto.
     * @param codigoPais                   O código do país do porto.
     * @param idProprietarioCliente        O ID do proprietário cliente do porto.
     * @param grupoPorto                   O grupo do porto.
     * @param quantidadeDisponivelRebocadores A quantidade disponível de rebocadores.
     */
    public Porto(int id, String descricao, String tipoElo, String codigoSiteProduto,
                 String codigoPorto, int capacidadeMinimaEstocagem, int capacidadeMaximaEstocagem,
                 boolean centroDistribuicao, String codigoInternacional, String codigoPais,
                 int idProprietarioCliente, Integer grupoPorto, Integer quantidadeDisponivelRebocadores) {
        super(id, descricao, tipoElo, codigoSiteProduto);
        setCodigoPorto(codigoPorto);
        setCapacidadeMinima(capacidadeMinimaEstocagem);
        setCapacidadeMaxima(capacidadeMaximaEstocagem);
        setCentroDistribuicao(centroDistribuicao);
        setCodigoInternacional(codigoInternacional);
        setCodigoPais(codigoPais);
        setIdProprietarioCliente(idProprietarioCliente);
        setGrupoPorto(grupoPorto);
        setQuantidadeDisponivelRebocadores(quantidadeDisponivelRebocadores);
    }

    /**
     * Obtém o código do porto.
     * @return O código do porto.
     */
    public String getCodigoPorto() {
        return codigoPorto;
    }

    /**
     * Define o código do porto.
     * @param codigoPorto O código do porto.
     */
    public void setCodigoPorto(String codigoPorto) {
        this.codigoPorto = codigoPorto;
    }

    /**
     * Obtém a capacidade mínima de estocagem do porto.
     * @return A capacidade mínima de estocagem do porto.
     */
    public int getCapacidadeMinima() {
        return capacidadeMinimaEstocagem;
    }

    /**
     * Define a capacidade mínima de estocagem do porto.
     * @param capacidadeMinimaEstocagem A capacidade mínima de estocagem do porto.
     */
    public void setCapacidadeMinima(int capacidadeMinimaEstocagem) {
        this.capacidadeMinimaEstocagem = capacidadeMinimaEstocagem;
    }

    /**
     * Obtém a capacidade máxima de estocagem do porto.
     * @return A capacidade máxima de estocagem do porto.
     */
    public int getCapacidadeMaxima() {
        return capacidadeMaximaEstocagem;
    }

    /**
     * Define a capacidade máxima de estocagem do porto.
     * @param capacidadeMaximaEstocagem A capacidade máxima de estocagem do porto.
     */
    public void setCapacidadeMaxima(int capacidadeMaximaEstocagem) {
        this.capacidadeMaximaEstocagem = capacidadeMaximaEstocagem;
    }

    /**
     * Verifica se o porto opera com lotes.
     * @return Verdadeiro se o porto opera com lotes, falso caso contrário.
     */
    public boolean isLotes() {
        return lotes;
    }

    /**
     * Define se o porto opera com lotes.
     * @param lotes Verdadeiro se o porto opera com lotes, falso caso contrário.
     */
    public void setLotes(boolean lotes) {
        this.lotes = lotes;
    }

    /**
     * Verifica se o porto é um centro de distribuição.
     * @return Verdadeiro se o porto é um centro de distribuição, falso caso contrário.
     */
    public boolean isCentroDistribuicao() {
        return centroDistribuicao;
    }

    /**
     * Define se o porto é um centro de distribuição.
     * @param centroDistribuicao Verdadeiro se o porto é um centro de distribuição, falso caso contrário.
     */
    public void setCentroDistribuicao(boolean centroDistribuicao) {
        this.centroDistribuicao = centroDistribuicao;
    }

    /**
     * Verifica se o porto está localizado na China.
     * @return Verdadeiro se o porto está localizado na China, falso caso contrário.
     */
    public boolean isChina() {
        return isChina;
    }

    /**
     * Define se o porto está localizado na China.
     * @param china Verdadeiro se o porto está localizado na China, falso caso contrário.
     */
    public void setChina(boolean china) {
        isChina = china;
    }

    /**
     * Obtém o código internacional do porto.
     * @return O código internacional do porto.
     */
    public String getCodigoInternacional() {
        return codigoInternacional;
    }

    /**
     * Define o código internacional do porto.
     * @param codigoInternacional O código internacional do porto.
     */
    public void setCodigoInternacional(String codigoInternacional) {
        this.codigoInternacional = codigoInternacional;
    }

    /**
     * Obtém o código do país do porto.
     * @return O código do país do porto.
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Define o código do país do porto.
     * @param codigoPais O código do país do porto.
     */
    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    /**
     * Verifica se existe restrição habilitada no porto.
     * @return Verdadeiro se existe restrição habilitada no porto, falso caso contrário.
     */
    public boolean isRestricaoHabilitada() {
        return restricaoHabilitada;
    }

    /**
     * Define se existe restrição habilitada no porto.
     * @param restricaoHabilitada Verdadeiro se existe restrição habilitada no porto, falso caso contrário.
     */
    public void setRestricaoHabilitada(boolean restricaoHabilitada) {
        this.restricaoHabilitada = restricaoHabilitada;
    }

    /**
     * Obtém o ID do proprietário cliente do porto.
     * @return O ID do proprietário cliente do porto.
     */
    public int getIdProprietarioCliente() {
        return idProprietarioCliente;
    }

    /**
     * Define o ID do proprietário cliente do porto.
     * @param idProprietarioCliente O ID do proprietário cliente do porto.
     */
    public void setIdProprietarioCliente(int idProprietarioCliente) {
        this.idProprietarioCliente = idProprietarioCliente;
    }

    /**
     * Obtém o grupo do porto.
     * @return O grupo do porto.
     */
    public int getGrupoPorto() {
        return grupoPorto;
    }

    /**
     * Define o grupo do porto.
     * @param grupoPorto O grupo do porto.
     */
    public void setGrupoPorto(Integer grupoPorto) {
        this.grupoPorto = grupoPorto;
    }

    /**
     * Obtém a quantidade disponível de rebocadores.
     * @return A quantidade disponível de rebocadores.
     */
    public int getQuantidadeDisponivelRebocadores() {
        return quantidadeDisponivelRebocadores;
    }

    /**
     * Define a quantidade disponível de rebocadores.
     * @param quantidadeDisponivelRebocadores A quantidade disponível de rebocadores.
     */
    public void setQuantidadeDisponivelRebocadores(Integer quantidadeDisponivelRebocadores) {
        this.quantidadeDisponivelRebocadores = quantidadeDisponivelRebocadores;
    }

    /**
     * Obtém o intervalo de tempo de atração.
     * @return O intervalo de tempo de atração.
     */
    public int getIntervaloTempoAtracao() {
        return intervaloTempoAtracao;
    }

    /**
     * Define o intervalo de tempo de atração.
     * @param intervaloTempoAtracao O intervalo de tempo de atração.
     */
    public void setIntervaloTempoAtracao(int intervaloTempoAtracao) {
        this.intervaloTempoAtracao = intervaloTempoAtracao;
    }

    /**
     * Obtém o tempo de desatracagem e carregamento.
     * @return O tempo de desatracagem e carregamento.
     */
    public int getTempoDesatracagemCarregamento() {
        return tempoDesatracagemCarregamento;
    }

    /**
     * Define o tempo de desatracagem e carregamento.
     * @param tempoDesatracagemCarregamento O tempo de desatracagem e carregamento.
     */
    public void setTempoDesatracagemCarregamento(int tempoDesatracagemCarregamento) {
        this.tempoDesatracagemCarregamento = tempoDesatracagemCarregamento;
    }

    /**
     * Obtém o tempo operacional padrão.
     * @return O tempo operacional padrão.
     */
    public int getTempoOperacionalPadrao() {
        return tempoOperacionalPadrao;
    }

    /**
     * Define o tempo operacional padrão.
     * @param tempoOperacionalPadrao O tempo operacional padrão.
     */
    public void setTempoOperacionalPadrao(int tempoOperacionalPadrao) {
        this.tempoOperacionalPadrao = tempoOperacionalPadrao;
    }

    /**
     * Obtém o horário final DPC.
     * @return O horário final DPC.
     */
    public Date getHorarioFinalDPC() {
        return horarioFinalDPC;
    }

    /**
     * Define o horário final DPC.
     * @param horarioFinalDPC O horário final DPC.
     */
    public void setHorarioFinalDPC(Date horarioFinalDPC) {
        this.horarioFinalDPC = horarioFinalDPC;
    }

    /**
     * Obtém o horário inicial DPC.
     * @return O horário inicial DPC.
     */
    public Date getHorarioInicialDPC() {
        return horarioInicialDPC;
    }

    /**
     * Define o horário inicial DPC.
     * @param horarioInicialDPC O horário inicial DPC.
     */
    public void setHorarioInicialDPC(Date horarioInicialDPC) {
        this.horarioInicialDPC = horarioInicialDPC;
    }

    /**
     * Obtém o tempo de chegada antecipada.
     * @return O tempo de chegada antecipada.
     */
    public int getTempoChegadaAntecipada() {
        return tempoChegadaAntecipada;
    }

    /**
     * Define o tempo de chegada antecipada.
     * @param tempoChegadaAntecipada O tempo de chegada antecipada.
     */
    public void setTempoChegadaAntecipada(int tempoChegadaAntecipada) {
        this.tempoChegadaAntecipada = tempoChegadaAntecipada;
    }

    /**
     * Obtém o tamanho do excesso.
     * @return O tamanho do excesso.
     */
    public int getTamanhoExcesso() {
        return tamanhoExcesso;
    }

    /**
     * Define o tamanho do excesso.
     * @param tamanhoExcesso O tamanho do excesso.
     */
    public void setTamanhoExcesso(int tamanhoExcesso) {
        this.tamanhoExcesso = tamanhoExcesso;
    }

    /**
     * Obtém o tamanho do sublote.
     * @return O tamanho do sublote.
     */
    public int getTamanhoSublote() {
        return tamanhoSublote;
    }

    /**
     * Define o tamanho do sublote.
     * @param tamanhoSublote O tamanho do sublote.
     */
    public void setTamanhoSublote(int tamanhoSublote) {
        this.tamanhoSublote = tamanhoSublote;
    }

    /**
     * Obtém a última sequência.
     * @return A última sequência.
     */
    public int getUltimaSequencia() {
        return ultimaSequencia;
    }

    /**
     * Define a última sequência.
     * @param ultimaSequencia A última sequência.
     */
    public void setUltimaSequencia(int ultimaSequencia) {
        this.ultimaSequencia = ultimaSequencia;
    }

    /**
     * Obtém a descrição do porto.
     * @return A descrição do porto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do porto.
     * @param descricao A descrição do porto.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Verifica se o código é numérico.
     * @return Verdadeiro se o código é numérico, falso caso contrário.
     */
    public boolean isCodigoNumerico() {
        return codigoNumerico;
    }

    /**
     * Define se o código é numérico.
     * @param codigoNumerico Verdadeiro se o código é numérico, falso caso contrário.
     */
    public void setCodigoNumerico(boolean codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    /**
     * Verifica se o porto está ativo.
     * @return Verdadeiro se o porto está ativo, falso caso contrário.
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define se o porto está ativo.
     * @param ativo Verdadeiro se o porto está ativo, falso caso contrário.
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}