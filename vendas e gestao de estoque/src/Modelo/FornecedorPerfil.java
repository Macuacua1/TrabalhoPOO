package Modelo;
// Generated Nov 1, 2015 5:59:57 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * FornecedorPerfil generated by hbm2java
 */
@Entity
@Table(name="fornecedor_perfil"
    ,catalog="clever"
)
public class FornecedorPerfil  implements java.io.Serializable {


     private Integer idFornecedorPerfil;
     private boolean cadastrarFornecedor;
     private boolean excluirFornecedor;
     private boolean actualizarFornecedor;
     private boolean telaFornecedor;
     private Set<Perfil> perfils = new HashSet<Perfil>(0);

    public FornecedorPerfil() {
    }

	
    public FornecedorPerfil(boolean cadastrarFornecedor, boolean excluirFornecedor, boolean actualizarFornecedor, boolean telaFornecedor) {
        this.cadastrarFornecedor = cadastrarFornecedor;
        this.excluirFornecedor = excluirFornecedor;
        this.actualizarFornecedor = actualizarFornecedor;
        this.telaFornecedor = telaFornecedor;
    }
    public FornecedorPerfil(boolean cadastrarFornecedor, boolean excluirFornecedor, boolean actualizarFornecedor, boolean telaFornecedor, Set<Perfil> perfils) {
       this.cadastrarFornecedor = cadastrarFornecedor;
       this.excluirFornecedor = excluirFornecedor;
       this.actualizarFornecedor = actualizarFornecedor;
       this.telaFornecedor = telaFornecedor;
       this.perfils = perfils;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_fornecedor_perfil", unique=true, nullable=false)
    public Integer getIdFornecedorPerfil() {
        return this.idFornecedorPerfil;
    }
    
    public void setIdFornecedorPerfil(Integer idFornecedorPerfil) {
        this.idFornecedorPerfil = idFornecedorPerfil;
    }

    
    @Column(name="cadastrar_fornecedor", nullable=false)
    public boolean isCadastrarFornecedor() {
        return this.cadastrarFornecedor;
    }
    
    public void setCadastrarFornecedor(boolean cadastrarFornecedor) {
        this.cadastrarFornecedor = cadastrarFornecedor;
    }

    
    @Column(name="excluir_fornecedor", nullable=false)
    public boolean isExcluirFornecedor() {
        return this.excluirFornecedor;
    }
    
    public void setExcluirFornecedor(boolean excluirFornecedor) {
        this.excluirFornecedor = excluirFornecedor;
    }

    
    @Column(name="actualizar_fornecedor", nullable=false)
    public boolean isActualizarFornecedor() {
        return this.actualizarFornecedor;
    }
    
    public void setActualizarFornecedor(boolean actualizarFornecedor) {
        this.actualizarFornecedor = actualizarFornecedor;
    }

    
    @Column(name="tela_fornecedor", nullable=false)
    public boolean isTelaFornecedor() {
        return this.telaFornecedor;
    }
    
    public void setTelaFornecedor(boolean telaFornecedor) {
        this.telaFornecedor = telaFornecedor;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="fornecedorPerfil")
    public Set<Perfil> getPerfils() {
        return this.perfils;
    }
    
    public void setPerfils(Set<Perfil> perfils) {
        this.perfils = perfils;
    }




}

