<table>
<tr>
<td>
<a href= "https://vale.com/pt/"><img src="https://upload.wikimedia.org/wikipedia/pt/c/cc/Logotipo_Vale.svg" alt="Vale" border="0" width="60%"></a>
</td>
<td><a href= "https://www.inteli.edu.br/"><img src="./inteli-logo.png" alt="Inteli - Instituto de Tecnologia e Liderança" border="0" width="40%"></a>
</td>
</tr>
</table>

# Introdução

Este é um dos repositórios do projeto de alunos do Inteli em parceria com a Vale no 1º semestre de 2024. Este projeto está sendo desenvolvido por alunos do Módulo 5 do curso de Ciência da Computação. É proposta uma abordagem estratégica para redefinir o planejamento logístico da Vale, alavancando a modelagem em grafos e a otimização para facilitar o fluxo eficiente de minério de ferro das minas aos clientes globais.     


# Projeto: Aumento da performance logística na distribuição de minério de ferro

# Grupo: *Minet*

## 👨‍🎓 Integrantes:

* <a href="https://www.linkedin.com/in/beatriz-monsanto-5a3a83267/">Beatriz Amorim Monsanto</a> 
* <a href="https://www.linkedin.com/in/drielly-farias/">Drielly Farias</a> 
* <a href="https://www.linkedin.com/in/enzo-bressane-72a030219/">Enzo Schiezaro Bressane</a> 
* <a href="https://www.linkedin.com/in/felipe-sabino-spina-b33372271/">Felipe Sabino Spina</a> 
* <a href="https://www.linkedin.com/in/fernando-machado-84673a212/">Fernando Machado dos Santos</a>  
* <a href="http://www.linkedin.com/in/gabrielcolettosilva">Gabriel Coletto Silva</a> 
* <a href="https://www.linkedin.com/in/lucasbmr/">Lucas Rego</a>
  
## 👩‍🏫 Professores:
### Orientador(a) 
- <a href="https://www.linkedin.com/in/tmsasaki?originalSubdomain=br">Tomaz Mikio Sasaki</a>
### Instrutores
- <a href="https://www.linkedin.com/in/rafael-will-m-de-araujo-20809b18b/?originalSubdomain=br">Rafael Will M. de Araujo</a>
- <a href="https://www.linkedin.com/in/cristinagramani/?originalSubdomain=br">Cristina Gramani</a>
- <a href="https://www.linkedin.com/in/anacristinadossantos/?originalSubdomain=br">Ana Cristina dos Santos</a>
- <a href="https://www.linkedin.com/in/filipe-gon%C3%A7alves-08a55015b/?originalSubdomain=br">Filipe Gonçalves</a> 
- <a href="https://www.linkedin.com/in/flavia-santoro-79704820?originalSubdomain=br">Flavia Santoro</a> 
- <a href="https://www.linkedin.com/in/filipe-gon%C3%A7alves-08a55015b/?originalSubdomain=br">Filipe Gonçalves</a>
- <a href="https://www.linkedin.com/in/janainamandra/?originalSubdomain=br">Janaína Mandra Garcia</a>
- <a href="https://www.linkedin.com/in/pedroteberga?originalSubdomain=br">Pedro Teberga</a>
- <a href="https://www.linkedin.com/in/sergio-venancio-a509b342/?originalSubdomain=br">Sergio Venancio</a>
- <a href="https://www.linkedin.com/in/filipe-gon%C3%A7alves-08a55015b/?originalSubdomain=br">Filipe Gonçalves</a> 
## Descrição

&emsp;Este projeto visa melhorar a eficiência logística na distribuição de minérios pela empresa VALE S.A., utilizando modelagem em grafos para otimizar o fluxo de minério das minas aos clientes, respeitando restrições operacionais e maximizando a satisfação do cliente. Enfoca na produção das minas distribuídas nos sistemas Sul, Sudeste, e Norte do Brasil, abordando desafios como diferentes qualidades de minério e a complexa malha logística. O objetivo é desenvolver uma solução simplificada, com expansão futura para uma abordagem mais abrangente, melhorando o tempo de resposta para avaliação dos cenários logísticos.

&emsp; A análise detalhada das operações logísticas atuais, considerando a diversidade de minas e a complexidade da malha logística, permite identificar oportunidades significativas de melhoria. Por meio da implementação de algoritmos de otimização, este projeto busca maximizar a satisfação do cliente, respeitando restrições operacionais e promovendo a sustentabilidade ambiental. A sinergia entre a tecnologia avançada e a expertise em mineração da Vale oferece uma oportunidade única para inovação e liderança no setor.

