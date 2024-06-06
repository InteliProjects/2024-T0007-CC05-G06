# Diagrama de Classes UML (Linguagem de Modelagem Unificada)
## 1. Importância do Diagrama de Classes no Projeto

### 1.1 Por que o Diagrama de Classes é Crucial?

&emsp;&emsp;O Diagrama de Classes é uma ferramenta fundamental no desenvolvimento de projetos, especialmente em contextos complexos como o da indústria de mineração de minério de ferro, o foco do nosso projeto. Ele oferece uma linguagem padronizada para especificar, visualizar, construir e documentar os artefatos de sistemas de software, além de ajudar na estruturação e comunicação de conceitos complexos de forma clara e precisa. Esta modelagem permite definir a estrutura e o relacionamento entre as classes que representam objetos do mundo real dentro do sistema, facilitando o entendimento da arquitetura do software.<sup>1</sup>.

### 1.2 Quando o Diagrama de Classes é Usado no Mercado?

&emsp;&emsp;O Diagrama de Classes é amplamente utilizado em diversas fases do ciclo de desenvolvimento de software, desde a concepção até a implementação, passando pela documentação e manutenção. No mercado, seu uso se destaca principalmente nas etapas de análise e design de sistemas, onde a necessidade de compreender e comunicar os requisitos do sistema e a arquitetura proposta é mais crítica. Empresas de tecnologia, engenharia de software e desenvolvimento de sistemas complexos frequentemente adotam o Diagrama de Classes para facilitar o entendimento mútuo entre as equipes de desenvolvimento e as partes interessadas.<sup>2</sup>.

### 1.3 Relevância do Diagrama de Classes para o Projeto

&emsp;&emsp;No contexto do projeto, que visa otimizar a malha logística para a distribuição de minério de ferro da Vale, a utilização do Diagrama de Classes se torna particularmente relevante. A complexidade do sistema a ser desenvolvido, que envolve a integração de diferentes modais de transporte e a necessidade de atender especificações de qualidade de forma eficiente, exige uma ferramenta que auxilie na visualização das estruturas de dados, processos e interações entre os componentes do sistema. O Diagrama de Classes, ao oferecer uma visão clara das entidades envolvidas e suas relações, torna-se indispensável para o planejamento e implementação eficaz do projeto.


### 1.4 Descrição do Diagrama de Classes UML

<div align="center">
  <p><b>Figura 1 </b>- Diagrama UML </p>
  <img src="..\img\DiagramaDeClasses.drawio.svg" alt="Representação visual dos grafos">
  <p>Fonte: elaborado por MiNet</p>
</div>

### 1.4.1. Classe Nó
As seguintes classes são herdadas da Classe `Nó` : ` UsinaDeBeneficiamento`, `UsinaDePelotizacao`, `UsinaDeBriqueto`, `Entreposto`, `Porto` e `Cliente`.
#### 1.4.1.1 Atributos 

| Atributos   | Tipo    | Descrição                                           |
|-------------|---------|-----------------------------------------------------|
| `idX`       | inteiro |  Id do nó. |
| `idY`       | inteiro | Id do site produtivo que está associado ao nó. |
| `descricao` | String  | Nome do nó.                            |
| `tipoEloX`  | String  | Tipo do nó, pode ser : usina, pátio , porto , fornecedor, ou cliente  |
| `tipoEloY`  | String  | Tipo do site produtivo que está associado ao tipo do nó, tambem podendo ser : usina, pátio , porto , fornecedor, ou cliente  |

#### 1.4.1.2 Métodos

| Método          | Retorno | Descrição                                   |
|-----------------|---------|---------------------------------------------|
| `getIdX()`      |         | Retorna o idX do nó.            |
| `setIdX()`      |         | Define o idX do nó.             |
| `getIdY()`      |         | Retorna idY do nó.            |
| `setIdY()`      |         | Define o idY do nó.             |
| `getDescricao()`|         | Retorna a nome do nó.                  |
| `setDescricao()`|         | Define o nome do nó.                   |
| `getTipoEloX()` |         | Retorna o tipo do nó. |
| `getTipoEloY()` |         | Retorna o tipo do site produtivo relacionado ao nó. |
| `setTipoEloX()` |         | Define o "tipo elo".  |
| `setTipoEloY()` |         | Define o "tipo elo" em relação ao site produtivo .  |

