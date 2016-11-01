
package interfaces;

import DaoClasse.UsuarioDao;
import Modelo.Usuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;

/**
 *
 * @author ILIDIOP
 */
@SuppressWarnings("serial")
public class Splash extends JWindow{
    private JProgressBar barra;
          
private List<Usuario> l;
 static Usuario u=null;
    @SuppressWarnings("unchecked")
    public Splash() {
        
        barra= new JProgressBar();
        int larg=(int) this.getToolkit().getScreenSize().getWidth();
        int halt=(int) this.getToolkit().getScreenSize().getHeight(); 
        
        int x=(larg-500)/2;
        int y=(halt-300)/2;
           
        
        JLabel lima= new JLabel(new ImageIcon("vendas.ico"));
        lima.setLocation(new Point(0,0));
        lima.setPreferredSize(new Dimension(500,300));
        
       
        barra.setBounds(0,270,500,10);
        barra.setBackground(Color.BLUE);
        barra.setBorderPainted(false);
        barra.setStringPainted(true);
  
        setBackground(Color.yellow);
        this.setLayout(null);
        this. setLocation(new Point(x,y));
        this. setSize(500, 300);
        this.add(barra);
        this.setVisible(true); 
        this.setBackground(new Color(126,71,0));
     l= new UsuarioDao().listarTodos();      
        
       new Thread(){
       @Override
       public void run(){
       
       for(int pro=0;pro<l.size();pro++ )
       {  try{   
           
           barra.setValue((pro*100));
           sleep(200);
       }catch(InterruptedException e){}
       
          }
       }
       }.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      this.dispose();
       boolean b =false;
        
        for (Usuario l1 : l) 
              
     if("Administrador".equals(l1.getPerfil().getPerfilNome()))
            {     b=true;
            break;}
        
       
    if( b)
       new Interfaces.TelaLog().setVisible(true); 
    else   
     new CadUsuario().setVisible(true);
      
         
    }
     
 public static void main(String[]args)   {
      Splash splash = new Splash();
}
    
}
