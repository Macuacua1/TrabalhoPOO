/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Venda1.java
 *
 * Created on Sep 23, 2015, 7:41:56 AM
 */
package interfaceemJdialogo;

import DaoClasse.ClienteDao;
import DaoClasse.ItemvendaDao;
import DaoClasse.ProdutoDao;
import DaoClasse.VendaDao;
import Modelo.ItemVenda;
import Modelo.ItemVendaId;
import Modelo.Produto;
import Modelo.Usuario;
import Modelo.Venda;
import abstratclass.ComboboxPreencher;
import abstratclass.Modelo;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author ILIDIOP
 */
public class Venda1 extends javax.swing.JDialog {
  
  private  ItemVenda itemVendas;
  List<ItemVenda> listaItems;
  Venda ve1;
  private DefaultTableCellRenderer dtCellr;
  Pagamento   pag;

    private double totall;
    private String valor1;
    
  private Usuario usu =null;
    @SuppressWarnings({"unchecked", "unchecked"})
    public Venda1(java.awt.Frame parent, boolean modal,Usuario u) {
        super(parent, modal);
        initComponents();
         setUsu(u); 
        
    bNovoCliente.setVisible(u.getPerfil().getClientePerfil().isTelaCliente());
    bDefdesconto.setVisible(u.getPerfil().getVendasPerfil().isDefinirDesconto());
    rVenda.setVisible(u.getPerfil().getVendasPerfil().isEfetuarVenda());
    rPedidos.setVisible(u.getPerfil().getVendasPerfil().isFazerPedidos());
    rCotacao.setVisible(u.getPerfil().getVendasPerfil().isFazerCotacao());
    
    
        listaItems= new ArrayList<ItemVenda>();
       itemVendas = new ItemVenda();
       
 
    List listaProduto= new ProdutoDao().listarNomes();
    List listaCliente= new ClienteDao().listarNomes();
    listaCliente.add(0, " ");
    
    new ComboboxPreencher().preencheCombo(cCliente, listaCliente);
    new ComboboxPreencher().preencheCombo(cProduto, listaProduto);
      valor1 =""; 
    AutoCompleteDecorator.decorate(cProduto);
    AutoCompleteDecorator.decorate(cCliente);
        
     lqua.setVisible(false);
     
       dtCellr =new DefaultTableCellHeaderRenderer();
       dtCellr.setOpaque(false);
       
        setLocationRelativeTo(null);
        
    }

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cCliente = new javax.swing.JComboBox();
        bNovoCliente = new javax.swing.JButton();
        rVenda = new javax.swing.JRadioButton();
        rPedidos = new javax.swing.JRadioButton();
        rCotacao = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lNomeProduto = new javax.swing.JLabel();
        lCustoUnitario = new javax.swing.JLabel();
        lUnidade = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbCustoTotal = new javax.swing.JLabel();
        lbLancamento = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        bDefdesconto = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        pproduto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cProduto = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        tQuantidade = new javax.swing.JTextField();
        lqua = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShadowColor(new java.awt.Color(51, 51, 51));
        dropShadowBorder1.setShadowOpacity(0.4F);
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        jPanel3.setBorder(dropShadowBorder1);

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cliente:");