### 1.4.2. Classe Cliente

Herda da classe `Nó`.
#### 1.4.2.1 Atributos
| Atributos                     | Tipo    | Descrição                                   |
|-------------------------------|---------|---------------------------------------------|
| `codigoCalendario`            | String  | Código associado ao calendário.             |
| `codigoCliente`               | String  | Código identificador do cliente.            |
| `codigoEscritorio`              | String  | Código identificador do escritório.           |
| `codigoMercado`               | String  | Código do mercado associado.                |
| `codigoPais`                  | String  | Código do país associado.                   |
| `codigoRegiao`                | String  | Código da região associada.                 |
| `grupoCliente`                | String  | Grupo a que o cliente pertence.             |
| `indicadorPrioridadeAtendimento` | inteiro | Indicador numérico de prioridade de atendimento. |
| `tempoPadraoOperacao`         | inteiro | Tempo padrão para operação.                 |

#### 1.4.2.2 Métodos

| Método                              | Descrição                                   |
|-------------------------------------|---------------------------------------------|
| `getId()`                           | Obtém o identificador da entidade.          |
| `setId()`                           | Define o identificador da entidade.         |
| `getCodigoCalendario()`             | Obtém o código do calendário.               |
| `setCodigoCalendario()`             | Define o código do calendário.              |
| `getCodigoCliente()`                | Obtém o código do cliente.                  |
| `setCodigoCliente()`                | Define o código do cliente.                 |
| `getCodigoEscritorio()`               | Obtém o código do escritório.                 |
| `setCodigoEscritorio()`               | Define o código do escritório.                |
| `getCodigoMercado()`                | Obtém o código do mercado.                  |
| `setCodigoMercado()`                | Define o código do mercado.                 |
| `getCodigoPais()`                   | Obtém o código do país.                     |
| `setCodigoPais()`                   | Define o código do país.                    |
| `getCodigoRegiao()`                 | Obtém o código da região.                   |
| `setCodigoRegiao()`                 | Define o código da região.                  |
| `getGrupoCliente()`                 | Obtém o grupo do cliente.                   |
| `setGrupoCliente()`                 | Define o grupo do cliente.                  |
| `getIndicadorPrioridadeAtendimento()` | Obtém o indicador de prioridade de atendimento. |
| `setIndicadorPrioridadeAtendimento()` | Define o indicador de prioridade de atendimento. |
| `getTempoPadraoOperacao()`         | Obtém o tempo padrão de operação.           |
| `setTempoPadraoOperacao()`         | Define o tempo padrão de operação.          |
### 1.4.3 Classe Entreposto

Herda da classe `Nó`.
#### 1.4.3.1 Atributos

| Atributos                            | Tipo     | Descrição                                        |
|--------------------------------------|----------|--------------------------------------------------|
| `capacidadeMaxima`                   | inteiro  | Capacidade máxima do entreposto.                 |
| `codigoPatio`                        | inteiro  | Código identificador do pátio.                   |
| `codigoTipoPatio`                    | inteiro  | Código do tipo de pátio.                         |
| `habilitarRestricao`                 | booleano | Indica se a restrição está habilitada.           |
| `indicadorVinculado`                 | String   | Indicador se o entreposto está vinculado.        |
| `operacional`                        | booleano | Status operacional do entreposto.                |
| `tempoPadrao`                        | inteiro  | Tempo padrão para alguma operação do entreposto. |
| `tipoRecuperacao`                    | String   | Tipo de recuperação aplicável ao entreposto.     |
| `capacidadeMaximaArmazenamento`      | inteiro  | Capacidade máxima de armazenamento.              |
| `codigoNumerico`                     | inteiro  | Código numérico do entreposto.                   |

#### 1.4.3.2 Métodos

