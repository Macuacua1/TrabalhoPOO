/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import DaoClasse.UsuarioDao;
import Modelo.ClientePerfil;
import Modelo.Endereco;
import Modelo.FornecedorPerfil;
import Modelo.Perfil;
import Modelo.ProdutoPerfil;
import Modelo.RelatorioPerfil;
import Modelo.Usuario;
import Modelo.UsuarioPerfil;
import Modelo.VendasPerfil;
import abstratclass.ManipularImagem;
import DaoClasse.Metodos;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;



/**
 *
 * @author MACUACUA
 */
public class CadUsuario extends javax.swing.JFrame {
private BufferedImage imagem;
   
    public CadUsuario() {
        setTitle("Cadastro de Usuarios");
        initComponents();
        setLocationRelativeTo(null);
        lookAndFeel(3);
         
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
               dispose();
            }
        });
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        tContacto1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rMasculino = new javax.swing.JRadioButton();
        rFemenino = new javax.swing.JRadioButton();
        lsexo = new javax.swing.JLabel();
        tAvenida = new javax.swing.JTextField();
        lavenida = new javax.swing.JLabel();
        lBairro = new javax.swing.JLabel();
        tBairro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tContacto2 = new javax.swing.JTextField();
        cCasa = new javax.swing.JSpinner();
        cQuareirao = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lImage = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tCofirmSenha = new javax.swing.JPasswordField();
        tSeha = new javax.swing.JPasswordField();
        bCadastrar = new javax.swing.JButton();

        setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(-1,true));

        jPanel1.setBackground(new java.awt.Color(-1,true));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Serif", 0, 14));
        jLabel1.setText("Nome do Usuario:");

        tNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNomeActionPerformed(evt);
            }
        });
        tNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tNomeKeyTyped(evt);
            }
        });

        tContacto1.setMinimumSize(new java.awt.Dimension(6, 26));
        tContacto1.setPreferredSize(new java.awt.Dimension(6, 26));
        tContacto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tContacto1ActionPerformed(evt);
            }
        });
        tContacto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tContacto1KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 0, 14));
        jLabel3.setText("Contacto 1:");

        rMasculino.setBackground(new java.awt.Color(-1,true));
        buttonGroup1.add(rMasculino);
        rMasculino.setFont(new java.awt.Font("Dialog", 0, 14));
        rMasculino.setText("Masculino");
        rMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMasculinoActionPerformed(evt);
            }
        });

        rFemenino.setBackground(new java.awt.Color(-1,true));
        buttonGroup1.add(rFemenino);
        rFemenino.setFont(new java.awt.Font("Dialog", 0, 14));
        rFemenino.setText("Femenino");
        rFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rFemeninoActionPerformed(evt);
            }
        });

        lsexo.setFont(new java.awt.Font("Serif", 0, 14));
        lsexo.setText("Sexo:");

        tAvenida.setPreferredSize(new java.awt.Dimension(6, 26));
        tAvenida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAvenidaActionPerformed(evt);
            }
        });

        lavenida.setFont(new java.awt.Font("Serif", 0, 14));
        lavenida.setText("Avenida:");

        lBairro.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        lBairro.setText("Bairro:");

        tBairro.setPreferredSize(new java.awt.Dimension(6, 26));

        jLabel7.setFont(new java.awt.Font("Serif", 0, 14));
        jLabel7.setText("Contacto 2:");

        tContacto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tContacto2KeyTyped(evt);
            }
        });

        cCasa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5000, 1));
        cCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cCasaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cCasaMouseExited(evt);
            }
        });
        cCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCasaKeyTyped(evt);
            }
        });

        cQuareirao.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));
        cQuareirao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cQuareiraoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cQuareiraoMouseExited(evt);
            }
        });
        cQuareirao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cQuareiraoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel6.setText("NO da casa:");

        jLabel8.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel8.setText("Quarteirao:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(lBairro)
                    .addComponent(lavenida, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tContacto2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                        .addComponent(rFemenino))
                    .addComponent(tNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tContacto1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tAvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cCasa, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(cQuareirao))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tContacto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tContacto2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tAvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lavenida, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cQuareirao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rMasculino)
                            .addComponent(rFemenino)
                            .addComponent(lsexo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lBairro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lImage.setBackground(new java.awt.Color(-1,true));
        lImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setBackground(new java.awt.Color(-1,true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(-1,true));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Dados de seguranca")));

        tUserName.setMinimumSize(new java.awt.Dimension(6, 26));
        tUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tUserNameKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14));
        jLabel4.setText("Nome do usuario:");

        jLabel5.setFont(new java.awt.Font("Serif", 0, 14));
        jLabel5.setText("Senha:");

        jLabel2.setFont(new java.awt.Font("Serif", 0, 14));
        jLabel2.setText("Comfirma a senha:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tCofirmSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                    .addComponent(tSeha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tSeha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tCofirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bCadastrar.setBackground(new java.awt.Color(-1,true));
        bCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Save.png"))); // NOI18N
        bCadastrar.setText("Cadastrar");
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(bCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeActionPerformed

    private void tAvenidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAvenidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tAvenidaActionPerformed

    private void rMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rMasculinoActionPerformed

    private void rFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rFemeninoActionPerformed

    private void tContacto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tContacto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tContacto1ActionPerformed

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
  Perfil perf=null;  boolean b=false;
        if( ValidarCampos() )
   {  
       if(ValidarSenha(tSeha.getText(), tCofirmSenha.getText())==true)   
        {  
            List lista = new Metodos().listarTodos("Perfil");       
           for (Object lista1 : lista) {
               Perfil p = (Perfil) lista1;
               if(p.getPerfilNome().equals("Administrador"))
               {
               perf=p;
               b=true;
               break;
               }}
           
    if( !  b)
    {
        perf= criarPerfil();
    } else {}
       Endereco ende=criarEnd(); 
      Metodos.salvar(criarUsuario(perf,ende));
      dispose();
        new Interfaces.TelaLog().setVisible(true); 
       } else JOptionPane.showMessageDialog(rootPane, " verifica a senha introduzida");
  
   } else  JOptionPane.showMessageDialog(null, "os campos nao estao todos preenchidos");
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        JFileChooser jf=new JFileChooser();
       int res=jf.showOpenDialog(null);
       
       if(res==JFileChooser.APPROVE_OPTION){
       File file=jf.getSelectedFile();
           try{
           imagem=ManipularImagem.setImagem(file.getAbsolutePath(), lImage.getWidth(), lImage.getHeight());
           lImage.setIcon(new ImageIcon(imagem));
            
      
           }catch(Exception ex){}
       }else JOptionPane.showMessageDialog(null, "imagem nao selecionada");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCasaKeyTyped
 char c= evt.getKeyChar();
 
 if(c<'0'||c>'9')
 {
     evt.consume();
 }       
    }//GEN-LAST:event_cCasaKeyTyped

    private void cQuareiraoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cQuareiraoKeyTyped
       char c= evt.getKeyChar();
 
 if(c<'0'||c>'9')
 {
     evt.consume();
 }
    }//GEN-LAST:event_cQuareiraoKeyTyped

    private void cCasaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cCasaMouseEntered
       
        cCasa.requestFocus();
    }//GEN-LAST:event_cCasaMouseEntered

    private void cQuareiraoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cQuareiraoMouseEntered
      
      cQuareirao.requestFocus();
    }//GEN-LAST:event_cQuareiraoMouseEntered

    private void cCasaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cCasaMouseExited
