package inteli.sudeste;

import inteli.algoritmo.*;
import inteli.cc5.Cliente;
import inteli.cc5.Entreposto;
import inteli.cc5.Fornecedores;
import inteli.cc5.Porto;
import inteli.cc5.Transportes;
import inteli.cc5.UsinaBeneficiamento;
import inteli.cc5.UsinaBriquete;
import inteli.cc5.UsinaPelotizacao;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.InputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class _App1 {
    public static InputStream getInputStream(String file) {
        ClassLoader classLoader = _App1.class.getClassLoader();
        return classLoader.getResourceAsStream(file);
    }

    public static Integer converterBigInteger(BigInteger number) {
        try { return Integer.parseInt(number.toString()); }
        catch (NullPointerException ignored) { return null; }
    }



    public Cenario gerandoJAXBE() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Cenario.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Cenario cenario;
        cenario = (Cenario) jaxbUnmarshaller.unmarshal(getInputStream("202204_SistemaSudeste.xml"));
        return cenario;
    }

    public List<Transportes> gerandoInstanciasArestas() throws JAXBException {
        Cenario cenario = gerandoJAXBE();

        // Transporte
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        List<SubmodalTransporte> SubmodalTransporteAPS = cenario.getFluxo().getSubmodaisTransporte().getSubmodalTransporte();
        for (int j = 0; j < SubmodalTransporteAPS.size(); j++) {
            ArrayList<String> list = new ArrayList<>();
            List<Object> conteudo = SubmodalTransporteAPS.get(j).getContent();
            String chave = "";
            String tipo = "";
            if (conteudo.get(5) instanceof Id) {
                Id id = (Id) conteudo.get(5);
                chave = id.getContent().get(0).toString();
            }
            if (conteudo.get(1) instanceof JAXBElement) {
                JAXBElement<?> elemento = (JAXBElement<?>) conteudo.get(1);
                tipo = elemento.getValue().toString();
            }
            list.add(tipo);
            map.put(chave, list);

//            if (map.containsKey("GFS")) {
//                ArrayList<String> recuperado = map.get("GFS");
//                String codigoTipoModal = recuperado.get(1);
//                try {
//                    double quantidade = Double.parseDouble(recuperado.get(0));
//                } catch (NumberFormatException e) {
//                }
//            }
        }
        HashMap<String, Integer> pesosMediosPorModal = getPesos();
        List<TrechoTransporte> trechoAPS = cenario.getFluxo().getTrechosTransporte().getTrechoTransporte();
        ArrayList<Transportes> transportes = new ArrayList<>();
        for (int i = 0; i < trechoAPS.size(); i++) {
            Integer id = i;
            String descricao = trechoAPS.get(i).getDescricao();
            List<Serializable> idList = trechoAPS.get(i).getId().getContent();
            JAXBElement codElement = (JAXBElement) idList.get(1);
            String codigoSubModal = codElement.getValue().toString();
            JAXBElement jaxOrigem = (JAXBElement) idList.get(3);
            int idElOrigem = Integer.parseInt(jaxOrigem.getValue().toString());
            JAXBElement jaxDestino = (JAXBElement) idList.get(5);
            int idElDestino = Integer.parseInt(jaxDestino.getValue().toString());
            Iterator<String> listaSet = map.get(codigoSubModal).iterator();
            int quantidade = pesosMediosPorModal.get(codigoSubModal);
            String codigoTipoModal = listaSet.next();
            Transportes transporte = new Transportes(id, descricao, codigoSubModal, codigoTipoModal, quantidade, idElOrigem, idElDestino);
            transportes.add(transporte);
        }

        return transportes;
    }


    public ArrayList<Object> gerandoInstanciasVertices() throws JAXBException {
        Cenario cenario = gerandoJAXBE();

        // Entreposto
        List<PatioAPS> entrepostoAPS = cenario.getCadeia().getPatiosAPS().getPatioAPS();
        ArrayList<Object> entrepostos = new ArrayList<>();
        for (int i = 0; i < entrepostoAPS.size(); i++) {
            try {
                int id = Integer.parseInt(entrepostoAPS.get(i).getId().getContent().get(0).toString());
                String descricao = entrepostoAPS.get(i).getDescricao();
                String tipoElo = entrepostoAPS.get(i).getTipoElo();
                String codigoPatio = entrepostoAPS.get(i).getCodigoPatio();
                String codigoSiteProduto = null;
                if (entrepostoAPS.get(i).getSiteProdutivoAPS() != null) {
                    codigoSiteProduto = entrepostoAPS.get(i).getSiteProdutivoAPS().getCodigoSiteProdutivo();
                }
                Entreposto entreposto = new Entreposto(id, descricao, tipoElo, codigoPatio, codigoSiteProduto);
                entrepostos.add(entreposto);
            } catch (NullPointerException e) {
                e.printStackTrace();
            }

        }

        // Fornecedres
        List<FornecedorAPS> fornecedorAPS = cenario.getCadeia().getFornecedoresAPS().getFornecedorAPS();
        ArrayList<Object> fornecedores = new ArrayList<>();
        for (int i = 0; i < fornecedorAPS.size(); i++) {
            int id = Integer.parseInt(fornecedorAPS.get(i).getId().getContent().get(0).toString());
            String tipoElo = fornecedorAPS.get(i).getTipoElo();
            String codigoFornecedor = fornecedorAPS.get(i).getCodigoFornecedor();
            String descricao = fornecedorAPS.get(i).getDescricao();
            Fornecedores fornecedor = new Fornecedores(id, tipoElo, codigoFornecedor, descricao);
            fornecedores.add(fornecedor);
        }

        // Porto, existe algumas coisas relacionadas a tempo na tabela xml do porto que
        // não estão na nossa classe porem não acho que tenha um impacto sobre nosso
        // projeto.
        List<PortoAPS> portoAPS = cenario.getCadeia().getPortosAPS().getPortoAPS();
        ArrayList<Object> portos = new ArrayList<>();
        for (int i = 0; i < portoAPS.size(); i++) {
            int id = Integer.parseInt(portoAPS.get(i).getId().getContent().get(0).toString());
            String descricao = portoAPS.get(i).getDescricao();
            String tipoElo = portoAPS.get(i).getTipoElo();
            String codigoSiteProduto = portoAPS.get(i).getSiteProdutivoAPS().getCodigoSiteProdutivo();
            String codigoPorto = portoAPS.get(i).getCodigoPorto();
            int capacidadeMinimaEstocagem = 0;
            int capacidadeMaximaEstocagem = 0;
            try {
                capacidadeMaximaEstocagem = Integer.parseInt(portoAPS.get(i).getCapacidadeMaximaEstocagem().split("\\.")[0]);
            } catch (NullPointerException ignored) {}
            boolean centroDistribuicao = portoAPS.get(i).isCentroDistribuicao();
            String codigoInternacional = portoAPS.get(i).getCodigoInternacional();
            String codigoPais = portoAPS.get(i).getCodigoPais();
            int idProprietarioCliente = Integer.parseInt(portoAPS.get(i).getIdClienteProprietario().toString());
            Integer grupoPorto = converterBigInteger(portoAPS.get(i).getIdGrupoPorto());
            Integer quantidadeDisponivelRebocadores = converterBigInteger(portoAPS.get(i).getQtdeRebocadorDisponivel());
            Porto porto = new Porto(id, descricao, tipoElo, codigoSiteProduto, codigoPorto, capacidadeMinimaEstocagem,
                    capacidadeMaximaEstocagem, centroDistribuicao, codigoInternacional, codigoPais,
                    idProprietarioCliente, grupoPorto, quantidadeDisponivelRebocadores);
            portos.add(porto);
        }

        // UsinaBeneficiamento
        List<UsinaBeneficiamentoAPS> usinaBeneficiamentoAPS = cenario.getCadeia().getUsinasBeneficiamentoAPS()
                .getUsinaBeneficiamentoAPS();
        ArrayList<Object> usinasBeneficiamento = new ArrayList<>();
        for (int i = 0; i < usinaBeneficiamentoAPS.size(); i++) {
            int id = Integer.parseInt(usinaBeneficiamentoAPS.get(i).getId().getContent().get(0).toString());
            String descricao = usinaBeneficiamentoAPS.get(i).getDescricao();
            String tipoElo = usinaBeneficiamentoAPS.get(i).getTipoElo();
            String codigoSiteProduto = usinaBeneficiamentoAPS.get(i).getSiteProdutivoAPS().getCodigoSiteProdutivo();
            String codigoUsinaBeneficiamento = usinaBeneficiamentoAPS.get(i).getCodigoUsinaBeneficiamento();
            int minimoObrigado = usinaBeneficiamentoAPS.get(i).getMinimoObrigado().intValue();
            UsinaBeneficiamento usinaBeneficiamento = new UsinaBeneficiamento(id, descricao, tipoElo, codigoSiteProduto,
                    codigoUsinaBeneficiamento, minimoObrigado);
            usinasBeneficiamento.add(usinaBeneficiamento);
        }

        // UsinaBriquete
        List<UsinaBriqueteAPS> usinaBriqueteAPS = cenario.getCadeia().getUsinasBriqueteAPS().getUsinaBriqueteAPS();
        ArrayList<Object> usinasBriquete = new ArrayList<>();
        for (int i = 0; i < usinaBriqueteAPS.size(); i++) {
            int id = Integer.parseInt(usinaBriqueteAPS.get(i).getId().getContent().get(0).toString());
            String descricao = usinaBriqueteAPS.get(i).getDescricao();
            String tipoElo = usinaBriqueteAPS.get(i).getTipoElo();
            String codigoSiteProduto = usinaBriqueteAPS.get(i).getSiteProdutivoAPS().getCodigoSiteProdutivo();
            String codigoBriquete = usinaBriqueteAPS.get(i).getCodigoUsinaBriquete();
            int idEmpresaProprietaria = Integer.parseInt(usinaBriqueteAPS.get(i).getIdEmpresaProprietaria().toString());
            int minimoObrigado = usinaBriqueteAPS.get(i).getMinimoObrigado().intValue();
            UsinaBriquete usinaBriquete = new UsinaBriquete(id, descricao, tipoElo, codigoSiteProduto, codigoBriquete,
                    idEmpresaProprietaria, minimoObrigado);
            usinasBriquete.add(usinaBriquete);
        }

        // UsinaPeloletizacao
        List<UsinaPelotizacaoAPS> usinaPelotizacaoAPS = cenario.getCadeia().getUsinasPelotizacaoAPS()
                .getUsinaPelotizacaoAPS();
        ArrayList<Object> usinasPelotizacao = new ArrayList<>();
        for (int i = 0; i < usinaPelotizacaoAPS.size(); i++) {
            int id = Integer.parseInt(usinaPelotizacaoAPS.get(i).getId().getContent().get(0).toString());
            String descricao = usinaPelotizacaoAPS.get(i).getDescricao();
            String tipoElo = usinaPelotizacaoAPS.get(i).getTipoElo();
            String codigoSiteProduto = usinaPelotizacaoAPS.get(i).getSiteProdutivoAPS().getCodigoSiteProdutivo();
            int idEmpresaProprietaria = Integer.parseInt(usinaPelotizacaoAPS.get(i).getIdEmpresaProprietaria().toString());
            String codigoPelotizacao = usinaPelotizacaoAPS.get(i).getCodigoUsinaPelotizacao();
            int minimoObrigado = usinaPelotizacaoAPS.get(i).getMinimoObrigado().intValue();
            UsinaPelotizacao usinaPelotizacao = new UsinaPelotizacao(id, descricao, tipoElo, codigoSiteProduto,
                    idEmpresaProprietaria, codigoPelotizacao, minimoObrigado);
            usinasPelotizacao.add(usinaPelotizacao);
        }

        // Clientes
        List<ClienteAPS> clientesAps = cenario.getCadeia().getClientesAPS().getClienteAPS();
        ArrayList<Object> clientes = new ArrayList<>();
        for (int i = 0; i < clientesAps.size(); i++) {
            int id = Integer.parseInt(clientesAps.get(i).getId().getContent().get(0).toString());
            String tipoElo = clientesAps.get(i).getTipoElo();
            String codigoMercado = clientesAps.get(i).getCodigoMercado();
            String codigoEscritorio = clientesAps.get(i).getCodigoEscritorio();
            String grupoCliente = clientesAps.get(i).getGrupoCliente();
            String codigoCliente = clientesAps.get(i).getCodigoCliente();
            String descricao = clientesAps.get(i).getDescricao();
            String unidadeFederativa = clientesAps.get(i).getUnidadeFederativa();
            Cliente cliente = new Cliente(id, descricao, tipoElo, codigoMercado, codigoEscritorio,
                    grupoCliente, codigoCliente,
                    unidadeFederativa);
            clientes.add(cliente);
        }
        ArrayList<Object> finalList = new ArrayList<>();
        finalList.addAll(usinasBeneficiamento);
        finalList.addAll(usinasBriquete);
        finalList.addAll(usinasPelotizacao);
        finalList.addAll(entrepostos);
        finalList.addAll(portos);
        finalList.addAll(clientes);
        finalList.addAll(fornecedores);
        return finalList;
    }

    public double getDemanda() throws JAXBException {
        Cenario cenario = gerandoJAXBE();

        List<PrevisaoAgregada> previsaoAgregadasList = cenario.getDemanda().getPrevisoesAgregadas().getPrevisaoAgregada();
        double qtdTotalProd = 0;
        for (PrevisaoAgregada previsaoAgregada : previsaoAgregadasList) {
            qtdTotalProd += Double.parseDouble(previsaoAgregada.getQtdeProduto().toString());
        }
        return qtdTotalProd;
    }

    public HashMap<String, Integer> getPesos() throws JAXBException {
        Cenario cenario = gerandoJAXBE();
        List<SubmodalTransporte> submodalTransporteList = cenario.getFluxo().getSubmodaisTransporte().getSubmodalTransporte();
        HashMap<String, Integer> pesosMedioPorModal = new HashMap<>();
        for (SubmodalTransporte submodalTransporte : submodalTransporteList) {
            List<Object> objectList = submodalTransporte.getContent();
            Double pesoTotal = null;
            String codigoSubModal = null;
            if (objectList.get(7) instanceof PesosMediosTransporteProduto && objectList.get(5) instanceof Id) {
                PesosMediosTransporteProduto pesos = (PesosMediosTransporteProduto) objectList.get(7);
                pesoTotal = somarPesos(pesos);

                codigoSubModal = ((Id) objectList.get(5)).getContent().toString();
                codigoSubModal = codigoSubModal.substring(1, codigoSubModal.length() - 1); // Retirando os parênteses da String
            }
            if (codigoSubModal != null) {
                pesosMedioPorModal.put(codigoSubModal,(int) Math.ceil(pesoTotal));
            }
        }
        return pesosMedioPorModal;
    }

    private double somarPesos(PesosMediosTransporteProduto pesos) {
        List<PesoMedioTransporteProduto> pesosList = pesos.getPesoMedioTransporteProduto();
        double total = 0;
        for (PesoMedioTransporteProduto peso : pesosList) {
            double pesoMedio = Double.parseDouble(peso.getPesoMedio().toString());
            total += pesoMedio;
        }
        return total;
    }

    public static void main(String[] args) throws JAXBException {

        _App1 app = new _App1();
        ConversorParaGrafo conversor = ConversorParaGrafo.getInstancia();
        List<int[]> conexoes = conversor.getConexoesNos();
        Map<Integer, Integer> mapaIdEloParaNo = conversor.getMapaIdsEloParaNo();

        // Criação do grafo
        DiGraph graph = new DiGraph(mapaIdEloParaNo.size()+2);

        for (int[] conexao: conexoes) {
            Edge edge = new Edge(conexao[0], conexao[1], conexao[2]);
            graph.addEdge(edge);
        }

        List<Integer> verticesZeroInDegree = graph.verticesWithZeroInDegree();
        List<Integer> verticesZeroOutDegree = graph.verticesWithZeroOutDegree();
        int font = mapaIdEloParaNo.size();
        int sink = mapaIdEloParaNo.size()+1;
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

        System.out.println(graph);

        FordFulkerson fordFulkerson = new FordFulkerson(graph, font, sink);
        double fluxo = fordFulkerson.valor();
        System.out.println(fluxo);


        Dinic dinic = new Dinic(graph, font, sink);
        double fluxoD = dinic.valor();
        System.out.println(fluxoD);

        System.out.println("qtd demanda: "+app.getDemanda());

        System.out.println(app.getPesos());
    }
}