        cCliente.setBackground(new java.awt.Color(204, 204, 204));
        cCliente.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153)));
        cCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cClienteActionPerformed(evt);
            }
        });

        bNovoCliente.setBackground(new java.awt.Color(204, 204, 204));
        bNovoCliente.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        bNovoCliente.setText("NOVO CLIENTE");
        bNovoCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153)));
        bNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoClienteActionPerformed(evt);
            }
        });

        rVenda.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(rVenda);
        rVenda.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        rVenda.setText("VENDAS");
        rVenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153)));
        rVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rVendaActionPerformed(evt);
            }
        });

        rPedidos.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(rPedidos);
        rPedidos.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        rPedidos.setText("PEDIDOS");
        rPedidos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153)));
        rPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPedidosActionPerformed(evt);
            }
        });

        rCotacao.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(rCotacao);
        rCotacao.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        rCotacao.setText("COTAÇÃO");
        rCotacao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(153, 153, 153)));
        rCotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCotacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rVenda)
                        .addGap(34, 34, 34)
                        .addComponent(rPedidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rCotacao))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                .addComponent(bNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rPedidos)
                    .addComponent(rVenda)
                    .addComponent(rCotacao))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder2 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder2.setShowLeftShadow(true);
        dropShadowBorder2.setShowTopShadow(true);
        jPanel4.setBorder(dropShadowBorder2);
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRODUTO");

        jLabel6.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PREÇO UNITÁRIO");

        jLabel7.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("UNIDADE");

        lNomeProduto.setBackground(new java.awt.Color(255, 255, 255));
        lNomeProduto.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lNomeProduto.setForeground(new java.awt.Color(51, 51, 51));
        lNomeProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNomeProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lNomeProduto.setOpaque(true);

        lCustoUnitario.setBackground(new java.awt.Color(255, 255, 255));
        lCustoUnitario.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lCustoUnitario.setForeground(new java.awt.Color(51, 51, 51));
        lCustoUnitario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCustoUnitario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lCustoUnitario.setOpaque(true);

        lUnidade.setBackground(new java.awt.Color(255, 255, 255));
        lUnidade.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        lUnidade.setForeground(new java.awt.Color(51, 51, 51));
        lUnidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lUnidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lUnidade.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addComponent(lCustoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addComponent(lUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lCustoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel5, jLabel6, jLabel7, lCustoUnitario, lNomeProduto, lUnidade});

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder3 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder3.setShadowColor(new java.awt.Color(51, 51, 51));
        dropShadowBorder3.setShadowSize(7);
        dropShadowBorder3.setShowLeftShadow(true);
        dropShadowBorder3.setShowTopShadow(true);
        jScrollPane1.setBorder(dropShadowBorder3);
        jScrollPane1.setOpaque(false);

        tabela.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabela.setGridColor(new java.awt.Color(102, 102, 102));
        tabela.setInheritsPopupMenu(true);
        tabela.setOpaque(false);
        tabela.setSelectionBackground(new java.awt.Color(51, 255, 255));
        tabela.setShowHorizontalLines(false);
        tabela.setShowVerticalLines(false);
        tabela.getTableHeader().setResizingAllowed(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder4 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder4.setShowLeftShadow(true);
        dropShadowBorder4.setShowTopShadow(true);
        jPanel6.setBorder(dropShadowBorder4);

        jLabel8.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CUSTO TOTAL");

        jLabel9.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("QUANTIDADE DE ARTIGOS");

        lbCustoTotal.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        lbCustoTotal.setForeground(new java.awt.Color(255, 255, 255));
        lbCustoTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbLancamento.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        lbLancamento.setForeground(new java.awt.Color(255, 255, 255));
        lbLancamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(lbLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCustoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCustoTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbLancamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel8, lbCustoTotal});

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel9, lbLancamento});

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder5 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder5.setShowLeftShadow(true);
        dropShadowBorder5.setShowTopShadow(true);
        jPanel7.setBorder(dropShadowBorder5);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Add.png"))); // NOI18N
        jButton2.setText("ADICIONAR");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bDefdesconto.setBackground(new java.awt.Color(204, 204, 204));
        bDefdesconto.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        bDefdesconto.setForeground(new java.awt.Color(51, 153, 0));
        bDefdesconto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/ant.png"))); // NOI18N
        bDefdesconto.setText("LIMPAR");
        bDefdesconto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        bDefdesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDefdescontoActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 153, 0));
        jButton5.setText("REMOVER ITEMS");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 153, 0));
        jButton4.setText("REINICIAR");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 102, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/check.png"))); // NOI18N
        jButton6.setText("CONCLUIR");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(204, 204, 204));
        b7.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        b7.setForeground(new java.awt.Color(51, 153, 0));
        b7.setText("7");
        b7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b7MouseClicked(evt);
            }
        });
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        b7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b7KeyTyped(evt);
            }
        });

        b8.setBackground(new java.awt.Color(204, 204, 204));
        b8.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        b8.setForeground(new java.awt.Color(51, 153, 0));
        b8.setText("8");
        b8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b8MouseClicked(evt);
            }
        });
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        b8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b8KeyTyped(evt);
            }
        });

        b9.setBackground(new java.awt.Color(204, 204, 204));
        b9.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        b9.setForeground(new java.awt.Color(51, 153, 0));
        b9.setText("9");
        b9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b9MouseClicked(evt);
            }
        });
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        b9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b9KeyTyped(evt);
            }
        });

        b4.setBackground(new java.awt.Color(204, 204, 204));
        b4.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        b4.setForeground(new java.awt.Color(51, 153, 0));
        b4.setText("4");
        b4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        b4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b4KeyTyped(evt);
            }
        });

        b5.setBackground(new java.awt.Color(204, 204, 204));
        b5.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        b5.setForeground(new java.awt.Color(51, 153, 0));
        b5.setText("5");
        b5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
            }
        });
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        b5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b5KeyTyped(evt);
            }
        });

        b6.setBackground(new java.awt.Color(204, 204, 204));
        b6.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        b6.setForeground(new java.awt.Color(51, 153, 0));
        b6.setText("6");
        b6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b6MouseClicked(evt);
            }
        });
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        b6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b6KeyTyped(evt);
            }
        });

        b1.setBackground(new java.awt.Color(204, 204, 204));
        b1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        b1.setForeground(new java.awt.Color(51, 153, 0));
        b1.setText("1");
        b1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        b1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b1KeyTyped(evt);
            }
        });

        b3.setBackground(new java.awt.Color(204, 204, 204));
        b3.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        b3.setForeground(new java.awt.Color(51, 153, 0));
        b3.setText("3");
        b3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        b3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b3KeyTyped(evt);
            }
        });

        b2.setBackground(new java.awt.Color(204, 204, 204));
        b2.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        b2.setForeground(new java.awt.Color(51, 153, 0));
        b2.setText("2");
        b2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        b2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b2KeyTyped(evt);
            }
        });

        b0.setBackground(new java.awt.Color(204, 204, 204));
        b0.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        b0.setForeground(new java.awt.Color(51, 153, 0));
        b0.setText("0");
        b0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(153, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0)));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(bDefdesconto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {b0, b1, b2, b3, b4, b5, b6, b7, b8, b9});

        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDefdesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9)
                    .addComponent(b8)
                    .addComponent(b7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b6)
                    .addComponent(b5)
                    .addComponent(b4)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2)
                    .addComponent(b3)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, jButton2});

        pproduto.setBackground(new java.awt.Color(0, 153, 153));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder6 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder6.setShowLeftShadow(true);
        dropShadowBorder6.setShowTopShadow(true);
        pproduto.setBorder(dropShadowBorder6);

        jLabel2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Produtos");

        cProduto.setBackground(new java.awt.Color(204, 204, 204));
        cProduto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cProduto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        cProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cProdutoItemStateChanged(evt);
            }
        });
        cProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cProdutoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantidade:");

        tQuantidade.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        tQuantidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        tQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tQuantidadeActionPerformed(evt);
            }
        });
        tQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tQuantidadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tQuantidadeKeyTyped(evt);
            }
        });

        lqua.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lqua.setForeground(new java.awt.Color(255, 255, 255));
        lqua.setText("! verifica a qantidade introduzida");

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pprodutoLayout = new javax.swing.GroupLayout(pproduto);
        pproduto.setLayout(pprodutoLayout);
        pprodutoLayout.setHorizontalGroup(
            pprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tQuantidade))
                    .addGroup(pprodutoLayout.createSequentialGroup()
                        .addComponent(lqua, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pprodutoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pprodutoLayout.setVerticalGroup(
            pprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pprodutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lqua)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pprodutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pprodutoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cProduto, tQuantidade});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pproduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pproduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void tQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tQuantidadeKeyTyped
       char c= evt.getKeyChar();
      System.out.println(c);
 if(c< '0'|| c >'9' )
    // if(c=='.')
     //    if(tQuantidade.getText().length()>0 && )
{
    evt.consume();
 }

          
    }//GEN-LAST:event_tQuantidadeKeyTyped

    private void bDefdescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDefdescontoActionPerformed
         if(tQuantidade.getText().length()>0)
         {  valor1=tQuantidade.getText();
           valor1=valor1.substring(0, valor1.length()-1);
           tQuantidade.setText(valor1);
           tQuantidade.requestFocus();}

    }//GEN-LAST:event_bDefdescontoActionPerformed

    
    private void bNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoClienteActionPerformed
     CadCliente1 ccli=new CadCliente1(new JFrame(),true,usu) ;   
      ccli.setVisible(true);
       List listaCliente= new ClienteDao().listarNomes();
        new ComboboxPreencher().preencheCombo(cCliente, listaCliente);
    }//GEN-LAST:event_bNovoClienteActionPerformed

    private void tQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tQuantidadeActionPerformed
       if(tQuantidade.isFocusable())tQuantidade.setBackground(Color.WHITE);
    }//GEN-LAST:event_tQuantidadeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
        int qua=-1;
                try{
           qua=Integer.parseInt(tQuantidade.getText());
           }catch(NumberFormatException ex){lqua.setVisible(true);  tocarSom("naoavanca");}
      if(rVenda.isSelected()==true){
          if(qua >0)
          { lbLancamento.setText(listaItems.size()+1+"");
         lqua.setVisible(false);
     preencheListas(criarItemVenda());
     tQuantidade.setText("");
     Total();}else 
          {lqua.setVisible(true);
          tocarSom("naoavanca");}
      }           
    else 
    if(rCotacao.isSelected()==true){
        
         if(qua >0)
         {
             lqua.setVisible(false);
             lbLancamento.setText(listaItems.size()+1+"");
     preencheListas(criarItemCotacao());
     tQuantidade.setText("");
      Total();} else { lqua.setVisible(true);  tocarSom("naoavanca");
         Thread t =new Thread();
             try {
                 t.sleep(2000);
                 lqua.setVisible(false);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Venda1.class.getName()).log(Level.SEVERE, null, ex);
             }
            
         }
    }else JOptionPane.showMessageDialog(null,"seleciona a modalidade de venda");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         cancelLancamento();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cProdutoActionPerformed

    private void cProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cProdutoItemStateChanged
          String nome=   (String) cProduto.getSelectedItem();
    lNomeProduto.setText(nome);
    List lista= new ProdutoDao().pesquisaPeloNome(nome);
    for(int i=0;i<lista.size();i++){
        Produto pro= (Produto) lista.get(i);
       lCustoUnitario.setText(pro.getValorVenda()+""); 
       lUnidade.setText(pro.getUnidade());
    } 
  
    }//GEN-LAST:event_cProdutoItemStateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
        if(listaItems.size()>0)
        {  venda();
          totall=Double.parseDouble(lbCustoTotal.getText());
   
   pag = new Pagamento(new JFrame(),true,totall,ve1 );
               pag.setVisible(true);
               ve1=null;
               if(pag. pago==true)
               {  listaItems.removeAll(listaItems);
               lbCustoTotal.setText("0.0");
              lbLancamento.setText("0");
               precherTabelaFalsa();
               
               }
                   
        }
        else
         JOptionPane.showMessageDialog(rootPane, "Nao existe nenhum produto por  vender!","Erro",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void rVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rVendaActionPerformed
        if(rVenda.isSelected())
        {     rCotacao.setEnabled(false);
        rPedidos.setEnabled(false);}
    }//GEN-LAST:event_rVendaActionPerformed

    private void rPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPedidosActionPerformed
        if(rPedidos.isSelected())
        {     rCotacao.setEnabled(false);
        rVenda.setEnabled(false);}
    }//GEN-LAST:event_rPedidosActionPerformed

    private void rCotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCotacaoActionPerformed
       if(rCotacao.isSelected()){
       rVenda.setEnabled(false);
       rPedidos.setEnabled(false);
       }
    }//GEN-LAST:event_rCotacaoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
       if(!rVenda.isEnabled())
       rVenda.setEnabled(true);
       if(!rCotacao.isEnabled())
       rCotacao.setEnabled(true);
       if(!rPedidos.isEnabled())
       rPedidos.setEnabled(true);
       
       
       rVenda.setSelected(false);
       rCotacao.setSelected(false);
       rPedidos.setSelected(false);
        
        listaItems.removeAll(listaItems);
        lbCustoTotal.setText("0.0");
        lbLancamento.setText("0");
      precherTabelaFalsa();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
     valor1=tQuantidade.getText();
     valor1+=b7.getText(); 
     tQuantidade.setText(valor1);
     tQuantidade.requestFocus();
    }//GEN-LAST:event_b7ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
           valor1+=b6.getText(); 
           tQuantidade.setText(valor1);
          tQuantidade.requestFocus();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b7KeyTyped

    }//GEN-LAST:event_b7KeyTyped

    private void b7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseClicked

     
    }//GEN-LAST:event_b7MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       if(listaItems.size()>0){
           JOptionPane.showMessageDialog(rootPane, " primeiro preciona o botao reiniciar", "Aviso",JOptionPane.INFORMATION_MESSAGE);
           setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       }
          else dispose();
    }//GEN-LAST:event_formWindowClosing

    private void cClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cClienteActionPerformed

    private void b8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b8KeyTyped
 
    }//GEN-LAST:event_b8KeyTyped

    private void b9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b9KeyTyped
      valor1+=b9.getText(); 
 tQuantidade.setText(valor1);
  tQuantidade.requestFocus();
    }//GEN-LAST:event_b9KeyTyped

    private void b4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b4KeyTyped
       valor1+=b4.getText(); 
 tQuantidade.setText(valor1);
  tQuantidade.requestFocus();
    }//GEN-LAST:event_b4KeyTyped

    private void b5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b5KeyTyped
       valor1+=b5.getText(); 
 tQuantidade.setText(valor1);
  tQuantidade.requestFocus();
    }//GEN-LAST:event_b5KeyTyped

    private void b6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b6KeyTyped
        valor1+=b6.getText(); 
 tQuantidade.setText(valor1);
 tQuantidade.requestFocus();
    }//GEN-LAST:event_b6KeyTyped

    private void b1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b1KeyTyped
      valor1+=b1.getText(); 
 tQuantidade.setText(valor1);
  tQuantidade.requestFocus();
    }//GEN-LAST:event_b1KeyTyped

    private void b2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b2KeyTyped
     valor1+=b2.getText(); 
 tQuantidade.setText(valor1);
 // tQuantidade.requestFocus();
    }//GEN-LAST:event_b2KeyTyped

    private void b3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b3KeyTyped
       valor1+=b3.getText(); 
 tQuantidade.setText(valor1);
  tQuantidade.requestFocus();
    }//GEN-LAST:event_b3KeyTyped

    private void b8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseClicked

    }//GEN-LAST:event_b8MouseClicked

    private void b9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseClicked
 
    }//GEN-LAST:event_b9MouseClicked

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
  
    }//GEN-LAST:event_b4MouseClicked

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
 
    }//GEN-LAST:event_b5MouseClicked

    private void b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseClicked
 
    }//GEN-LAST:event_b6MouseClicked

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
 
    }//GEN-LAST:event_b1MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked

    }//GEN-LAST:event_b2MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
       
    }//GEN-LAST:event_b3MouseClicked

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        valor1=tQuantidade.getText();
        valor1+=b8.getText(); 
        tQuantidade.setText(valor1);
        tQuantidade.requestFocus();
    }//GEN-LAST:event_b8ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
          valor1=tQuantidade.getText();
          valor1+=b3.getText(); 
          tQuantidade.setText(valor1);
          tQuantidade.requestFocus();
    }//GEN-LAST:event_b3ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
          valor1=tQuantidade.getText();
          valor1+=b9.getText(); 
          tQuantidade.setText(valor1);
          tQuantidade.requestFocus();
    }//GEN-LAST:event_b9ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
           valor1=tQuantidade.getText();
           valor1+=b4.getText(); 
           tQuantidade.setText(valor1);
           tQuantidade.requestFocus();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
             valor1=tQuantidade.getText();
             valor1+=b5.getText(); 
             tQuantidade.setText(valor1);
             tQuantidade.requestFocus();
    }//GEN-LAST:event_b5ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
            valor1=tQuantidade.getText(); 
            valor1+=b1.getText(); 
            tQuantidade.setText(valor1);
            tQuantidade.requestFocus();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
             valor1=tQuantidade.getText();
             valor1+=b2.getText(); 
             tQuantidade.setText(valor1);
             tQuantidade.requestFocus();
    }//GEN-LAST:event_b2ActionPerformed

    private void tQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tQuantidadeKeyPressed

    }//GEN-LAST:event_tQuantidadeKeyPressed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
             valor1=tQuantidade.getText();
             valor1+=b0.getText(); 
             tQuantidade.setText(valor1);
             tQuantidade.requestFocus();
    }//GEN-LAST:event_b0ActionPerformed


    private Venda criarVenda(){   //este metodo e usado para criar o objeto venda
  
         Venda ve= new Venda();
         String cli= (String) cCliente.getSelectedItem(); //a venda precisa de um cliente e e buscado no combobox
         try{
         ve.setCliente(new ClienteDao().buscarCliente(cli));
         }catch(NullPointerException e){ve.setCliente(null);}
         ve.setCustoTotal(0.0);
         ve.setUsuario(usu);
         ve.setDataEHora(new Date());
     return ve;    
    
    }
   
      private Venda criarVendaESalvar(){
  
         Venda ve= new Venda();
         String cli= (String) cCliente.getSelectedItem();
         try{
         ve.setCliente(new ClienteDao().buscarCliente(cli));
         }catch(NullPointerException e){ve.setCliente(null);}
         ve.setCustoTotal(0.0);
         ve.setUsuario(usu);
         ve.setDataEHora(new Date());
         new VendaDao().salvar(ve); 
     return ve;    
    
    }
    
      private ItemVenda criarItemVenda() {

        Produto p = new ProdutoDao().buscarProdutoN((String) cProduto.getSelectedItem());
        int quaP= p.getQuantidade();
        ItemVenda itV = new ItemVenda();
        int quant = Integer.parseInt(tQuantidade.getText());
        
        if(quaP>=quant){   
        itV.setQuantidade(quant);
        itV.setVenda(criarVenda());
        itV.setProduto(p);
        itV.setSubtotal(quant * p.getValorVenda());
        
        Produto pro= new Produto();
        
        pro.setIdProduto(p.getIdProduto());
        pro.setCodigoBarras(p.getCodigoBarras());
        pro.setDesconto(p.getDesconto());
        pro.setEstoqueMax(p.getEstoqueMax());
        pro.setEstoqueMin(p.getEstoqueMin());
        pro.setNomeProduto(p.getNomeProduto());
        pro.setQuantidade(quaP-quant);
        pro.setUnidade(p.getUnidade());
        pro.setValorCompra(p.getValorCompra());
        pro.setValorVenda(p.getValorVenda());
        pro.setTipoproduto(p.getTipoproduto());
        pro.setValidade(p.getValidade()); 
       
        new ProdutoDao().actualizar(pro);
       }else
        JOptionPane.showMessageDialog(rootPane, "A quantidade Solicitada é supeior a disponivel!"
    + "\napenas tem disponivel "+p.getQuantidade()+" "+p.getUnidade() ,"AVISO",JOptionPane.INFORMATION_MESSAGE); 
         
            if(quaP==0)
            JOptionPane.showMessageDialog(rootPane, "Lista vazia!","AVISO",JOptionPane.INFORMATION_MESSAGE);
             
        return itV;
    }
      
      
      private ItemVenda criarItemCotacao() {

        Produto p = new ProdutoDao().buscarProdutoN((String) cProduto.getSelectedItem());
        int quaP= p.getQuantidade();
        
        ItemVenda itV = new ItemVenda();
       
        int quant = Integer.parseInt(tQuantidade.getText());
        if(quaP>=quant){
            
        itV.setQuantidade(quant);
        itV.setVenda(criarVenda());
        itV.setProduto(p);
        itV.setSubtotal(quant * p.getValorVenda());
        
       
       }else
        JOptionPane.showMessageDialog(rootPane, "A quantidade Solicitada e supeior a disponivel!",
        "ERRO",JOptionPane.ERROR_MESSAGE); 
         
     
             
        return itV;
    }
        
      private void preencheListas(ItemVenda itV){
     boolean b= false;
   
     if(itV.getQuantidade()>0){
       for(int j=0;j<listaItems.size();j++)
        if(listaItems.get(j).getProduto().getIdProduto().equals(itV.getProduto().getIdProduto()))
          {
          ItemVenda it=new ItemVenda();
          it.setQuantidade(itV.getQuantidade()+listaItems.get(j).getQuantidade());
          it.setSubtotal(itV.getSubtotal()+listaItems.get(j).getSubtotal());
          it.setId(itV.getId());
          it.setProduto(itV.getProduto());
          it.setVenda(itV.getVenda());
          
          listaItems.remove(j);
          listaItems.add(j, it);
            b=true;
          break;
          }
       
       if(b==false) 
       listaItems.add(itV);
      actualizarTabela(listaItems);
     }
    }
      
      
      private void precherTabelaFalsa(){
       ArrayList dados= new ArrayList();
       String [] colunas= new String[]{""};
        try{
        Modelo     modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
         tabela.getColumnModel().getColumn(0).setPreferredWidth(0);
         }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);
         }
       
      }
     private void actualizarTabela(List listaItems) {
       
        ArrayList dados= new ArrayList();
       String [] colunas= new String[]{"NOME DO PRODUTO","QUANTIDADE","UNIDADE DE MEDIDA","SUBTOTAL"};
      
       for(int i=0;i<listaItems.size();i++){
           ItemVenda item= (ItemVenda) listaItems.get(i);
              Object[] ob= new Object[]{item.getProduto().getNomeProduto(),item.getQuantidade(),
              item.getProduto().getUnidade(),item.getSubtotal()};
                dados.add(ob);
        }
           
       try{
        Modelo     modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
         }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);
         }
    
        tabela.getColumnModel().getColumn(0).setPreferredWidth(355);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(210);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(220);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(310);
        tabela.getColumnModel().getColumn(3).setResizable(false);
        
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabela.setRowHeight(25);
        
        
   }
     
       private void cancelLancamento(){
    
    List<ItemVenda> item= new ArrayList<ItemVenda>();
        
      for(int i=0;i<tabela.getRowCount();i++)
         if(tabela.isRowSelected(i))
          item.add(listaItems.get(tabela.getSelectedRow()));
       
      
      
     for(int j=0;j<item.size();j++){
      Produto p= new ProdutoDao().buscarProduto(item.get(j).getProduto().getIdProduto());
      Produto pro= new Produto();
             
        pro.setIdProduto(p.getIdProduto());
        pro.setCodigoBarras(p.getCodigoBarras());
        pro.setDesconto(item.get(j).getProduto().getDesconto());
        pro.setEstoqueMax(item.get(j).getProduto().getEstoqueMax());
        pro.setEstoqueMin(item.get(j).getProduto().getEstoqueMin());
        pro.setNomeProduto(p.getNomeProduto());
      
        pro.setQuantidade(p.getQuantidade()+item.get(j).getQuantidade());
        pro.setUnidade(item.get(j).getProduto().getUnidade());
        pro.setValorCompra(item.get(j).getProduto().getValorCompra());
        pro.setValorVenda(item.get(j).getProduto().getValorVenda());
        pro.setTipoproduto(item.get(j).getProduto().getTipoproduto());
        pro.setValidade(item.get(j).getProduto().getValidade()); 
      
        new ProdutoDao().actualizar(pro); 
      } 
     
   for(int i=0;i<listaItems.size();i++){
    for(int j=0;j<item.size();j++){
     if(listaItems.get(i).getProduto().getIdProduto().equals(item.get(j).getProduto().getIdProduto()))
     listaItems.remove(i);
            }   
       }
        actualizarTabela(listaItems);
         Total();
         lbLancamento.setText(listaItems.size()+"");
    }
      
   
       
       
     private void venda(){
   
   Venda ven  =criarVendaESalvar();//faz se o registro da venda nesse momento mas sem o valor total da venda 
                                   //o valor totall ainda e 00.
       
   
       
        for (ItemVenda listaItem : listaItems) {
            ItemVenda iv= new ItemVenda();
            ItemVendaId  itvID = new ItemVendaId();
            iv.setProduto(listaItem.getProduto());
            iv.setQuantidade(listaItem.getQuantidade());
            iv.setSubtotal(listaItem.getSubtotal());
            iv.setVenda(ven);
            itvID.setIdProduto(listaItem.getProduto().getIdProduto());
            itvID.setIdVenda(ven.getIdVenda());
            iv.setId(itvID);
            new ItemvendaDao().gravarItemVenda(iv);//efectua se o registro dos itemes selecionados ou seja os produtos
                                                   //e a sua respectiva venda
        }
        
    ve1=new Venda();
    ve1.setCliente(ven.getCliente());
    ve1.setCustoTotal(Double.parseDouble(lbCustoTotal.getText()));
    ve1.setDataEHora(ven.getDataEHora());
    ve1.setUsuario(ven.getUsuario());
    ve1.setIdVenda(ven.getIdVenda());
    new VendaDao().actualizar(ve1);//actualiza se a venda ja com o valor total de todos os produtos selecionados
    
  }     
    
 
    
          public void tocarSom(String som){
     URL url= DefinirDesconto1.class.getResource(som+".wav"); 
     AudioClip audio = Applet.newAudioClip(url);
   audio.play();
   }
          
 private void Total(){
 
    double total=0; 
    int linha= tabela.getRowCount()+1;
    if(tabela.getRowCount()>0)
    for(int i=0;i<linha-1;i++){
    double subtotal= (Double) tabela.getValueAt(i, 3);
         total=total+subtotal; 
             lbCustoTotal.setText(total+"");   
          } else  lbCustoTotal.setText("0.0"); 
} 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bDefdesconto;
    private javax.swing.JButton bNovoCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cCliente;
    private javax.swing.JComboBox cProduto;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCustoUnitario;
    private javax.swing.JLabel lNomeProduto;
    private javax.swing.JLabel lUnidade;
    private javax.swing.JLabel lbCustoTotal;
    private javax.swing.JLabel lbLancamento;
    private javax.swing.JLabel lqua;
    private javax.swing.JPanel pproduto;
    private javax.swing.JRadioButton rCotacao;
    private javax.swing.JRadioButton rPedidos;
    private javax.swing.JRadioButton rVenda;
    private javax.swing.JTextField tQuantidade;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
