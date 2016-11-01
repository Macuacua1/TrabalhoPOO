
package DaoClasse;


import Modelo.Endereco;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author MACUACUA
 */
public class EnderecoDao implements Serializable{
    private Session sessao;
    private List <Endereco> lista=null;
    
    
    public EnderecoDao(){
    }
    
    public void gravarEndereco(Endereco alvo){
        sessao= HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.save(alvo);
        sessao.getTransaction().commit();
     
       
    }
    
    public void removerEndereco(int codigo){
        
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        Endereco end = (Endereco)sessao.get(Endereco.class, codigo);
       
        sessao.delete(end);
        sessao.getTransaction().commit();
       
       
       
    }
    
    public void updateEndereco(Endereco end){
        try{
        sessao=HibernateUtil.getSessionFactory().getCurrentSession();
        sessao.beginTransaction();
        sessao.update(end);
        sessao.getTransaction().commit();
        }catch(Exception e){}    
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
