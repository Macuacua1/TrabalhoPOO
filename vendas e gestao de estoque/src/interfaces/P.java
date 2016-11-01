/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author ILIDIOP
 */
public class P extends JPanel{
    
private final Image ima;

    public P() {
    ImageIcon  referencia=new ImageIcon("Vendas.ico");
       ima = referencia.getImage();  
        
        setPreferredSize(new Dimension(500,500));
this.setBackground(new Color(127,51,0));
    }
    
@Override
   public void paintComponent(Graphics g){
       
       g.drawImage(ima,0, 0, getWidth(), getHeight(), this);
   } 
    

}
