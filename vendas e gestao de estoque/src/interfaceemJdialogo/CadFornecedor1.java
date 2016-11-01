/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceemJdialogo;

import DaoClasse.EnderecoDao;
import DaoClasse.FornecedorDao;
import Modelo.Endereco;
import Modelo.Fornecedor;
import Modelo.Usuario;
import abstratclass.Modelo;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author ILIDIOP
 */
public class CadFornecedor1 extends javax.swing.JDialog {
private Usuario usu;
 int codigoUpdate;
 
 private List<Fornecedor> l;
       private Endereco endereco;
    public CadFornecedor1(java.awt.Frame parent, boolean modal,Usuario u) {
        super(parent, modal);
        initComponents();
       bAlterar.setVisible(u.getPerfil().getFornecedorPerfil().isActualizarFornecedor());
       bRegistar.setVisible(u.getPerfil().getFornecedorPerfil().isCadastrarFornecedor());
       bExcluir.setVisible(u.getPerfil().getFornecedorPerfil().isExcluirFornecedor());
        l=null;
       preencherTabela();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tBairro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tAvenida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tCaixaPostal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tContacto2 = new javax.swing.JTextField();
        tContacto1 = new javax.swing.JTextField();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        bSair = new javax.swing.JButton();
        bRegistar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bAlterar = new javax.swing.JButton();
        bNovo = new javax.swing.JButton();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        jLabel9 = new javax.swing.JLabel();
        tPesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setCornerSize(15);
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        jScrollPane1.setBorder(dropShadowBorder1);

        tabela.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
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

        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShadowColor(new java.awt.Color(102, 102, 102));
        dropShadowBorder2.setShadowSize(7);
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        jPanel3.setBorder(dropShadowBorder2);
        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        tNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tNomeKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Bairro:");

        tBairro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Email:");

        tEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tEmail.setText("exemlo@mail.com");
        tEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tEmailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tEmailMouseExited(evt);
            }
        });
        tEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Contacto 1:  ");

        tAvenida.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tAvenida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAvenidaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Avenida:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Caixa postal:");

        tCaixaPostal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tCaixaPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tCaixaPostalKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Contacto 2:  ");

        tContacto2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tContacto1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tAvenida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tBairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(tCaixaPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tContacto2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tEmail)
                                .addComponent(tContacto1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)
                        .addComponent(tNome)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tAvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tContacto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCaixaPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(tContacto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tBairro, tCaixaPostal});

        jXPanel1.setBackground(new java.awt.Color(153, 153, 153));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShadowColor(new java.awt.Color(102, 102, 102));
        dropShadowBorder3.setShadowSize(7);
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        jXPanel1.setBorder(dropShadowBorder3);

        bSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Undo.png"))); // NOI18N
        bSair.setText("Voltar");
        bSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204)));
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        bRegistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Save.png"))); // NOI18N
        bRegistar.setText("Registrar");
        bRegistar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204)));
        bRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistarActionPerformed(evt);
            }
        });

        bExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/delete_to_bin_24.png"))); // NOI18N
        bExcluir.setText("Excluir");
        bExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204)));
        bExcluir.setEnabled(false);
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Refresh.png"))); // NOI18N
        bAlterar.setText("Actualizar");
        bAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204)));
        bAlterar.setEnabled(false);
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        bNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Script-Edit.png"))); // NOI18N
        bNovo.setText("Novo");
        bNovo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204)));
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jXPanel1Layout = new javax.swing.GroupLayout(jXPanel1);
        jXPanel1.setLayout(jXPanel1Layout);
        jXPanel1Layout.setHorizontalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jXPanel1Layout.setVerticalGroup(
            jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSair)
                    .addGroup(jXPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bRegistar)
                        .addComponent(bExcluir)
                        .addComponent(bAlterar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/search1.png"))); // NOI18N

        tPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tPesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jXPanel2Layout = new javax.swing.GroupLayout(jXPanel2);
        jXPanel2.setLayout(jXPanel2Layout);
        jXPanel2Layout.setHorizontalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addComponent(tPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jXPanel2Layout.setVerticalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jXPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jXPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
      dispose();
    }//GEN-LAST:event_bSairActionPerformed

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
     
      limpar();
      tNome.requestFocus();
    }//GEN-LAST:event_bNovoActionPerformed

    private void tAvenidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAvenidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tAvenidaActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
          if(tabela.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Selecione um Fornecedor na lista");
            return;}
        Fornecedor forne= criarFornecedor();
         
        forne.setIdFornecedor(this.codigoUpdate);
        new FornecedorDao().actualizar(forne);
        preencherTabela();
        limpar();
    }//GEN-LAST:event_bAlterarActionPerformed

    private void tPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPesquisaKeyReleased
        preencherTabelapesquisa();
    }//GEN-LAST:event_tPesquisaKeyReleased

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
            int line = tabela.getSelectedRow();
        codigoUpdate = preencherCampos(line);
       
        bRegistar.setEnabled(false);
        bAlterar.setEnabled(true);
        bExcluir.setEnabled(true);
    }//GEN-LAST:event_tabelaMouseClicked

    private void bRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistarActionPerformed
     boolean b=false;
       // for(int j=0;j<l.size();j++)
           // if()
        if(validarForne1())
        {  new FornecedorDao().salvar(this.criarFornecedor());
       limpar();
       preencherTabela();
       tNome.requestFocus();
        }else JOptionPane.showMessageDialog(rootPane,"Os campos nao estao corretamente preenchidos");
       
    }//GEN-LAST:event_bRegistarActionPerformed

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
             
         if(this.tabela.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "Selecione um Fornecedor na lista");
            return;}
            int opcao;
			
			Object[] botoes = {"Sim","Nao"};
			opcao = JOptionPane.showOptionDialog(null,
			"Deseja mesmo eliminar?",
			"Sair",0,
			JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
if (opcao==0){
    int codigo =Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        new FornecedorDao().apagarFornecedor(codigo);
       preencherTabela();
       
}
      
    
             
    }//GEN-LAST:event_bExcluirActionPerformed

    private void tabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyReleased
     
    }//GEN-LAST:event_tabelaKeyReleased

    private void tEmailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tEmailMouseEntered
