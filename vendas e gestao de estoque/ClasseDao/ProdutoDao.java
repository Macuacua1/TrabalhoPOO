/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseDao;

import Hibernate.HibernateUtil;
import Modelo.Fornecedor;
import Modelo.Produto;
import java.awt.List;
import java.util.ArrayList;
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
public class ProdutoDao {
    
    static Session sessao;
    
    private java.util.List <Produto> lista=null;
    private Produto guest=null;
    private boolean added=false;
    
    
    public static void iniciarSessao(){
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
  }

    public ProdutoDao() {
        sessao= HibernateUtil.getSessionFactory().openSession();
    }
    
    
    public void salvar(Produto cli){
     
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
    
  
    public  Produto buscarProduto(int codigo){
       try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
       Produto cli = (Produto)sessao.get(Produto.class, codigo);
      sessao.getTransaction().commit();
      return cli;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace();
    }
        return null;
 }
    
   
    public int buscarIdProduto(String nome){
        try{
      sessao=HibernateUtil.getSessionFactory().getCurrentSession();
       sessao.beginTransaction();
     lista=sessao.createQuery("From Produto where nomeProduto like'"+nome+"'").list();
        sessao.getTransaction().commit();
        
        for(Produto  p: lista)          
          if(p.getNomeProduto().equals(nome)) 
              
              return p.getCodigoBarras();
        
        
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace(); }
        return 0;
    }
    
      public Produto buscarProdutoN(String nome){
        try{
      sessao=HibernateUtil.getSessionFactory().getCurrentSession();
       sessao.beginTransaction();
     lista=sessao.createQuery("From Produto where nomeProduto like'"+nome+"'").list();
        sessao.getTransaction().commit();
        
        for(Produto  p: lista)          
          if(p.getNomeProduto().equals(nome)) 
              
              return p;
        
        
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace(); }
        return null;
    }
//Class tipo,int id
    public void  apagarProduto(int codigo) throws HibernateException{
    
          try{
         sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            Produto cli = (Produto)sessao.get(Produto.class, codigo);
    sessao.delete(cli);
     JOptionPane.showMessageDialog(null,"Eliminado com sucesso");
        sessao.getTransaction().commit();
        guest=cli;
        added=false;
          sessao.close();
     
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel apagar o Produto" +e);
            e.printStackTrace();
    }
   }
    
    public  void actualizar(Produto cli){
      try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.update(cli);
         JOptionPane.showMessageDialog(null, "Actualizado com sucesso");
        sessao.getTransaction().commit();
        guest=cli;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel actualizar o Produto" +e);
            e.printStackTrace();
    }   
        
    }
    
    public static List buscaTodos(Produto cli) throws HibernateException{
        
     List lista=null;
     try{
     sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        lista= (List) sessao.createCriteria(Produto.class).list();
      }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel carregar a lista" +e);
            e.printStackTrace();
    }
        return lista;
    }
    
    public java.util.List  listarTodos(){
          try{
           SessionFactory tp= new Configuration().configure().buildSessionFactory();
           Session sessao= tp.openSession();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("from  Produto").list();
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
           lista= sessao.createQuery("select nomeProduto from Produto ").list();
           sessao.close();
       
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
                lista= (java.util.List) sessao.createCriteria(Produto.class).add(Restrictions.like("nomeProduto", nome, MatchMode.START)).list();
                       
                 sessao.close();
       return lista;
                           }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar o Produto " +e);
    }

        return null;         
		
    }
    
    public static int getIdTipo(String nome) {

		sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		java.util.List lista;
		lista = sessao.createQuery("From Produto where nomeProduto like'" + nome + "'").list();
		sessao.getTransaction().commit();

		Produto procurado = new Produto();
		if (lista.size() == 1)
			procurado = (Produto) lista.get(0);

		for (Object p : lista) {
			if (nome.equals(((Produto) p).getNomeProduto()))
				procurado = (Produto) p;
		}

		if (procurado != null)
			return procurado.getCodigoBarras();

		return -1;
	}
    
    public static void fecharSessao(){
     sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.close();
    }
    


    
}

    

