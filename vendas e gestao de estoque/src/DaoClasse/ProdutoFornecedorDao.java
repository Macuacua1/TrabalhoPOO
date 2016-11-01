/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasse;


import static DaoClasse.ProdutoDao.sessao;
import Modelo.Produto;
import Modelo.ProdutoFornecedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author MACUACUA
 */
public class ProdutoFornecedorDao {
  
    private Session sessao;
    private List <ProdutoFornecedor> lista=null;
    private ProdutoFornecedorDao guest=null;
    private boolean added=false;
    
    public ProdutoFornecedorDao(){
    }
    
    public void gravarProdutoFornecedor(ProdutoFornecedor pf){
        try{
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.save(pf);
        sessao.getTransaction().commit();
        }catch(HibernateException e){JOptionPane.showMessageDialog(null, "Erro ao tentar salvar"+e);}
       
    }
    
    public void removerProdutoFornecedor(ProdutoFornecedor pf){
        try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.delete(pf);
        sessao.getTransaction().commit();
        }catch(HibernateException ex){}
        
    }
 public java.util.List  listarProdutoFornecedor(){
          try{
            sessao=HibernateUtil.getSessionFactory().getCurrentSession();
           sessao.beginTransaction();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("from  ProdutoFornecedor").list();
           sessao.getTransaction().commit();
        return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+e);
    }
          return null;
    }

 public  void actualizar(ProdutoFornecedor pf){
      try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.update(pf);
         JOptionPane.showMessageDialog(null, "Actualizado com sucesso");
        sessao.getTransaction().commit();
 
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel actualizar o Produto" +e);
            e.printStackTrace();
    }   
        
    } 
  public  ProdutoFornecedor getProFor(Produto pp) {

		sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
                java.util.List lista;
   try {             
	lista=( java.util.List )sessao.createQuery("From Bem where nome='"+pp+"'").list();
  // lista = sessao.createQuery("From ProdutoFornecedor where produto like'" + pp + "'").list();
   sessao.getTransaction().commit();
   
		if (lista.size() >= 0)
                    for (Object p : lista) {
	    ProdutoFornecedor proF = ( ProdutoFornecedor) p;
	   if (pp.equals(proF.getProduto()))
	   return proF;                 
		}
                
              }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar o Produto em questao" );	
	}   
     return null;
}
   
  
  
}

    

