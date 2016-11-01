
package interfaceemJdialogo;

import Modelo.ClientePerfil;
import Modelo.FornecedorPerfil;
import Modelo.Perfil;
import Modelo.ProdutoPerfil;
import Modelo.RelatorioPerfil;
import Modelo.UsuarioPerfil;
import Modelo.VendasPerfil;
import abstratclass.ListaModelo;
import DaoClasse.Metodos;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PermicoesINterface1 extends javax.swing.JDialog {
private int codigoPUsuario,codigoPFornecedor,CodigoPerfilVenda,CodigoperfilRelatorio,codigoperfilCliente,codigoPerfilProduto,codigoPerfil;
   
    public PermicoesINterface1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        preencherLista();
          bNovo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bRegistar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();
        bNovo = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        cFornecedor = new javax.swing.JCheckBox();
        cCadastrarF = new javax.swing.JCheckBox();
        cRemoverF = new javax.swing.JCheckBox();
        cAlterarF = new javax.swing.JCheckBox();
        cAlterarP = new javax.swing.JCheckBox();
        cRemoverP = new javax.swing.JCheckBox();
        cCadastrarP = new javax.swing.JCheckBox();
        cProdutos = new javax.swing.JCheckBox();
        cRemoverU = new javax.swing.JCheckBox();
        cAlterarU = new javax.swing.JCheckBox();
        cCadastrarU = new javax.swing.JCheckBox();
        cUsuario = new javax.swing.JCheckBox();
        cAlterarC = new javax.swing.JCheckBox();
        cRemoverC = new javax.swing.JCheckBox();
        cCadastrarC = new javax.swing.JCheckBox();
        cCliente = new javax.swing.JCheckBox();
        cVenda = new javax.swing.JCheckBox();
        cFazerV = new javax.swing.JCheckBox();
        cFazerPedido = new javax.swing.JCheckBox();
        cFazerCotacao = new javax.swing.JCheckBox();
        cFazerDesc = new javax.swing.JCheckBox();
        cRelatorio = new javax.swing.JCheckBox();
        cEntrada = new javax.swing.JCheckBox();
        cSaida = new javax.swing.JCheckBox();
        cEstoque = new javax.swing.JCheckBox();
        cPrazo = new javax.swing.JCheckBox();
        cLimitePedidosV = new javax.swing.JCheckBox();
        cTelaPerfil = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        listagem = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tperfil = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        bRegistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Save.png"))); // NOI18N
        bRegistar.setText("Registar");
        bRegistar.setEnabled(false);
        bRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistarActionPerformed(evt);
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

        bActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Refresh.png"))); // NOI18N
        bActualizar.setText("Actualizar");
        bActualizar.setEnabled(false);
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        bNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Script-Edit.png"))); // NOI18N
        bNovo.setText("Novo");
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });

        bSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Undo.png"))); // NOI18N
        bSair.setText("Voltar");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBar(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        cFornecedor.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cFornecedor.setText("Fornecedores");
        cFornecedor.setEnabled(false);
        cFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cFornecedorActionPerformed(evt);
            }
        });

        cCadastrarF.setBackground(new java.awt.Color(255, 255, 255));
        cCadastrarF.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cCadastrarF.setText("Permitir registar fornecedor");
        cCadastrarF.setEnabled(false);
        cCadastrarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCadastrarFActionPerformed(evt);
            }
        });

        cRemoverF.setBackground(new java.awt.Color(255, 255, 255));
        cRemoverF.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cRemoverF.setText("Permitir remover fornecedor");
        cRemoverF.setEnabled(false);
        cRemoverF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRemoverFActionPerformed(evt);
            }
        });

        cAlterarF.setBackground(new java.awt.Color(255, 255, 255));
        cAlterarF.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cAlterarF.setText("Permirir alterar fornecedor");
        cAlterarF.setEnabled(false);
        cAlterarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAlterarFActionPerformed(evt);
            }
        });

        cAlterarP.setBackground(new java.awt.Color(255, 255, 255));
        cAlterarP.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cAlterarP.setText("Permitir alterar Produtos");
        cAlterarP.setEnabled(false);
        cAlterarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAlterarPActionPerformed(evt);
            }
        });

        cRemoverP.setBackground(new java.awt.Color(255, 255, 255));
        cRemoverP.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cRemoverP.setText("Permitir remover produtos");
        cRemoverP.setEnabled(false);
        cRemoverP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRemoverPActionPerformed(evt);
            }
        });

        cCadastrarP.setBackground(new java.awt.Color(255, 255, 255));
        cCadastrarP.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cCadastrarP.setText("Permitir registrar produtos");
        cCadastrarP.setEnabled(false);
        cCadastrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCadastrarPActionPerformed(evt);
            }
        });

        cProdutos.setBackground(new java.awt.Color(255, 255, 255));
        cProdutos.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cProdutos.setText("Produtos");
        cProdutos.setEnabled(false);
        cProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cProdutosActionPerformed(evt);
            }
        });

        cRemoverU.setBackground(null);
        cRemoverU.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cRemoverU.setText("Permitir remover usuarios");
        cRemoverU.setEnabled(false);
        cRemoverU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRemoverUActionPerformed(evt);
            }
        });

        cAlterarU.setBackground(null);
        cAlterarU.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cAlterarU.setText("Permitir alterar usuarios");
        cAlterarU.setEnabled(false);
        cAlterarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAlterarUActionPerformed(evt);
            }
        });

        cCadastrarU.setBackground(null);
        cCadastrarU.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cCadastrarU.setText("Permitir registar usuarios");
        cCadastrarU.setEnabled(false);
        cCadastrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCadastrarUActionPerformed(evt);
            }
        });

        cUsuario.setBackground(null);
        cUsuario.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cUsuario.setText("Usuarios");
        cUsuario.setEnabled(false);
        cUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUsuarioActionPerformed(evt);
            }
        });

        cAlterarC.setBackground(null);
        cAlterarC.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cAlterarC.setText("Permitir alterar cliente");
        cAlterarC.setEnabled(false);
        cAlterarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cAlterarCActionPerformed(evt);
            }
        });

        cRemoverC.setBackground(new java.awt.Color(255, 255, 255));
        cRemoverC.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cRemoverC.setText("Permitir remover clientes");
        cRemoverC.setEnabled(false);
        cRemoverC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRemoverCActionPerformed(evt);
            }
        });

        cCadastrarC.setBackground(new java.awt.Color(255, 255, 255));
        cCadastrarC.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cCadastrarC.setText("Permitir registrar clientes");
        cCadastrarC.setEnabled(false);
        cCadastrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCadastrarCActionPerformed(evt);
            }
        });

        cCliente.setBackground(new java.awt.Color(255, 255, 255));
        cCliente.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cCliente.setText("Clientes");
        cCliente.setEnabled(false);
        cCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cClienteActionPerformed(evt);
            }
        });

        cVenda.setBackground(null);
        cVenda.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cVenda.setText("Vendas");
        cVenda.setEnabled(false);
        cVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cVendaActionPerformed(evt);
            }
        });

        cFazerV.setBackground(null);
        cFazerV.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cFazerV.setText("Permitir efectuar vendas");
        cFazerV.setEnabled(false);
        cFazerV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cFazerVActionPerformed(evt);
            }
        });

        cFazerPedido.setBackground(null);
        cFazerPedido.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cFazerPedido.setText("Permitir efectuar pedidos");
        cFazerPedido.setEnabled(false);

        cFazerCotacao.setBackground(null);
        cFazerCotacao.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cFazerCotacao.setText("Permitir fazer cotacao");
        cFazerCotacao.setEnabled(false);

        cFazerDesc.setBackground(null);
        cFazerDesc.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cFazerDesc.setText("Permitir efectuar desconto");
        cFazerDesc.setEnabled(false);

        cRelatorio.setBackground(null);
        cRelatorio.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        cRelatorio.setText("Relatorios");
        cRelatorio.setEnabled(false);
        cRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRelatorioActionPerformed(evt);
            }
        });

        cEntrada.setBackground(null);
        cEntrada.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cEntrada.setText("Aceder  relatorio de entrada de produtos");
        cEntrada.setEnabled(false);
        cEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEntradaActionPerformed(evt);
            }
        });

        cSaida.setBackground(null);
        cSaida.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cSaida.setText("Aceder relatorio de vendas");
        cSaida.setEnabled(false);

        cEstoque.setBackground(null);
        cEstoque.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cEstoque.setText("Aceder relatorio de produtos abaixo de estoque");
        cEstoque.setEnabled(false);

        cPrazo.setBackground(null);
        cPrazo.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        cPrazo.setText("Aceder relatorio de produtos prestes a expirar o prazo");
        cPrazo.setEnabled(false);
        cPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPrazoActionPerformed(evt);
            }
        });

        cLimitePedidosV.setBackground(null);
        cLimitePedidosV.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cLimitePedidosV.setText("permitir definir o limite de pedidos");
        cLimitePedidosV.setEnabled(false);

        cTelaPerfil.setBackground(null);
        cTelaPerfil.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cTelaPerfil.setText("Permitir aceder o perfil");
        cTelaPerfil.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cFornecedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cRemoverF)
                            .addComponent(cCadastrarF)
                            .addComponent(cAlterarF)
                            .addComponent(cAlterarP)
                            .addComponent(cRemoverP)
                            .addComponent(cCadastrarP)
                            .addComponent(cRemoverU)
                            .addComponent(cAlterarU)
                            .addComponent(cCadastrarU)
                            .addComponent(cAlterarC)
                            .addComponent(cRemoverC)
                            .addComponent(cCadastrarC)
                            .addComponent(cFazerV)
                            .addComponent(cFazerPedido)
                            .addComponent(cFazerCotacao)
                            .addComponent(cFazerDesc)
                            .addComponent(cLimitePedidosV)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cProdutos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cUsuario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cVenda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cEntrada)
                                    .addComponent(cSaida)
                                    .addComponent(cEstoque)
                                    .addComponent(cPrazo)))
                            .addComponent(cRelatorio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cTelaPerfil)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCadastrarF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cRemoverF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cAlterarF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCadastrarP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cRemoverP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cAlterarP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCadastrarC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cRemoverC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cAlterarC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCadastrarU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cRemoverU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cAlterarU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cFazerV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cFazerPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cFazerCotacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cFazerDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cLimitePedidosV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cSaida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cPrazo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cTelaPerfil)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        listagem.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        listagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listagemMouseClicked(evt);
            }
        });
        listagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listagemKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                listagemKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(listagem);

        jLabel1.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel1.setText("CLEVER");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setText("Nome do perfil:");

        tperfil.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tperfil.setEnabled(false);
        tperfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tperfilKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("O Administrador");

        jLabel5.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel5.setText("Lista de perfil:");

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setText("Definicao do perfil do Usuario:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bRegistar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bEliminar)
                .addGap(18, 18, 18)
                .addComponent(bActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSair)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(482, 482, 482)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(461, 461, 461)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRegistar)
                    .addComponent(bEliminar)
                    .addComponent(bActualizar)
                    .addComponent(bSair))
                .addGap(436, 436, 436))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bActualizar, bEliminar, bNovo, bRegistar, bSair});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cRemoverFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRemoverFActionPerformed
       if(cCadastrarF.isSelected()||cRemoverF.isSelected()||cAlterarF.isSelected())
           cFornecedor.setSelected(true);else 
        if(!cCadastrarF.isSelected()&&!cRemoverF.isSelected()&&!cAlterarF.isSelected())    
           cFornecedor.setSelected(false);
    }//GEN-LAST:event_cRemoverFActionPerformed

    private void cAlterarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAlterarCActionPerformed
      if(cCadastrarC.isSelected()||cRemoverC.isSelected()||cAlterarC.isSelected())
          cCliente.setSelected(true);else
       if(!cCadastrarC.isSelected()&&!cRemoverC.isSelected()&&!cAlterarC.isSelected())
          cCliente.setSelected(false); 
    }//GEN-LAST:event_cAlterarCActionPerformed

    private void cCadastrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCadastrarPActionPerformed
      if(cCadastrarP.isSelected()||cRemoverP.isSelected()||cAlterarP.isSelected())
         cProdutos.setSelected(true);else
        if(!cCadastrarP.isSelected()&&!cRemoverP.isSelected()&&!cAlterarP.isSelected())  
            cProdutos.setSelected(false);
    }//GEN-LAST:event_cCadastrarPActionPerformed

    private void cEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEntradaActionPerformed
       if(cEntrada.isSelected()||cSaida.isSelected()||cEstoque.isSelected()||cPrazo.isSelected())
           cRelatorio.setSelected(true);else
      if(!cEntrada.isSelected()&&!cSaida.isSelected()&&!cEstoque.isSelected()&&!cPrazo.isSelected())
           cRelatorio.setSelected(false);     
    }//GEN-LAST:event_cEntradaActionPerformed

    private void cPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPrazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPrazoActionPerformed

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
            cFazerDesc.setSelected(true);
            cLimitePedidosV.setSelected(true);
        } else {
            cFazerCotacao.setSelected(false);
            cFazerPedido.setSelected(false);
            cFazerDesc.setSelected(false);
            cFazerV.setSelected(false);
            cLimitePedidosV.setSelected(false);
        }
    }//GEN-LAST:event_cVendaActionPerformed

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

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
       reiniciar();
      bNovo();
    }//GEN-LAST:event_bNovoActionPerformed

    private void bRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistarActionPerformed
