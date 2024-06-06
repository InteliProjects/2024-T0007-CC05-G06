# Complexidade e corretude do algoritmo

## Introdução

&emsp;&emsp;Neste documento, são apresentados os algoritmos propostos e aplicados computacionalmente para a execução da solução esperada pela empresa parceira (Vale). A problemática que cerceia este projeto está devidamente enunciada e referenciada nos demais arquivos que complementam este repositório, explicitando as nuances técnicas e o resultado aguardado. 

&emsp;&emsp;De maneira sintática, entretanto, compreende-se que a proposta é de maximizar o transporte do minério de ferro, partindo das diferentes usinas e chegando, finalmente, ao cliente, atendendo a demanda. Para alcançar tal resultado, os dados de localidade e caminhos, tais quais as informações de capacidade máxima (estes em formato .xml), foram convertidos para classes em Java, linguagem de programação utilizada mundialmente. De maneira sequencial, foi implementado um modelo de Grafos que consiste na enorme malha de transportes que representa o complexo sistema de distribuição da empresa cliente. Finalmente, foram implementados neste modelo diferentes algoritmos, referenciados abaixo, que pretendem atender a esta solução de Fluxo Máximo. 


## Algoritmos escolhidos

&emsp;&emsp;Para a solução idealizada, foram escolhidos 2 algoritmos distintos, cada qual com suas restrições e pontos positivos. Estes foram:

 - Algoritmo de Ford-Fulkerson
 - Algoritmo de Dinic

&emsp;&emsp;O Algoritmo de Ford-Fulkerson foi desenvolvido em 1956 pelos matemáticos norte-americanos Lester Randolph Ford Jr. (1927 - 2017) e Delbert Ray Fulkerson (1924 - 1976) como uma solução para problemas de fluxo máximo. Este algoritmo, por sua vez, calcula o fluxo máximo de uma rede (representado computacionalmente através de um dígrafo direcionado) a partir de um fluxo viável. O algoritmo percorre todos os vértices, buscando caminho de aumento de fluxo entre a fonte (ponto de saída) e o sumidouro (ponto de chegada). Assim que este caminho é encontrado, o algoritmo amplia o fluxo da rede. 

&emsp;&emsp;Apesar de apresentar uma implementação relativamente simples, este pode apresentar alguns problemas em determinados casos especificados. Ciclos negativos, a via de exemplo, são uma problemática que levam ao algoritmo a não convergir ou a convergir para um fluxo negativo infinito. Em sequência, o modelo não funciona para situações nas quais não estão apresentados um sumidouro ou fonte únicas.

&emsp;&emsp;Já o algoritmo de Dinic (também conhecido como algoritmo de Dinitz) foi desenvolvido em 1970 pelo cientista da computação soviético Yefim Dinitz. O principal propósito de seu surgimento foi de trazer uma nova abordagem para a parametrização do fluxo máximo em dígrafos ponderados, fazendo-o de maneira extremamente rápida.

&emsp;&emsp;Apresentando-se uma fonte e um sumidouro e uma contextualização semelhante a do algoritmo anterior (como a restrição baseada na capacidade dos caminhos distintos), o método de Dinic utiliza de _Breadth-first search_ (Busca em largura, em português) e _Depth-first search_ (Busca em profundidade) como técnicas de travessia em grafos para procurar o maior fluxo possível do ponto de partida ao de chegada, eliminando todos os caminhos dos grafos residuais e checando a necessidade de se construir um grafo de níveis. Neste, é atribuído um valor em cada um dos nós relacionado a sua distância em relação à fonte. Apresenta uma melhora substancial de otimização temporal em relação aos algoritmos anteriores, principalmente quando os dados abordados contêm um grande número de restrições (que não são variáveis no cálculo de complexidade deste algoritmo).

## Análise dos algoritmos escolhidos
### Ford-Fulkerson:
&emsp;&emsp;Na composição de uma análise concreta do algoritmo clássico escolhido, considera-se que sua aplicação se deve à quantidade de arestas presentes dentro do grafo que será alvo do código proposto e o fluxo máximo presente no sistema. Sabendo disto e considerando a relação de componentes dentro da solução, pode-se concluir que a complexidade do algoritmo de Ford-Fulkerson, em seu caso base, é de $O(Ef)$, sendo que $E$ é a quantidade de arestas presentes no grafo $G$ e $f$ o fluxo máximo encontrado.
	
