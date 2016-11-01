         /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasse;


import Modelo.PagamentoEmprestimo;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author MACUACUA
 */
public class PagamentoDao implements Serializable{
    
     static Session sessao;
    
    private java.util.List <PagamentoEmprestimo> lista=null;
    
    
    
    public static void iniciarSessao(){
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
  }

    public PagamentoDao() {
        sessao= HibernateUtil.getSessionFactory().openSession();
    }
    
    
    public void salvar(PagamentoEmprestimo  pa){
     
        try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.save(pa);
         
        sessao.getTransaction().commit();
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o Cliente" +e);
            e.printStackTrace();
    }
     
    }
    
  
    public  PagamentoEmprestimo buscarpagamento(int codigo){
       try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        PagamentoEmprestimo pag = (PagamentoEmprestimo)sessao.get(PagamentoEmprestimo.class, codigo);
      sessao.getTransaction().commit();
      return pag;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace();
    }
        return null;
 }
    
   
   
//Class tipo,int id
    public void  apagar(int codigo) throws HibernateException{
    
          try{
         sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            PagamentoEmprestimo pe = (PagamentoEmprestimo)sessao.get(PagamentoEmprestimo.class, codigo);
    sessao.delete(pe);
     
        sessao.getTransaction().commit();
          
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel apagar o objecto" +e);
            e.printStackTrace();
    }
   }
    
    public  void actualizar(PagamentoEmprestimo pe){
      try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.update(pe);
         
        sessao.getTransaction().commit();
       
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel actualizar o objecto" +e);
            e.printStackTrace();
    }   
        
    }
    
   
    
    public java.util.List  listarTodas(){
          try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("from  PagamentoEmprestimo").list();
           sessao.getTransaction().commit();
        return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+e);
    }
          return null;
    }
    
    
   
    
    
     public java.util.List pesquisaPeloVenda(String nome) {
     
         java.util.List lista= null;
          sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
     	try {
                lista= (java.util.List) sessao.createCriteria(PagamentoEmprestimo.class)
				.add(
					Restrictions.like("venda", nome, MatchMode.START)
				).list();
                 sessao.getTransaction().commit();
       return lista;
                           }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar o Cliente " +e);
    }

        return null;
    
}
     
            public java.util.List  buscarListaVenda(int venda){
        try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        lista=sessao.createQuery("From PagamentoEmprestimo where venda='"+venda+"'").list();
         sessao.getTransaction().commit();
      return lista;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace(); }
        return null;
    }
}