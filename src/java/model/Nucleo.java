package model;
// Generated 12/04/2015 19:06:05 by Hibernate Tools 3.6.0

import dao.NucleoDAO;
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
 * Nucleo generated by hbm2java
 */
@Entity
@Table(name = "nucleo", catalog = "scp"
)
public class Nucleo implements java.io.Serializable {

    private int codigoNucleo;
    private String nomeNucleo;
    private Campus campus;

    public Nucleo() {
    }

    public Nucleo(int codigoNucleo, String nomeNucleo, Campus campus) {
        this.codigoNucleo = codigoNucleo;
        this.nomeNucleo = nomeNucleo;
        this.campus = campus;
    }

    @Id

    @Column(name = "codigoNucleo", unique = true, nullable = false)
    public int getCodigoNucleo() {
        return this.codigoNucleo;
    }

    public void setCodigoNucleo(int codigoNucleo) {
        this.codigoNucleo = codigoNucleo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "campus_codigo", nullable = false)
    public Campus getCampus() {
        return this.campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    @Column(name = "nomeNucleo", length = 45)
    public String getNomeNucleo() {
        return this.nomeNucleo;
    }

    public void setNomeNucleo(String nomeNucleo) {
        this.nomeNucleo = nomeNucleo;
    }

    public void gravar() throws SQLException, ClassNotFoundException {
        NucleoDAO.gravar(this);
    }

    public void editar() throws SQLException, ClassNotFoundException {
        NucleoDAO.editar(this);
    }

    public void excluir() throws SQLException, ClassNotFoundException {
        NucleoDAO.excluir(this);
    }

    public static List<Nucleo> obterNucleos()
            throws ClassNotFoundException, SQLException {
        return NucleoDAO.obterNucleos();
    }

    public static Nucleo obterNucleo(int codigoNucleo) throws ClassNotFoundException,
            SQLException {
        return NucleoDAO.obterNucleo(codigoNucleo);
    }

}
