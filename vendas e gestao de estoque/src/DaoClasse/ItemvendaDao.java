/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasse;


import Modelo.ItemVenda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import util.HibernateUtil;

/**
 *
 * @author MACUACUA
 */
public class ItemvendaDao {

    private Session sessao;
    private List <ItemVenda> lista=null;
  
    
    public ItemvendaDao(){
    }
    
    public void gravarItemVenda(ItemVenda item){
        try{
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.save(item);
        sessao.getTransaction().commit();
      
        }catch(HibernateException e){}
    }
    
    public void removerItemVenda(ItemVenda item){
     try{   
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.delete(item);
        sessao.getTransaction().commit(); 
       }catch(HibernateException e){} 
    }
    
 public java.util.List  listarItens(){
          try{
          sessao=HibernateUtil.getSessionFactory().getCurrentSession();
           sessao.beginTransaction();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("from  ItemVenda").list();
           sessao.getTransaction().commit();
        return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro na tentativa de busca"+e);
    }
          return null;
    }

    public  java.util.List  listarIdProduto(){
          try{
           SessionFactory tp= new Configuration().configure().buildSessionFactory();
            Session sessao= tp.openSession();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery(" from ItemVenda ").list();
           sessao.getTransaction().commit();
       
          return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+e);
    }
          return null;
    }
 
    
   
}
