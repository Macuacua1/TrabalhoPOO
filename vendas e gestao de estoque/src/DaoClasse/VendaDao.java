/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasse;

import Modelo.Cliente;
import Modelo.Venda;
import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author MACUACUA
 */
public class VendaDao implements Serializable{
   static Session sessao;
    
    private java.util.List <Cliente> lista=null;
    
    
    
    public static void iniciarSessao(){
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
  }

    public VendaDao() {
        sessao= HibernateUtil.getSessionFactory().openSession();
    }
    
    
    public void salvar(Venda ve){
     
        try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.save(ve);
        sessao.getTransaction().commit();
      
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o Cliente" +e);
            e.printStackTrace();
    }
   
    }
    
  
    public  Venda buscarVenda(int codigo){
       try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        Venda vee = (Venda)sessao.get(Venda.class, codigo);
      sessao.getTransaction().commit();
     
      return vee;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace();
    }
        return null;
 }
    
   
   
//Class tipo,int id
    
    public  void  apagarVenda(Venda ve) {
    
          try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
         
        sessao.delete(ve);
        sessao.getTransaction().commit();
     
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel apagar o objecto");
    }
   }
    
    public  void actualizar(Venda ve){
      try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.update(ve);
        sessao.getTransaction().commit();
       
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel actualizar o objecto" +e);
            e.printStackTrace();
    }   
        
    }
    
   
    
    public java.util.List  listarTodas(){
          try{
           SessionFactory tp= new Configuration().configure().buildSessionFactory();
           sessao= tp.openSession();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("from  Venda").list();
           sessao.close();
        return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+e);
    }
          return null;
    }
    public  java.util.List  listarNomes(){
          try{
           SessionFactory tp= new Configuration().configure().buildSessionFactory();
            Session sessao= tp.openSession();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("SELECT nomeCliente from Cliente ").list();
           sessao.close();
       
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
                lista= (java.util.List) sessao.createCriteria(Cliente.class)
				.add(
					Restrictions.like("nomeCliente", nome, MatchMode.START)
				).list();
                 sessao.close();
       return lista;
                           }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar o Cliente " +e);
    }

        return null;
		
    }
    
    
    public static void fecharSessao(){
     sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.close();
    }
      
}
