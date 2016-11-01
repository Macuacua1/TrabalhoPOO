/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceemJdialogo;

//import abstratclass.ManipularImagem;

import DaoClasse.EnderecoDao;
import DaoClasse.UsuarioDao;
import Modelo.Endereco;
import Modelo.Perfil;
import Modelo.Usuario;
import abstratclass.ManipularImagem;
import DaoClasse.Metodos;
import DaoClasse.ProdutoDao;
import abstratclass.Modelo;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author ILIDIOP
 */
public class CadUsuario1 extends javax.swing.JDialog {
private BufferedImage imagem;
        private final String[] DIAS={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"
        ,"21","22","23","24","25","26","27","28","29","30","31","32","32","33","34","35","36","37","37","38","39","40",
        "41","42","43","44","45","46","47","48","49","50"};
   
        int linha =-1;
          List<Usuario> l;
          Usuario us=null;
    public CadUsuario1(java.awt.Frame parent, boolean modal,Usuario u) {
        super(parent, modal);
        initComponents();
        
        bActualizar.setVisible(u.getPerfil().getUsuarioPerfil().isActualizarUsuario());
        bRegistar.setVisible(u.getPerfil().getUsuarioPerfil().isCadastrarUsuario());
        bRemover.setVisible(u.getPerfil().getUsuarioPerfil().isExcluirUsuario());
        
       
        
     List lista = new Metodos().listarTodos("Perfil");
     Perfil p = null;
     
     for(int i=0;i<lista.size();i++)
     {    p=(Perfil)lista.get(i);
    cPerfil.addItem(p.getPerfilNome());
     }
    
        setLocationRelativeTo(null);
         preencherTabela();
   
    
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        bFoto = new javax.swing.JButton();
        lImage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        tBairro = new javax.swing.JTextField();
        tAvenida = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rMasculino = new javax.swing.JRadioButton();
        rFemenino = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        tContacto1 = new javax.swing.JTextField();
        tContacto2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cCasa = new javax.swing.JSpinner();
        cQuareirao = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tUserName = new javax.swing.JTextField();
        tSeha = new javax.swing.JTextField();
        cPerfil = new javax.swing.JComboBox();
        tPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        bNovo = new javax.swing.JButton();
        bRegistar = new javax.swing.JButton();
        bRemover = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();
        bSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 861, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel4.setOpaque(false);

        bFoto.setText("Fotografia");
        bFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFotoActionPerformed(evt);
            }
        });

        lImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addComponent(lImage, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(lImage, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bFoto))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2)));
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel2.setText("Sexo:");

        jLabel3.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel3.setText("Bairro:");

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setText("Avenida:");

        jLabel5.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel5.setText("Quarteirao:");

        tNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tNomeKeyTyped(evt);
            }
        });

        tBairro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tAvenida.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel6.setText("NO da casa");

        rMasculino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rMasculino);
        rMasculino.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        rMasculino.setText("Masculino");
        rMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rMasculinoActionPerformed(evt);
            }
        });

        rFemenino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rFemenino);
        rFemenino.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        rFemenino.setText("Femenino");

        jLabel7.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel7.setText("Contacto 1:");

        tContacto1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tContacto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tContacto1KeyTyped(evt);
            }
        });

        tContacto2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tContacto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tContacto2KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel8.setText("Contacto2:");

        cCasa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));

        cQuareirao.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));
        cQuareirao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cQuareiraoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rFemenino))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cQuareirao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel1))
                                    .addGap(14, 14, 14)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tContacto1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                                        .addComponent(tNome)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tContacto2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tAvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rMasculino))))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tContacto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tContacto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(cCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tAvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cQuareirao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rMasculino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Infornacao de seguranca"));
        jPanel3.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel9.setText("User nane :");

        jLabel10.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel10.setText("Senha:");

        jLabel11.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel11.setText("perfi do usuariol:");

        tUserName.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tUserNameKeyTyped(evt);
            }
        });

        tSeha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        cPerfil.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tSeha)
                    .addComponent(cPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tUserName))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tSeha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        tPesquisa.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/search1.png"))); // NOI18N

        jPanel5.setOpaque(false);

        bNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Script-Edit.png"))); // NOI18N
        bNovo.setText("Novo");
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });

        bRegistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Save.png"))); // NOI18N
        bRegistar.setText("Registar");
        bRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistarActionPerformed(evt);
            }
        });

        bRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/delete_to_bin_24.png"))); // NOI18N
        bRemover.setText("Remover");
        bRemover.setEnabled(false);
        bRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverActionPerformed(evt);
            }
        });

        bActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Refresh.png"))); // NOI18N
        bActualizar.setText("Actualizar");
        bActualizar.setEnabled(false);
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        bSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Undo.png"))); // NOI18N
        bSair.setText("Voltar");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bRegistar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSair)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRegistar)
                    .addComponent(bRemover)
                    .addComponent(bActualizar)
                    .addComponent(bSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(tPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
    closeAboutBox();
    }//GEN-LAST:event_bSairActionPerformed

    private void bFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFotoActionPerformed
    
        JFileChooser jf=new JFileChooser();
       int res=jf.showOpenDialog(null);
       
       if(res==JFileChooser.APPROVE_OPTION){
       File file=jf.getSelectedFile();
           try{
           imagem=ManipularImagem.setImagem(file.getAbsolutePath(), lImage.getWidth(), lImage.getHeight());
           lImage.setIcon(new ImageIcon(imagem));
            
      
           }catch(Exception ex){}
       }else JOptionPane.showMessageDialog(null, "imagem nao selecionada");
       
     
    }//GEN-LAST:event_bFotoActionPerformed

    
    
    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
        limpar();
        bRegistar.setEnabled(true);
        preencherTabela();
        bActualizar.setEnabled(false);
        bRemover.setEnabled(false);
        linha=-1;
        us=null;
    }//GEN-LAST:event_bNovoActionPerformed

