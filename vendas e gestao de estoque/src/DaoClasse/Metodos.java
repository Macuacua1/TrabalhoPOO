/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasse;



import Modelo.Tipoproduto;
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
 * @author MACUACUA
 */
public class Metodos implements Serializable{
    
    static Session sessao;
    
    public static void iniciarSessao(){
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
  }

    public Metodos() {
        sessao= HibernateUtil.getSessionFactory().openSession();
    }
    
    
    public static Object salvar(Object ob){
       
        try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
      Object obj=( Object)  sessao.save(ob);
        sessao.getTransaction().commit();
     
        return obj;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o objecto" +e);
            //e.printStackTrace();
    }
     return null;  
    }
    
    public  static Object buscar(Class tipo,int id){
        Object o= null;
         try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        o= sessao.get(tipo,id);
        sessao.getTransaction().commit();
        return o;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace();
    }
    return null;
 }
    
    public static Object buscarNome(Class tipo,String nome){
        try{
      sessao=HibernateUtil.getSessionFactory().getCurrentSession();
       sessao.beginTransaction();
     Object o= sessao.get(tipo,nome);
     sessao.getTransaction().commit();
      return o;
        }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace();}
        return null;
    } 
    
//Class tipo,int id
    public static java.util.List  apagar(Class tipo,int id) throws HibernateException{
    
          try{
        //sessao=HibernateUtil.getSessionFactory().getCurrentSession();
       
       // SessionFactory tp= new Configuration().configure().buildSessionFactory();
           sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
    sessao.delete(sessao.get(tipo,id));
     JOptionPane.showMessageDialog(null,"Eliminado com sucesso");
        sessao.getTransaction().commit();
          
     
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel apagar o objecto" +e);
            e.printStackTrace();
    }
        return null;
        
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
        
     List list=null;
     try{
     sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        list= (List) sessao.createCriteria(tipo).list();
        sessao.getTransaction().commit();
        return list;
      }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel carregar a lista" +e);
            e.printStackTrace();
    }
        return null;
    }
    
    public java.util.List  listarTodos(String tipo){
          try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("from "+tipo).list();
           sessao.getTransaction().commit();
       
           
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
           sessao.getTransaction().commit();
       
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
                 sessao.getTransaction().commit();
       return lista;
                           }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar o Tipo do Produdo " +e);
    }
				
				
        return null;
		
    }
    
    
   
    
}
