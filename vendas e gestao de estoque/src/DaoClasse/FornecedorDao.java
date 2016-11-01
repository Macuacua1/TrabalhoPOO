
package DaoClasse;


import Modelo.Fornecedor;
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
public class FornecedorDao {
   static Session sessao;
    
    private java.util.List <Fornecedor> lista=null;
  
    
    
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
        sessao.getTransaction().commit();
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o Fornecedor" +e);
            e.printStackTrace();
    }
     
    }
  
        public Fornecedor buscarForneloNome(String nome){
       java.util.List list= new ArrayList();
          try{
              
      sessao=HibernateUtil.getSessionFactory().getCurrentSession();
      sessao.beginTransaction();
        list=( java.util.List)  sessao.createCriteria(Fornecedor.class).list();
        sessao.getTransaction().commit();
       
        for(int j=0;j<list.size();j++) {
            Fornecedor f =(Fornecedor) list.get(j);
          if(f.getNomeFornecedor().equals(nome))
              return f;
        }
        
       
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
             }
          catch(StackOverflowError e){ JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e); }
        return null;
    }
  
    public  Fornecedor buscarFornecedor(int codigo){
       try{
       sessao = HibernateUtil.getSessionFactory().openSession();
       sessao.beginTransaction();
       Fornecedor forn = (Fornecedor) sessao.get(Fornecedor.class, codigo);
      sessao.getTransaction().commit();
      return forn;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace();
    }
        return null;
 }
    
   
    public int buscarIdFornecedor(String nome){
        try{
      sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
     lista=sessao.createQuery("From Fornecedor where nomeFornecedor=' "+nome+" '").list();
        sessao.getTransaction().commit();
        
        for(Fornecedor c: lista)          
          if(c.getNomeFornecedor().equals(nome)) 
              return c.getIdFornecedor();
        
       
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace(); }
        return -1;
    }

    
    public void  apagarFornecedor(int codigo) throws HibernateException{
    
          try{
         sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            Fornecedor fo = (Fornecedor)sessao.get(Fornecedor.class, codigo);
    sessao.delete(fo);
     JOptionPane.showMessageDialog(null,"Eliminado com sucesso");
        sessao.getTransaction().commit();
      
         
     
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel apagar o Fornecedor" +e);
            e.printStackTrace();
    }
   }
    
     public void  apagarFornecedor(Fornecedor fo) throws HibernateException{
    
          try{
         sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
           
    sessao.delete(fo);
     
        sessao.getTransaction().commit();
        
          
     
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel apagar o Fornecedor" +e);
            e.printStackTrace();
    }
   }
    
    
    public  void actualizar(Fornecedor fo){
      try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.update(fo);
        
        sessao.getTransaction().commit();
      
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel actualizar o Fornecedor" +e);
            e.printStackTrace();
    }   
        
    }
    
    public static java.util.List buscaTodos() throws HibernateException{
        
     java.util.List lista=null;
     try{
       sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        lista= (java.util.List) sessao.createCriteria(Fornecedor.class).list();
        sessao.getTransaction().commit();
        
      }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel carregar a lista" +e);
            e.printStackTrace();
    }
        return lista;
    }
    
    public java.util.List  listarTodos(){
          try{
            sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("from  Fornecedor").list();
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
           lista= sessao.createQuery("select nomeFornecedor from Fornecedor ").list();
           sessao.getTransaction().commit();
    
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
       sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
     	try {
                lista= sessao.createCriteria(Fornecedor.class).
                        add(Restrictions.like("nomeFornecedor", nome, MatchMode.START)).list();
                       
                 sessao.getTransaction().commit();
       return lista;
                           }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar o Fornecedor " +e);
    }

        return null;         
		
    }
    

    
}

    