tEmail.setText("");
tEmail.requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_tEmailMouseEntered

    private void tCaixaPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCaixaPostalKeyTyped
         char c= evt.getKeyChar();

        if(c<'0'||c>'9'){
            evt.consume();
           
        }
    }//GEN-LAST:event_tCaixaPostalKeyTyped

    private void tNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tNomeKeyTyped
      char c= evt.getKeyChar();

        if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
           
        }        
    }//GEN-LAST:event_tNomeKeyTyped

    private void tEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tEmailMouseExited
       if(tEmail.getText()==null||"".equals(tEmail.getText()))
       {  tEmail.setText("exemlo@mail.com");
          //tEmail.setFont(new Font "Serif ");
       
       }
    }//GEN-LAST:event_tEmailMouseExited

    private void tEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEmailActionPerformed
        
    }//GEN-LAST:event_tEmailActionPerformed


      public boolean isSelected(){
        return this.tabela.getSelectedRow()!=-1;
    }
      
      
    private void limpar(){
    tAvenida.setText("");
    tBairro.setText("");
    tCaixaPostal.setText("");
    tContacto1.setText("");
    tContacto2.setText("");
    tEmail.setText("");
    tNome.setText("");
    }

  
       
  public Fornecedor criarFornecedor(){
        
  Fornecedor f= new Fornecedor();      
   f.setNomeFornecedor(tNome.getText());
           if(!tEmail.getText().equals("exemlo@mail.com")) {
               f.setEmail(tEmail.getText());
           } else {
               f.setEmail(null);
           }
           
  try{
 f.setCell1(Integer.parseInt(tContacto1.getText()));
 }catch(NumberFormatException ex){ f.setCell1(0);}
           
   try{
   f.setCell2(Integer.parseInt(tContacto2.getText()));
    }catch(NumberFormatException ex){ f.setCell2(0);}
          
            f.setEndereco(this.criarEndereco());
        return f;
           
      }
  

  
    private boolean validarForne1(){
if((tAvenida.getText()==null||"".equals(tAvenida.getText())))
    return false;
else
  if((tBairro.getText()==null||"".equals(tBairro.getText()))) 
      return false;
else
      if((tNome.getText()==null||"".equals(tNome.getText())))
          return false;
          else
         return!( tCaixaPostal.getText()==null||"".equals(tCaixaPostal.getText()));
  }
          
 private Endereco criarEndereco(){
             
           Endereco ende = new Endereco();
       
           ende.setAvenida(tAvenida.getText());
           ende.setBairro(tBairro.getText());
           try{
           ende.setNumeroCasa(Integer.parseInt(tCaixaPostal.getText()));}
           catch(NumberFormatException ex){ende.setNumeroCasa(0);}
           ende.setQuarteirao(0);  
           new EnderecoDao().gravarEndereco(ende);
       return ende;    
         } 
 
 
 
    public int preencherCampos(int line){
       
        int codigo=Integer.parseInt(tabela.getValueAt(line,0).toString());
       Fornecedor forn= new FornecedorDao().buscarFornecedor(codigo); 
       
       tNome.setText(forn.getNomeFornecedor());
      tContacto2.setText(forn.getCell2().toString());
       tContacto1.setText(forn.getCell1().toString());
       tEmail.setText(forn.getEmail());
       tAvenida.setText(forn.getEndereco().getAvenida());
      tBairro.setText(forn.getEndereco().getBairro());
      tCaixaPostal.setText(forn.getEndereco().getNumeroCasa()+"");
     
       
     return codigo;
     } 
    
  public void preencherTabela(){
         
     
        ArrayList dados= new ArrayList();
        
       String [] colunas= new String[]{"CODIGO","NOME","ENDERECO","EMAIL","CONTACTO 1","CONTACTO 2"};
       l=  FornecedorDao.buscaTodos();
     
    for (Object l1 : l) {
        Fornecedor forne = (Fornecedor) l1;
        String en="AV  "+forne.getEndereco().getAvenida()+", Bairro "+forne.getEndereco().getBairro()+", C.Postal N. "+forne.getEndereco().getNumeroCasa();
        Object[] ob= new Object[]{forne.getIdFornecedor(),forne.getNomeFornecedor(),en,forne.getEmail(),forne.getCell1(),forne.getCell2()};
        dados.add(ob);
        
        System.out.println( forne.getNomeFornecedor());
    }
           
       try{
          Modelo modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
         }catch(NullPointerException e){
   
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);}
    
    tabela.getColumnModel().getColumn(0).setPreferredWidth(60);
    tabela.getColumnModel().getColumn(0).setResizable(false);
    tabela.getColumnModel().getColumn(1).setPreferredWidth(140);
    tabela.getColumnModel().getColumn(1).setResizable(false);
    tabela.getColumnModel().getColumn(2).setPreferredWidth(360);
    tabela.getColumnModel().getColumn(2).setResizable(false);
    tabela.getColumnModel().getColumn(3).setPreferredWidth(130);
    tabela.getColumnModel().getColumn(3).setResizable(false);
    tabela.getColumnModel().getColumn(4).setPreferredWidth(110);
    tabela.getColumnModel().getColumn(4).setResizable(false);
    tabela.getColumnModel().getColumn(5).setPreferredWidth(110);
    tabela.getColumnModel().getColumn(5).setResizable(false);
      
    tabela.setRowHeight(23);
       tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
        
   }  
  
   public void preencherTabelapesquisa(){
       
        ArrayList dados= new ArrayList();
       String [] colunas= new String[]{"CODIGO","NOME","ENDERECO","EMAIL","CONTACTO 1","CONTACTO 1"};
       
       TextAutoCompleter auto= new TextAutoCompleter(tPesquisa);
       
    java.util.List l= new FornecedorDao().pesquisaPeloNome(tPesquisa.getText());
       
    for (Object l1 : l) {
        Fornecedor forne = (Fornecedor) l1;
        auto.addItem(forne.getNomeFornecedor());
         auto.getItemSelected();
        String   endereco="AV  "+forne.getEndereco().getAvenida()+", Bairro "+forne.getEndereco().getBairro()+", C.Postal NO. "+forne.getEndereco().getNumeroCasa();
        Object[] ob= new Object[]{forne.getIdFornecedor(),forne.getNomeFornecedor(),endereco,forne.getEmail(),forne.getCell1(),forne.getCell2()};
        dados.add(ob);
    }
       try{
         Modelo modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
         }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);}
    
        
    tabela.getColumnModel().getColumn(0).setPreferredWidth(60);
    tabela.getColumnModel().getColumn(0).setResizable(false);
    tabela.getColumnModel().getColumn(1).setPreferredWidth(140);
    tabela.getColumnModel().getColumn(1).setResizable(false);
    tabela.getColumnModel().getColumn(2).setPreferredWidth(340);
    tabela.getColumnModel().getColumn(2).setResizable(false);
    tabela.getColumnModel().getColumn(3).setPreferredWidth(130);
    tabela.getColumnModel().getColumn(3).setResizable(false);
    tabela.getColumnModel().getColumn(4).setPreferredWidth(110);
    tabela.getColumnModel().getColumn(4).setResizable(false);
    tabela.getColumnModel().getColumn(5).setPreferredWidth(110);
    tabela.getColumnModel().getColumn(5).setResizable(false);
     
    tabela.setRowHeight(23);
       tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
   }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bNovo;
    private javax.swing.JButton bRegistar;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private javax.swing.JTextField tAvenida;
    private javax.swing.JTextField tBairro;
    private javax.swing.JTextField tCaixaPostal;
    private javax.swing.JTextField tContacto1;
    private javax.swing.JTextField tContacto2;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tPesquisa;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
