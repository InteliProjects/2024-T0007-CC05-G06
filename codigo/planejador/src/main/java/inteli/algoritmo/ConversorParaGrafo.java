package inteli.algoritmo;

import inteli.cc5.*;
import inteli.sudeste._App1;
import jakarta.xml.bind.JAXBException;

import java.util.*;

public class ConversorParaGrafo {
    private static ConversorParaGrafo instancia;
    Map<Integer, Integer> mapaIdEloParaNo = new HashMap<>();
    Map<Integer, Integer> mapaIdNoParaElo = new HashMap<>(); // Mapa inverso
    Map<Integer, Map<String, Object>> mapaIdEloParaInfo = new HashMap<>();

    List<int[]> conexoesNos = new ArrayList<>(); // id do grafo, ids que ele se conecta

    private ConversorParaGrafo() throws JAXBException {
        _App1 app = new _App1();
        List<Transportes> transportes = app.gerandoInstanciasArestas();

        ArrayList<Object> listaVertices = app.gerandoInstanciasVertices();
        for (Object vertices : listaVertices) {
            if (vertices instanceof Cliente) {
                int idElo = ((Cliente) vertices).getId();
                String descricao = ((Cliente) vertices).getDescricao();
                Map<String, Object> info = new HashMap<>();
                info.put("descricao", descricao);
                info.put("tipo", "cliente");
                mapaIdEloParaInfo.put(idElo, info);
            } else if (vertices instanceof Entreposto) {
                int idElo = ((Entreposto) vertices).getId();
                String descricao = ((Entreposto) vertices).getDescricao();
                Map<String, Object> info = new HashMap<>();
                info.put("descricao", descricao);
                info.put("tipo", "entreposto");
                mapaIdEloParaInfo.put(idElo, info);
            } else if (vertices instanceof Porto) {
                int idElo = ((Porto) vertices).getId();
                String descricao = ((Porto) vertices).getDescricao();
                Map<String, Object> info = new HashMap<>();
                info.put("descricao", descricao);
                info.put("tipo", "porto");
                mapaIdEloParaInfo.put(idElo, info);
            } else if (vertices instanceof UsinaBeneficiamento) {
                int idElo = ((UsinaBeneficiamento) vertices).getId();
                String descricao = ((UsinaBeneficiamento) vertices).getDescricao();
                Map<String, Object> info = new HashMap<>();
                info.put("descricao", descricao);
                info.put("tipo", "usina beneficiamento");
                mapaIdEloParaInfo.put(idElo, info);
            } else if (vertices instanceof UsinaBriquete) {
                int idElo = ((UsinaBriquete) vertices).getId();
                String descricao = ((UsinaBriquete) vertices).getDescricao();
                Map<String, Object> info = new HashMap<>();
                info.put("descricao", descricao);
                info.put("tipo", "usina briquete");
                mapaIdEloParaInfo.put(idElo, info);
            } else if (vertices instanceof UsinaPelotizacao) {
                int idElo = ((UsinaPelotizacao) vertices).getId();
                String descricao = ((UsinaPelotizacao) vertices).getDescricao();
                Map<String, Object> info = new HashMap<>();
                info.put("descricao", descricao);
                info.put("tipo", "usina pelotizacao");
                mapaIdEloParaInfo.put(idElo, info);
            } else if (vertices instanceof Fornecedores) {
                int idElo = ((Fornecedores) vertices).getId();
                String descricao = ((Fornecedores) vertices).getDescricao();
                Map<String, Object> info = new HashMap<>();
                info.put("descricao", descricao);
                info.put("tipo", "fornecedores");
                mapaIdEloParaInfo.put(idElo, info);
            }
        }
        // For que itera sobre a lista de transportes para criar o grafo
        for (Transportes transporte : transportes) {
            // Pegando todas as informações do transporte i
            int quantidade = transporte.getQuantidade();
            int idEloOrigem = transporte.getIdCadeiaOrigem();
            int idEloDestino = transporte.getIdCadeiaDestino();

            // Se os idsElo estão contidos dentro dos nós
            if (mapaIdEloParaInfo.containsKey(idEloOrigem) && mapaIdEloParaInfo.containsKey(idEloDestino)) {
                adicionarConexaoElo(idEloOrigem, idEloDestino, quantidade);
            }
        }
    }
    public void adicionarConexaoElo(int idEloOrigem, int idEloDestino, int capacidade) {
        // Se o ID de Elo ainda não estiver mapeado para um ID de nó, adicione-o ao mapa
        if (!mapaIdEloParaNo.containsKey(idEloOrigem)) {
            int novoIdNo = mapaIdEloParaNo.size();
            mapaIdEloParaNo.put(idEloOrigem, novoIdNo);
            mapaIdNoParaElo.put(novoIdNo, idEloOrigem); // Adiciona o mapeamento inverso
        }
        if (!mapaIdEloParaNo.containsKey(idEloDestino)) {
            int novoIdNo = mapaIdEloParaNo.size();
            mapaIdEloParaNo.put(idEloDestino, novoIdNo);
            mapaIdNoParaElo.put(novoIdNo, idEloDestino); // Adiciona o mapeamento inverso
        }

        // Obtém os IDs de nó correspondentes aos IDs de Elo
        int idNoOrigem = mapaIdEloParaNo.get(idEloOrigem);
        int idNoDestino = mapaIdEloParaNo.get(idEloDestino);

        // Adiciona a conexão entre os nós na lista de conexões
        conexoesNos.add(new int[]{idNoOrigem, idNoDestino, capacidade});
    }

    // Métodos para obter o mapa de IDs de Elo para IDs de nó e a lista de conexões de nós
    public Map<Integer, Integer> getMapaIdsEloParaNo() {
        return mapaIdEloParaNo;
    }

    // Método para obter o ID do Elo a partir do ID do nó
    public Integer getIdEloFromIdNo(int idNo) {
        return mapaIdNoParaElo.get(idNo);
    }

    public Map<String, Object> getMapaIdEloParaInfo(int idElo) {
        return mapaIdEloParaInfo.get(idElo);
    }
    public List<int[]> getConexoesNos() {
        return conexoesNos;
    }
    public void removeIdElo(int idElo) {
        mapaIdEloParaNo.remove(idElo);
    }

    public static ConversorParaGrafo getInstancia() throws JAXBException {
        if (instancia == null) {
            instancia = new ConversorParaGrafo();
        }
        return instancia;
    }

    public static void main(String[] args) throws Exception {
        ConversorParaGrafo conversor = ConversorParaGrafo.getInstancia();
    }
}