if(tperfil.getText().equals("Administrador"))
    JOptionPane.showMessageDialog(null, "este perfil ja existe");
else{
        Metodos.salvar( criarPerfil());
        reiniciar() ;
        preencherLista();}
        
    }//GEN-LAST:event_bRegistarActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        dispose();
    }//GEN-LAST:event_bSairActionPerformed

    private void cCadastrarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCadastrarFActionPerformed
     if(cCadastrarF.isSelected()||cRemoverF.isSelected()||cAlterarF.isSelected())
           cFornecedor.setSelected(true);else 
        if(!cCadastrarF.isSelected()&&!cRemoverF.isSelected()&&!cAlterarF.isSelected()) 
         cFornecedor.setSelected(false);
    }//GEN-LAST:event_cCadastrarFActionPerformed

    private void cAlterarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAlterarFActionPerformed
     if(cCadastrarF.isSelected()||cRemoverF.isSelected()||cAlterarF.isSelected())
           cFornecedor.setSelected(true);else 
          if(!cCadastrarF.isSelected()&&!cRemoverF.isSelected()&&!cAlterarF.isSelected())
         cFornecedor.setSelected(false);
    }//GEN-LAST:event_cAlterarFActionPerformed

    private void cRemoverPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRemoverPActionPerformed
    if(cCadastrarP.isSelected()||cRemoverP.isSelected()||cAlterarP.isSelected())
         cProdutos.setSelected(true);else
        if(!cCadastrarP.isSelected()&&!cRemoverP.isSelected()&&!cAlterarP.isSelected())  
            cProdutos.setSelected(false);
    }//GEN-LAST:event_cRemoverPActionPerformed

    private void cAlterarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAlterarPActionPerformed
      if(cCadastrarP.isSelected()||cRemoverP.isSelected()||cAlterarP.isSelected())
         cProdutos.setSelected(true);else
        if(!cCadastrarP.isSelected()&&!cRemoverP.isSelected()&&!cAlterarP.isSelected())  
            cProdutos.setSelected(false);
    }//GEN-LAST:event_cAlterarPActionPerformed

    private void cCadastrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCadastrarCActionPerformed
      if(cCadastrarC.isSelected()||cRemoverC.isSelected()||cAlterarC.isSelected())
          cCliente.setSelected(true);else
       if(!cCadastrarC.isSelected()&&!cRemoverC.isSelected()&&!cAlterarC.isSelected())
          cCliente.setSelected(false);   
    }//GEN-LAST:event_cCadastrarCActionPerformed

    private void cRemoverCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRemoverCActionPerformed
    if(cCadastrarC.isSelected()||cRemoverC.isSelected()||cAlterarC.isSelected())
          cCliente.setSelected(true);else
       if(!cCadastrarC.isSelected()&&!cRemoverC.isSelected()&&!cAlterarC.isSelected())
          cCliente.setSelected(false); 
    }//GEN-LAST:event_cRemoverCActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
          Metodos.actualizar(criarClientePCodigo(codigoperfilCliente));
          Metodos.actualizar(criarFornecedorPCodigo(codigoPFornecedor));
          Metodos.actualizar(criarProdutoPerfilCodigo(codigoPerfilProduto));
          Metodos.actualizar(criarRelatorioPerCodigo(CodigoperfilRelatorio));
          Metodos.actualizar(criarUperfilCodigo(codigoPUsuario));
          Metodos.actualizar(criarVendaPrefilCodigo(CodigoPerfilVenda));
          
           Perfil p =(Perfil)  Metodos.buscar(Perfil.class, codigoPerfil);
           Perfil pp= new Perfil();
           
           pp.setClientePerfil(p.getClientePerfil());
           pp.setFornecedorPerfil(p.getFornecedorPerfil());
           pp.setProdutoPerfil(p.getProdutoPerfil());
           pp.setRelatorioPerfil(p.getRelatorioPerfil());
           pp.setUsuarioPerfil(p.getUsuarioPerfil());
           pp.setVendasPerfil(p.getVendasPerfil());
           pp.setPerfilTela(cTelaPerfil.isSelected());
           pp.setPerfilNome(tperfil.getText());
           pp.setIdPerfil(codigoPerfil);
           
        
        Metodos.actualizar(pp);
        preencherLista();
        reiniciar();
        bNovo();
    }//GEN-LAST:event_bActualizarActionPerformed

    private void listagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listagemKeyPressed
    
    }//GEN-LAST:event_listagemKeyPressed

    private void listagemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listagemKeyTyped
    
    }//GEN-LAST:event_listagemKeyTyped

    private void listagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listagemMouseClicked
            String li =(String) listagem.getSelectedValue();
     List lista = new Metodos().listarTodos("Perfil");
     Perfil p = null;
     if(listagem.getSelectedIndex()>=0){
     for(int i=0;i<lista.size();i++)
     {    p=(Perfil)lista.get(i);
         if(p.getPerfilNome().equals(li))
             break;}
      bNovo();
      bRegistar.setEnabled(false);
     cAlterarC.setSelected(p.getClientePerfil().isActualizarCliente());
     cAlterarF.setSelected(p.getFornecedorPerfil().isActualizarFornecedor());
     cAlterarP.setSelected(p.getProdutoPerfil().isActualizarProduto());
     cAlterarU.setSelected(p.getUsuarioPerfil().isActualizarUsuario());
     cCadastrarC.setSelected(p.getClientePerfil().isCadastrarCliente());
     cCadastrarF.setSelected(p.getFornecedorPerfil().isCadastrarFornecedor());
     cCadastrarP.setSelected(p.getProdutoPerfil().isCadastrarProduto());
     cCadastrarU.setSelected(p.getUsuarioPerfil().isCadastrarUsuario());
     cCliente.setSelected(p.getClientePerfil().isTelaCliente());
     cEntrada.setSelected(p.getRelatorioPerfil().isAcederRentrada());
     cEstoque.setSelected(p.getRelatorioPerfil().isAcederRestoque());
     cFazerCotacao.setSelected(p.getVendasPerfil().isFazerCotacao());
     cFazerDesc.setSelected(p.getVendasPerfil().isDefinirDesconto());
     cFazerPedido.setSelected(p.getVendasPerfil().isFazerPedidos());
     cFazerV.setSelected(p.getVendasPerfil().isEfetuarVenda());
     cFornecedor.setSelected(p.getFornecedorPerfil().isTelaFornecedor());
     cLimitePedidosV.setSelected(p.getVendasPerfil().isDefinirLimite());
     cPrazo.setSelected(p.getRelatorioPerfil().isAbaixoPrazo());
     cProdutos.setSelected(p.getProdutoPerfil().isTelaProduto());
     cRemoverC.setSelected(p.getClientePerfil().isExcluirCliente());
     cRemoverF.setSelected(p.getFornecedorPerfil().isExcluirFornecedor());
     cRemoverP.setSelected(p.getProdutoPerfil().isExcluirProduto());
     cRemoverU.setSelected(p.getUsuarioPerfil().isExcluirUsuario());
     cSaida.setSelected(p.getRelatorioPerfil().isAcederRsaida());
     cUsuario.setSelected(p.getUsuarioPerfil().isTelaUsuario());  
     cVenda.setSelected(p.getVendasPerfil().isTelaVenda());
     cTelaPerfil.setSelected(p.isPerfilTela());
     
 if(p.getRelatorioPerfil().isAbaixoPrazo()==true && p.getRelatorioPerfil().isAcederRentrada()==true 
         && p.getRelatorioPerfil().isAcederRestoque()==true &&p.getRelatorioPerfil().isAcederRsaida()==true)
     cRelatorio.setSelected(true);
 else cRelatorio.setSelected(false);
     tperfil.setText(p.getPerfilNome());
     tperfil.setEnabled(true);
     bActualizar.setEnabled(true);
     bEliminar.setEnabled(true);
     
     CodigoPerfilVenda=p.getVendasPerfil().getIdVendasPerfil();
     CodigoperfilRelatorio=p.getRelatorioPerfil().getIdRelatorioPerfil();
     codigoPFornecedor=p.getFornecedorPerfil().getIdFornecedorPerfil();
     codigoPUsuario=p.getUsuarioPerfil().getIdUsuarioPerfil();
     codigoPerfil=p.getIdPerfil();
     codigoPerfilProduto=p.getProdutoPerfil().getIdProdutoPerfil();
     codigoperfilCliente=p.getClientePerfil().getIdClientePerfil();
    }else JOptionPane.showMessageDialog(null, "precisa selecionar o nome do perfil");
       
    }//GEN-LAST:event_listagemMouseClicked

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        Metodos.apagar(Perfil.class, codigoPerfil);
       
        Metodos.apagar(VendasPerfil.class, CodigoPerfilVenda);
        Metodos.apagar(UsuarioPerfil.class, codigoPUsuario);
        Metodos.apagar(RelatorioPerfil.class, CodigoperfilRelatorio);
        Metodos.apagar(ProdutoPerfil.class, codigoPerfilProduto);
        Metodos.apagar(FornecedorPerfil.class, codigoPFornecedor);
        preencherLista();
        reiniciar();
        bNovo();
        
    }//GEN-LAST:event_bEliminarActionPerformed

    private void cCadastrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCadastrarUActionPerformed
