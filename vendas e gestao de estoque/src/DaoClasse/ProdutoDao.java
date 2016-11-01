/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClasse;


import static DaoClasse.ClienteDao.sessao;
import Modelo.Cliente;
import Modelo.Produto;
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
public class ProdutoDao implements Serializable{
    
    static Session sessao;
    
    private java.util.List <Produto> lista=null;
  
    
    
//    public static void iniciarSessao(){
//       // sessao= HibernateUtil.getSessionFactory().getCurrentSession();
//       // sessao.beginTransaction();
//  }

    public ProdutoDao() {
        sessao= HibernateUtil.getSessionFactory().openSession();
    }
    
    
    public void salvar(Produto pro){
     
        try{
         sessao=HibernateUtil.getSessionFactory().openSession();
         sessao.beginTransaction();
         sessao.save(pro);
        sessao.getTransaction().commit();
         JOptionPane.showMessageDialog(null, "Salvo com sucesso" );
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
     sessao=HibernateUtil.getSessionFactory().openSession();
     sessao.beginTransaction();
    
      lista= (java.util.List) sessao.createCriteria(Produto.class).list();
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
    public void  apagarProduto(Produto p) throws HibernateException{
    
          try{
     sessao=HibernateUtil.getSessionFactory().openSession();
     sessao.beginTransaction();
          
         sessao.delete(p);
         sessao.getTransaction().commit();
   
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel apagar o Produto" +e);
            e.printStackTrace();
    }
   }
    
   
     public Produto buscarProdloNome(String nome){
       java.util.List list= new ArrayList();
          try{
              
      sessao=HibernateUtil.getSessionFactory().getCurrentSession();
      sessao.beginTransaction();
            list=( java.util.List)  sessao.createCriteria(Produto.class).list();
        sessao.getTransaction().commit();
       
        for(int j=0;j<list.size();j++) {
            Produto p =(Produto) list.get(j);
          if(p.getNomeProduto().equals(nome))
              return p;
        }
        
       
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
             }
          catch(StackOverflowError e){ JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e); }
        return null;
    }   
    
    public  void actualizar(Produto cli){
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
    
    public static List buscaTodos(Produto cli) throws HibernateException{
        
     List lista=null;
     try{
     sessao=HibernateUtil.getSessionFactory().getCurrentSession();
     sessao.beginTransaction();
        lista= (List) sessao.createCriteria(Produto.class).list();
        sessao.getTransaction().commit();
      
      }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel carregar a lista" +e);
            e.printStackTrace();
    }
        return lista;
    }
    
    public java.util.List  listarTodos(){
          try{
            sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("from  Produto").list();
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
           lista= sessao.createQuery("select nomeProduto from Produto ").list();
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
                lista= (java.util.List) sessao.createCriteria(Produto.class).add(Restrictions.like("nomeProduto", nome, MatchMode.START)).list();
                       
                 sessao.getTransaction().commit();
       return lista;
       }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar o Produto " +e);
    }

        return null;         
		
    }
          
            public java.util.List pesquisaPeloNome1(String nome) {
     
         java.util.List lista= null;
          sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
     	try {
                lista= (java.util.List) sessao.createCriteria(Produto.class)
				.add(
					Restrictions.like("nomeProduto", nome, MatchMode.START)
				).list();
                 sessao.getTransaction().commit();
       return lista;
                           }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar o Cliente " +e);
    }

        return null;
		
    }
    
    public static int getIdTipo(String nome) {

		sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
                java.util.List lista;
   try {             
		
   lista = sessao.createQuery("From Produto where nomeProduto like'" + nome + "'").list();
   sessao.getTransaction().commit();
   
		if (lista.size() >= 0)
                    for (Object p : lista) {
	    Produto proc = ( Produto) p;
	   if (nome.equals(proc.getNomeProduto()))
	   return proc.getCodigoBarras();                 
		}		
             
              }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar o Produto em questao" );	
	}
       
     return -1;
}
}

    

