package br.edu.inteli.backend;

import inteli.algoritmo.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Controlador responsável por lidar com as requisições REST relacionadas à aplicação.
 */
@RestController
public class Controller {
    private ArrayList<Integer> nodesToBeExcluded;

    /**
     * Retorna uma mensagem de "Hello World" em formato JSON.
     * @return uma mensagem de "Hello World"
     */
    @RequestMapping("/hello")
    public String helloWorld() {
        return """
        {
            "message": "Hello World Spring Boot"
        }
        """;
    }

    /**
     * Retorna uma mensagem de "Goodbye" em formato JSON.
     * @return uma mensagem de "Goodbye"
     */
    @RequestMapping("/goodbye")
    public String goodbye() {
        return """
        {
            "message": "Goodbye from Spring Boot"
        }
        """;
    }

    /**
     * Retorna o fluxo máximo na rede de fluxo usando o algoritmo de Ford-Fulkerson.
     * @return um mapa contendo o valor do fluxo máximo
     * @throws Exception se houver algum erro durante a execução do algoritmo
     */
    @RequestMapping("/flow")
    public Map<String, Double> flow() throws Exception {
        FordFulkerson fulkerson = fordFulkerson();
        Map<String, Double> json = new HashMap<>();
        json.put("fluxo", fulkerson.valor());
        return json;
    }

    /**
     * Executa o algoritmo de Ford-Fulkerson para encontrar o fluxo máximo na rede de fluxo.
     * @return uma instância de FordFulkerson representando o resultado do algoritmo
     * @throws Exception se houver algum erro durante a execução do algoritmo
     */
    @RequestMapping("/ford-fulkerson")
    public FordFulkerson fordFulkerson() throws Exception {
        DiGraph graph = digraph();
        Map<String, List<Map<String, String>>> nodesData = nodes();
        int font = nodesData.get("message").size();
        int sink = nodesData.get("message").size() + 1;
        return new FordFulkerson(graph, font, sink);
    }

    /**
     * Retorna as arestas da rede de fluxo com suas capacidades e fluxos em formato JSON.
     * @return um mapa contendo as informações das arestas em formato JSON
     * @throws Exception se houver algum erro durante a execução do algoritmo
     */
    @RequestMapping("/flow-edges")
    public Map<String, List<java.util.Map<String, Object>>> flowEdges() throws Exception {
        FordFulkerson fulkerson = fordFulkerson();
        FlowNetwork flow = fulkerson.getFluxoAtualizado();
        Map<String, List<java.util.Map<String, Object>>> retorno = new HashMap<>();
        retorno.put("message", flow.toJson());
        return retorno;
    }

    /**
     * Executa o algoritmo de Dinic para encontrar o fluxo máximo na rede de fluxo.
     * @return uma instância de Dinic representando o resultado do algoritmo
     * @throws Exception se houver algum erro durante a execução do algoritmo
     */
    @RequestMapping("/dinic")
    public Dinic dinic() throws Exception {
        DiGraph graph = digraph();
        Map<String, List<Map<String, String>>> nodesData = nodes();
        int font = nodesData.get("message").size();
        int sink = nodesData.get("message").size() + 1;
        return new Dinic(graph, font, sink);
    }

    /**
     * Retorna os nós da rede de fluxo em formato JSON.
     * @return um mapa contendo as informações dos nós em formato JSON
     * @throws Exception se houver algum erro durante a execução do algoritmo
     */
    @RequestMapping("/nodes")
    public Map<String, List<Map<String, String>>> nodes() throws Exception {
        ConversorParaGrafo conversor = conversor();
        Map<Integer, Integer> mapaIdEloParaNo = conversor.getMapaIdsEloParaNo();
        Iterable<Integer> iterableIdelo = mapaIdEloParaNo.keySet();
        List<Map<String, String>> nodes = new ArrayList<>();
        for (Integer idElo : iterableIdelo) {
            System.out.println(".");
            Map<String, String> node = new HashMap<>();
            node.put("idElo", idElo.toString());
            node.put("id", mapaIdEloParaNo.get(idElo).toString());
            Map<String, Object> info = conversor.getMapaIdEloParaInfo(idElo);
            if (info != null) {
                node.put("descricao", info.get("descricao").toString());
                node.put("tipo", info.get("tipo").toString());
                nodes.add(node);
            }
        }
        Map<String, List<Map<String, String>>> json = new HashMap<>();
        json.put("message", nodes);
        return json;
    }

    /**
     * Constrói um grafo direcionado a partir dos dados do conversor.
     * @return um grafo direcionado representando a rede de fluxo
     * @throws Exception se houver algum erro durante a execução do algoritmo
     */
    @RequestMapping("/digraph")
    public DiGraph digraph() throws Exception {
        ConversorParaGrafo conversor = conversor();
        Map<String, List<Map<String, String>>> data = nodes();
        List<int[]> conexoes = conversor.getConexoesNos();
        List<Map<String, String>> nodesData = data.get("message");
        DiGraph graph = new DiGraph(nodesData.size() + 2);
        for (int[] conexao : conexoes) {
            try {
                Edge edge = new Edge(conexao[0], conexao[1], conexao[2]);
                graph.addEdge(edge);
            } catch (Exception ignored) {
                System.out.println(",");
            }
        }
        List<Integer> verticesZeroInDegree = graph.verticesWithZeroInDegree();
        List<Integer> verticesZeroOutDegree = graph.verticesWithZeroOutDegree();
        int font = nodesData.size();
        int sink = nodesData.size() + 1;
        for (int vertex : verticesZeroInDegree) {
            if (vertex != font && vertex != sink) {
                Edge e = new Edge(font, vertex, Double.POSITIVE_INFINITY);
                graph.addEdge(e);
            }
        }
        for (int vertex : verticesZeroOutDegree) {
            if (vertex != font && vertex != sink) {
                Edge e = new Edge(vertex, sink, Double.POSITIVE_INFINITY);
                graph.addEdge(e);
            }
        }
        return graph;
    }

    /**
     * Retorna as arestas do grafo em formato JSON.
     * @return um mapa contendo as informações das arestas em formato JSON
     * @throws Exception se houver algum erro durante a execução do algoritmo
     */
    @RequestMapping("/edges")
    public Map<String, List<Map<String, Object>>> edges() throws Exception {
        DiGraph digraph = digraph();
        Map<String, List<java.util.Map<String, Object>>> retorno = new HashMap<>();
        retorno.put("message", digraph.toJson());
        return retorno; 
    }

    /**
     * Cria uma instância do conversor para converter os dados de transporte em um grafo.
     * @return uma instância de ConversorParaGrafo
     * @throws Exception se houver algum erro durante a execução do algoritmo
     */
    @RequestMapping("/conversor")
    private ConversorParaGrafo conversor() throws Exception {
        return ConversorParaGrafo.getInstancia();
    }

}
