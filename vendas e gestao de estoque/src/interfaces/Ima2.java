/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author ILIDIOP
 */
public class Ima2 extends JPanel{
    
    private Image ima;

    public Ima2() {
    ImageIcon  referencia=new ImageIcon("foto2.png");
        ima = referencia.getImage();  
        
        setPreferredSize(new Dimension(500,500));

    }
    

@Override
   public void paintComponent(Graphics g){
       
       g.drawImage(ima,0, 0, getWidth(), getHeight(), this);
   } 
  

}