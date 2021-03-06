package model;
// Generated 12/04/2015 19:06:05 by Hibernate Tools 3.6.0


import dao.OrientadorDAO;
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
 * Orientador generated by hbm2java
 */
@Entity
@Table(name="orientador"
    ,catalog="scp"
)
public class Orientador  implements java.io.Serializable {


     private int matricula;
     private Pessoas pessoas;
     private Nucleo nucleo;
     private String homepageLattes;
     
    public Orientador() {
    }

	
    public Orientador(int matricula, Pessoas pessoas, Nucleo nucleo, String homepageLattes) {

        this.matricula = matricula;
        this.homepageLattes = homepageLattes;
        this.nucleo = nucleo;
        this.pessoas = pessoas;
    }
   
     @Id 

    
    @Column(name="matricula", unique=true, nullable=false)
    public int getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pessoas_codigo", nullable=false)
    public Pessoas getPessoas() {
        return this.pessoas;
    }
    
    public void setPessoas(Pessoas pessoas) {
        this.pessoas = pessoas;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="nucleo_codigo", nullable=false)
    public Nucleo getNucleo() {
        return this.nucleo;
    }
    
    public void setNucleo(Nucleo nucleo) {
        this.nucleo = nucleo;
    }

    
    @Column(name="homepageLattes", nullable=false, length=45)
    public String getHomepageLattes() {
        return this.homepageLattes;
    }
    
    public void setHomepageLattes(String homepageLattes) {
        this.homepageLattes = homepageLattes;
    }

 public void gravar() throws SQLException, ClassNotFoundException {
        OrientadorDAO.gravar(this);
    }

    public void editar() throws SQLException, ClassNotFoundException {
        OrientadorDAO.editar(this);
    }

    public void excluir() throws SQLException, ClassNotFoundException {
        OrientadorDAO.excluir(this);
    }

    public static List<Orientador> obterOrientadores()
            throws ClassNotFoundException, SQLException {
        return OrientadorDAO.obterOrientadores();
    }

    public static Orientador obterOrientador(int matricula) throws ClassNotFoundException,
            SQLException {
        return OrientadorDAO.obterOrientador(matricula);
    }

    
    


}


