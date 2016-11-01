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
public class TipoprodutoDao implements Serializable{
    
    static Session sessao;
    
    private java.util.List <Tipoproduto> lista=null;
   
    
    
    public static void iniciarSessao(){
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
  }

    public TipoprodutoDao() {
        sessao= HibernateUtil.getSessionFactory().openSession();
    }

  
    
    public void salvarTipoproduto(Tipoproduto cli){
     
        try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.save(cli);
         JOptionPane.showMessageDialog(null, "Salvo com sucesso" );
        sessao.getTransaction().commit();
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o Tipoproduto" +e);
            e.printStackTrace();
    }
     
    }
    
  
    public  Tipoproduto buscarTipoproduto(int codigo){
       try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        Tipoproduto cli = (Tipoproduto)sessao.get(Tipoproduto.class, codigo);
      sessao.getTransaction().commit();
      return cli;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace();
    }
        return null;
 }
    
      public Tipoproduto buscarTipoPeloNome(String nome){
       java.util.List list= new ArrayList();
          try{
              
      sessao=HibernateUtil.getSessionFactory().getCurrentSession();
      sessao.beginTransaction();
            list=( java.util.List)  sessao.createCriteria(Tipoproduto.class).list();
        sessao.getTransaction().commit();
        
        for(int j=0;j<list.size();j++) {
            Tipoproduto t =(Tipoproduto) list.get(j);
          if(t.getNomeTipo().equals(nome))
              return t;
        }
        
       
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
             }
          catch(StackOverflowError e){ JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e); }
        return null;
    }
    
    
    public int buscarIdTipoproduto(String nome){
        try{
      sessao=HibernateUtil.getSessionFactory().getCurrentSession();
       sessao.beginTransaction();
     lista=sessao.createQuery("From Tipoproduto where nomeTipo=' "+nome+" '").list();
        sessao.getTransaction().commit();
        
        for(Tipoproduto c: lista)          
          if(c.getNomeTipo().equals(nome)) return c.getIdTipoProduto();
        
        return -1;
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel fazer a busca" +e);
            e.printStackTrace(); }
        return 0;
    }
//Class tipo,int id
    public void  apagarTipoproduto(int codigo) throws HibernateException{
    
          try{
         sessao=HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();
            Tipoproduto cli = (Tipoproduto)sessao.get(Tipoproduto.class, codigo);
    sessao.delete(cli);
     JOptionPane.showMessageDialog(null,"Eliminado com sucesso");
        sessao.getTransaction().commit();
        
          sessao.close();
     
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel apagar o Tipoproduto" +e);
            e.printStackTrace();
    }
   }
    
    public void actualizar(Tipoproduto cli){
      try{
         sessao=HibernateUtil.getSessionFactory().getCurrentSession();
         sessao.beginTransaction();
         sessao.update(cli);
         sessao.getTransaction().commit();
         JOptionPane.showMessageDialog(null, "Actualizado com sucesso");
    }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao e possivel actualizar o Tipoproduto" +e);
            e.printStackTrace();
    }   
        
    }
    
    public static List buscaTodos(Tipoproduto cli) throws HibernateException{
        
     List lista=null;
     try{
     sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        lista= (List) sessao.createCriteria(Tipoproduto.class).list();
        
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
           lista= sessao.createQuery("FROM  Tipoproduto").list();
        //   sessao.getTransaction().commit();
        return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro tipo de produto"+e);
    }
          return null;
    }
    
    public static int getIdTipo(String nome) {

		sessao = HibernateUtil.getSessionFactory().openSession();
		sessao.beginTransaction();
		java.util.List lista;
		lista = sessao.createQuery("From Tipoproduto where nomeTipo='" + nome + "'").list();
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
    
     public  java.util.List  listarNomes(){
          try{
          sessao = HibernateUtil.getSessionFactory().openSession();
          sessao.beginTransaction();
           java.util.List lista= new ArrayList();
           lista= sessao.createQuery("SELECT nomeTipo from Tipoproduto ").list();
           sessao.getTransaction().commit();
       sessao.close();
          return lista;
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Erro ao preencher tabela"+e);
    }
          return null;
    }
    
    
     public java.util.List pesquisaPeloNome(String nome) {
     
        java.util.List lista= null;
          sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
     	try {
                lista= (java.util.List) sessao.createCriteria(Tipoproduto.class).add(Restrictions.like("nomeTipo", nome,MatchMode.START)).list();
                       
       sessao.getTransaction().commit();
       return lista;
                           }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar o Tipo do Produdo " +e);
    }

        return null;          
		
    }
    
    
    public static void fecharSessao(){
     sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.close();
    }
    
}
