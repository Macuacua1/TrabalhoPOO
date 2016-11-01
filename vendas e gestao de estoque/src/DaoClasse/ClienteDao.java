package DaoClasse;


import Modelo.Cliente;
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
public class ClienteDao implements Serializable{
    
    static Session sessao;
    
    private java.util.List <Cliente> lista=null;
    

    public ClienteDao() {
        sessao= HibernateUtil.getSessionFactory().openSession();
    }
    
    
    public void salvar(Cliente cli){
     
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
    
  
    public  Cliente buscarCliente(int codigo){
       try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        Cliente cli = (Cliente)sessao.get(Cliente.class, codigo);
      sessao.getTransaction().commit();
      return cli;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace();
    }
        return null;
 }
    
   
    public int buscarIdCliente(String nome){
        try{
      sessao=HibernateUtil.getSessionFactory().getCurrentSession();
       sessao.beginTransaction();
     lista=sessao.createQuery("From Cliente where nomeCliente='"+nome+"'").list();
        sessao.getTransaction().commit();
        
        for(Cliente c: lista)          
          if(c.getNomeCliente().equals(nome)) return c.getIdCliente();
        
        return -1;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace(); }
        return 0;
    }
//Class tipo,int id
    public void  apagarCliente(Cliente cli) throws HibernateException{
    
          try{
        sessao=HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        sessao.delete(cli);
        sessao.getTransaction().commit();
       
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel apagar o objecto" +e);
            e.printStackTrace();
    }
   }
    
    public  void actualizar(Cliente cli){
      try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.update(cli);
        
        sessao.getTransaction().commit();
     
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
        lista=  (List) sessao.createCriteria(Cliente.class).list();
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
           lista= sessao.createQuery("from  Cliente").list();
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
           lista= sessao.createQuery("SELECT nomeCliente from Cliente ").list();
           sessao.getTransaction().commit();
       
          return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+e);
    }
          return null;
    }
    
    public static int getIdTipo(String nome) {

		sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		java.util.List lista;
		lista = sessao.createQuery("From Cliente where nomeCliente='" + nome + "'").list();
		sessao.getTransaction().commit();

		Cliente procurado = new Cliente();
		if (lista.size() == 1)
			procurado = (Cliente) lista.get(0);

		for (Object cli : lista) {
			if (nome.equals(((Cliente) cli).getNomeCliente()))
				procurado = (Cliente) cli;
		}

		if (procurado != null)
			return procurado.getIdCliente();

		return -1;
	}
    
    
     public java.util.List pesquisaPeloNome(String nome) {
     
         java.util.List lista= null;
          sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
     	try {
                lista= (java.util.List) sessao.createCriteria(Cliente.class)
				.add(
					Restrictions.like("nomeCliente", nome, MatchMode.START)
				).list();
                 sessao.getTransaction().commit();
       return lista;
                           }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar o Cliente " +e);
    }

        return null;
		
    }
      public Cliente buscarCliente(String nome){
        try{
      sessao=HibernateUtil.getSessionFactory().getCurrentSession();
       sessao.beginTransaction();
     lista=sessao.createQuery("From Cliente where nomeCliente like'"+nome+"'").list();
        sessao.getTransaction().commit();
        
        for(Cliente  p: lista)          
          if(p.getNomeCliente().equals(nome)) 
              
              return p;
        
        
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace(); }
        return null;
    }
    
}
