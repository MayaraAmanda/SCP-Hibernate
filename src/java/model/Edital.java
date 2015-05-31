package model;
// Generated 12/04/2015 19:06:05 by Hibernate Tools 3.6.0

import dao.EditalDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Edital generated by hbm2java
 */
@Entity
@Table(name = "edital", catalog = "scp"
)
public class Edital implements java.io.Serializable {

    private int codigoEdital;
    private int numeroEdital;
    private int anoEdital;
    private int quantidadeBolsa;
    private int validadeEdital;
    private float valorBolsa;
    private int validadeBolsa;
    private Tipobolsa tipobolsa;
    private Campus campus;
    private SubArea subareaconhecimento;
    
    
    public Edital() {
    }

    public Edital(int codigoEdital, int numeroEdital, int anoEdital, int quantidadeBolsa, int validadeEdital, float valorBolsa, int validadeBolsa, Tipobolsa tipobolsa, Campus campus, SubArea subareaconhecimento) {
        this.codigoEdital = codigoEdital;
        this.numeroEdital = numeroEdital;
        this.anoEdital = anoEdital;
        this.quantidadeBolsa = quantidadeBolsa;
        this.validadeEdital = validadeEdital;
        this.valorBolsa = valorBolsa;
        this.validadeBolsa = validadeBolsa;
        this.tipobolsa = tipobolsa;
        this.campus = campus;
        this.subareaconhecimento = subareaconhecimento;
    }

    @Id

    @Column(name = "codigoEdital", unique = true, nullable = false)
    public int getCodigoEdital() {
        return this.codigoEdital;
    }

    public void setCodigoEdital(int codigoEdital) {
        this.codigoEdital = codigoEdital;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "campus_codigo", nullable = false)
    public Campus getCampus() {
        return this.campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipobolsa_codigo", nullable = false)
    public Tipobolsa getTipobolsa() {
        return this.tipobolsa;
    }

    public void setTipobolsa(Tipobolsa tipobolsa) {
        this.tipobolsa = tipobolsa;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subareaconhecimento_codigo", nullable = false)
    public SubArea getSubareaconhecimento() {
        return this.subareaconhecimento;
    }

    public void setSubareaconhecimento(SubArea subareaconhecimento) {
        this.subareaconhecimento = subareaconhecimento;
    }

    @Column(name = "numeroEdital", nullable = false)
    public int getNumeroEdital() {
        return this.numeroEdital;
    }

    public void setNumeroEdital(int numeroEdital) {
        this.numeroEdital = numeroEdital;
    }

    @Column(name = "anoEdital", nullable = false)
    public int getAnoEdital() {
        return this.anoEdital;
    }

    public void setAnoEdital(int anoEdital) {
        this.anoEdital = anoEdital;
    }

    @Column(name = "validadeEdital", nullable = false, length = 11)
    public int getValidadeEdital() {
        return this.validadeEdital;
    }

    public void setValidadeEdital(int validadeEdital) {
        this.validadeEdital = validadeEdital;
    }

    @Column(name = "valorBolsa", nullable = false, precision = 12, scale = 0)
    public float getValorBolsa() {
        return this.valorBolsa;
    }

    public void setValorBolsa(float valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

    @Column(name = "quantidadeBolsa", nullable = false)
    public int getQuantidadeBolsa() {
        return this.quantidadeBolsa;
    }

    public void setQuantidadeBolsa(int quantidadeBolsa) {
        this.quantidadeBolsa = quantidadeBolsa;
    }

    @Column(name = "validadeBolsa", nullable = false, length = 11)
    public int getValidadeBolsa() {
        return this.validadeBolsa;
    }

    public void setValidadeBolsa(int validadeBolsa) {
        this.validadeBolsa = validadeBolsa;
    }

    public void gravar() throws SQLException, ClassNotFoundException {
        EditalDAO.gravar(this);
    }

    public void editar() throws SQLException, ClassNotFoundException {
        EditalDAO.editar(this);
    }

    public void excluir() throws SQLException, ClassNotFoundException {
        EditalDAO.excluir(this);
    }

    public static List<Edital> obterEditais()
            throws ClassNotFoundException, SQLException {
        return EditalDAO.obterEditais();
    }

    public static Edital obterEdital(int codigoEdital) throws ClassNotFoundException,
            SQLException {
        return EditalDAO.obterEdital(codigoEdital);
    }

}