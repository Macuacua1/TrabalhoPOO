
package ClasseDao;

import Hibernate.HibernateUtil;
import Modelo.Endereco;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author MACUACUA
 */
public class EnderecoDao {
    private Session sessao;
    private List <Endereco> lista=null;
    private Endereco guest=null;
    private boolean added=false;
    
    public EnderecoDao(){
    }
    
    public void gravarEndereco(Endereco alvo){
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.save(alvo);
        sessao.getTransaction().commit();
      guest=alvo;
       
    }
    
    public void removerEndereco(int codigo){
        
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        Endereco end = (Endereco)sessao.get(Endereco.class, codigo);
       
        sessao.delete(end);
        sessao.getTransaction().commit();
        lista.remove(end);
        guest=end;
        added=false;
       
    }
    
    public void updateEndereco(Endereco merc){
        
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
       sessao.update(merc);
        sessao.getTransaction().commit();
       guest=merc;
        
    }
    
    public int getIdEndereco(Endereco end){
        
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        
        List <Endereco> lista=(List <Endereco>) sessao.createQuery("From Endereco where bairro='"+end.getBairro()+"'").list();
        sessao.getTransaction().commit();

       Endereco procurado=new Endereco();
        if(lista.size()!=0) procurado=lista.get(0);
        
        for(Endereco alvo: lista){
            if(alvo.getBairro().equals(end.getBairro())&& alvo.getQuarteirao().equals(end.getQuarteirao()) && (alvo.getNumeroCasa()+"").equals(end.getNumeroCasa()))
            procurado=alvo;//listaBairros.add(alvo);
        }
        
        if(procurado!=null) return procurado.getIdEndereco();
        
        return -1;
    }
    
    public Endereco getEndereco(int codigo){
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        Endereco alvo = (Endereco)sessao.get(Endereco.class, codigo);
        sessao.getTransaction().commit();
        
        return alvo;  
    }
    
}