if(cCasa.getValue().toString().equals(""))
    cCasa.setValue(0);
    }//GEN-LAST:event_cCasaMouseExited

    private void cQuareiraoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cQuareiraoMouseExited
        if(cQuareirao.getValue().toString().equals(""))
        cQuareirao.setValue(0);
    }//GEN-LAST:event_cQuareiraoMouseExited

    private void tContacto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tContacto1KeyTyped
char c= evt.getKeyChar();
 
 if(c<'0'||c>'9')
 {
     evt.consume();
 }             
    }//GEN-LAST:event_tContacto1KeyTyped

    private void tContacto2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tContacto2KeyTyped
char c= evt.getKeyChar();
 
 if(c<'0'||c>'9')
 {
     evt.consume();
 }             
    }//GEN-LAST:event_tContacto2KeyTyped

    private void tNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tNomeKeyTyped
         char c= evt.getKeyChar();

        if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
           
        } 
    }//GEN-LAST:event_tNomeKeyTyped

    private void tUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tUserNameKeyTyped
  char c= evt.getKeyChar();

        if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
           
        }        
    }//GEN-LAST:event_tUserNameKeyTyped

    
    
    private ClientePerfil criarClienteP(){
    ClientePerfil cP =new ClientePerfil();
    cP.setActualizarCliente(true);
    cP.setCadastrarCliente(true);
    cP.setExcluirCliente(true);
    cP.setTelaCliente(true);
    Metodos.salvar( cP);
    return cP;
    }
    
   
    
   private FornecedorPerfil criarFornecedorP(){
    FornecedorPerfil fP=new FornecedorPerfil();
    fP.setActualizarFornecedor(true);
    fP.setCadastrarFornecedor(true);
    fP.setExcluirFornecedor(true);
    fP.setTelaFornecedor(true);
    Metodos.salvar( fP);
    return fP;
    }
    
 
    
   private ProdutoPerfil criarProdutoPerfil(){
    ProdutoPerfil pP=new ProdutoPerfil();
    pP.setActualizarProduto(true);
    pP.setCadastrarProduto(true);
    pP.setExcluirProduto(true);
    pP.setTelaProduto(true);
   Metodos.salvar( pP);
    return pP;
    }
    
  
     
  private RelatorioPerfil criarRelatorioPer(){
   RelatorioPerfil rP=new RelatorioPerfil();
   rP.setAbaixoPrazo(true);
   rP.setAcederRentrada(true);
   rP.setAcederRsaida(true);
   rP.setAcederRestoque(true);
  Metodos.salvar( rP);
   return rP;
   } 
    
 
     
    private UsuarioPerfil criarUperfil(){
    UsuarioPerfil uP=new UsuarioPerfil();
    uP.setActualizarUsuario(true);
    uP.setCadastrarUsuario(true);
    uP.setExcluirUsuario(true);
    uP.setTelaUsuario(true);
   Metodos.salvar( uP);
    return uP;
    }
  
  
    
    private VendasPerfil criarVendaPrefil(){
    VendasPerfil  vP= new VendasPerfil ();
    vP.setDefinirDesconto(true);
    vP.setDefinirLimite(true);
    vP.setEfetuarVenda(true);
    vP.setFazerCotacao(true);
    vP.setFazerPedidos(true);
    vP.setTelaVenda(true);
   Metodos.salvar( vP);
    return vP;
    }
    