if(cCadastrarU.isSelected()||cRemoverU.isSelected()||cAlterarU.isSelected())
    cUsuario.setSelected(true);else
       if(!cCadastrarU.isSelected()&&!cRemoverU.isSelected()&&!cAlterarU.isSelected())
    cUsuario.setSelected(false);
    }//GEN-LAST:event_cCadastrarUActionPerformed

    private void cAlterarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cAlterarUActionPerformed
     if(cCadastrarU.isSelected()||cRemoverU.isSelected()||cAlterarU.isSelected())
    cUsuario.setSelected(true);else
       if(!cCadastrarU.isSelected()&&!cRemoverU.isSelected()&&!cAlterarU.isSelected())
    cUsuario.setSelected(false);
    }//GEN-LAST:event_cAlterarUActionPerformed

    private void cRemoverUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRemoverUActionPerformed
     if(cCadastrarU.isSelected()||cRemoverU.isSelected()||cAlterarU.isSelected())
    cUsuario.setSelected(true);else
       if(!cCadastrarU.isSelected()&&!cRemoverU.isSelected()&&!cAlterarU.isSelected())
    cUsuario.setSelected(false);
    }//GEN-LAST:event_cRemoverUActionPerformed

    private void cFazerVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cFazerVActionPerformed
if(cFazerV.isSelected()||cFazerPedido.isSelected()||cFazerCotacao.isSelected()||cFazerDesc.isSelected()||cLimitePedidosV.isSelected())
    cVenda.setSelected(true);else
    
    if(!cFazerV.isSelected()&&!cFazerPedido.isSelected()&&!cFazerCotacao.isSelected()&&!cFazerDesc.isSelected()&&!cLimitePedidosV.isSelected())
    cVenda.setSelected(false);
    }//GEN-LAST:event_cFazerVActionPerformed

    private void tperfilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tperfilKeyTyped
        char c= evt.getKeyChar();
        if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
           
        } 
    }//GEN-LAST:event_tperfilKeyTyped

   
  
    
      public void reiniciar() { 
          tperfil.setText(" ");
          tperfil.setEnabled(false);
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
    cFazerDesc.setSelected(false);
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
    cTelaPerfil.setSelected(false); 
    cLimitePedidosV.setSelected(false);
    bActualizar.setEnabled(false);
    bEliminar.setEnabled(false);
    bRegistar.setEnabled(false);
    }
    
    public void bNovo(){
    bRegistar.setEnabled(true);
    bActualizar.setEnabled(false);
    bEliminar.setEnabled(false);
    tperfil.setEnabled(true);
    tperfil.requestFocus();
    
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
    cFazerDesc.setEnabled(true);
     cFazerCotacao.setEnabled(true);
     cFazerPedido.setEnabled(true);
     cFazerV.setEnabled(true);
     cFornecedor.setEnabled(true);
     cLimitePedidosV.setEnabled(true);
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
    cTelaPerfil.setEnabled(true);
    }
    
    private ClientePerfil criarClienteP(){
    ClientePerfil cP =new ClientePerfil();
    cP.setActualizarCliente(cAlterarC.isSelected());
    cP.setCadastrarCliente(cCadastrarC.isSelected());
    cP.setExcluirCliente(cRemoverC.isSelected());
    cP.setTelaCliente(cCliente.isSelected());
    Metodos.salvar( cP);
    return cP;
    }
    
     private ClientePerfil criarClientePCodigo(int codigo){
    ClientePerfil cP =new ClientePerfil();
    cP.setActualizarCliente(cAlterarC.isSelected());
    cP.setCadastrarCliente(cCadastrarC.isSelected());
    cP.setExcluirCliente(cRemoverC.isSelected());
    cP.setTelaCliente(cCliente.isSelected());
    cP.setIdClientePerfil(codigo);
    return cP;
    }
    
    private FornecedorPerfil criarFornecedorP(){
    FornecedorPerfil fP=new FornecedorPerfil();
    fP.setActualizarFornecedor(cAlterarF.isSelected());
    fP.setCadastrarFornecedor(cCadastrarF.isSelected());
    fP.setExcluirFornecedor(cRemoverF.isSelected());
    fP.setTelaFornecedor(cFornecedor.isSelected());
    Metodos.salvar( fP);
    return fP;
    }
    
      private FornecedorPerfil criarFornecedorPCodigo(int codigo ){
    FornecedorPerfil fP=new FornecedorPerfil();
    fP.setActualizarFornecedor(cAlterarF.isSelected());
    fP.setCadastrarFornecedor(cCadastrarF.isSelected());
    fP.setExcluirFornecedor(cRemoverF.isSelected());
    fP.setTelaFornecedor(cFornecedor.isSelected());
    fP.setIdFornecedorPerfil(codigo);
    return fP;
    }
    
    private ProdutoPerfil criarProdutoPerfil(){
    ProdutoPerfil pP=new ProdutoPerfil();
    pP.setActualizarProduto(cAlterarP.isSelected());
    pP.setCadastrarProduto(cCadastrarP.isSelected());
    pP.setExcluirProduto(cRemoverP.isSelected());
    pP.setTelaProduto(cProdutos.isSelected());
   Metodos.salvar( pP);
    return pP;
    }
    
     private ProdutoPerfil criarProdutoPerfilCodigo(int codi){
    ProdutoPerfil pP=new ProdutoPerfil();
    pP.setActualizarProduto(cAlterarP.isSelected());
    pP.setCadastrarProduto(cCadastrarP.isSelected());
    pP.setExcluirProduto(cRemoverP.isSelected());
    pP.setTelaProduto(cProdutos.isSelected());
    pP.setIdProdutoPerfil(codi);
    return pP;
    }
     
   private RelatorioPerfil criarRelatorioPer(){
   RelatorioPerfil rP=new RelatorioPerfil();
   rP.setAbaixoPrazo(cPrazo.isSelected());
   rP.setAcederRentrada(cEntrada.isSelected());
   rP.setAcederRsaida(cSaida.isSelected());
   rP.setAcederRestoque(cEstoque.isSelected());
  Metodos.salvar( rP);
   return rP;
   } 
    
     private RelatorioPerfil criarRelatorioPerCodigo(int codigo){
   RelatorioPerfil rP=new RelatorioPerfil();
   rP.setAbaixoPrazo(cPrazo.isSelected());
   rP.setAcederRentrada(cEntrada.isSelected());
   rP.setAcederRsaida(cSaida.isSelected());
   rP.setAcederRestoque(cEstoque.isSelected());
  rP.setIdRelatorioPerfil(codigo);
   return rP;
   } 
     
    private UsuarioPerfil criarUperfil(){
    UsuarioPerfil uP=new UsuarioPerfil();
    uP.setActualizarUsuario(cAlterarU.isSelected());
    uP.setCadastrarUsuario(cCadastrarU.isSelected());
    uP.setExcluirUsuario(cRemoverU.isSelected());
    uP.setTelaUsuario(cUsuario.isSelected());
   Metodos.salvar( uP);
    return uP;
    }
  
      private UsuarioPerfil criarUperfilCodigo(int codigo){
    UsuarioPerfil uP=new UsuarioPerfil();
    uP.setActualizarUsuario(cAlterarU.isSelected());
    uP.setCadastrarUsuario(cCadastrarU.isSelected());
    uP.setExcluirUsuario(cRemoverU.isSelected());
    uP.setTelaUsuario(cUsuario.isSelected());
    uP.setIdUsuarioPerfil(codigo);
    return uP;
    }
    
    private VendasPerfil criarVendaPrefil(){
    VendasPerfil  vP= new VendasPerfil ();
    vP.setDefinirDesconto(cFazerDesc.isSelected());
    vP.setDefinirLimite(cLimitePedidosV.isSelected());
    vP.setEfetuarVenda(cFazerV.isSelected());
    vP.setFazerCotacao(cFazerCotacao.isSelected());
    vP.setFazerPedidos(cFazerPedido.isSelected());
    vP.setTelaVenda(cVenda.isSelected());
   Metodos.salvar( vP);
    return vP;
    }
    
     private VendasPerfil criarVendaPrefilCodigo(int codigo){
    VendasPerfil  vP= new VendasPerfil ();
    vP.setDefinirDesconto(cFazerDesc.isSelected());
    vP.setDefinirLimite(cLimitePedidosV.isSelected());
    vP.setEfetuarVenda(cFazerV.isSelected());
    vP.setFazerCotacao(cFazerCotacao.isSelected());
    vP.setFazerPedidos(cFazerPedido.isSelected());
    vP.setTelaVenda(cVenda.isSelected());
    vP.setIdVendasPerfil(codigo);
    return vP;
    }
    
    private Perfil criarPerfil(){
    Perfil per= new Perfil();
    
    per.setClientePerfil(criarClienteP());
    per.setFornecedorPerfil(criarFornecedorP());
    per.setPerfilNome(tperfil.getText());
    per.setProdutoPerfil(criarProdutoPerfil());
    per.setRelatorioPerfil(criarRelatorioPer());
    per.setUsuarioPerfil(criarUperfil());
    per.setVendasPerfil(criarVendaPrefil());
    per.setPerfilTela(cTelaPerfil.isSelected());
     return per;
    }
 
    
   
    private void preencherLista(){
        List lista = new Metodos().listarTodos("Perfil");
        
        ArrayList li=new ArrayList();
        for( int j=0;j<lista.size();j++){
            Perfil p =(Perfil) lista.get(j) ;
    li.add(p.getPerfilNome());}
        
        try{
            ListaModelo mo = new ListaModelo(li);
            listagem.setModel(mo);
         //   listagem.setSelectionModel(ListSele);
        }catch(Exception ex){}
    } 
    
    
    @SuppressWarnings("deprecation")
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bNovo;
    private javax.swing.JButton bRegistar;
    private javax.swing.JButton bSair;
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
    private javax.swing.JCheckBox cFazerCotacao;
    private javax.swing.JCheckBox cFazerDesc;
    private javax.swing.JCheckBox cFazerPedido;
    private javax.swing.JCheckBox cFazerV;
    private javax.swing.JCheckBox cFornecedor;
    private javax.swing.JCheckBox cLimitePedidosV;
    private javax.swing.JCheckBox cPrazo;
    private javax.swing.JCheckBox cProdutos;
    private javax.swing.JCheckBox cRelatorio;
    private javax.swing.JCheckBox cRemoverC;
    private javax.swing.JCheckBox cRemoverF;
    private javax.swing.JCheckBox cRemoverP;
    private javax.swing.JCheckBox cRemoverU;
    private javax.swing.JCheckBox cSaida;
    private javax.swing.JCheckBox cTelaPerfil;
    private javax.swing.JCheckBox cUsuario;
    private javax.swing.JCheckBox cVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listagem;
    private javax.swing.JTextField tperfil;
    // End of variables declaration//GEN-END:variables
}
