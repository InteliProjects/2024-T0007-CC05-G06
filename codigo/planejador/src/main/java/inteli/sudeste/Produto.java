//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2024.02.22 at 08:27:36 PM UTC
//


package inteli.sudeste;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}associacoesProdutoElo"/&gt;
 *         &lt;element ref="{}associacoesProdutoEloPartCargo"/&gt;
 *         &lt;element ref="{}associacoesProdutoGrupo"/&gt;
 *         &lt;element ref="{}blendagensProduto"/&gt;
 *         &lt;element ref="{}categoriasProdutoAPS"/&gt;
 *         &lt;element ref="{}clientesMapaAnalise"/&gt;
 *         &lt;element ref="{}clientesRegraBlendagem"/&gt;
 *         &lt;element ref="{}especificacoesPlanejamento"/&gt;
 *         &lt;element ref="{}grandezasEnsaioMapaAnaliseAPS"/&gt;
 *         &lt;element ref="{}gruposProdutoAPS"/&gt;
 *         &lt;element ref="{}mapasAnaliseAPS"/&gt;
 *         &lt;element ref="{}produtosAPS"/&gt;
 *         &lt;element ref="{}qualidadesPrevistas"/&gt;
 *         &lt;element ref="{}regrasBlendagemProdutoQualidade"/&gt;
 *         &lt;element ref="{}subcategoriasProdutoAPS"/&gt;
 *         &lt;element ref="{}utilizacoesObrigatorias"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "associacoesProdutoElo",
    "associacoesProdutoEloPartCargo",
    "associacoesProdutoGrupo",
    "blendagensProduto",
    "categoriasProdutoAPS",
    "clientesMapaAnalise",
    "clientesRegraBlendagem",
    "especificacoesPlanejamento",
    "grandezasEnsaioMapaAnaliseAPS",
    "gruposProdutoAPS",
    "mapasAnaliseAPS",
    "produtosAPS",
    "qualidadesPrevistas",
    "regrasBlendagemProdutoQualidade",
    "subcategoriasProdutoAPS",
    "utilizacoesObrigatorias"
})
@XmlRootElement(name = "produto")
public class Produto {

    @XmlElement(required = true)
    protected AssociacoesProdutoElo associacoesProdutoElo;
    @XmlElement(required = true)
    protected AssociacoesProdutoEloPartCargo associacoesProdutoEloPartCargo;
    @XmlElement(required = true)
    protected AssociacoesProdutoGrupo associacoesProdutoGrupo;
    @XmlElement(required = true)
    protected BlendagensProduto blendagensProduto;
    @XmlElement(required = true)
    protected CategoriasProdutoAPS categoriasProdutoAPS;
    @XmlElement(required = true)
    protected ClientesMapaAnalise clientesMapaAnalise;
    @XmlElement(required = true)
    protected ClientesRegraBlendagem clientesRegraBlendagem;
    @XmlElement(required = true)
    protected EspecificacoesPlanejamento especificacoesPlanejamento;
    @XmlElement(required = true)
    protected GrandezasEnsaioMapaAnaliseAPS grandezasEnsaioMapaAnaliseAPS;
    @XmlElement(required = true)
    protected GruposProdutoAPS gruposProdutoAPS;
    @XmlElement(required = true)
    protected MapasAnaliseAPS mapasAnaliseAPS;
    @XmlElement(required = true)
    protected ProdutosAPS produtosAPS;
    @XmlElement(required = true)
    protected QualidadesPrevistas qualidadesPrevistas;
    @XmlElement(required = true)
    protected RegrasBlendagemProdutoQualidade regrasBlendagemProdutoQualidade;
    @XmlElement(required = true)
    protected SubcategoriasProdutoAPS subcategoriasProdutoAPS;
    @XmlElement(required = true)
    protected UtilizacoesObrigatorias utilizacoesObrigatorias;

    /**
     * Gets the value of the associacoesProdutoElo property.
     *
     * @return
     *     possible object is
     *     {@link AssociacoesProdutoElo }
     *
     */
    public AssociacoesProdutoElo getAssociacoesProdutoElo() {
        return associacoesProdutoElo;
    }

    /**
     * Sets the value of the associacoesProdutoElo property.
     *
     * @param value
     *     allowed object is
     *     {@link AssociacoesProdutoElo }
     *
     */
    public void setAssociacoesProdutoElo(AssociacoesProdutoElo value) {
        this.associacoesProdutoElo = value;
    }