| Método                                  | Descrição                                                |
|-----------------------------------------|----------------------------------------------------------|
| `getCapacidadeMaxima()`                 | Obtém a capacidade máxima do entreposto.                 |
| `setCapacidadeMaxima()`                 | Define a capacidade máxima do entreposto.                |
| `getCodigoPatio()`                      | Obtém o código do pátio.                                 |
| `setCodigoPatio()`                      | Define o código do pátio.                                |
| `getCodigoTipoPatio()`                  | Obtém o código do tipo de pátio.                         |
| `setCodigoTipoPatio()`                  | Define o código do tipo de pátio.                        |
| `isHabilitarRestricao()`                | Verifica se a restrição está habilitada.                 |
| `setHabilitarRestricao()`               | Habilita ou desabilita a restrição.                      |
| `getIndicadorVinculado()`               | Obtém o indicador de vinculação do entreposto.           |
| `setIndicadorVinculado()`               | Define o indicador de vinculação do entreposto.          |
| `isOperacional()`                       | Verifica se o entreposto está operacional.               |
| `setOperacional()`                      | Define o status operacional do entreposto.               |
| `getTempoPadrao()`                      | Obtém o tempo padrão para operações do entreposto.       |
| `setTempoPadrao()`                      | Define o tempo padrão para operações do entreposto.      |
| `getTipoRecuperacao()`                  | Obtém o tipo de recuperação do entreposto.               |
| `setTipoRecuperacao()`                  | Define o tipo de recuperação do entreposto.              |
| `getCapacidadeMaximaArmazenamento()`    | Obtém a capacidade máxima de armazenamento do entreposto.|
| `setCapacidadeMaximaArmazenamento()`    | Define a capacidade máxima de armazenamento do entreposto.|
| `getCodigoNumerico()`                   | Obtém o código numérico do entreposto.                   |
| `setCodigoNumerico()`                   | Define o código numérico do entreposto.                  |

### 1.4.4 Classe Fornecedores

#### 1.4.4.1 Atributos

| Atributos          | Tipo     | Descrição                                 |
|--------------------|----------|-------------------------------------------|
| `id`               | inteiro  | Identificador único do fornecedor.        |
| `codigoFornecedor` |          | Código identificador do fornecedor.       |
| `ativo`            | booleano | Indica se o fornecedor está ativo.        |

#### 1.4.4.2 Métodos

| Método                  | Descrição                                      |
|-------------------------|------------------------------------------------|
| `getId()`               | Obtém o identificador do fornecedor.           |
| `setId()`               | Define o identificador do fornecedor.          |
| `getCodigoFornecedor()` | Obtém o código do fornecedor.                  |
| `setCodigoFornecedor()` | Define o código do fornecedor.                 |
| `isAtivo()`             | Verifica se o fornecedor está ativo.           |
| `setAtivo()`            | Define o status de atividade do fornecedor.    |

### 1.4.5 Classe UsinaDeBriquete

#### 1.4.5.1 Atributos

| Atributos                   | Tipo     | Descrição                                      |
|-----------------------------|----------|------------------------------------------------|
| `codigoDeBriquete`          | String   | Código identificador do briquete.              |
| `consideraFeed`             | booleano | Indica se o feed é considerado no processo.    |
| `idEmpresaProprietaria`     | inteiro  | Identificador da empresa proprietária.         |
| `minimoObrigatorio`         | inteiro  | Quantidade mínima obrigatória para produção.   |
| `percentualVale`            | inteiro  | Percentual do valor do vale no processo.       |
| `codigoNumerico`            | inteiro  | Código numérico associado à usina.             |

#### 1.4.5.2 Métodos

