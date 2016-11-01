/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasse;

import Modelo.Tipoproduto;
import Modelo.UsuarioPerfil;
import java.awt.List;
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
 * @author ILIDIOP
 */
public class UsuarioPerfilDao implements Serializable{
       static Session sessao;
    
    public static void iniciarSessao(){
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
  }

    public UsuarioPerfilDao() {
        sessao= HibernateUtil.getSessionFactory().openSession();
    }
    
    
    public static UsuarioPerfil salvar(UsuarioPerfil up){
       
        try{
       sessao=HibernateUtil.getSessionFactory().getCurrentSession();
       sessao.beginTransaction();
       UsuarioPerfil u=(UsuarioPerfil) sessao.save(up);
        sessao.getTransaction().commit();
        return u;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objecto" +e);
            e.printStackTrace();
    }
      return null; 
    }
    
  
    public static void  apagar(Class tipo,int id) throws HibernateException{
    
          try{
        //sessao=HibernateUtil.getSessionFactory().getCurrentSession();
       
       // SessionFactory tp= new Configuration().configure().buildSessionFactory();
           sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
    sessao.delete(sessao.get(tipo,id));
     JOptionPane.showMessageDialog(null,"Eliminado com sucesso");
        sessao.getTransaction().commit();
          sessao.close();
     
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel apagar o objecto" +e);
            e.printStackTrace();
    }
    
        
    }
    
    public static void actualizar(Object o){
      try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.update(o);
         JOptionPane.showMessageDialog(null, "Actualizado com sucesso");
        sessao.getTransaction().commit();
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel actualizar o objecto" +e);
            e.printStackTrace();
    }   
        
    }
    
    public static List buscaTodos(Class tipo) {
        
     List lista=null;
     try{
     sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        lista= (List) sessao.createCriteria(tipo).list();
        
      }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel carregar a lista" +e);
            e.printStackTrace();
    }
        return lista;
    }
    
    public java.util.List  listarTodos(String tipo){
          try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("from "+tipo).list();
           sessao.close();
       
           
          // JOptionPane.showMessageDialog(null, "Dados buscados com sucesso");
           return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+e);
    }
          return null;
    }
    
    public static int getIdTipo(Class tipo,String nome) {

		sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		java.util.List lista;
		lista = sessao.createQuery("From "+tipo+" where nomeTipo='" + nome + "'").list();
		sessao.getTransaction().commit();

		Tipoproduto procurado = new Tipoproduto();
		if (lista.size() == 1)
			procurado = (Tipoproduto) lista.get(0);

		for (Object tipoProduto : lista) {
			if (nome.equals(((Tipoproduto) tipoProduto).getNomeTipo()))
				procurado = (Tipoproduto) tipoProduto;
		}

		if (procurado != null)
			return procurado.getIdTipoProduto();

		return -1;
	}
    
    
 public static java.util.List  buscarNome(String classe,String coluna,String nome){
     java.util.List lista;
        try{
      sessao=HibernateUtil.getSessionFactory().getCurrentSession();
       sessao.beginTransaction();
     lista=sessao.createQuery("From classe where coluna='"+nome+"'").list();
        sessao.getTransaction().commit();
        
        return lista;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace(); }
        return null;
    }
 
     public static java.util.List  listarColuna(String coluna,String tipo){
          try{
           sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("SELECT "+coluna+" FROM "+tipo).list();
           sessao.close();
       
          return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+e);
    }
          return null;
    }
     
     public List pesquisaPeloNome(String nome) {
     
         List lista= null;
          sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
     	try {
                lista= (List) sessao.createCriteria(Tipoproduto.class)
				.add(
					Restrictions.like("nomeTipo", nome, MatchMode.ANYWHERE)
				).list();
                 sessao.close();
       return lista;
                           }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar o Tipo do Produdo " +e);
    }
				
				//Desta vez usamos o metodo like().
				//Ele possui 3 parametros. O 1° e o 2°
				//Já sabemos para que serve, o 3° serve para
				//informarmos que queremos localizar todos os
				//nomes que contenham a palavra Maria em qualquer lugar.
				//e por fim retornamos uma lista.
        return null;
		
    }
    
}
