/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasse;


import Modelo.Perfil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
public class PerfilDao implements Serializable{
    
    static Session sessao;
    
    private java.util.List <Perfil> lista=null;
    private Perfil guest=null;
    private boolean added=false;
    
    
    public static void iniciarSessao(){
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
  }

    public PerfilDao() {
        sessao= HibernateUtil.getSessionFactory().openSession();
    }
    
    
    public void salvar(Perfil cli){
     
        try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.save(cli);
         JOptionPane.showMessageDialog(null, "Salvo com sucesso" );
        sessao.getTransaction().commit();
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o Produto" +e);
            e.printStackTrace();
    }
     
    }
    
  
    public  Perfil buscarProduto(int codigo){
       try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
       Perfil cli = (Perfil)sessao.get(Perfil.class, codigo);
      sessao.getTransaction().commit();
      return cli;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace();
    }
        return null;
 }
    
   
    public int buscarIdPerfil(String nome){
        try{
      sessao=HibernateUtil.getSessionFactory().getCurrentSession();
       sessao.beginTransaction();
     lista=sessao.createQuery("From Perfil where perfilNome like'"+nome+"'").list();
        sessao.getTransaction().commit();
        
        for(Perfil  p: lista)          
          if(p.getPerfilNome().equals(nome)) return p.getIdPerfil();
        
        return -1;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace(); }
        return 0;
    }
//Class tipo,int id
    public void  apagarPerfil(int codigo) throws HibernateException{
    
          try{
         sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            Perfil cli = (Perfil)sessao.get(Perfil.class, codigo);
    sessao.delete(cli);
    
        sessao.getTransaction().commit();
       
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel apagar o Produto" +e);
            e.printStackTrace();
    }
   }
    
    public  void actualizar(Perfil cli){
      try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.update(cli);
        
        sessao.getTransaction().commit();
        
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel actualizar o Produto" +e);
            e.printStackTrace();
    }   
        
    }
    
    public static List buscaTodos(Perfil cli) throws HibernateException{
        
     List lista=null;
     try{
     sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        lista= (List) sessao.createCriteria(Perfil.class).list();
        sessao.getTransaction().commit();
      }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel carregar a lista" +e);
            e.printStackTrace();
    }
        return lista;
    }
    
    public java.util.List  listarTodos(){
          try{
           sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("from  Perfil").list();
           sessao.getTransaction().commit();
        return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+e);
    }
          return null;
    }
      public  java.util.List  listarNomes(){
          try{
           sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("select perfilNome from Perfil ").list();
           sessao.getTransaction().commit();
       
          return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro ao buscar o nome do Produto"+e);
    }
          return null;
    }
      
          public java.util.List pesquisaPeloNome(String nome) {
     
        java.util.List lista= null;
          sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
     	try {
                lista= (java.util.List) sessao.createCriteria(Perfil.class).add(Restrictions.like("nomePerfil", nome, MatchMode.ANYWHERE)).list();
                       
                 sessao.getTransaction().commit();
       return lista;
                           }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar o Perfil " +e);
    }

        return null;         
		
    }
    
    public static int getIdTipo(String nome) {

		sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		java.util.List lista;
		lista = sessao.createQuery("From Perfil where perfilNome like'" + nome + "'").list();
		sessao.getTransaction().commit();

		Perfil procurado = new Perfil();
		if (lista.size() == 1)
			procurado = (Perfil) lista.get(0);

		for (Object p : lista) {
			if (nome.equals(((Perfil) p).getPerfilNome()))
				procurado = (Perfil) p;
		}

		if (procurado != null)
			return procurado.getIdPerfil();

		return -1;
	}
    
    public static void fecharSessao(){
     sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.close();
    }
    


}
