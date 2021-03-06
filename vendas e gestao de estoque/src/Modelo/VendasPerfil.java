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
 * VendasPerfil generated by hbm2java
 */
@Entity
@Table(name="vendas_perfil"
    ,catalog="clever"
)
public class VendasPerfil  implements java.io.Serializable {


     private Integer idVendasPerfil;
     private boolean efetuarVenda;
     private boolean definirDesconto;
     private boolean fazerPedidos;
     private boolean fazerCotacao;
     private boolean definirLimite;
     private boolean telaVenda;
     private Set<Perfil> perfils = new HashSet<Perfil>(0);

    public VendasPerfil() {
    }

	
    public VendasPerfil(boolean efetuarVenda, boolean definirDesconto, boolean fazerPedidos, boolean fazerCotacao, boolean definirLimite, boolean telaVenda) {
        this.efetuarVenda = efetuarVenda;
        this.definirDesconto = definirDesconto;
        this.fazerPedidos = fazerPedidos;
        this.fazerCotacao = fazerCotacao;
        this.definirLimite = definirLimite;
        this.telaVenda = telaVenda;
    }
    public VendasPerfil(boolean efetuarVenda, boolean definirDesconto, boolean fazerPedidos, boolean fazerCotacao, boolean definirLimite, boolean telaVenda, Set<Perfil> perfils) {
       this.efetuarVenda = efetuarVenda;
       this.definirDesconto = definirDesconto;
       this.fazerPedidos = fazerPedidos;
       this.fazerCotacao = fazerCotacao;
       this.definirLimite = definirLimite;
       this.telaVenda = telaVenda;
       this.perfils = perfils;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_vendas_perfil", unique=true, nullable=false)
    public Integer getIdVendasPerfil() {
        return this.idVendasPerfil;
    }
    
    public void setIdVendasPerfil(Integer idVendasPerfil) {
        this.idVendasPerfil = idVendasPerfil;
    }

    
    @Column(name="efetuar_venda", nullable=false)
    public boolean isEfetuarVenda() {
        return this.efetuarVenda;
    }
    
    public void setEfetuarVenda(boolean efetuarVenda) {
        this.efetuarVenda = efetuarVenda;
    }

    
    @Column(name="definir_desconto", nullable=false)
    public boolean isDefinirDesconto() {
        return this.definirDesconto;
    }
    
    public void setDefinirDesconto(boolean definirDesconto) {
        this.definirDesconto = definirDesconto;
    }

    
    @Column(name="fazer_pedidos", nullable=false)
    public boolean isFazerPedidos() {
        return this.fazerPedidos;
    }
    
    public void setFazerPedidos(boolean fazerPedidos) {
        this.fazerPedidos = fazerPedidos;
    }

    
    @Column(name="fazer_cotacao", nullable=false)
    public boolean isFazerCotacao() {
        return this.fazerCotacao;
    }
    
    public void setFazerCotacao(boolean fazerCotacao) {
        this.fazerCotacao = fazerCotacao;
    }

    
    @Column(name="definir_limite", nullable=false)
    public boolean isDefinirLimite() {
        return this.definirLimite;
    }
    
    public void setDefinirLimite(boolean definirLimite) {
        this.definirLimite = definirLimite;
    }

    
    @Column(name="tela_venda", nullable=false)
    public boolean isTelaVenda() {
        return this.telaVenda;
    }
    
    public void setTelaVenda(boolean telaVenda) {
        this.telaVenda = telaVenda;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="vendasPerfil")
    public Set<Perfil> getPerfils() {
        return this.perfils;
    }
    
    public void setPerfils(Set<Perfil> perfils) {
        this.perfils = perfils;
    }




}