    /**
     * Gets the value of the associacoesProdutoEloPartCargo property.
     *
     * @return
     *     possible object is
     *     {@link AssociacoesProdutoEloPartCargo }
     *
     */
    public AssociacoesProdutoEloPartCargo getAssociacoesProdutoEloPartCargo() {
        return associacoesProdutoEloPartCargo;
    }

    /**
     * Sets the value of the associacoesProdutoEloPartCargo property.
     *
     * @param value
     *     allowed object is
     *     {@link AssociacoesProdutoEloPartCargo }
     *
     */
    public void setAssociacoesProdutoEloPartCargo(AssociacoesProdutoEloPartCargo value) {
        this.associacoesProdutoEloPartCargo = value;
    }

    /**
     * Gets the value of the associacoesProdutoGrupo property.
     *
     * @return
     *     possible object is
     *     {@link AssociacoesProdutoGrupo }
     *
     */
    public AssociacoesProdutoGrupo getAssociacoesProdutoGrupo() {
        return associacoesProdutoGrupo;
    }

    /**
     * Sets the value of the associacoesProdutoGrupo property.
     *
     * @param value
     *     allowed object is
     *     {@link AssociacoesProdutoGrupo }
     *
     */
    public void setAssociacoesProdutoGrupo(AssociacoesProdutoGrupo value) {
        this.associacoesProdutoGrupo = value;
    }

    /**
     * Gets the value of the blendagensProduto property.
     *
     * @return
     *     possible object is
     *     {@link BlendagensProduto }
     *
     */
    public BlendagensProduto getBlendagensProduto() {
        return blendagensProduto;
    }

    /**
     * Sets the value of the blendagensProduto property.
     *
     * @param value
     *     allowed object is
     *     {@link BlendagensProduto }
     *
     */
    public void setBlendagensProduto(BlendagensProduto value) {
        this.blendagensProduto = value;
    }

    /**
     * Gets the value of the categoriasProdutoAPS property.
     *
     * @return
     *     possible object is
     *     {@link CategoriasProdutoAPS }
     *
     */
    public CategoriasProdutoAPS getCategoriasProdutoAPS() {
        return categoriasProdutoAPS;
    }

    /**
     * Sets the value of the categoriasProdutoAPS property.
     *
     * @param value
     *     allowed object is
     *     {@link CategoriasProdutoAPS }
     *
     */
    public void setCategoriasProdutoAPS(CategoriasProdutoAPS value) {
        this.categoriasProdutoAPS = value;
    }

    /**
     * Gets the value of the clientesMapaAnalise property.
     *
     * @return
     *     possible object is
     *     {@link ClientesMapaAnalise }
     *
     */
    public ClientesMapaAnalise getClientesMapaAnalise() {
        return clientesMapaAnalise;
    }

    /**
     * Sets the value of the clientesMapaAnalise property.
     *
     * @param value
     *     allowed object is
     *     {@link ClientesMapaAnalise }
     *
     */
    public void setClientesMapaAnalise(ClientesMapaAnalise value) {
        this.clientesMapaAnalise = value;
    }

    /**
     * Gets the value of the clientesRegraBlendagem property.
     *
     * @return
     *     possible object is
     *     {@link ClientesRegraBlendagem }
     *
     */
    public ClientesRegraBlendagem getClientesRegraBlendagem() {
        return clientesRegraBlendagem;
    }

    /**
     * Sets the value of the clientesRegraBlendagem property.
     *
     * @param value
     *     allowed object is
     *     {@link ClientesRegraBlendagem }
     *
     */
    public void setClientesRegraBlendagem(ClientesRegraBlendagem value) {
        this.clientesRegraBlendagem = value;
    }

    /**
     * Gets the value of the especificacoesPlanejamento property.
     *
     * @return
     *     possible object is
     *     {@link EspecificacoesPlanejamento }
     *
     */
    public EspecificacoesPlanejamento getEspecificacoesPlanejamento() {
        return especificacoesPlanejamento;
    }

    /**
     * Sets the value of the especificacoesPlanejamento property.
     *
     * @param value
     *     allowed object is
     *     {@link EspecificacoesPlanejamento }
     *
     */
    public void setEspecificacoesPlanejamento(EspecificacoesPlanejamento value) {
        this.especificacoesPlanejamento = value;
    }

    /**
     * Gets the value of the grandezasEnsaioMapaAnaliseAPS property.
     *
     * @return
     *     possible object is
     *     {@link GrandezasEnsaioMapaAnaliseAPS }
     *
     */
    public GrandezasEnsaioMapaAnaliseAPS getGrandezasEnsaioMapaAnaliseAPS() {
        return grandezasEnsaioMapaAnaliseAPS;
    }