//    private void butaoNovo(){
// tAvenida.setEnabled(true);
//tBairro.setEnabled(true);
//cCasa.setEnabled(true);
//tContacto1.setEnabled(true);
//tContacto2.setEnabled(true);
//tNome.setEnabled(true);
//tSeha.setEnabled(true);
//tUserName.setEnabled(true);
//cPerfil.setEnabled(true);
//cQuareirao.setEnabled(true);
//bActualizar.setEnabled(true);
// bRegistar.setEnabled(true);
// bRemover.setEnabled(true);
//  bFoto.setEnabled(true);
// tNome.requestFocus();
//        limpar(); 
//    
//    }
    private void tContacto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tContacto1KeyTyped
       char c= evt.getKeyChar();
 
 if(c<'0'||c>'9')
 {
     evt.consume();
     tocarSom("naoavanca");}
    }//GEN-LAST:event_tContacto1KeyTyped

    private void tContacto2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tContacto2KeyTyped
      char c= evt.getKeyChar();
 
 if(c<'0'||c>'9')
 {
     evt.consume();
     tocarSom("naoavanca");}
    }//GEN-LAST:event_tContacto2KeyTyped

    private void bRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistarActionPerformed
     boolean b=false;
      
        if(ValidarCampos1())
      {   new UsuarioDao().salvar(criarUsuario());
       preencherTabela();
       limpar();}else JOptionPane.showMessageDialog(rootPane, "! verifica os campos um ou mais campos nao esta corretamente preenchido");
    }//GEN-LAST:event_bRegistarActionPerformed

    private void rMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rMasculinoActionPerformed

    private void cQuareiraoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cQuareiraoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cQuareiraoKeyTyped

    private void bRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverActionPerformed
        if( us!=null)
        {  new UsuarioDao().apagarUsuario(us);
        limpar();
        preencherTabela();
        linha=-1;
        us=null;
        }
    }//GEN-LAST:event_bRemoverActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
       if(tabela.getSelectedRow()>=0)
       {    linha=tabela.getSelectedRow();
       String nome= tabela.getValueAt(linha, 1).toString();
       
           for (Usuario l1 : l) {
               if (l1.getNomeUsuario().equals(nome)) {
                   us = l1;
                   break;
               }
           }
       
       if(us!=null)
       preencherCampos( us);
       bActualizar.setEnabled(true);
       bRemover.setEnabled(true);
       bRegistar.setEnabled(false);
       }
       
      
    }//GEN-LAST:event_tabelaMouseClicked

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        if( us!=null)
        {  
            if(ValidarCampos1())
            {new EnderecoDao().updateEndereco(  criarEndNaGra(us.getEndereco().getIdEndereco()));
            new UsuarioDao().upDateUsuario(criarUsuarioCodgo( criarEndNaGra(us.getEndereco().getIdEndereco()), us.getIdUsuario()));
        limpar();
        preencherTabela();
        linha=-1;
        us=null;}
        }
    }//GEN-LAST:event_bActualizarActionPerformed

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
    
    
    public void closeAboutBox() {
        setVisible(false);
    }
       

          public void tocarSom(String som){
     URL url= DefinirDesconto1.class.getResource(som+".wav"); 
     AudioClip audio = Applet.newAudioClip(url);
   audio.play();
   }
          
          
          private void limpar(){
           tAvenida.setText("");
           tBairro.setText("");
           cCasa.setValue(0);
           tContacto1.setText("");
           tContacto2.setText("");
           tNome.setText("");
           tSeha.setText("");
           tUserName.setText("");
           cPerfil.setSelectedIndex(0);
           cQuareirao.setValue(0);
           cQuareirao.setValue(0);
           cPerfil.setSelectedIndex(0);
           rMasculino.setSelected(false);
           rFemenino.setSelected(false);
           lImage.setIcon(null);
          }
          
     private Endereco criarEnd(){   
     Endereco e= new Endereco();
     e.setAvenida(tAvenida.getText());
     e.setBairro(tBairro.getText());
     try{
     e.setNumeroCasa(Integer.parseInt(cCasa.getValue().toString()));
     }catch(NumberFormatException ex){ e.setNumeroCasa(0);}
     e.setQuarteirao(Integer.parseInt(cQuareirao.getValue().toString()));
     new EnderecoDao().gravarEndereco(e);
     return e;
     }
     
      private Endereco criarEndNaGra(int cod){   
     Endereco e= new Endereco();
     e.setAvenida(tAvenida.getText());
     e.setBairro(tBairro.getText());
     try{
     e.setNumeroCasa(Integer.parseInt(cCasa.getValue().toString()));
     }catch(NumberFormatException ex){ e.setNumeroCasa(0);}
     e.setQuarteirao(Integer.parseInt(cQuareirao.getValue().toString()));
     e.setIdEndereco(cod);
     return e;
     }
     
 
  
  @SuppressWarnings("deprecation")
   private boolean ValidarCampos1(){
   if((tNome.getText()==null||"".equals(tNome.getText()))||(tAvenida.getText()==null||"".equals(tAvenida.getText()))
           ||("".equals(tBairro.getText())||tBairro.getText()==null))
            return false;
   else
           if( (tUserName.getText()==null||"".equals(tUserName.getText())) )return false;
   else
           if((tSeha.getText()==null||"".equals(tSeha.getText())) )return false;
   else
           return imagem != null;    
   } 
     private Usuario criarUsuario(){
     
         Usuario u=new Usuario();
         
         try{
         u.setCell1(Integer.parseInt(tContacto1.getText()));
         }catch(NumberFormatException ex){u.setCell1(0);}
         
          try{
         u.setCell2(Integer.parseInt(tContacto2.getText()));
         }catch(NumberFormatException ex){u.setCell2(0);}
          
          u.setEndereco(criarEnd());
          u.setImagem(ManipularImagem.getImagebytes(imagem));
          u.setNomeUsuario(tNome.getText());
          u.setSenha(tSeha.getText());
          u.setUsername(tUserName.getText());
              List lista = new Metodos().listarTodos("Perfil");
        Perfil p = null;
    for (Object lista1 : lista) {
        p = (Perfil) lista1;
        if(p.getPerfilNome().equals(cPerfil.getSelectedItem()))
            break;
    }
          u.setPerfil(p);
          if(rMasculino.isSelected())
          u.setSexoUsuario(rMasculino.getText());
          else if(rFemenino.isSelected())
              u.setSexoUsuario(rFemenino.getText());
          return u;
          
}
   
  private Usuario criarUsuarioCodgo(Endereco end,int cod){
     
         Usuario u=new Usuario();
         
         try{
         u.setCell1(Integer.parseInt(tContacto1.getText()));
         }catch(NumberFormatException ex){u.setCell1(0);}
         
          try{
         u.setCell2(Integer.parseInt(tContacto2.getText()));
         }catch(NumberFormatException ex){u.setCell2(0);}
          
          u.setEndereco(criarEnd());
          u.setImagem(ManipularImagem.getImagebytes(imagem));
          u.setNomeUsuario(tNome.getText());
          u.setSenha(tSeha.getText());
          u.setUsername(tUserName.getText());
              List lista = new Metodos().listarTodos("Perfil");
        Perfil p = null;
        for(int j=0;j< lista.size();j++){
         p=(Perfil)lista.get(j);
         if(p.getPerfilNome().equals(cPerfil.getSelectedItem()))
             break;
             }
          u.setPerfil(p);
          if(rMasculino.isSelected())
          u.setSexoUsuario(rMasculino.getText());
          else if(rFemenino.isSelected())
              u.setSexoUsuario(rFemenino.getText());
          u.setIdUsuario(cod);
          return u;
          
}    
     
     
     
     
@SuppressWarnings("unchecked")
     private void  preencherTabela(){   
        ArrayList dados= new ArrayList();
       String [] colunas= new String[]{"CODIGO","NOME", "ENDERECO","CONTECTO 1","CONTACTO 2"};
 
       l= new UsuarioDao().listarTodos();
    for (Usuario l1 : l) {
        Usuario u = l1;
        String end="Bairro: " +u.getEndereco().getBairro()+" Avenida: "+ u.getEndereco().getAvenida()+" casa NO: "+u.getEndereco().getNumeroCasa()+" Quart. :  "+u.getEndereco().getQuarteirao();
        Object[] ob= new Object[]{u.getIdUsuario(),u.getNomeUsuario(),end,u.getCell1(),u.getCell2()};
        dados.add(ob);
    }
           
       try{
        Modelo     modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
         }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);
         }
    
        tabela.getColumnModel().getColumn(0).setPreferredWidth(80);
        tabela.getColumnModel().getColumn(0).setResizable(false);
         tabela.getColumnModel().getColumn(1).setPreferredWidth(140);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(416);
        tabela.getColumnModel().getColumn(2).setResizable(false);
         tabela.getColumnModel().getColumn(3).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(3).setResizable(false);
         tabela.getColumnModel().getColumn(4).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(4).setResizable(false);
     
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabela.setRowHeight(25);
   }
  
      public void preencherCampos( Usuario user){
        
         tNome.setText(user.getNomeUsuario());
         tContacto1.setText(user.getCell1()+"");
         tContacto2.setText(user.getCell2()+"");
         tUserName.setText(user.getUsername());
         tSeha.setText(user.getSenha());
         tAvenida.setText(user.getEndereco().getAvenida());
         tBairro.setText(user.getEndereco().getBairro());
        
         cCasa.setValue(user.getEndereco().getNumeroCasa());
         cPerfil.setSelectedItem(user.getPerfil().getPerfilNome());
         cQuareirao.setValue(user.getEndereco().getQuarteirao());
         if(user.getSexoUsuario().equals(rFemenino.getText()))
           rFemenino.setSelected(true);
         else rMasculino.setSelected(true);
        
         
       //  lImage.setIcon();
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bFoto;
    private javax.swing.JButton bNovo;
    private javax.swing.JButton bRegistar;
    private javax.swing.JButton bRemover;
    private javax.swing.JButton bSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JSpinner cCasa;
    private javax.swing.JComboBox cPerfil;
    private javax.swing.JSpinner cQuareirao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lImage;
    private javax.swing.JRadioButton rFemenino;
    private javax.swing.JRadioButton rMasculino;
    private javax.swing.JTextField tAvenida;
    private javax.swing.JTextField tBairro;
    private javax.swing.JTextField tContacto1;
    private javax.swing.JTextField tContacto2;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tPesquisa;
    private javax.swing.JTextField tSeha;
    private javax.swing.JTextField tUserName;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