| Método                         | Descrição                                               |
|--------------------------------|---------------------------------------------------------|
| `setCodigoDeBriquete()`        | Define o código do briquete.                            |
| `getCodigoDeBriquete()`        | Obtém o código do briquete.                             |
| `setConsideraFeed()`           | Define se o feed é considerado no processo.             |
| `isConsideraFeed()`            | Verifica se o feed é considerado no processo.           |
| `setIdEmpresaProprietaria()`   | Define o identificador da empresa proprietária.         |
| `getIdEmpresaProprietaria()`   | Obtém o identificador da empresa proprietária.          |
| `setMinimoObrigatorio()`       | Define a quantidade mínima obrigatória para produção.   |
| `getMinimoObrigatorio()`       | Obtém a quantidade mínima obrigatória para produção.    |
| `setPercentualVale()`          | Define o percentual do valor do vale no processo.       |
| `getPercentualVale()`          | Obtém o percentual do valor do vale no processo.        |
| `setCodigoNumerico()`          | Define o código numérico da usina.                      |
| `getCodigoNumerico()`          | Obtém o código numérico da usina.                       |

### 1.4.6 Classe UsinaDePelotizacao

#### 1.4.6.1 Atributos 

| Atributos                    | Tipo     | Descrição                                      |
|------------------------------|----------|------------------------------------------------|
| `codigoDePelotizacao`        | String   | Código identificador do processo de pelotização.|
| `consideraFeed`              | booleano | Indica se o feed é considerado no processo.    |
| `idEmpresaProprietaria`      | inteiro  | Identificador da empresa proprietária.         |
| `minimoObrigatorio`          | inteiro  | Quantidade mínima obrigatória para produção.   |
| `percentualVale`             | inteiro  | Percentual do valor do vale no processo.       |
| `codigoNumerico`             | inteiro  | Código numérico associado à usina.             |

#### 1.4.6.2 Métodos 

| Método                          | Descrição                                               |
|---------------------------------|---------------------------------------------------------|
| `setCodigoDePelotizacao()`      | Define o código do processo de pelotização.             |
| `getCodigoDePelotizacao()`      | Obtém o código do processo de pelotização.              |
| `setConsideraFeed()`            | Define se o feed é considerado no processo.             |
| `isConsideraFeed()`             | Verifica se o feed é considerado no processo.           |
| `setIdEmpresaProprietaria()`    | Define o identificador da empresa proprietária.         |
| `getIdEmpresaProprietaria()`    | Obtém o identificador da empresa proprietária.          |
| `setMinimoObrigatorio()`        | Define a quantidade mínima obrigatória para produção.   |
| `getMinimoObrigatorio()`        | Obtém a quantidade mínima obrigatória para produção.    |
| `setPercentualVale()`           | Define o percentual do valor do vale no processo.       |
| `getPercentualVale()`           | Obtém o percentual do valor do vale no processo.        |
| `setCodigoNumerico()`           | Define o código numérico da usina.                      |
| `getCodigoNumerico()`           | Obtém o código numérico da usina.                       |

### 1.4.7 Classe UsinaBeneficiamento

#### 1.4.7.1 Atributos 

| Atributos          | Tipo    | Descrição                                      |
|--------------------|---------|------------------------------------------------|
| `codigoDaUsina`    | String  | Código identificador da usina de beneficiamento. |
| `minimoObrigatorio`| inteiro | Quantidade mínima obrigatória para processo na usina. |

#### 1.4.7.1 Métodos 

| Método                   | Descrição                                             |
|--------------------------|-------------------------------------------------------|
| `getCodigoDaUsina()`     | Obtém o código identificador da usina de beneficiamento. |
| `setCodigoDaUsina()`     | Define o código identificador da usina de beneficiamento. |
| `getMinimoObrigatorio()` | Obtém a quantidade mínima obrigatória para o processo.   |
| `setMinimoObrigatorio()` | Define a quantidade mínima obrigatória para o processo.   |

### 1.4.8 Classe Porto