private Perfil criarPerfil(){
    Perfil per= new Perfil();
    
    per.setClientePerfil(criarClienteP());
    per.setFornecedorPerfil(criarFornecedorP());
    per.setPerfilNome("Administrador");
    per.setProdutoPerfil(criarProdutoPerfil());
    per.setRelatorioPerfil(criarRelatorioPer());
    per.setUsuarioPerfil(criarUperfil());
    per.setVendasPerfil(criarVendaPrefil());
    per.setPerfilTela(true);
    Metodos.salvar( per);
     return per;
    }    
    
@SuppressWarnings("deprecation")
   private boolean ValidarCampos(){
   if((tNome.getText()==null||"".equals(tNome.getText()))||(tAvenida.getText()==null||"".equals(tAvenida.getText()))
           ||("".equals(tBairro.getText())||tBairro.getText()==null))
            return false;
   else
       if((tCofirmSenha.getText()==null||"".equals(tCofirmSenha.getText())))return false;
           else
           if( (tUserName.getText()==null||"".equals(tUserName.getText())) )return false;
   else
           if((tSeha.getText()==null||"".equals(tSeha.getText())) )return false;
   else
           return imagem != null;    
   }  
   
    
    private Perfil criarPerfil(UsuarioPerfil us, ProdutoPerfil pr,VendasPerfil ve ,ClientePerfil cl,FornecedorPerfil fo ,RelatorioPerfil re){
    Perfil per= new Perfil();
    
     per.setUsuarioPerfil(us);
     per.setProdutoPerfil(pr);
     per.setVendasPerfil(ve);
     per.setClientePerfil(cl);
     per.setFornecedorPerfil(fo);
     per.setRelatorioPerfil(re);
     per.setPerfilNome("Adimnistrador");
     per.setPerfilTela(true);
     return per;
    }
 
 
      private Endereco criarEnd(){
         
     Endereco e= new Endereco();
     e.setAvenida(tAvenida.getText());
     e.setBairro(tBairro.getText());
     try{
     e.setNumeroCasa(Integer.parseInt(cCasa.getValue().toString()));
     }catch(NumberFormatException ex){ e.setNumeroCasa(0);}
     e.setQuarteirao(Integer.parseInt(cQuareirao.getValue().toString()));
     Metodos.salvar(e);
     return e;
     }
    

   private boolean ValidarSenha(String senha1, String senha2) {
       return (senha1.equals(senha2));
               
              
   }     
        

      
     private Usuario criarUsuario( Perfil per ,Endereco ed){
         Usuario u=new Usuario();
         
         try{
         u.setCell1(Integer.parseInt(tContacto1.getText()));
          u.setCell2(Integer.parseInt(tContacto2.getText()));
         }catch(NumberFormatException ex){u.setCell1(0);}
         
          try{
         u.setCell2(Integer.parseInt(tContacto2.getText()));
         }catch(NumberFormatException ex){u.setCell2(0);}
          
          u.setEndereco(ed);
          u.setImagem(ManipularImagem.getImagebytes(imagem));
          u.setNomeUsuario(tNome.getText());
          u.setSenha(tSeha.getText());
          u.setUsername(tUserName.getText());
          u.setPerfil(per);
          
          if(rMasculino.isSelected())
          u.setSexoUsuario(rMasculino.getText());
          else if(rFemenino.isSelected())
              u.setSexoUsuario(rFemenino.getText());
          return u;
          
}
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadUsuario().setVisible(true);
            }
        });
    }
          private void lookAndFeel(int a){
   try{
   UIManager.setLookAndFeel(UIManager.getInstalledLookAndFeels()[a].getClassName());
   SwingUtilities.updateComponentTreeUI(this);
   }catch(NullPointerException e){}catch(Exception e){}
   
   }
          
    private void bNovo(){
    bCadastrar.setEnabled(true);
    tAvenida.setEnabled(true);
    tBairro.setEnabled(true);
    tContacto1.setEnabled(true);
    tContacto2.setEnabled(true);
    tNome.setEnabled(true);
    tSeha.setEnabled(true);
    tUserName.setEnabled(true);
    tCofirmSenha.setEnabled(true);
    }      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JSpinner cCasa;
    private javax.swing.JSpinner cQuareirao;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lBairro;
    private javax.swing.JLabel lImage;
    private javax.swing.JLabel lavenida;
    private javax.swing.JLabel lsexo;
    private javax.swing.JRadioButton rFemenino;
    private javax.swing.JRadioButton rMasculino;
    private javax.swing.JTextField tAvenida;
    private javax.swing.JTextField tBairro;
    private javax.swing.JPasswordField tCofirmSenha;
    private javax.swing.JTextField tContacto1;
    private javax.swing.JTextField tContacto2;
    private javax.swing.JTextField tNome;
    private javax.swing.JPasswordField tSeha;
    private javax.swing.JTextField tUserName;
    // End of variables declaration//GEN-END:variables
}
