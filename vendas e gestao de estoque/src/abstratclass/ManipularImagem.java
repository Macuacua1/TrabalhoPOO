/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstratclass;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author ILIDIOP
 */
public class ManipularImagem {
    
    
    public static BufferedImage setImagem(String caminho,Integer imageLargura,Integer imageHaltura){
       Double novaImLargura =null;
       Double novaImHaltura =null;
       Double imProporcao =null;
       Graphics2D gr2d=null;
       BufferedImage image=null,novaImage=null;
       
       try{
       image=ImageIO.read(new File(caminho));
  }catch(IOException ex){
  //Logger.getLogger(ManipularImagem.class.getName()).Log;
  }
     novaImLargura=(double)image.getWidth();
     novaImHaltura=(double)image.getHeight();
       
       
     if(novaImLargura>=imageLargura) {
     imProporcao =(novaImHaltura/novaImLargura);
     
     novaImLargura=(double)imageLargura;
     
     novaImHaltura=(novaImLargura*imProporcao);
     
     while(novaImHaltura>imageHaltura){
     
      novaImLargura=(double)(--imageLargura);
     novaImHaltura=(novaImLargura*imProporcao);
     }
     }
     else
         if(novaImHaltura>=imageHaltura){
     imProporcao =(novaImLargura/novaImHaltura);
     novaImHaltura=(double)imageHaltura;
     
     
       while(novaImHaltura>imageHaltura){
     
     novaImHaltura =(double)(--imageHaltura);
     novaImLargura =(novaImLargura*imProporcao);
     }
         }
     
     
     novaImage=new BufferedImage(novaImLargura.intValue(), novaImHaltura.intValue(), BufferedImage.TYPE_INT_BGR);
     gr2d=novaImage.createGraphics();
      gr2d.drawImage(image, 0, 0,novaImLargura.intValue(),novaImHaltura.intValue(),null);  
    return novaImage;
    }
    
    public static byte[]getImagebytes(BufferedImage image){
     ByteArrayOutputStream baopstream=  new  ByteArrayOutputStream();
     try{
     ImageIO.write(image,"JPNG",baopstream);
     
     }catch(IOException ex){}
     
    InputStream is= new   ByteArrayInputStream (baopstream.toByteArray()) ;
    
    return baopstream.toByteArray();
    }
    
    public static void ExibirImagemLable(byte[] minhaImage,javax.swing.JLabel label){
        
        if( minhaImage!=null){
        InputStream input =new ByteArrayInputStream(minhaImage);
        try{
        BufferedImage image=ImageIO.read(input);
        label.setIcon(new ImageIcon(image));
        }
        catch(IOException ex){}
        
        }else label.setIcon(null);
    
    }
}
