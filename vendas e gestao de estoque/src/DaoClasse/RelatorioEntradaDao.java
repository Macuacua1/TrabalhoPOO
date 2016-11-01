/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasse;

import Modelo.RelatorioEntrada;
import Modelo.Tipoproduto;
import java.io.Serializable;
import java.util.ArrayList;
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
public class RelatorioEntradaDao implements Serializable{
     static Session sessao;
    
    private java.util.List <RelatorioEntrada> lista=null;
    private RelatorioEntrada guest=null;
    private boolean added=false;
    
    
    public static void iniciarSessao(){
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
  }

    public RelatorioEntradaDao() {
        sessao= HibernateUtil.getSessionFactory().openSession();
    }

  
    
    public void salvarRelatorioEntrada(RelatorioEntrada cli){
     
        try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.save(cli);
       sessao.getTransaction().commit();
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o RelatorioEntrada" +e);
            e.printStackTrace();
    }
     
    }
    
  
    public  RelatorioEntrada buscarRelatorioEntrada(int codigo){
       try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        RelatorioEntrada cli = (RelatorioEntrada)sessao.get(RelatorioEntrada.class, codigo);
      sessao.getTransaction().commit();
      return cli;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace();
    }
        return null;
 }
  public void  apagarRelatorioEntrada(int codigo) throws HibernateException{
    
          try{
         sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
           RelatorioEntrada cli = (RelatorioEntrada)sessao.get(RelatorioEntrada.class, codigo);
    sessao.delete(cli);
    sessao.getTransaction().commit();
        guest=cli;
        added=false;
          sessao.close();
     
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel apagar o RelatorioEntrada" +e);
            e.printStackTrace();
    }
   }
      public java.util.List  listarTodoRelatorios(){
          try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            java.util.List lista= new ArrayList();
            lista= sessao.createQuery(" from RelatorioEntrada ").list();
            sessao.getTransaction().commit();
            return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro na tentativa de busca"+e);
    }
          return null;
    }
      
      
    public void actualizar(RelatorioEntrada cli){
      try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.update(cli);
       sessao.getTransaction().commit();
        
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel actualizar o RelatorioEntrada" +e);
            e.printStackTrace();
    }   
        
    }

    public java.util.List  listarTodos(Tipoproduto cli){
          try{
           sessao=HibernateUtil.getSessionFactory().getCurrentSession();
           sessao.beginTransaction();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("from  RelatorioEntrada order by idRelatorioEntrada  ").list();
           sessao.getTransaction().commit();
        return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+e);
    }
          return null;
    }
   
    public static void fecharSessao(){
     sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.close();
    }
    
}
