
package ClasseDao;

import Hibernate.HibernateUtil;
import Modelo.Cliente;
import Modelo.Fornecedor;
import Modelo.Tipoproduto;
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
public class FornecedorDao {
   static Session sessao;
    
    private java.util.List <Fornecedor> lista=null;
    private Fornecedor guest=null;
    private boolean added=false;
    
    
    public static void iniciarSessao(){
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
  }

    public FornecedorDao() {
        sessao= HibernateUtil.getSessionFactory().openSession();
    }
    
    
    public void salvar(Fornecedor cli){
     
        try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.save(cli);
         JOptionPane.showMessageDialog(null, "Salvo com sucesso" );
        sessao.getTransaction().commit();
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o Fornecedor" +e);
            e.printStackTrace();
    }
     
    }
    
  
    public  Fornecedor buscarFornecedor(int codigo){
       try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
       Fornecedor cli = (Fornecedor)sessao.get(Fornecedor.class, codigo);
      sessao.getTransaction().commit();
      return cli;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace();
    }
        return null;
 }
    
   
    public int buscarIdFornecedor(String nome){
        try{
      sessao=HibernateUtil.getSessionFactory().getCurrentSession();
       sessao.beginTransaction();
     lista=sessao.createQuery("From Fornecedor where nomeFornecedor='"+nome+"'").list();
        sessao.getTransaction().commit();
        
        for(Fornecedor c: lista)          
          if(c.getNomeFornecedor().equals(nome)) return c.getIdFornecedor();
        
        return -1;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace(); }
        return 0;
    }
//Class tipo,int id
    public void  apagarFornecedor(int codigo) throws HibernateException{
    
          try{
         sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            Fornecedor cli = (Fornecedor)sessao.get(Fornecedor.class, codigo);
    sessao.delete(cli);
     JOptionPane.showMessageDialog(null,"Eliminado com sucesso");
        sessao.getTransaction().commit();
        guest=cli;
        added=false;
          sessao.close();
     
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel apagar o Fornecedor" +e);
            e.printStackTrace();
    }
   }
    
    public  void actualizar(Fornecedor cli){
      try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.update(cli);
         JOptionPane.showMessageDialog(null, "Actualizado com sucesso");
        sessao.getTransaction().commit();
        guest=cli;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel actualizar o Fornecedor" +e);
            e.printStackTrace();
    }   
        
    }
    
    public static List buscaTodos(Fornecedor cli) throws HibernateException{
        
     List lista=null;
     try{
     sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        lista= (List) sessao.createCriteria(Fornecedor.class).list();
      }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel carregar a lista" +e);
            e.printStackTrace();
    }
        return lista;
    }
    
    public java.util.List  listarTodos(/*Fornecedor cli*/){
          try{
           SessionFactory tp= new Configuration().configure().buildSessionFactory();
           Session sessao= tp.openSession();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("from  Fornecedor").list();
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
           lista= sessao.createQuery("select nomeFornecedor from Fornecedor ").list();
           sessao.close();
       
          return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro ao buscar o nome do Fornecedor"+e);
    }
          return null;
    }
    
    public static int getIdTipo(String nome) {

		sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		java.util.List lista;
		lista = sessao.createQuery("From Fornecedor where nomeFornecedor like'" + nome + "'").list();
		sessao.getTransaction().commit();

		Fornecedor procurado = new Fornecedor();
		if (lista.size() == 1)
			procurado = (Fornecedor) lista.get(0);

		for (Object forne : lista) {
			if (nome.equals(((Fornecedor) forne).getNomeFornecedor()))
				procurado = (Fornecedor) forne;
		}

		if (procurado != null)
			return procurado.getIdFornecedor();

		return -1;
	}
       public java.util.List pesquisaPeloNome(String nome) {
     
        java.util.List lista= null;
          sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
     	try {
                lista= (java.util.List) sessao.createCriteria(Fornecedor.class).add(Restrictions.like("nomeFornecedor", nome, MatchMode.START)).list();
                       
                 sessao.close();
       return lista;
                           }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar o Fornecedor " +e);
    }

        return null;         
		
    }
    
    public static void fecharSessao(){
     sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.close();
    }
    
}

    

