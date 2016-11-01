
package interfaces;

import Modelo.Usuario;
import interfaceemJdialogo.CadCliente1;
import interfaceemJdialogo.CadFornecedor1;
import interfaceemJdialogo.CadProduto1;
import interfaceemJdialogo.CadUsuario1;
import interfaceemJdialogo.DefinirDesconto1;
import interfaceemJdialogo.DefinirLimite;
import interfaceemJdialogo.PermicoesINterface1;
import interfaceemJdialogo.REntradaP;
import interfaceemJdialogo.RelatorioVendas;
import interfaceemJdialogo.TipoProduto1;
import interfaceemJdialogo.Venda1;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;


/**
 *
 * @author MACUACUA
 */
public class TelaPrincipal extends javax.swing.JFrame {
private Usuario usu=null;
    public TelaPrincipal(Usuario u ) {
        setUsu(u);
        
        initComponents();
        
     jMProduto.setVisible(u.getPerfil().getProdutoPerfil().isTelaProduto());
     bProduto.setVisible(u.getPerfil().getProdutoPerfil().isTelaProduto());
     
      jMCliente.setVisible(u.getPerfil().getClientePerfil().isTelaCliente());
      bCliente.setVisible(u.getPerfil().getClientePerfil().isTelaCliente());
      
      jMTproduto.setVisible(u.getPerfil().getProdutoPerfil().isTelaProduto());
      bTproduto.setVisible(u.getPerfil().getProdutoPerfil().isTelaProduto());
      
      bVenda.setVisible(u.getPerfil().getVendasPerfil().isTelaVenda());
      jMVenda.setVisible(u.getPerfil().getVendasPerfil().isTelaVenda());
      
      jMfornecedor.setVisible(u.getPerfil().getFornecedorPerfil().isTelaFornecedor());
      bFornecedor.setVisible(u.getPerfil().getFornecedorPerfil().isTelaFornecedor());
      
      jMperfil.setVisible(u.getPerfil().isPerfilTela());
      bPerfil.setVisible(u.getPerfil().isPerfilTela());
      
      jMUsuario.setVisible(u.getPerfil().getUsuarioPerfil().isTelaUsuario());
      bUsuario.setVisible(u.getPerfil().getUsuarioPerfil().isTelaUsuario());
      
    jMdefDesconto.setVisible(  usu.getPerfil().getVendasPerfil().isDefinirDesconto());
      
    jMenuBarprincipal.setBackground(new Color(102,204,255));
    
         lookAndFeel(3);
          this.setExtendedState(MAXIMIZED_BOTH);
               
          data();
       Timer timer= new Timer(1000,new hora());
       timer.start();
   }
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        ldata = new javax.swing.JLabel();
        lhora = new javax.swing.JLabel();
        bCliente = new javax.swing.JButton();
        bPerfil = new javax.swing.JButton();
        bVenda = new javax.swing.JButton();
        bUsuario = new javax.swing.JButton();
        bFornecedor = new javax.swing.JButton();
        bProduto = new javax.swing.JButton();
        bTproduto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jMenuBarprincipal = new javax.swing.JMenuBar();
        jMenuClie = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMTproduto = new javax.swing.JMenuItem();
        jMProduto = new javax.swing.JMenuItem();
        jMCliente = new javax.swing.JMenuItem();
        jMfornecedor = new javax.swing.JMenuItem();
        jMperfil = new javax.swing.JMenuItem();
        jMUsuario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMVenda = new javax.swing.JMenuItem();
        jMdefDesconto = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar2.setRollover(true);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        ldata.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ldata.setForeground(new java.awt.Color(51, 102, 255));

        lhora.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lhora.setForeground(new java.awt.Color(51, 102, 255));

