/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadCliente1.java
 *
 * Created on Sep 22, 2015, 7:19:52 PM
 */
package interfaceemJdialogo;

import DaoClasse.ClienteDao;
import DaoClasse.EnderecoDao;
import Modelo.Cliente;
import Modelo.Endereco;
import Modelo.Usuario;
import abstratclass.Modelo;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.ListSelectionModel;



public class CadCliente1 extends javax.swing.JDialog {
 private JPopupMenu opcoes;
 
     private JMenuItem remover;
     private JMenuItem verDados;
     private JMenuItem actualizar;

 int codigoUpdate;
 private Usuario usu;
 private  List<Cliente> l;
    public CadCliente1(java.awt.Frame parent, boolean modal,Usuario us) {
        super(parent, modal);
        initComponents();
        setUsu(us);
        bRegistar.setVisible(us.getPerfil().getClientePerfil().isCadastrarCliente());
        bAtualizar.setVisible(us.getPerfil().getClientePerfil().isActualizarCliente());
        bRemover.setVisible(us.getPerfil().getClientePerfil().isExcluirCliente());
        
        setLocationRelativeTo(null);
        
        preencherTabela();
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

       public Endereco criarEndereco(){
          Endereco end = new Endereco(); 
           
        end.setAvenida(tAvenida.getText());
        end.setBairro(tBairro.getText());
        try{
        int qua=Integer.parseInt( cQuarteirao.getValue().toString());
        end.setQuarteirao(qua);
         } catch(NumberFormatException ex){ end.setQuarteirao(0);}
        try{
        end.setNumeroCasa(Integer.parseInt(cCasa.getValue().toString()));
         } catch(NumberFormatException ex){ end.setNumeroCasa(0);}
        
        new EnderecoDao().gravarEndereco(end);
 return end;
    }
 
    public Cliente criarCliente(){
         Cliente cli= new Cliente();
        cli.setNomeCliente(tNome.getText());
        try{
        cli.setCell1(Integer.parseInt(tContacto1.getText()));
        }catch(NumberFormatException ex){cli.setCell1(0);}
        try{
        cli.setCell2(Integer.parseInt(tContacto2.getText()));
         }catch(NumberFormatException ex){cli.setCell2(0);}
        
        cli.setObservacao(tIfornacoes.getText());
        cli.setEndereco(this.criarEndereco());
      
   
       return cli;
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        bRegistar = new javax.swing.JButton();
        bRemover = new javax.swing.JButton();
        bAtualizar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        lAvenida = new javax.swing.JLabel();
        tAvenida = new javax.swing.JTextField();
        lBairro = new javax.swing.JLabel();
        tBairro = new javax.swing.JTextField();
        lQuarteirao = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lContacto2 = new javax.swing.JLabel();
        tContacto2 = new javax.swing.JTextField();
        tIfornacoes = new javax.swing.JTextField();
        tContacto1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cQuarteirao = new javax.swing.JSpinner();
        cCasa = new javax.swing.JSpinner();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        tPesquisa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        jScrollPane1.setBorder(dropShadowBorder1);

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
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        jPanel3.setBorder(dropShadowBorder2);

        bRegistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Save.png"))); // NOI18N
        bRegistar.setText("Registar");
        bRegistar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153)));
        bRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistarActionPerformed(evt);
            }
        });

        bRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/delete_to_bin_24.png"))); // NOI18N
        bRemover.setText("Remover");
        bRemover.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153)));
        bRemover.setEnabled(false);
        bRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverActionPerformed(evt);
            }
        });

        bAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Refresh.png"))); // NOI18N
        bAtualizar.setText("Atualizar");
        bAtualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153)));
        bAtualizar.setEnabled(false);
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Undo.png"))); // NOI18N
        jButton5.setText("Voltar");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Script-Edit.png"))); // NOI18N
        jButton1.setText("Novo");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bRegistar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bAtualizar, bRegistar, bRemover, jButton1, jButton5});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bRegistar)
                        .addComponent(bRemover)
                        .addComponent(bAtualizar)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bAtualizar, bRegistar, bRemover, jButton5});

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        jPanel4.setBorder(dropShadowBorder3);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");

        tNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
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

        lAvenida.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lAvenida.setForeground(new java.awt.Color(255, 255, 255));
        lAvenida.setText("Avenida");

        tAvenida.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        lBairro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lBairro.setForeground(new java.awt.Color(255, 255, 255));
        lBairro.setText("Bairro");

        tBairro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        lQuarteirao.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lQuarteirao.setForeground(new java.awt.Color(255, 255, 255));
        lQuarteirao.setText("Quateirao");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NO da casa");

        lContacto2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lContacto2.setForeground(new java.awt.Color(255, 255, 255));
        lContacto2.setText("Contacto 2:   ");

        tContacto2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tContacto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tContacto2KeyTyped(evt);
            }
        });

        tIfornacoes.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tContacto1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
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

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Informacoes adicionais");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contacto 1: ");

        cQuarteirao.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cQuarteirao.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));
        cQuarteirao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cQuarteiraoMouseEntered(evt);
            }
        });
        cQuarteirao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cQuarteiraoKeyTyped(evt);
            }
        });

        cCasa.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cCasa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5000, 1));
        cCasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cCasaMouseEntered(evt);
            }
        });
        cCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cCasaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tIfornacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lContacto2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tContacto2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lAvenida))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tContacto1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tAvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(lBairro)
                                .addGap(33, 33, 33)
                                .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lQuarteirao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cQuarteirao, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(tNome)
                        .addContainerGap(2, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lAvenida))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tAvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lBairro)
                            .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tContacto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lContacto2)
                            .addComponent(tContacto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lQuarteirao)
                            .addComponent(cQuarteirao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(cCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tIfornacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tAvenida, tBairro, tContacto1, tContacto2, tNome});

        tPesquisa.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPesquisaActionPerformed(evt);
            }
        });
        tPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tPesquisaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tPesquisaKeyTyped(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/search1.png"))); // NOI18N

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPesquisaKeyReleased
if(!tPesquisa.getText().equals(""))  
    preencherTabelaPesquisa();
    }//GEN-LAST:event_tPesquisaKeyReleased

    private void cCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cCasaKeyTyped
        char c= evt.getKeyChar();

        if(c<'0'||c>'9'){
            evt.consume();
            tocarSom("naoavanca");}
    }//GEN-LAST:event_cCasaKeyTyped

    private void cCasaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cCasaMouseEntered
       
        cCasa.requestFocus();
    }//GEN-LAST:event_cCasaMouseEntered

    private void cQuarteiraoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cQuarteiraoKeyTyped
        char c= evt.getKeyChar();

        if(c<'0'||c>'9'){
            evt.consume();
            tocarSom("naoavanca");}
    }//GEN-LAST:event_cQuarteiraoKeyTyped

    private void cQuarteiraoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cQuarteiraoMouseEntered

        cQuarteirao.requestFocus();
    }//GEN-LAST:event_cQuarteiraoMouseEntered

    private void tContacto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tContacto1KeyTyped
        char c= evt.getKeyChar();

        if(c<'0'||c>'9'){
            evt.consume();
            tocarSom("naoavanca");
        }
    }//GEN-LAST:event_tContacto1KeyTyped

    private void tContacto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tContacto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tContacto1ActionPerformed

    private void tContacto2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tContacto2KeyTyped
        char c= evt.getKeyChar();

        if(c<'0'||c>'9'){
            evt.consume();
            tocarSom("naoavanca");
        }
    }//GEN-LAST:event_tContacto2KeyTyped

    private void tNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        apagarCampos();
        preencherTabela();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        Cliente cli= criarCliente();
        cli.setIdCliente(this.codigoUpdate);
        new ClienteDao().actualizar(cli);
        preencherTabela();
        apagarCampos();
    }//GEN-LAST:event_bAtualizarActionPerformed

    private void bRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverActionPerformed
        int opcao;

        Object[] botoes = {"Sim","Nao"};
        opcao = JOptionPane.showOptionDialog(null,
            "Deseja mesmo eliminar?",
            "Sair",0,
            JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);

        if (opcao==0){
            if( tabela.getSelectedRow()>=0){
                int  pos= tabela.getSelectedRow();
                   
           new ClienteDao().apagarCliente(l.get(pos));
                    preencherTabela();
                    apagarCampos();
                
            }else
            JOptionPane.showMessageDialog(null,"Seleciona uma linha por favor ","ERRO",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bRemoverActionPerformed

    private void bRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistarActionPerformed
        new ClienteDao().salvar(criarCliente());
        preencherTabela();
        apagarCampos();
    }//GEN-LAST:event_bRegistarActionPerformed

    private void tabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyReleased
        preencherTabelaPesquisa();
    }//GEN-LAST:event_tabelaKeyReleased

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        int line=this.tabela.getSelectedRow();
        this.codigoUpdate=this.preencherCampos(line);
        bAtualizar.setEnabled(true);
        bRemover.setEnabled(true);
        bRegistar.setEnabled(false);

    }//GEN-LAST:event_tabelaMouseClicked

    private void tNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tNomeKeyTyped
          char c= evt.getKeyChar();

        if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
           
        }
    }//GEN-LAST:event_tNomeKeyTyped

    private void tPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPesquisaActionPerformed

    private void tPesquisaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPesquisaKeyTyped
        
    }//GEN-LAST:event_tPesquisaKeyTyped

      private boolean isEmpty(){
        return true;
    } 
    
     public int preencherCampos(int line){
       
       int  codigo=Integer.parseInt(tabela.getValueAt(line, 0).toString());
        
      Cliente cli= l.get(line); 
       this.tNome.setText(cli.getNomeCliente());
       tContacto1.setText(cli.getCell1().toString());
       tContacto2.setText(cli.getCell2().toString());
       tIfornacoes.setText(cli.getObservacao());
       tAvenida.setText(cli.getEndereco().getAvenida());
        tBairro.setText(cli.getEndereco().getBairro());
        cCasa.setValue(cli.getEndereco().getNumeroCasa());
        cQuarteirao.setValue(cli.getEndereco().getQuarteirao());
      return codigo;
     } 
    
          public boolean isSelected(){
        return this.tabela.getSelectedRow()!=-1;
    } 
    private void butaoNovo(){
    tNome.setEnabled(true);
    tAvenida.setEnabled(true);
    tBairro.setEnabled(true);
    cCasa.setEnabled(true);
    tContacto1.setEnabled(true);
    tContacto2.setEnabled(true);
    tIfornacoes.setEnabled(true);
    bRegistar.setEnabled(usu.getPerfil().getClientePerfil().isCadastrarCliente());
    bRemover.setEnabled(usu.getPerfil().getClientePerfil().isExcluirCliente());
    bAtualizar.setEnabled(usu.getPerfil().getClientePerfil().isActualizarCliente());
    }
    
    public void tocarSom(String som){
     URL url= CadCliente1.class.getResource(som+".wav"); 
     AudioClip audio = Applet.newAudioClip(url);
   audio.play();
   }
 private void apagarCampos(){
  tNome.setText("");
    tAvenida.setText("");
    tBairro.setText("");
   
    tContacto1.setText("");
    tContacto2.setText("");
    tIfornacoes.setText("");
   
    cCasa.setValue(0);
    cQuarteirao.setValue(0);
    bRegistar.setEnabled(true);
    bAtualizar.setEnabled(false);
    bRemover.setEnabled(false);
    tNome.requestFocus();
    tabela.isRowSelected(-1);
 
 }   
 
  private void  preencherTabela(){
           
        ArrayList dados= new ArrayList();
       String [] colunas= new String[]{" CODIGO "," NOME ","ENDERECO ","CONTACTO 1 ","CONTACTO 2 "};
     
     
     l= (List) new ClienteDao().listarTodos();
           for(int i=0;i<l.size();i++){
         Cliente cli=(Cliente) l.get(i);
         
          String c1,c2;
         if(cli.getCell1()==0)
             c1="";
         else c1=cli.getCell1().toString();
         
         if(cli.getCell2()==0)
             c2="";
         else c2=cli.getCell2().toString();
         
         String end="Avenida  "+ cli.getEndereco().getAvenida()+"  ,Bairro  "+cli.getEndereco().getBairro()+"  ,Casa NO. "+cli.getEndereco().getNumeroCasa();
       Object[] ob= new Object[]{cli.getIdCliente(),cli.getNomeCliente(),end,c1,c2};
        dados.add(ob);
           }
   
           
       try{
        Modelo     modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
         }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);
         }
    
         tabela.getColumnModel().getColumn(0).setPreferredWidth(70);
        tabela.getColumnModel().getColumn(0).setResizable(false);
         tabela.getColumnModel().getColumn(1).setPreferredWidth(170);
        tabela.getColumnModel().getColumn(1).setResizable(false);
         tabela.getColumnModel().getColumn(2).setPreferredWidth(360);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(116);
        tabela.getColumnModel().getColumn(3).setResizable(false);
         tabela.getColumnModel().getColumn(4).setPreferredWidth(116);
        tabela.getColumnModel().getColumn(4).setResizable(false);
        
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
        tabela.setAlignmentX(CENTER_ALIGNMENT);
         tabela.setRowHeight(25);
         tabela.setShowGrid(false);
         
   }
  
 @SuppressWarnings("unchecked")
   public void preencherTabelaPesquisa(){
   
        ArrayList dados= new ArrayList();
       String [] colunas= new String[]{"CODIGO","NOME","ENDEREÇO","CONTACTO 1","CONTACTO 2"};
     
      TextAutoCompleter auto= new TextAutoCompleter(tPesquisa);
     
    l= (List) new  ClienteDao().pesquisaPeloNome(tPesquisa.getText());
           for(int i=0;i<l.size();i++){             
         Cliente cli=(Cliente) l.get(i);
         String c1,c2;
         if(cli.getCell1()==0)
             c1="";
         else c1=cli.getCell1().toString();
         
         if(cli.getCell2()==0)
             c2="";
         else c2=cli.getCell2().toString();
         
         auto.addItem(cli.getNomeCliente()); 
      String  endereco="Avenida  "+cli.getEndereco().getAvenida()+"  ,Bairro  "+cli.getEndereco().getBairro()+"  ,Casa NO. "+cli.getEndereco().getNumeroCasa();
   Object[] ob= new Object[]{cli.getIdCliente(),cli.getNomeCliente(),endereco,c1,c2};
        dados.add(ob);
               System.out.println(cli.getNomeCliente()+" "+i );
           }
           
           
       try{
        Modelo     modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
         }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);
         }
    
         tabela.getColumnModel().getColumn(0).setPreferredWidth(70);
         tabela.getColumnModel().getColumn(0).setResizable(false);
         tabela.getColumnModel().getColumn(1).setPreferredWidth(170);
         tabela.getColumnModel().getColumn(1).setResizable(false);
         tabela.getColumnModel().getColumn(2).setPreferredWidth(360);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(116);
        tabela.getColumnModel().getColumn(3).setResizable(false);
         tabela.getColumnModel().getColumn(4).setPreferredWidth(116);
        tabela.getColumnModel().getColumn(4).setResizable(false);
        
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabela.setRowHeight(25);
        tabela.setShowGrid(false);

   }
    
 
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizar;
    private javax.swing.JButton bRegistar;
    private javax.swing.JButton bRemover;
    private javax.swing.JSpinner cCasa;
    private javax.swing.JSpinner cQuarteirao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private javax.swing.JLabel lAvenida;
    private javax.swing.JLabel lBairro;
    private javax.swing.JLabel lContacto2;
    private javax.swing.JLabel lQuarteirao;
    private javax.swing.JTextField tAvenida;
    private javax.swing.JTextField tBairro;
    private javax.swing.JTextField tContacto1;
    private javax.swing.JTextField tContacto2;
    private javax.swing.JTextField tIfornacoes;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tPesquisa;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