- **Melhor caso:** o melhor caso para o algoritmo descrito se dá quando este atinge rapidamente o fluxo máximo utilizando o mínimo de iterações possíveis. Isto se dá quando é encontrado o caminho aumentador rapidamente, sendo que este apresenta um valor significativo de capacidade. Outro momento em que o melhor caso pode ser encontrado é em grafos com a existência de uma multiplicidade de caminhos aumentadores de capacidade relativamente alta. Ocorrendo isto rapidamente, atinge-se também o melhor caso para Ford-Fulkerson.
- **Pior caso:** Por outro lado, o pior caso do algoritmo de Ford-Fulkerson ocorre em situações nas quais existe uma escassez de caminhos aumentadores ou uma estrutura de rede que torna a busca realizada ineficiente. Imagine uma rede em que os caminhos aumentadores são escassos ou têm capacidades muito baixas. Nesse cenário, o algoritmo pode ter dificuldade em encontrar um caminho aumentador útil, levando a múltiplas iterações sobre o grafo gerado antes de alcançar o fluxo máximo resultando em um aumento substancial no tempo de execução. Neste caso, a complexidade é de  $O(Ef)$.

	#### Invariante com justificativa:
&emsp;&emsp;Seja $f(u, v)$ o fluxo na aresta $(u, v)$ e $c(u, v)$ a capacidade da aresta $(u, v)$. A invariante pode ser expressa da seguinte forma:

$$ \text{Fluxo total} = \sum_{\text{arestas } e} f(e) - \sum_{\text{arestas } e} f_{\text{reverse}}(e) $$

Onde:
- $f(e)$ é o fluxo na aresta $e$.
- $f_{\text{reverse}}(e)$ é o fluxo na aresta reversa de $ e $ (ou seja, a aresta oposta em direção).
- A primeira soma calcula o total de fluxo que entra no destino.
- A segunda soma calcula o total de fluxo que sai do destino.

&emsp;&emsp; Essa fórmula expressa que a quantidade total de fluxo que entra no destino (ou sai da fonte) é igual à quantidade total de fluxo que sai do destino (ou entra na fonte). Essa propriedade deve ser verdadeira em cada iteração do algoritmo de Ford-Fulkerson, vide que é de extrema importância para algoritmos de fluxo máximo.

#### Demonstração da corretude

- Caso Base:<br>
&emsp;&emsp;Após a primeira iteração do algoritmo, o fluxo em cada arco é zero.

- Passo Indutivo: <br>
&emsp;&emsp;Assuma que a invariante é verdadeira para a rede residual $G_f^k$ após a k-ésima iteração. Mostraremos que ela também é verdadeira para a rede residual $G_f^{k+1}$ após a $(k+1)$-ésima iteração.

&emsp;&emsp;Consideremos o aumento de fluxo em um caminho $P$ de $s$ para $t$ na $(k+1)$-ésima iteração. Seja $u$ um vértice em $P$ diferente de $s$ e $t$.

- Fluxo que entra em $u$: <br>
&emsp;&emsp;O fluxo que entra em $u$ em $G_f^{k+1}$ é a soma dos fluxos que entram em $u$ em $G_f^k$ mais o fluxo que entra em $u$ pelo arco $(v, u)$ em $P$.

- Fluxo que sai de $u$: <br>
&emsp;&emsp;O fluxo que sai de $u$ em $G_f^{k+1}$ é a soma dos fluxos que saem de $u$ em $G_f^k$ menos o fluxo que sai de $u$ pelo arco $(u, v)$ em $P$.

&emsp;&emsp;Como o fluxo total no caminho P é conservado, a diferença entre o fluxo que entra em u e o fluxo que sai de u em G_f^{k+1} é zero.

&emsp;&emsp;Portanto, a soma dos fluxos que entram em u em G_f^{k+1} é igual à soma dos fluxos que saem de u em G_f^{k+1}.

