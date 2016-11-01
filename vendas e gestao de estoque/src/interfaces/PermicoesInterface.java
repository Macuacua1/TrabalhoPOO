/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PermicoesInterface.java
 *
 * Created on Sep 14, 2015, 1:12:08 PM
 */
package interfaces;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class PermicoesInterface extends javax.swing.JFrame {

    public PermicoesInterface() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tperfil = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bRegistar = new javax.swing.JButton();
        bAtualizar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        cFornecedor = new javax.swing.JCheckBox();
        cAlterarF = new javax.swing.JCheckBox();
        cCadastrarF = new javax.swing.JCheckBox();
        cRemoverF = new javax.swing.JCheckBox();
        cProdutos = new javax.swing.JCheckBox();
        cCadastrarP = new javax.swing.JCheckBox();
        cRemoverP = new javax.swing.JCheckBox();
        cAlterarP = new javax.swing.JCheckBox();
        cCadastrarC = new javax.swing.JCheckBox();
        cCliente = new javax.swing.JCheckBox();
        cRemoverC = new javax.swing.JCheckBox();
        cAlterarC = new javax.swing.JCheckBox();
        cRelatorio = new javax.swing.JCheckBox();
        cUsuario = new javax.swing.JCheckBox();
        cCadastrarU = new javax.swing.JCheckBox();
        cRemoverU = new javax.swing.JCheckBox();
        cAlterarU = new javax.swing.JCheckBox();
        cVenda = new javax.swing.JCheckBox();
        cFazerV = new javax.swing.JCheckBox();
        cFazerPedido = new javax.swing.JCheckBox();
        cFazerCotacao = new javax.swing.JCheckBox();
        cFaerzDesc = new javax.swing.JCheckBox();
        cEntrada = new javax.swing.JCheckBox();
        cSaida = new javax.swing.JCheckBox();
        cEstoque = new javax.swing.JCheckBox();
        cPrazo = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        bnovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14));
        jLabel1.setText("Nome do perfil:");

        tperfil.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(tperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Serif", 0, 36));
        jLabel2.setForeground(new java.awt.Color(-13478657,true));
        jLabel2.setText("CLEVER");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel3.setForeground(new java.awt.Color(-16736769,true));
        jLabel3.setText("O Administrador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(123, 123, 123))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bRegistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Save.png"))); // NOI18N
        bRegistar.setText("Registar");
        bRegistar.setEnabled(false);
        bRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistarActionPerformed(evt);
            }
        });

        bAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Refresh.png"))); // NOI18N
        bAtualizar.setText("Actualizar");
        bAtualizar.setEnabled(false);
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        bEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/delete_to_bin_24.png"))); // NOI18N
        bEliminar.setText("Eliminar");
        bEliminar.setEnabled(false);
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bSair.setText("fechar");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14));
        jLabel4.setText("Lista de perfil");

        jPanel3.setBackground(new java.awt.Color(-1,true));

        cFornecedor.setBackground(new java.awt.Color(-1,true));
        cFornecedor.setFont(new java.awt.Font("Serif", 1, 14));
        cFornecedor.setText("Fornecedores");
        cFornecedor.setEnabled(false);
        cFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cFornecedorActionPerformed(evt);
            }
        });

        cAlterarF.setBackground(new java.awt.Color(-1,true));
        cAlterarF.setFont(new java.awt.Font("Serif", 0, 14));
        cAlterarF.setText("Permitir o  usuario a alterar um fornecedor");
        cAlterarF.setEnabled(false);

        cCadastrarF.setBackground(new java.awt.Color(-1,true));
        cCadastrarF.setFont(new java.awt.Font("Serif", 0, 14));
        cCadastrarF.setText("Permitir o  usuario a cadastrar o fornecedor");
        cCadastrarF.setEnabled(false);
        cCadastrarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCadastrarFActionPerformed(evt);
            }
        });

        cRemoverF.setBackground(new java.awt.Color(-1,true));
        cRemoverF.setFont(new java.awt.Font("Serif", 0, 14));
        cRemoverF.setText("Permitir o  usuario a remover  o fornecedor");
        cRemoverF.setEnabled(false);
        cRemoverF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRemoverFActionPerformed(evt);
            }
        });

        cProdutos.setBackground(new java.awt.Color(-1,true));
        cProdutos.setFont(new java.awt.Font("Serif", 1, 14));
        cProdutos.setText("Produtos");
        cProdutos.setEnabled(false);
        cProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cProdutosActionPerformed(evt);
            }
        });

        cCadastrarP.setBackground(new java.awt.Color(-1,true));
        cCadastrarP.setFont(new java.awt.Font("Serif", 0, 14));
        cCadastrarP.setText("Permitir o  usuario a cadastrar o produto");
        cCadastrarP.setEnabled(false);
        cCadastrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCadastrarPActionPerformed(evt);
            }
        });

        cRemoverP.setBackground(new java.awt.Color(-1,true));
        cRemoverP.setFont(new java.awt.Font("Serif", 0, 14));
        cRemoverP.setText("Permitir o  usuario a remover um produto");
        cRemoverP.setEnabled(false);

        cAlterarP.setBackground(new java.awt.Color(-1,true));
        cAlterarP.setFont(new java.awt.Font("Serif", 0, 14));
        cAlterarP.setText("Permitir o  usuario a alterar um produto");
        cAlterarP.setEnabled(false);

        cCadastrarC.setBackground(new java.awt.Color(-1,true));
        cCadastrarC.setFont(new java.awt.Font("Serif", 0, 14));
        cCadastrarC.setText("Permitir o  usuario a cadastrar o cliente");
        cCadastrarC.setEnabled(false);
        cCadastrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCadastrarCActionPerformed(evt);
            }
        });

        cCliente.setBackground(new java.awt.Color(-1,true));
        cCliente.setFont(new java.awt.Font("Serif", 1, 14));
        cCliente.setText("Clientes");
        cCliente.setEnabled(false);
        cCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cClienteActionPerformed(evt);
            }
        });

        cRemoverC.setBackground(new java.awt.Color(-1,true));
        cRemoverC.setFont(new java.awt.Font("Serif", 0, 14));
        cRemoverC.setText("Permitir o  usuario a remover cliente");
        cRemoverC.setEnabled(false);
        cRemoverC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRemoverCActionPerformed(evt);
            }
        });

        cAlterarC.setBackground(new java.awt.Color(-1,true));
        cAlterarC.setFont(new java.awt.Font("Serif", 0, 14));
        cAlterarC.setText("Permitir o  usuario a alterar um cliente");
        cAlterarC.setEnabled(false);

        cRelatorio.setBackground(new java.awt.Color(-1,true));
        cRelatorio.setFont(new java.awt.Font("Serif", 1, 14));
        cRelatorio.setText("Relatorios");
        cRelatorio.setEnabled(false);
        cRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRelatorioActionPerformed(evt);
            }
        });

        cUsuario.setBackground(new java.awt.Color(-1,true));
        cUsuario.setFont(new java.awt.Font("Serif", 1, 14));
        cUsuario.setText("Usuarios");
        cUsuario.setEnabled(false);
        cUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUsuarioActionPerformed(evt);
            }
        });

        cCadastrarU.setBackground(new java.awt.Color(-1,true));
        cCadastrarU.setFont(new java.awt.Font("Serif", 0, 14));
        cCadastrarU.setText("Permitir o  usuario a cadastrar outos usuarios");
        cCadastrarU.setEnabled(false);
        cCadastrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCadastrarUActionPerformed(evt);
            }
        });

        cRemoverU.setBackground(new java.awt.Color(-1,true));
        cRemoverU.setFont(new java.awt.Font("Serif", 0, 14));
        cRemoverU.setText("Permitir o  usuario a remover  o fornecedor");
        cRemoverU.setEnabled(false);
        cRemoverU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRemoverUActionPerformed(evt);
            }
        });

        cAlterarU.setBackground(new java.awt.Color(-1,true));
        cAlterarU.setFont(new java.awt.Font("Serif", 0, 14));
        cAlterarU.setText("Permitir o  usuario a alterar outros usuarios");
        cAlterarU.setEnabled(false);

        cVenda.setBackground(new java.awt.Color(-1,true));
        cVenda.setFont(new java.awt.Font("Serif", 1, 14));
        cVenda.setText("Vendas");
        cVenda.setEnabled(false);
        cVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cVendaActionPerformed(evt);
            }
        });

        cFazerV.setBackground(new java.awt.Color(-1,true));
        cFazerV.setFont(new java.awt.Font("Serif", 0, 14));
        cFazerV.setText("Permitir o  usuario a efetuar venda");
        cFazerV.setEnabled(false);

        cFazerPedido.setBackground(new java.awt.Color(-1,true));
        cFazerPedido.setFont(new java.awt.Font("Serif", 0, 14));
        cFazerPedido.setText("Permitir o  usuario a efetuar pedidos");
        cFazerPedido.setEnabled(false);
        cFazerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cFazerPedidoActionPerformed(evt);
            }
        });

        cFazerCotacao.setBackground(new java.awt.Color(-1,true));
        cFazerCotacao.setFont(new java.awt.Font("Serif", 0, 14));
        cFazerCotacao.setText("Permitir o  usuario fazer cotacao");
        cFazerCotacao.setEnabled(false);

        cFaerzDesc.setBackground(new java.awt.Color(-1,true));
        cFaerzDesc.setFont(new java.awt.Font("Serif", 0, 14));
        cFaerzDesc.setText("Permitir o  usuario definir descontos");
        cFaerzDesc.setEnabled(false);

        cEntrada.setBackground(new java.awt.Color(-1,true));
        cEntrada.setFont(new java.awt.Font("Serif", 0, 14));
        cEntrada.setText("Aceder relatorio de entrada de produtos");
        cEntrada.setEnabled(false);

        cSaida.setBackground(new java.awt.Color(-1,true));
        cSaida.setFont(new java.awt.Font("Serif", 0, 14));
        cSaida.setText("Aceder relatorio de saida de produtos");
        cSaida.setEnabled(false);

        cEstoque.setBackground(new java.awt.Color(-1,true));
        cEstoque.setFont(new java.awt.Font("Serif", 0, 14));
        cEstoque.setText("Aceder relatorio de produtos abaicho de estoque");
        cEstoque.setEnabled(false);

        cPrazo.setBackground(new java.awt.Color(-1,true));
        cPrazo.setText("Aceder relatorio de produtos prestes a aspirar o praso");
        cPrazo.setEnabled(false);
        cPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPrazoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cRelatorio)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(cEntrada))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cFazerV)
                            .addComponent(cFazerCotacao)
                            .addComponent(cFaerzDesc)
                            .addComponent(cFazerPedido)))
                    .addComponent(cVenda)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cCadastrarU)
                            .addComponent(cRemoverU)
                            .addComponent(cAlterarU)))
                    .addComponent(cUsuario)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cPrazo)
                            .addComponent(cEstoque)
                            .addComponent(cSaida)))
                    .addComponent(cCliente)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cAlterarC)
                            .addComponent(cRemoverC)
                            .addComponent(cCadastrarC)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(cAlterarP))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cRemoverF)
                            .addComponent(cCadastrarF)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cRemoverP)
                                    .addComponent(cCadastrarP))
                                .addComponent(cAlterarF))))
                    .addComponent(cProdutos)
                    .addComponent(cFornecedor))
                .addContainerGap(676, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(cFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cCadastrarF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cRemoverF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cAlterarF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cCadastrarP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cRemoverP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cAlterarP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCadastrarC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cRemoverC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cAlterarC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cCadastrarU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cRemoverU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cAlterarU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cFazerV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cFazerPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cFazerCotacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cFaerzDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cRelatorio)
                .addGap(3, 3, 3)
                .addComponent(cEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cSaida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cPrazo)
                .addGap(312, 312, 312))
        );

        jScrollPane1.setViewportView(jPanel3);

        jLabel5.setFont(new java.awt.Font("Serif", 0, 14));
        jLabel5.setText("Definicao do perfil do utilizador:");

        bnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Script-Edit.png"))); // NOI18N
        bnovo.setText("Novo");
        bnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(bnovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bRegistar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bAtualizar))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(98, 98, 98))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                            .addComponent(bSair)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bAtualizar, bEliminar, bRegistar, bSair, bnovo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRegistar)
                    .addComponent(bnovo)
                    .addComponent(bEliminar)
                    .addComponent(bAtualizar)
                    .addComponent(bSair))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bAtualizar, bEliminar, bRegistar, bSair, bnovo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
      dispose();
    }//GEN-LAST:event_bSairActionPerformed

    private void bRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistarActionPerformed
   
        tperfil.setText(" ");
        reiniciar() ;

    }//GEN-LAST:event_bRegistarActionPerformed

    private void cCadastrarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCadastrarFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCadastrarFActionPerformed

    private void cRemoverFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRemoverFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cRemoverFActionPerformed

    private void cCadastrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCadastrarCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCadastrarCActionPerformed

    private void cRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRelatorioActionPerformed
       if (cRelatorio.isSelected()) {
            cEntrada.setSelected(true);
            cPrazo.setSelected(true);
            cEstoque.setSelected(true);
            cSaida.setSelected(true);
        } else {
            cEntrada.setSelected(false);
            cPrazo.setSelected(false);
            cEstoque.setSelected(false);
            cSaida.setSelected(false);
        }
    }//GEN-LAST:event_cRelatorioActionPerformed

     public void reiniciar() { 
    cAlterarC.setSelected(false);
     cAlterarF.setSelected(false);
   cAlterarP.setSelected(false);
     cAlterarU.setSelected(false);
     cCadastrarC.setSelected(false);
     cCadastrarF.setSelected(false);
    cCadastrarP.setSelected(false);
    cCadastrarU.setSelected(false);
    cCliente.setSelected(false);
     cEntrada.setSelected(false);
     cEstoque.setSelected(false);
    cFaerzDesc.setSelected(false);
     cFazerCotacao.setSelected(false);
    cFazerPedido.setSelected(false);
     cFazerV.setSelected(false);
    cFornecedor.setSelected(false);
    cPrazo.setSelected(false);
     cProdutos.setSelected(false);
     cRelatorio.setSelected(false);
     cRemoverC.setSelected(false);
    cRemoverF.setSelected(false);
    cRemoverP.setSelected(false);
   cRemoverU.setSelected(false);
  cSaida.setSelected(false);
     cUsuario.setSelected(false);
    cVenda.setSelected(false);      
    }
    
    public void bNovo(){
    bRegistar.setEnabled(true);
    bAtualizar.setEnabled(true);
    bEliminar.setEnabled(true);
    tperfil.setEnabled(true);
    
      cAlterarC.setEnabled(true);
     cAlterarF.setEnabled(true);
   cAlterarP.setEnabled(true);
     cAlterarU.setEnabled(true);
     cCadastrarC.setEnabled(true);
     cCadastrarF.setEnabled(true);
    cCadastrarP.setEnabled(true);
    cCadastrarU.setEnabled(true);
    cCliente.setEnabled(true);
     cEntrada.setEnabled(true);
     cEstoque.setEnabled(true);
    cFaerzDesc.setEnabled(true);
     cFazerCotacao.setEnabled(true);
    cFazerPedido.setEnabled(true);
     cFazerV.setEnabled(true);
    cFornecedor.setEnabled(true);
    cPrazo.setEnabled(true);
     cProdutos.setEnabled(true);
     cRelatorio.setEnabled(true);
     cRemoverC.setEnabled(true);
    cRemoverF.setEnabled(true);
    cRemoverP.setEnabled(true);
   cRemoverU.setEnabled(true);
  cSaida.setEnabled(true);
     cUsuario.setEnabled(true);
    cVenda.setEnabled(true);
    }
     
          private void lookAndFeel(int a){
   try{
   UIManager.setLookAndFeel(UIManager.getInstalledLookAndFeels()[a].getClassName());
   SwingUtilities.updateComponentTreeUI(this);
   }catch(NullPointerException e){}catch(Exception e){}
   }
          
    private void cCadastrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCadastrarUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCadastrarUActionPerformed

    private void cRemoverUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRemoverUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cRemoverUActionPerformed

    private void cPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPrazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPrazoActionPerformed

    private void cCadastrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCadastrarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCadastrarPActionPerformed

    private void cFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cFornecedorActionPerformed
   if (cFornecedor.isSelected()) {
            cAlterarF.setSelected(true);
            cCadastrarF.setSelected(true);
            cRemoverF.setSelected(true);
        } else {
            cAlterarF.setSelected(false);
            cCadastrarF.setSelected(false);
            cRemoverF.setSelected(false);
        }       
    }//GEN-LAST:event_cFornecedorActionPerformed

    private void cProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cProdutosActionPerformed
       if (cProdutos.isSelected()) {
            cAlterarP.setSelected(true);
            cCadastrarP.setSelected(true);
            cRemoverP.setSelected(true);
        } else {
            cAlterarP.setSelected(false);
            cCadastrarP.setSelected(false);
            cRemoverP.setSelected(false);
        }
    }//GEN-LAST:event_cProdutosActionPerformed

    private void cClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cClienteActionPerformed
        if (cCliente.isSelected()) {
            cCadastrarC.setSelected(true);
            cAlterarC.setSelected(true);
            cRemoverC.setSelected(true);
        } else {
            cCadastrarC.setSelected(false);
            cAlterarC.setSelected(false);
            cRemoverC.setSelected(false);
        }
    }//GEN-LAST:event_cClienteActionPerformed

    private void cRemoverCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRemoverCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cRemoverCActionPerformed

    private void cUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cUsuarioActionPerformed
       if (cUsuario.isSelected()) {
            cCadastrarU.setSelected(true);
            cRemoverU.setSelected(true);
            cAlterarU.setSelected(true);
        } else {
            cCadastrarU.setSelected(false);
            cRemoverU.setSelected(false);
            cAlterarU.setSelected(false);
        }
    }//GEN-LAST:event_cUsuarioActionPerformed

    private void cVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cVendaActionPerformed
        if (cVenda.isSelected()) {
            cFazerV.setSelected(true);
            cFazerCotacao.setSelected(true);
            cFazerPedido.setSelected(true);
            cFaerzDesc.setSelected(true);
        } else {
            cFazerCotacao.setSelected(false);
            cFazerPedido.setSelected(false);
            cFaerzDesc.setSelected(false);
            cFazerV.setSelected(false);
        }
    }//GEN-LAST:event_cVendaActionPerformed

    private void cFazerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cFazerPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cFazerPedidoActionPerformed

    private void bnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnovoActionPerformed
     bNovo();
    }//GEN-LAST:event_bnovoActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAtualizarActionPerformed

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PermicoesInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PermicoesInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PermicoesInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PermicoesInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                new PermicoesInterface().setVisible(true);
//            }
//        });
//    }
    
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bRegistar;
    private javax.swing.JButton bSair;
    private javax.swing.JButton bnovo;
    private javax.swing.JCheckBox cAlterarC;
    private javax.swing.JCheckBox cAlterarF;
    private javax.swing.JCheckBox cAlterarP;
    private javax.swing.JCheckBox cAlterarU;
    private javax.swing.JCheckBox cCadastrarC;
    private javax.swing.JCheckBox cCadastrarF;
    private javax.swing.JCheckBox cCadastrarP;
    private javax.swing.JCheckBox cCadastrarU;
    private javax.swing.JCheckBox cCliente;
    private javax.swing.JCheckBox cEntrada;
    private javax.swing.JCheckBox cEstoque;
    private javax.swing.JCheckBox cFaerzDesc;
    private javax.swing.JCheckBox cFazerCotacao;
    private javax.swing.JCheckBox cFazerPedido;
    private javax.swing.JCheckBox cFazerV;
    private javax.swing.JCheckBox cFornecedor;
    private javax.swing.JCheckBox cPrazo;
    private javax.swing.JCheckBox cProdutos;
    private javax.swing.JCheckBox cRelatorio;
    private javax.swing.JCheckBox cRemoverC;
    private javax.swing.JCheckBox cRemoverF;
    private javax.swing.JCheckBox cRemoverP;
    private javax.swing.JCheckBox cRemoverU;
    private javax.swing.JCheckBox cSaida;
    private javax.swing.JCheckBox cUsuario;
    private javax.swing.JCheckBox cVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tperfil;
    // End of variables declaration//GEN-END:variables
}