    /**
     * Sets the value of the grandezasEnsaioMapaAnaliseAPS property.
     *
     * @param value
     *     allowed object is
     *     {@link GrandezasEnsaioMapaAnaliseAPS }
     *
     */
    public void setGrandezasEnsaioMapaAnaliseAPS(GrandezasEnsaioMapaAnaliseAPS value) {
        this.grandezasEnsaioMapaAnaliseAPS = value;
    }

    /**
     * Gets the value of the gruposProdutoAPS property.
     *
     * @return
     *     possible object is
     *     {@link GruposProdutoAPS }
     *
     */
    public GruposProdutoAPS getGruposProdutoAPS() {
        return gruposProdutoAPS;
    }

    /**
     * Sets the value of the gruposProdutoAPS property.
     *
     * @param value
     *     allowed object is
     *     {@link GruposProdutoAPS }
     *
     */
    public void setGruposProdutoAPS(GruposProdutoAPS value) {
        this.gruposProdutoAPS = value;
    }

    /**
     * Gets the value of the mapasAnaliseAPS property.
     *
     * @return
     *     possible object is
     *     {@link MapasAnaliseAPS }
     *
     */
    public MapasAnaliseAPS getMapasAnaliseAPS() {
        return mapasAnaliseAPS;
    }

    /**
     * Sets the value of the mapasAnaliseAPS property.
     *
     * @param value
     *     allowed object is
     *     {@link MapasAnaliseAPS }
     *
     */
    public void setMapasAnaliseAPS(MapasAnaliseAPS value) {
        this.mapasAnaliseAPS = value;
    }

    /**
     * Gets the value of the produtosAPS property.
     *
     * @return
     *     possible object is
     *     {@link ProdutosAPS }
     *
     */
    public ProdutosAPS getProdutosAPS() {
        return produtosAPS;
    }

    /**
     * Sets the value of the produtosAPS property.
     *
     * @param value
     *     allowed object is
     *     {@link ProdutosAPS }
     *
     */
    public void setProdutosAPS(ProdutosAPS value) {
        this.produtosAPS = value;
    }

    /**
     * Gets the value of the qualidadesPrevistas property.
     *
     * @return
     *     possible object is
     *     {@link QualidadesPrevistas }
     *
     */
    public QualidadesPrevistas getQualidadesPrevistas() {
        return qualidadesPrevistas;
    }

    /**
     * Sets the value of the qualidadesPrevistas property.
     *
     * @param value
     *     allowed object is
     *     {@link QualidadesPrevistas }
     *
     */
    public void setQualidadesPrevistas(QualidadesPrevistas value) {
        this.qualidadesPrevistas = value;
    }

    /**
     * Gets the value of the regrasBlendagemProdutoQualidade property.
     *
     * @return
     *     possible object is
     *     {@link RegrasBlendagemProdutoQualidade }
     *
     */
    public RegrasBlendagemProdutoQualidade getRegrasBlendagemProdutoQualidade() {
        return regrasBlendagemProdutoQualidade;
    }

    /**
     * Sets the value of the regrasBlendagemProdutoQualidade property.
     *
     * @param value
     *     allowed object is
     *     {@link RegrasBlendagemProdutoQualidade }
     *
     */
    public void setRegrasBlendagemProdutoQualidade(RegrasBlendagemProdutoQualidade value) {
        this.regrasBlendagemProdutoQualidade = value;
    }

    /**
     * Gets the value of the subcategoriasProdutoAPS property.
     *
     * @return
     *     possible object is
     *     {@link SubcategoriasProdutoAPS }
     *
     */
    public SubcategoriasProdutoAPS getSubcategoriasProdutoAPS() {
        return subcategoriasProdutoAPS;
    }

    /**
     * Sets the value of the subcategoriasProdutoAPS property.
     *
     * @param value
     *     allowed object is
     *     {@link SubcategoriasProdutoAPS }
     *
     */
    public void setSubcategoriasProdutoAPS(SubcategoriasProdutoAPS value) {
        this.subcategoriasProdutoAPS = value;
    }

    /**
     * Gets the value of the utilizacoesObrigatorias property.
     *
     * @return
     *     possible object is
     *     {@link UtilizacoesObrigatorias }
     *
     */
    public UtilizacoesObrigatorias getUtilizacoesObrigatorias() {
        return utilizacoesObrigatorias;
    }

    /**
     * Sets the value of the utilizacoesObrigatorias property.
     *
     * @param value
     *     allowed object is
     *     {@link UtilizacoesObrigatorias }
     *
     */
    public void setUtilizacoesObrigatorias(UtilizacoesObrigatorias value) {
        this.utilizacoesObrigatorias = value;
    }

}