        bCliente.setBackground(new java.awt.Color(153, 255, 255));
        bCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/sacola.png"))); // NOI18N
        bCliente.setText("Cliente");
        bCliente.setFocusable(false);
        bCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClienteActionPerformed(evt);
            }
        });

        bPerfil.setBackground(new java.awt.Color(153, 255, 255));
        bPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/cv.png"))); // NOI18N
        bPerfil.setText("Perfil");
        bPerfil.setFocusable(false);
        bPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bPerfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPerfilActionPerformed(evt);
            }
        });

        bVenda.setBackground(new java.awt.Color(153, 255, 255));
        bVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/bank.png"))); // NOI18N
        bVenda.setText("Venda");
        bVenda.setFocusable(false);
        bVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVendaActionPerformed(evt);
            }
        });

        bUsuario.setBackground(new java.awt.Color(153, 255, 255));
        bUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/customers1.png"))); // NOI18N
        bUsuario.setText("Usuario");
        bUsuario.setFocusable(false);
        bUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsuarioActionPerformed(evt);
            }
        });

        bFornecedor.setBackground(new java.awt.Color(153, 255, 255));
        bFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/hire-me1.png"))); // NOI18N
        bFornecedor.setText("Fornecedor");
        bFornecedor.setFocusable(false);
        bFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFornecedorActionPerformed(evt);
            }
        });

        bProduto.setBackground(new java.awt.Color(153, 255, 255));
        bProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/cart_add.png"))); // NOI18N
        bProduto.setText("Produtos");
        bProduto.setFocusable(false);
        bProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProdutoActionPerformed(evt);
            }
        });

        bTproduto.setBackground(new java.awt.Color(153, 255, 255));
        bTproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/basket.png"))); // NOI18N
        bTproduto.setText("Tipo ");
        bTproduto.setFocusable(false);
        bTproduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bTproduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bTproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTprodutoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(bTproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(bProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ldata, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lhora, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bFornecedor, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bTproduto, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bVenda, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bCliente)
                            .addComponent(bPerfil)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ldata, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lhora, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBarprincipal.setBackground(new java.awt.Color(153, 255, 255));

        jMenuClie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/order-1.png"))); // NOI18N
        jMenuClie.setText("Registros");
        jMenuClie.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jMenuClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClieActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/lock.png"))); // NOI18N
        jMenuItem1.setText("Seguranca");
        jMenuClie.add(jMenuItem1);

        jMTproduto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jMTproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/basket1.png"))); // NOI18N
        jMTproduto.setText("Registro de tipos de produto");
        jMTproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMTprodutoActionPerformed(evt);
            }
        });
        jMenuClie.add(jMTproduto);

        jMProduto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jMProduto.setText("Registros de produtos");
        jMProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMProdutoActionPerformed(evt);
            }
        });
        jMenuClie.add(jMProduto);

        jMCliente.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jMCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/bank1.png"))); // NOI18N
        jMCliente.setText("Registros de clientes");
        jMCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMClienteActionPerformed(evt);
            }
        });
        jMenuClie.add(jMCliente);

        jMfornecedor.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jMfornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/usuario.png"))); // NOI18N
        jMfornecedor.setText("Registros de Fornecedor");
        jMfornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMfornecedorActionPerformed(evt);
            }
        });
        jMenuClie.add(jMfornecedor);

        jMperfil.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jMperfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/cv1.png"))); // NOI18N
        jMperfil.setText("Definicoes de prefil do usuario");
        jMperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMperfilActionPerformed(evt);
            }
        });
        jMenuClie.add(jMperfil);

        jMUsuario.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jMUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/customers.png"))); // NOI18N
        jMUsuario.setText("Registro de usuarios");
        jMUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMUsuarioActionPerformed(evt);
            }
        });
        jMenuClie.add(jMUsuario);

        jMenuBarprincipal.add(jMenuClie);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/bank1.png"))); // NOI18N
        jMenu1.setText("Vendas");

        jMVenda.setText("Efectuar Vendas");
        jMVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMVendaActionPerformed(evt);
            }
        });
        jMenu1.add(jMVenda);

        jMdefDesconto.setText("Definir descontos");
        jMdefDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMdefDescontoActionPerformed(evt);
            }
        });
        jMenu1.add(jMdefDesconto);

        jMenuItem4.setText("Fazer cotacao");
        jMenu1.add(jMenuItem4);

        jMenuItem7.setText("Definir limite maximo de vale em cada cliente");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBarprincipal.add(jMenu1);

        menuAjuda.setText("Ajuda");
        menuAjuda.setFocusable(false);
        menuAjuda.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        jMenuItem2.setText("Sobre o sistema");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuAjuda.add(jMenuItem2);

        jMenuItem3.setText("Como usar o sistema");
        menuAjuda.add(jMenuItem3);

        jMenuBarprincipal.add(menuAjuda);

        jMenu2.setText("Relatorios");

        jMenuItem5.setText("Relatorio de entrada de produtos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Relatorio das vendas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBarprincipal.add(jMenu2);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/logout.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuSair.add(menuItemSair);

        jMenuBarprincipal.add(menuSair);

        setJMenuBar(jMenuBarprincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(666, 666, 666)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(445, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(388, 388, 388))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    

    private void jMProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMProdutoActionPerformed
    CadProduto1 cP= new CadProduto1(new JFrame(),true,usu) ;
     cP.setVisible(true);   
    }//GEN-LAST:event_jMProdutoActionPerformed

    private void jMClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMClienteActionPerformed
CadCliente1  cC= new CadCliente1(new JFrame(),true,getUsu());
cC.setVisible(true);
    }//GEN-LAST:event_jMClienteActionPerformed

    private void jMTprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMTprodutoActionPerformed
