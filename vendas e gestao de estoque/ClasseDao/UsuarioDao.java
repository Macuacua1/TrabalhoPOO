/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseDao;

import Hibernate.HibernateUtil;
import Modelo.Usuario;
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

/**
 *
 * @author MACUACUA
 */
public class UsuarioDao implements Serializable{
    static Session sessao;
    
    private java.util.List <Usuario> lista=null;
    private Usuario guest=null;
    private boolean added=false;
    
    
    public static void iniciarSessao(){
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
  }

    public UsuarioDao() {
        sessao= HibernateUtil.getSessionFactory().openSession();
    }
    
    
    public void salvar(Usuario cli){
     
        try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.save(cli);
         JOptionPane.showMessageDialog(null, "Salvo com sucesso" );
        sessao.getTransaction().commit();
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o Cliente" +e);
            e.printStackTrace();
    }
     
    }
    
  
    public  Usuario buscarUsuario(int codigo){
       try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
       Usuario cli = (Usuario)sessao.get(Usuario.class, codigo);
      sessao.getTransaction().commit();
      return cli;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace();
    }
        return null;
 }
    
   
    public int buscarIdUsuario(String nome){
        try{
      sessao=HibernateUtil.getSessionFactory().getCurrentSession();
       sessao.beginTransaction();
     lista=sessao.createQuery("From Usuario where nomeUsuario='"+nome+"'").list();
        sessao.getTransaction().commit();
        
        for(Usuario c: lista)          
          if(c.getNomeUsuario().equals(nome)) return c.getIdUsuario();
        
        return -1;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace(); }
        return 0;
    }
//Class tipo,int id
    public void  apagarUsuario(int codigo) throws HibernateException{
    
          try{
       //  sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            Usuario cli = (Usuario)sessao.get(Usuario.class, codigo);
    sessao.delete(cli);
     JOptionPane.showMessageDialog(null,"Eliminado com sucesso");
        sessao.getTransaction().commit();
        guest=cli;
        added=false;
          sessao.close();
     
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel apagar o objecto" +e);
            e.printStackTrace();
    }
   }
    
    public  void actualizar(Usuario cli){
      try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.update(cli);
         JOptionPane.showMessageDialog(null, "Actualizado com sucesso");
        sessao.getTransaction().commit();
        guest=cli;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel actualizar o objecto" +e);
            e.printStackTrace();
    }   
        
    }
    
    public static List buscaTodos() throws HibernateException{
        
     List lista=null;
     try{
     sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        lista=  (List) sessao.createCriteria(Usuario.class).list();
      }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel carregar a lista" +e);
            e.printStackTrace();
    }
        return lista;
    }
    
    public java.util.List  listarTodos(){
          try{
           SessionFactory tp= new Configuration().configure().buildSessionFactory();
           sessao= tp.openSession();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("from  Usuario").list();
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
           lista= sessao.createQuery("SELECT nomeUsuario from Usuario ").list();
           sessao.close();
       
          return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+e);
    }
          return null;
    }
    
    public static int getIdUsuario(String nome) {

		sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		java.util.List lista;
		lista = sessao.createQuery("From Usuario where nomeTipoUsuario='" + nome + "'").list();
		sessao.getTransaction().commit();

		Usuario procurado = new Usuario();
		if (lista.size() == 1)
			procurado = (Usuario) lista.get(0);

		for (Object user : lista) {
			if (nome.equals(((Usuario) user).getNomeUsuario()))
				procurado = (Usuario) user;
		}

		if (procurado != null)
			return procurado.getIdUsuario();

		return -1;
	}
    
    
     public java.util.List pesquisaPeloNome(String nome) {
     
         java.util.List lista= null;
          sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
     	try {
                lista= (java.util.List) sessao.createCriteria(Usuario.class)
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