### Dinic:
Compreendendo-se a estruturação do algoritmo de Dinic e que, na busca por cada um dos níveis, utiliza-se uma Busca em Largura para encontrar os caminhos aumentadores que existem sobre o grafo criado e compreender os diferentes níveis (esta ocorrendo com complexidade de tempo de $O(VE)$. De maneira complementar, este processo ocorre $V$ vezes, tendo como conhecimento que o algoritmo percorrerá por todos os vértices distintos (no pior dos casos) para assimilar o valor do fluxo máximo. Assim, a complexidade final de Dinic se dá por $O(EV^2)$, sendo $E$ o número de arestas e $V$ o número de vértices.

- **Melhor caso:** O melhor dos casos se dá em decorrência do formato do grafo e de como as arestas e vértices se relacionam. Na melhor situação, o algoritmo encontra facilmente os caminhos aumentadores, sem a necessidade de percorrer todos os vértices (transpassando, por exemplo, $V - n$ vértices) para encontrar o fluxo máximo do grafo. 
- **Pior caso:** No pior dos casos, será necessário transpassar por cada um dos vértices do grafo uma vez para encontrar os caminhos aumentadores e atingir o fluxo máximo. Neste caso, entende-se que a complexidade do algoritmo de Dinic é de $O(EV^2)$.
  
#### Invariante com justificativa
A fórmula matemática para a invariante do algoritmo de Dinic pode ser expressa como:

$$
\text{dist}[v] = \begin{cases} 
      0 & \text{se } v = s \\
      \min(\text{dist}[u] + 1) & \text{se existe uma aresta } (u, v) \text{ na rede residual e } \text{excesso}[u] > 0 \\
      \infty & \text{caso contrário} \\
   \end{cases}
$$


Onde:

- `dist[v]` é a distância (ou nível) do vértice `v` na rede residual.
- `s` é o vértice de origem.
- `excesso[u]` é o excesso de fluxo no vértice `u`.

Essa fórmula expressa que a distância de um vértice `v` é zero se `v` é a fonte `s`. Caso contrário, a distância de `v` é definida como um a mais do que o mínimo das distâncias dos vértices conectados a `v`, desde que haja um excesso de fluxo nestes vértices.

A invariante garante que o algoritmo de Dinic só explore caminhos aumentantes que levam a vértices de nível inferior, acelerando assim a convergência para o fluxo máximo na rede.

#### Demonstração da corretude

Prova de Corretude do Algoritmo de Dinic por Indução

- Base:

Consideremos o caso base onde a rede residual possui apenas um vértice s (a fonte) e um vértice t (o sumidouro). A capacidade da aresta entre s e t é igual ao fluxo máximo possível na rede. O algoritmo de Dinic irá encontrar este fluxo máximo em uma única iteração, pois a distância de t será 1 e o algoritmo irá enviar o máximo de fluxo possível através da aresta (s, t).

- Passo Indutivo:

Assumamos que o algoritmo de Dinic encontra o fluxo máximo em qualquer rede residual com n vértices. Consideremos agora uma rede residual com n+1 vértices. Podemos adicionar um novo vértice v à rede residual com as seguintes propriedades:

- `v` é conectado a um vértice `u` na rede residual original.
- A capacidade da aresta `(u, v)` é igual a `c`.
- `v` não é conectado a nenhum outro vértice na rede residual.
- Mostraremos que o algoritmo de Dinic encontra o fluxo máximo na rede residual com `n+1` vértices.

1. Caso 1: `v` não é alcançável a partir de `s`:

Neste caso, o algoritmo de Dinic nunca irá explorar o vértice `v`. A capacidade da aresta `(u, v)` não afetará o fluxo máximo na rede, pois `v` não pode ser usado para aumentar o fluxo.

2. Caso 2: `v` é alcançável a partir de `s`:

Neste caso, o algoritmo de Dinic irá explorar o vértice `v` em algum momento. Se a distância de `v` for menor que a distância de t, então o algoritmo irá enviar o máximo de fluxo possível através da aresta `(u, v)`. Isso aumentará o fluxo máximo na rede em `c`.

Se a distância de `v` for igual ou maior que a distância de `t`, então o algoritmo não irá enviar fluxo através da aresta `(u, v)`. Isso significa que o fluxo máximo na rede já foi encontrado e não pode ser aumentado.

Conclusão:

Em ambos os casos, o algoritmo de Dinic encontra o fluxo máximo na rede residual com `n+1` vértices. Isso conclui a prova por indução, comprovando a tese proposta e a corretude do algoritmo.

