package Modelo;
// Generated Nov 1, 2015 5:59:57 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ItemVendaId generated by hbm2java
 */
@Embeddable
public class ItemVendaId  implements java.io.Serializable {


     private int idVenda;
     private int idProduto;

    public ItemVendaId() {
    }

    public ItemVendaId(int idVenda, int idProduto) {
       this.idVenda = idVenda;
       this.idProduto = idProduto;
    }
   


    @Column(name="id_venda", nullable=false)
    public int getIdVenda() {
        return this.idVenda;
    }
    
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }


    @Column(name="id_produto", nullable=false)
    public int getIdProduto() {
        return this.idProduto;
    }
    
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ItemVendaId) ) return false;
		 ItemVendaId castOther = ( ItemVendaId ) other; 
         
		 return (this.getIdVenda()==castOther.getIdVenda())
 && (this.getIdProduto()==castOther.getIdProduto());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdVenda();
         result = 37 * result + this.getIdProduto();
         return result;
   }   


}


