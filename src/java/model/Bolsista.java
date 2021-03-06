package model;
// Generated 08/04/2015 07:47:32 by Hibernate Tools 3.6.0
import dao.BolsistaDAO;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * Bolsista generated by hbm2java
 */
@Entity
@Table(name="bolsista"
    ,catalog="scp"
)
public class Bolsista  implements java.io.Serializable {
     private int matricula;
     private Curso curso;
     private Projeto projeto;
     public Pessoas pessoas;
     private int contaCorrente;
     private String nomeBanco;
     private int agencia;
    public Bolsista() {
    }
    public Bolsista(int matricula, Curso curso, Projeto projeto, Pessoas pessoas) {
        this.matricula = matricula;
        this.curso = curso;
        this.projeto = projeto;
        this.pessoas = pessoas;
    }
    public Bolsista(int matricula, Curso curso, Projeto projeto, Pessoas pessoas, int contaCorrente, String nomeBanco, int agencia) {
       this.matricula = matricula;
       this.curso = curso;
       this.projeto = projeto;
       this.pessoas = pessoas;
       this.contaCorrente = contaCorrente;
       this.nomeBanco = nomeBanco;
       this.agencia = agencia;
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
    @JoinColumn(name="curso_codigo", nullable=false)
    public Curso getCurso() {
        return this.curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="projeto_codigo", nullable=false)
    public Projeto getProjeto() {
        return this.projeto;
    }
    
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pessoas_codigo", nullable=false)
    public Pessoas getPessoas() {
        return this.pessoas;
    }
    
    public void setPessoas(Pessoas pessoas) {
        this.pessoas = pessoas;
    }
    
    @Column(name="contaCorrente")
    public Integer getContaCorrente() {
        return this.contaCorrente;
    }
    
    public void setContaCorrente(int contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    
    @Column(name="nomeBanco", length=45)
    public String getNomeBanco() {
        return this.nomeBanco;
    }
    
    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
    
    @Column(name="agencia")
    public Integer getAgencia() {
        return this.agencia;
    }
    
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void gravar() throws SQLException, ClassNotFoundException {
        BolsistaDAO.gravar(this);
    }
    public void editar() throws SQLException, ClassNotFoundException {
        BolsistaDAO.editar(this);
    }
    public void excluir() throws SQLException, ClassNotFoundException {
        BolsistaDAO.excluir(this);
    }
    public static List<Bolsista> obterBolsistas()
            throws ClassNotFoundException, SQLException {
        return BolsistaDAO.obterBolsistas();
    }
    public static Bolsista obterBolsista(int codigo) throws ClassNotFoundException,
            SQLException {
        return BolsistaDAO.obterBolsista(codigo);
    }
}