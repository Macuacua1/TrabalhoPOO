package Modelo;
// Generated Nov 1, 2015 5:59:57 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Venda generated by hbm2java
 */
@Entity
@Table(name="venda"
    ,catalog="clever"
)
public class Venda  implements java.io.Serializable {


     private Integer idVenda;
     private Cliente cliente;
     private Usuario usuario;
     private double custoTotal;
     private Date dataEHora;
     private Set<PagamentoEmprestimo> pagamentoEmprestimos = new HashSet<PagamentoEmprestimo>(0);
     private Set<ItemVenda> itemVendas = new HashSet<ItemVenda>(0);

    public Venda() {
    }

	
    public Venda(Cliente cliente, Usuario usuario, double custoTotal, Date dataEHora) {
        this.cliente = cliente;
        this.usuario = usuario;
        this.custoTotal = custoTotal;
        this.dataEHora = dataEHora;
    }
    public Venda(Cliente cliente, Usuario usuario, double custoTotal, Date dataEHora, Set<PagamentoEmprestimo> pagamentoEmprestimos, Set<ItemVenda> itemVendas) {
       this.cliente = cliente;
       this.usuario = usuario;
       this.custoTotal = custoTotal;
       this.dataEHora = dataEHora;
       this.pagamentoEmprestimos = pagamentoEmprestimos;
       this.itemVendas = itemVendas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_venda", unique=true, nullable=false)
    public Integer getIdVenda() {
        return this.idVenda;
    }
    
    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_cliente", nullable=true)
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_usuario", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="custo_total", nullable=false, precision=22, scale=0)
    public double getCustoTotal() {
        return this.custoTotal;
    }
    
    public void setCustoTotal(double custoTotal) {
        this.custoTotal = custoTotal;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dataE_hora", nullable=false, length=19)
    public Date getDataEHora() {
        return this.dataEHora;
    }
    
    public void setDataEHora(Date dataEHora) {
        this.dataEHora = dataEHora;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="venda")
    public Set<PagamentoEmprestimo> getPagamentoEmprestimos() {
        return this.pagamentoEmprestimos;
    }
    
    public void setPagamentoEmprestimos(Set<PagamentoEmprestimo> pagamentoEmprestimos) {
        this.pagamentoEmprestimos = pagamentoEmprestimos;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="venda")
    public Set<ItemVenda> getItemVendas() {
        return this.itemVendas;
    }
    
    public void setItemVendas(Set<ItemVenda> itemVendas) {
        this.itemVendas = itemVendas;
    }




}

