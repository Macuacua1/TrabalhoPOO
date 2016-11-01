/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaLog.java
 *
 * Created on Aug 12, 2015, 6:58:49 PM
 */
package Interfaces;

import DaoClasse.UsuarioDao;
import Modelo.Usuario;
import abstratclass.LogInClass;
import interfaceemJdialogo.CadCliente1;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author ILIDIOP
 */

public class TelaLog extends javax.swing.JFrame implements Runnable{
  private Timer time;
    int cont;
    public static int TOW_SEC=5;
    
   
    public TelaLog() {
        
        initComponents();
        setLocationRelativeTo(null); 
       
        lookAndFeel(3);
     lAviso.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ima21 = new Interfaces.Ima2();
        jPanel1 = new javax.swing.JPanel();
        lUsern = new javax.swing.JLabel();
        lSenha = new javax.swing.JLabel();
        tUsern = new javax.swing.JTextField();
        tSenha = new javax.swing.JPasswordField();
        bok = new javax.swing.JButton();
        lAviso = new javax.swing.JLabel();
        bsair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(-1,true));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShadowColor(new java.awt.Color(51, 51, 51));
        dropShadowBorder1.setShadowOpacity(0.4F);
        dropShadowBorder1.setShadowSize(8);
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        jPanel1.setBorder(dropShadowBorder1);

        lUsern.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lUsern.setText("Nome do usuario");

        lSenha.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lSenha.setText("Senha:");

        tUsern.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        tUsern.setDisabledTextColor(new java.awt.Color(-12566464,true));
        tUsern.setPreferredSize(new java.awt.Dimension(59, 25));
        tUsern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tUsernActionPerformed(evt);
            }
        });
        tUsern.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tUsernKeyPressed(evt);
            }
        });

        tSenha.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        tSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tSenha.setPreferredSize(new java.awt.Dimension(111, 25));
        tSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tSenhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lUsern)
                    .addComponent(lSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tUsern, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tUsern, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUsern, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSenha)
                    .addComponent(tSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        bok.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        bok.setForeground(new java.awt.Color(102, 102, 102));
        bok.setText("acessar");
        bok.setContentAreaFilled(false);
        bok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bokMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bokMouseExited(evt);
            }
        });
        bok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bokActionPerformed(evt);
            }
        });

        lAviso.setForeground(new java.awt.Color(204, 0, 0));
        lAviso.setText("O nome do usuario ou senha é invalido queira por favor inserir corretamente os dados ou cancela.");

        bsair.setBackground(new java.awt.Color(153, 0, 51));
        bsair.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        bsair.setForeground(new java.awt.Color(102, 102, 102));
        bsair.setText("Cancelar");
        bsair.setContentAreaFilled(false);
        bsair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bsairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bsairMouseExited(evt);
            }
        });
        bsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsairActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/User_login_Icon_128.png"))); // NOI18N

        javax.swing.GroupLayout ima21Layout = new javax.swing.GroupLayout(ima21);
        ima21.setLayout(ima21Layout);
        ima21Layout.setHorizontalGroup(
            ima21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ima21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ima21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ima21Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ima21Layout.createSequentialGroup()
                        .addComponent(bok, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bsair))
                    .addGroup(ima21Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ima21Layout.setVerticalGroup(
            ima21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ima21Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ima21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ima21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(lAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ima21, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ima21, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tUsernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tUsernActionPerformed
  
    }//GEN-LAST:event_tUsernActionPerformed

    private void bsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsairActionPerformed
        dispose();
    }//GEN-LAST:event_bsairActionPerformed

    private void bokMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bokMouseEntered
   
        bok.setContentAreaFilled(true);
      bok.setBackground(Color.GREEN);
    }//GEN-LAST:event_bokMouseEntered

    private void bokMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bokMouseExited

        bok.setContentAreaFilled(false);
    }//GEN-LAST:event_bokMouseExited

    private void bsairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsairMouseEntered
     
        bsair.setContentAreaFilled(true);
      bsair.setBackground(Color.RED);
    }//GEN-LAST:event_bsairMouseEntered

    private void bsairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsairMouseExited

        bsair.setContentAreaFilled(false);
    }//GEN-LAST:event_bsairMouseExited

    private void bokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bokActionPerformed
iniciarCessao();      
           
    }//GEN-LAST:event_bokActionPerformed

    private void tSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tSenhaKeyPressed
   int k=    evt.getKeyCode();
   if(k==KeyEvent.VK_ENTER)
  iniciarCessao();
    }//GEN-LAST:event_tSenhaKeyPressed

    private void tUsernKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tUsernKeyPressed
         if(lAviso.isVisible())   
         {Thread t= new Thread(this);
         t.start();}
        int k=    evt.getKeyCode();
         if(k==KeyEvent.VK_ENTER)
         tSenha.requestFocus();
    }//GEN-LAST:event_tUsernKeyPressed

  @Override
   public void run(){
      try {
          Thread.sleep(1500);
      } catch (InterruptedException ex) {
          Logger.getLogger(TelaLog.class.getName()).log(Level.SEVERE, null, ex);
      }
      lAviso.setVisible(false);
   } 
   
   
      public void tocarSom( String som ){
     URL url= CadCliente1.class.getResource(som+".wve"); 
      AudioClip audio = Applet.newAudioClip(url);
      audio.play();
   }
  
  private void iniciarCessao(){
     LogInClass log = new LogInClass();
        log.setSenha(tSenha.getText());
        log.setUsername(tUsern.getText());
        
        
           List l= (List) new UsuarioDao().listarTodos();
           Usuario u =null;
           for(int i=0;i<l.size();i++){
               u=(Usuario)l.get(i);
     log.setUsua(u);
           if (log.VerSrnha()==true){
               new interfaces.TelaPrincipal(u).setVisible(true);
               dispose();
           break;
           }
           if(log.VerSrnha()==false)
           {lAviso.setVisible(true);
           tSenha.setText(null);
           tUsern.setText(null);
             tUsern.requestFocus();
           }
           }   
  
  }    
      
       private void lookAndFeel(int a){
   try{
   UIManager.setLookAndFeel(UIManager.getInstalledLookAndFeels()[a].getClassName());
   SwingUtilities.updateComponentTreeUI(this);
   }catch(NullPointerException e){}catch(Exception e){}
   
   
     
   }
       
   
  public class TimeListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
         cont++;
        
         if(cont==100){
         time.stop();
         }
        }
    }
      
public void esconder(){this.setVisible(false);}
public void ativar(){time.start();}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bok;
    private javax.swing.JButton bsair;
    private Interfaces.Ima2 ima21;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lAviso;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lUsern;
    private javax.swing.JPasswordField tSenha;
    private javax.swing.JTextField tUsern;
    // End of variables declaration//GEN-END:variables
}
