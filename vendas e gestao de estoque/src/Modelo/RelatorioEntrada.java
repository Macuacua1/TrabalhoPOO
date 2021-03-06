package Modelo;
// Generated Nov 1, 2015 5:59:57 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * RelatorioEntrada generated by hbm2java
 */
@Entity
@Table(name="relatorio_entrada"
    ,catalog="clever"
)
public class RelatorioEntrada  implements java.io.Serializable {


     private Integer idREntrada;
     private Produto produto;
     private int quantAnteriorR;
     private int acrescimo;
     private int quantidadePosteriorR;
     private Date data;

    public RelatorioEntrada() {
    }

    public RelatorioEntrada(Produto produto, int quantAnteriorR, int acrescimo, int quantidadePosteriorR, Date data) {
       this.produto = produto;
       this.quantAnteriorR = quantAnteriorR;
       this.acrescimo = acrescimo;
       this.quantidadePosteriorR = quantidadePosteriorR;
       this.data = data;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_r_entrada", unique=true, nullable=false)
    public Integer getIdREntrada() {
        return this.idREntrada;
    }
    
    public void setIdREntrada(Integer idREntrada) {
        this.idREntrada = idREntrada;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_produto", nullable=false)
@Cascade(CascadeType.SAVE_UPDATE)
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
    @Column(name="quant_anterior_r", nullable=false)
    public int getQuantAnteriorR() {
        return this.quantAnteriorR;
    }
    
    public void setQuantAnteriorR(int quantAnteriorR) {
        this.quantAnteriorR = quantAnteriorR;
    }

    
    @Column(name="acrescimo", nullable=false)
    public int getAcrescimo() {
        return this.acrescimo;
    }
    
    public void setAcrescimo(int acrescimo) {
        this.acrescimo = acrescimo;
    }

    
    @Column(name="quantidade_posterior_r", nullable=false)
    public int getQuantidadePosteriorR() {
        return this.quantidadePosteriorR;
    }
    
    public void setQuantidadePosteriorR(int quantidadePosteriorR) {
        this.quantidadePosteriorR = quantidadePosteriorR;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data", nullable=false, length=19)
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }




}