TipoProduto1 tp= new  TipoProduto1(new JFrame(), true,usu);
tp.setVisible(true);
    }//GEN-LAST:event_jMTprodutoActionPerformed

    private void jMfornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMfornecedorActionPerformed
CadFornecedor1 cF = new CadFornecedor1(new JFrame(),true,usu);
cF.setVisible(true);
    }//GEN-LAST:event_jMfornecedorActionPerformed

    private void jMUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMUsuarioActionPerformed
 CadUsuario1 caU= new CadUsuario1(new JFrame(),true,usu);
 caU.setVisible(true);    
    }//GEN-LAST:event_jMUsuarioActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
         int opcao;
			
			Object[] botoes = {"Sim","Nao"};
			opcao = JOptionPane.showOptionDialog(null,
			"Deseja mesmo sair?",
			"Sair",0,
			JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);

			if (opcao==0){
                            System.exit(0);
      }
       
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         
              int opcao;
			
			Object[] botoes = {"Sim","Nao"};
			opcao = JOptionPane.showOptionDialog(null,
			"Deseja mesmo sair?",
			"Sair",0,
			JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);

			if (opcao==0){
                           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        }else
                            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      
    }//GEN-LAST:event_formWindowClosing

    private void jMenuClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClieActionPerformed

    }//GEN-LAST:event_jMenuClieActionPerformed

    private void bProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProdutoActionPerformed
