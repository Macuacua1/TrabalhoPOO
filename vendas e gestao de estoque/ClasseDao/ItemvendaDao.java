/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseDao;

import Hibernate.HibernateUtil;
import Modelo.ItemVenda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author MACUACUA
 */
public class ItemvendaDao {

    private Session sessao;
    private List <ItemVenda> lista=null;
    private ItemVenda guest=null;
    private boolean added=false;
    
    public ItemvendaDao(){
    }
    
    public void gravarItemVenda(ItemVenda item){
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.save(item);
        sessao.getTransaction().commit();
      guest=item;
       
    }
    
    public void removerItemVenda(int codigo){
        
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        ItemVenda item = (ItemVenda)sessao.get(ItemVenda.class, codigo);
       
        sessao.delete(item);
        sessao.getTransaction().commit();
        lista.remove(item);
        guest=item;
        added=false;
       
    }
 public java.util.List  listarItens(){
          try{
           SessionFactory tp= new Configuration().configure().buildSessionFactory();
           Session sessao= tp.openSession();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("from  ItemVenda").list();
           sessao.close();
        return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+e);
    }
          return null;
    }

    
}