# Configuração de desenvolvimento
## Pré-requisitos
Antes de começar , é necessário que instale os seguintes softwares em seu sistema:
- **Java JDK 22**: Necessário para executar o backend do projeto.
- **Node.js**: Essencial para executar o frontend do projeto.
- **Maven**: Utilizado para gerenciar as dependências do projeto Java.

## Configuração do Projeto

### Clonar o Repositório
1. Inicialmente clone o repositório do projeto e navegue a té a pasta do projeto clonado.

### Configurar o Backend

2. Abra a pasta `planejador` com o IntelliJ IDEA.
3. Instale o Maven para gerenciar as dependências do projeto. No IntelliJ, isso geralmente é feito automaticamente.
4. Navegue até a subpasta `backend`.
5. Execute um build do projeto com Maven:

6. Execute a classe principal `BackendApplication` para iniciar o servidor backend.

### Configurar o Frontend

7. Após garantir que o backend está executando corretamente, abra outra instância do terminal.
8. Navegue até a pasta `buscador` utilizando o Visual Studio Code (VSCode).
9. Instale as dependências do projeto com o comando:
 ```
 npm install
 ```
10. Inicie a aplicação frontend com:
 ```
 npm start
 ```

Após seguir esses passos, o site deverá estar rodando localmente em seu navegador, com o backend e frontend integrados.

Se encontrar qualquer problema durante a instalação ou execução, verifique se todos os pré-requisitos foram corretamente instalados e configurados.


# Releases

* SPRINT 1 - 16/02/2024
    * Desenvolvimento da parte de negócios.
    * Desenvolvimento do modelo matemático.
    * Desenvolvimento da experiência do usuário. 
* SPRINT 2 - 30/02/2024
    * Desenvolvimento da versão inicial do artigo do projeto.
    * Entendimento do contexto do problema.
    * Desenvolvimento das classes e repositório do código. 
* SPRINT3 - 15/03/2024
    * Desenvolvimento inicial do front-end da aplicação.
    * Atualização do artigo.
    * Adequação da estrutura do grafo e algoritmo. 
* SPRINT4 - 28/03/2024
    * Aplicação integrada do front-end.
    * Atualização do artigo.
    * Análise de complexcidade e corretude do algoritmo. 
* SPRINT5 - 11/04/2024
    * Artigo finalizado.
    * Refinamento e validação da seção de negócios.
    * Refinamento da aplicação.

## 📋 Licença/License

<img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;" src="https://mirrors.creativecommons.org/presskit/icons/cc.svg?ref=chooser-v1"><img style="height:22px!important;margin-left:3px;vertical-align:text-bottom;" src="https://mirrors.creativecommons.org/presskit/icons/by.svg?ref=chooser-v1"><p xmlns:cc="http://creativecommons.org/ns#" xmlns:dct="http://purl.org/dc/terms/">

<a property="dct:title" rel="cc:attributionURL" href="https://github.com/2024M5T7-Inteli/g6">Minet</a> by <a rel="cc:attributionURL dct:creator" property="cc:attributionName" href="https://github.com/InteliProjects">Inteli</a>,<a property="dct:title" rel="cc:attributionURL" href="https://www.linkedin.com/in/beatriz-monsanto-5a3a83267/">Beatriz Amorim Monsanto</a>, <a property="dct:title" rel="cc:attributionURL" href="https://www.linkedin.com/in/drielly-farias/">Drielly Farias</a>, <a property="dct:title" rel="cc:attributionURL" href="https://www.linkedin.com/in/enzo-bressane-72a030219/">Enzo Schiezaro Bressane</a>, <a property="dct:title" rel="cc:attributionURL" href="https://www.linkedin.com/in/felipe-sabino-spina-b33372271/">Felipe Sabino Spina</a>, <a property="dct:title" rel="cc:attributionURL" href="https://www.linkedin.com/in/fernando-machado-84673a212/">Fernando Machado dos Santos</a>, <a property="dct:title" rel="cc:attributionURL" href="http://www.linkedin.com/in/gabrielcolettosilva">Gabriel Coletto Silva</a>, <a property="dct:title" rel="cc:attributionURL" href="https://www.linkedin.com/in/lucasbmr/">Lucas Bittencourt Moraes Rego</a> is licensed under <a href="https://creativecommons.org/licenses/by/4.0/?ref=chooser-v1" rel="license noopener noreferrer" style="display:inline-block;">Attribution 4.0 International</a>.</p>