CadProduto1 cP= new CadProduto1(new JFrame(),true,usu) ;
cP.setVisible(true);
    }//GEN-LAST:event_bProdutoActionPerformed

    private void bPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPerfilActionPerformed
        PermicoesINterface1 pFace= new  PermicoesINterface1(new JFrame(),true);
      pFace.setVisible(true);
    }//GEN-LAST:event_bPerfilActionPerformed

    private void bTprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTprodutoActionPerformed
       TipoProduto1 tp= new  TipoProduto1(new JFrame(), true,usu);
     tp.setVisible(true);
    }//GEN-LAST:event_bTprodutoActionPerformed

    private void bClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClienteActionPerformed
       CadCliente1  cC= new CadCliente1(new JFrame(),true,usu);
      cC.setVisible(true);
    }//GEN-LAST:event_bClienteActionPerformed

    private void bVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVendaActionPerformed
       Venda1 v1 =new Venda1(new JFrame(),true,usu);
       v1.setVisible(true);
    }//GEN-LAST:event_bVendaActionPerformed

    private void jMVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMVendaActionPerformed
     Venda1 v1 =new Venda1(new JFrame(),true,usu);
       v1.setVisible(true);
    }//GEN-LAST:event_jMVendaActionPerformed

    private void jMperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMperfilActionPerformed
      PermicoesINterface1 pFace= new  PermicoesINterface1(new JFrame(),true);
      pFace.setVisible(true);
    }//GEN-LAST:event_jMperfilActionPerformed

    private void bFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFornecedorActionPerformed
       CadFornecedor1 cF = new CadFornecedor1(new JFrame(),true,usu);
       cF.setVisible(true);
    }//GEN-LAST:event_bFornecedorActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      
        
        try{
      
     // Runtime.getRuntime().exec("rundll32 url.dll,FileprotocolHandler "+);
      
      }catch(Exception e){JOptionPane.showMessageDialog(null, "  ");}
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void bUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsuarioActionPerformed
       CadUsuario1 caU= new CadUsuario1(new JFrame(),true,usu);
       caU.setVisible(true);
    }//GEN-LAST:event_bUsuarioActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       REntradaP re = new REntradaP(new JFrame(),true);
      re .setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMdefDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMdefDescontoActionPerformed
        DefinirDesconto1 dd= new DefinirDesconto1(new JFrame(),true);
        dd.setVisible(true);
    }//GEN-LAST:event_jMdefDescontoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      RelatorioVendas rVendas = new RelatorioVendas(new JFrame(),true);
      rVendas.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
     DefinirLimite dl= new DefinirLimite(new JFrame(),true);
     dl.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

 

   
    public void data(){
        String dia,mes = null,ano,dia_semana = null;
        Date data= new Date();
        
        dia= " "+data.getDate();
        ano= " "+(1900+data.getYear());
        
        switch(data.getMonth()){
            case 0:mes= "Janeiro";break;
            case 1:mes= "Fevereiro";break;
            case 2:mes= "Marco";break;
            case 3:mes= "Abril";break;
            case 4:mes= "Maio";break;
            case 5:mes= "Junho";break;
            case 6:mes= "Julho";break;
            case 7:mes= "Agosto";break;
            case 8:mes= "Setembro";break;
            case 9:mes= "Outubro";break;
            case 10:mes= "Novembro";break;
            case 11:mes= "Dezembro";break;
        }
         switch(data.getDay()){
            case 0:dia_semana= "Domingo";break;
            case 1:dia_semana = "Segunda-Feira";break;
            case 2:dia_semana= "Terca-Feira";break;
            case 3:dia_semana= "Quarta-Feira";break;
            case 4:dia_semana= "Quinta-Feira";break;
            case 5:dia_semana= "Sexta-Feira";break;
            case 6:dia_semana= "Sabado";break;
        
         }
         ldata.setText(dia_semana+" , "+dia+" de "+mes+" de "+ano);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCliente;
    private javax.swing.JButton bFornecedor;
    private javax.swing.JButton bPerfil;
    private javax.swing.JButton bProduto;
    private javax.swing.JButton bTproduto;
    private javax.swing.JButton bUsuario;
    private javax.swing.JButton bVenda;
    private javax.swing.JMenuItem jMCliente;
    private javax.swing.JMenuItem jMProduto;
    private javax.swing.JMenuItem jMTproduto;
    private javax.swing.JMenuItem jMUsuario;
    private javax.swing.JMenuItem jMVenda;
    private javax.swing.JMenuItem jMdefDesconto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBarprincipal;
    private javax.swing.JMenu jMenuClie;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMfornecedor;
    private javax.swing.JMenuItem jMperfil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel ldata;
    private javax.swing.JLabel lhora;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables

   private void lookAndFeel(int a){
   try{
   UIManager.setLookAndFeel(UIManager.getInstalledLookAndFeels()[a].getClassName());
   SwingUtilities.updateComponentTreeUI(this);
   }catch(NullPointerException e){}catch(Exception e){}
   
   }
    
    
    private class hora implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Calendar novo =Calendar.getInstance();
            lhora.setText(String.format("%1$tH:%1$tM:%1$tS", novo));
        }
    }
}