#### 1.4.8.1 Atributos 
| Atributos                          | Tipo     | Descrição                                      |
|------------------------------------|----------|------------------------------------------------|
| `codigoPorto`                      | inteiro  | Código identificador do porto.                 |
| `capacidadeMinima`                 | inteiro  | Capacidade mínima operacional do porto.        |
| `lotes`                            | booleano | Indica se o porto opera com lotes.             |
| `centroDistribuicao`               | booleano | Indica se o porto é um centro de distribuição. |
| `isChina`                          | booleano | Indica se o porto está localizado na China.    |
| `codigoInternacional`              | String   | Código internacional do porto.                 |
| `codigoPais`                       | String   | Código do país onde o porto está localizado.   |
| `restricaoHabilitada`              | booleano | Indica se há alguma restrição habilitada.      |
| `idProprietarioCliente`            | inteiro  | ID do proprietário ou cliente do porto.        |
| `grupoPorto`                       | inteiro  | Grupo ao qual o porto pertence.                |
| `quantidadeDisponivelRecobradores` | inteiro  | Quantidade disponível de recobradores.         |
| `intervaloTempoAtracao`            | inteiro  | Intervalo de tempo de atração ao porto.        |
| `tempoDescargaCargaemnto`          | inteiro  | Tempo de descarga de carregamento.             |
| `tempoOperacionalPadrao`           | inteiro  | Tempo operacional padrão do porto.             |
| `horarioFinalDPC`                  | Data     | Horário final para Despacho Posterior à Chegada. |
| `horarioInicialDPC`                | Data     | Horário inicial para Despacho Posterior à Chegada. |
| `tempoChegadaAntecipada`           | inteiro  | Tempo para chegada antecipada.                 |
| `tamanhoExcesso`                   | inteiro  | Tamanho do excesso permitido.                  |
| `tamanhoSublote`                   | inteiro  | Tamanho do sublote.                            |
| `ultimaSequencia`                  | inteiro  | Última sequência registrada.                   |
| `codigoNumerico`                   | booleano | Indica se o porto possui um código numérico.   |

#### 1.4.8.2 Métodos 

| Método                               | Descrição                                      |
|--------------------------------------|------------------------------------------------|
| `setCodigoPorto()`                   | Define o código do porto.                       |
| `getCodigoPorto()`                   | Obtém o código do porto.                        |
| `setCapacidadeMinima()`              | Define a capacidade mínima do porto.            |
| `getCapacidadeMinima()`              | Obtém a capacidade mínima do porto.             |
| `setLotes()`                         | Define se o porto opera com lotes.              |
| `isLotes()`                          | Verifica se o porto opera com lotes.            |
| `setCentroDistribuicao()`            | Define se o porto é um centro de distribuição.  |
| `isCentroDistribuicao()`             | Verifica se o porto é um centro de distribuição.|
| `setIsChina()`                       | Define se o porto está localizado na China.     |
| `isChina()`                          | Verifica se o porto está localizado na China. |
| `setCodigoInternacional()`| Define o código internacional do porto. |
| `getCodigoInternacional()` | Obtém o código internacional do porto. |
| `setCodigoPais()` | Define o código do país do porto. |
| `getCodigoPais()` | Obtém o código do país do porto. |
| `setRestricaoHabilitada()` | Define uma restrição no porto. |
| `isRestricaoHabilitada()` | Verifica se existe alguma restrição no porto. |
| `setIdProprietarioCliente()` | Define o ID do proprietário ou cliente. |
| `getIdProprietarioCliente()` | Obtém o ID do proprietário ou cliente. |
| `setGrupoPorto()` | Define o grupo do porto. |
| `getGrupoPorto()` | Obtém o grupo do porto. |
| `setQuantidadeDisponivelRecobradores()` | Define a quantidade de recobradores disponíveis.|
| `getQuantidadeDisponivelRecobradores()` | Obtém a quantidade de recobradores disponíveis.|
| `setIntervaloTempoAtracao()` | Define o intervalo de tempo de atração. |
| `getIntervaloTempoAtracao()` | Obtém o intervalo de tempo de atração. |
| `setTempoDescargaCargaemnto()` | Define o tempo de descarga de carregamento. |
| `getTempoDescargaCargaemnto()` | Obtém o tempo de descarga de carregamento. |
| `setTempoOperacionalPadrao()` | Define o tempo operacional padrão do porto. |
| `getTempoOperacionalPadrao()` | Obtém o tempo operacional padrão do porto. |
| `setHorarioFinalDPC()` | Define o horário final para DPC. |
| `getHorarioFinalDPC()` | Obtém o horário final para DPC. |
| `setHorarioInicialDPC()` | Define o horário inicial para DPC. |
| `getHorarioInicialDPC()` | Obtém o horário inicial para DPC. |
| `setTempoChegadaAntecipada()` | Define o tempo para chegada antecipada. |
| `getTempoChegadaAntecipada()` | Obtém o tempo para chegada antecipada. |
| `setTamanhoExcesso()` | Define o tamanho do excesso permitido. |
| `getTamanhoExcesso()` | Obtém o tamanho do excesso permitido. |
| `setTamanhoSublote()` | Define o tamanho do sublote. |
| `getTamanhoSublote()` | Obtém o tamanho do sublote. |
| `setUltimaSequencia()` | Define a última sequência registrada. |
| `getUltimaSequencia()` | Obtém a última sequência registrada. |
| `setCodigoNumerico()` | Define se o porto tem um código numérico. |
| `isCodigoNumerico()` | Verifica se o porto tem um código numérico. |

### 1.4.9 Classe Transporte

#### 1.4.9.1 Atributos 
| Atributos              | Tipo    | Descrição                                       |
|------------------------|---------|-------------------------------------------------|
| `idX`                  | inteiro | Id do transporte. |
| `idY`                  | inteiro | Id do site produtivo do transporte. |
| `descricao`            | String  | Nome do transporte.                        |
| `tipoEloX`             | String  | Tipo do transporte.            |
| `tipoEloY`             | String  | Tipo do transporte relacionado ao site produtivo.            |
| `codigoSiteProduto`    | String  | Código do site relacionado ao produto.          |
| `codigoSubModal`       | String  | Código do submodal de transporte.               |
| `idCadeiaOrigem`       | inteiro | Identificador da cadeia de origem do transporte.|
| `idRedeSubTransporte`  | inteiro | Identificador da rede de subtransporte.         |

#### 1.4.9.2 Métodos 

| Método                       | Descrição                                          |
|------------------------------|----------------------------------------------------|
| `getIdX()`                   | Obtém o idX .             |
| `setIdX()`                   | Define o idX.            |
| `getIdY()`                   | Obtém o idY             |
| `setIdY()`                   | Define o idY            |
| `getTipoEloX()`              | Obtém o "tipo de elo" de transporte.       |
| `setTipoEloX()`              | Define o "tipo de elo" de transporte.      |
| `getTipoEloY()`              | Obtém "tipo de elo" de transporte em relação ao site produtivo |
| `setTipoEloY()`              | Define "tipo de elo" de transporte em relação ao site produtivo      |
| `getCodigoSiteProduto()`     | Obtém o código do site relacionado ao produto.     |
| `setCodigoSiteProduto()`     | Define o código do site relacionado ao produto.    |
| `getCodigoSubModal()`        | Obtém o código do submodal de transporte.          |
| `setCodigoSubModal()`        | Define o código do submodal de transporte.         |
| `getIdCadeiaOrigem()`        | Obtém o identificador da cadeia de origem.         |
| `setIdCadeiaOrigem()`        | Define o identificador da cadeia de origem.        |
| `getIdRedeSubTransporte()`   | Obtém o identificador da rede de subtransporte.    |
| `setIdRedeSubTransporte()`   | Define o identificador da rede de subtransporte.   |



### 1.5 Conclusão:
&emsp;&emsp; Em resumo, a adoção da Modelagem UML é um passo estratégico para o sucesso do nosso projeto, pois oferece os meios para abordar sua complexidade de maneira organizada e eficiente, alinhando as soluções propostas com os objetivos de negócio da Vale.

### 1.6 Referências:

1. Lucidchart. O que é um diagrama de classe UML? Disponível em: https://www.lucidchart.com/pages/pt/o-que-e-diagrama-de-classe-uml. Acesso em: 29 fev. 2024.

2. IBM. (2024). Diagramas de classe. Disponível em: https://www.ibm.com/docs/pt-br/rsas/7.5.0?topic=structure-class-diagrams. Acesso em: 29 fev. 2024




