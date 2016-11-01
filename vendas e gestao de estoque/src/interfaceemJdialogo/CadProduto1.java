/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceemJdialogo;

import DaoClasse.FornecedorDao;
import DaoClasse.ProdutoDao;
import DaoClasse.ProdutoFornecedorDao;
import DaoClasse.TipoprodutoDao;
import Modelo.Fornecedor;
import Modelo.Produto;
import Modelo.ProdutoFornecedor;
import Modelo.RelatorioEntrada;
import Modelo.Usuario;
import abstratclass.ComboboxPreencher;
import DaoClasse.Metodos;
import DaoClasse.RelatorioEntradaDao;
import Modelo.Tipoproduto;
import abstratclass.Modelo;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Font;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javassist.CtMethod;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author ILIDIOP
 */
@SuppressWarnings("serial")
public class CadProduto1 extends javax.swing.JDialog {
  
    private List listaTipo;
    private TipoprodutoDao  dao;
    private  List<Produto> lisprof;
    private Usuario usu;
    private Produto prod;
    
   boolean alterar= false; 
    @SuppressWarnings("unchecked")
    public CadProduto1(java.awt.Frame parent, boolean modal,Usuario u) {
        super(parent, modal);
        initComponents();
     setUsu(u);
       
        dao=new TipoprodutoDao();
         listaTipo=  dao.listarNomes();
         List listaForne=  new FornecedorDao().listarNomes();
     listaForne.add(0, "");
           new ComboboxPreencher().preencheCombo(cTipoProduto, listaTipo);
     new ComboboxPreencher().preencheCombo(cFornecedor, listaForne); 
        
          
        bAtualizar.setVisible(u.getPerfil().getUsuarioPerfil().isActualizarUsuario());
        bRegistar.setVisible(u.getPerfil().getUsuarioPerfil().isCadastrarUsuario());
        bRemover.setVisible(u.getPerfil().getUsuarioPerfil().isExcluirUsuario());
        
        setLocationRelativeTo(null);
        JTableHeader header = tabela.getTableHeader();
        header.setFont(new Font("Serif",Font.PLAIN,13));
        //header.setBackground(Color.ORANGE);
        
        preencherTabela();
        bAcrescimo.setVisible(false);
         cValidade.setDate(new Date());
         
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tPesquisa = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tVaCompra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tVaVenda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tEstMax = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tEstMin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tQuantidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cTipoProduto = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        cFornecedor = new javax.swing.JComboBox();
        tMedida = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cValidade = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        bRegistar = new javax.swing.JButton();
        bRemover = new javax.swing.JButton();
        bAtualizar = new javax.swing.JButton();
        bNovo = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        bAcrescimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 51));
        jLabel12.setText("REGISTO DOS PRODUTOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255))));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/search1.png"))); // NOI18N

        tPesquisa.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tPesquisaKeyReleased(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255))));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Valor de Compra:");

        tVaCompra.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tVaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tVaCompraActionPerformed(evt);
            }
        });
        tVaCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tVaCompraKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Valor de venda:");

        tVaVenda.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tVaVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tVaVendaKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setText("Estoque maximo");

        tEstMax.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        tEstMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tEstMaxMouseExited(evt);
            }
        });
        tEstMax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tEstMaxKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Estoque minimo");

        tEstMin.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        tEstMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEstMinActionPerformed(evt);
            }
        });
        tEstMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tEstMinKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Quantidade:");

        tQuantidade.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        tQuantidade.setText("0");
        tQuantidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tQuantidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tQuantidadeMouseExited(evt);
            }
        });
        tQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tQuantidadeKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setText("MT");

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel15.setText("MT");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tVaVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(tVaCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(10, 10, 10)
                        .addComponent(tEstMin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tEstMax, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addComponent(tQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tEstMax, tEstMin});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tVaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel11))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addComponent(tEstMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tVaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel15))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tEstMin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(0, 11, Short.MAX_VALUE))
        );

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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Dados do produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Produto:");

        tDescricao.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tDescricaoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Unidade :");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de produto:");

        cTipoProduto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel14.setText("Fornecedor");

        tMedida.setEditable(true);
        tMedida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kg", "Litros", "gramas", "Saco" }));
        tMedida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tMedidaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Validade:");

        cValidade.setBackground(new java.awt.Color(255, 255, 255));
        cValidade.setDateFormatString("d/ MM/ yyyy");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Codigo:");

        tCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tCodigoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel14)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tMedida, 0, 300, Short.MAX_VALUE)
                    .addComponent(cTipoProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cValidade, tCodigo, tDescricao});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(4, 4, 4)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(cValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cFornecedor, cTipoProduto, tDescricao, tMedida});

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

        bAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Refresh.png"))); // NOI18N
        bAtualizar.setText("Atualizar");
        bAtualizar.setEnabled(false);
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        bNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Script-Edit.png"))); // NOI18N
        bNovo.setText("Novo");
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Undo.png"))); // NOI18N
        jButton5.setText("Voltar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        bAcrescimo.setText("Acresc");
        bAcrescimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAcrescimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bRegistar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bAcrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bAtualizar, bNovo, bRegistar, bRemover, jButton5});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(tPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRegistar)
                    .addComponent(bRemover)
                    .addComponent(bAtualizar)
                    .addComponent(jButton5)
                    .addComponent(bNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAcrescimo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bAtualizar, bNovo, bRegistar, bRemover, jButton5});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
        limpar();
        tCodigo.requestFocus();
        bAtualizar.setEnabled(false);
        bRemover.setEnabled(false);
        bRegistar.setEnabled(true);
        bAcrescimo.setVisible(false);
        butaoNovo();
        preencherTabela();
    }//GEN-LAST:event_bNovoActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
    
                @SuppressWarnings("unchecked")
       List<RelatorioEntrada> l = new RelatorioEntradaDao().listarTodoRelatorios() ;
        ArrayList<RelatorioEntrada> ll=new ArrayList<RelatorioEntrada>();
    RelatorioEntrada   entra = new RelatorioEntrada();
        
    
        if(alterar==false)
       {      int opcao;
            Object[] botoes = {" Introdur nova quantidade","Modificar dados"};
            opcao = JOptionPane.showOptionDialog(null,
                "selecioma uma das  alrenativas?",
                "   ",0,
                JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);
        
    if (opcao==0){           
   tQuantidade.setEnabled(true);
   tQuantidade.requestFocus();
   bAcrescimo.setVisible(true);
   bAtualizar.setEnabled(false);
   bRemover.setEnabled(false);
   tQuantidade.setText(null);
    }else{
    
   
        
           for (RelatorioEntrada l1 : l) 
               if (l1.getProduto().getIdProduto().equals(prod.getIdProduto())) {
                    ll.add(l1);
               }
           
                     entra = ll.get(ll.size()-1);
                     
                   prod.setQuantidade(entra.getAcrescimo());
                   preencherCampos(prod,tabela.getSelectedRow());
                   
       alterar=true;    
    butaoNovo();
   
    }
       }else
       
       {
           
           
           for (RelatorioEntrada l1 : l) 
               if (l1.getProduto().getIdProduto().equals(prod.getIdProduto())) {
                    ll.add(l1);
               }
           
            entra = ll.get(ll.size()-1);
           
            Fornecedor f= new FornecedorDao().buscarForneloNome(cFornecedor.getSelectedItem().toString());
            Tipoproduto t=    new TipoprodutoDao().buscarTipoPeloNome(cTipoProduto.getSelectedItem().toString());
            int anter =entra.getQuantAnteriorR();
            
         entra.setAcrescimo(Integer.parseInt(tQuantidade.getText()));
         entra.setQuantAnteriorR(anter+Integer.parseInt(tQuantidade.getText()));
         Produto p= criarProduto(t);
         p.setIdProduto(entra.getProduto().getIdProduto());
         p.setQuantidade(entra.getQuantidadePosteriorR());
        
         new ProdutoDao().actualizar(p);
         Produto p1=new ProdutoDao().buscarProdloNome(tDescricao.getText());
         entra.setProduto(p1);
         new RelatorioEntradaDao().actualizar(entra);
        
      
        
         alterar=false;
         preencherTabela();
         limpar();
         bAcrescimo.setVisible(false);
       }
   
    }//GEN-LAST:event_bAtualizarActionPerformed

    private void bRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverActionPerformed

        if( tabela.getSelectedRow()>=0){

            int opcao;
            Object[] botoes = {"Sim","Nao"};
            opcao = JOptionPane.showOptionDialog(null,
                "Deseja mesmo eliminar?",
                "Sair",0,
                JOptionPane.QUESTION_MESSAGE,null,botoes,botoes[0]);

            
    if (opcao==0){
                int pos= tabela.getSelectedRow();
               if(pos>=0){
   String n=tabela.getValueAt(pos, 1).toString();
   Produto p= new ProdutoDao().buscarProdloNome(n);
  new ProdutoDao().apagarProduto(p);
   preencherTabela();
    limpar();
    bAcrescimo.setVisible(false);
     prod=null;  
               }
    }
        }else
        JOptionPane.showMessageDialog(null,"Seleciona uma linha por favor ","ERRO",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_bRemoverActionPerformed

    private void bRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistarActionPerformed
     boolean b =false;  //controla se  o produto a res registado ja existe
     boolean g = false;//controla se e pela primeira vez que se cadastra o produto
       
        if(validarProduto1()){
           Tipoproduto t=    new TipoprodutoDao().buscarTipoPeloNome(cTipoProduto.getSelectedItem().toString());
       Fornecedor f= new FornecedorDao().buscarForneloNome(cFornecedor.getSelectedItem().toString());
            if(t==null) //verifica se existe um tipo de produto cadastrado para nao dar erro
               JOptionPane.showMessageDialog(null, "! precisa de cadastrar o tipo de produto");
            
         for (Produto lisprof1 : lisprof) 
             if (lisprof1.getNomeProduto().equalsIgnoreCase(tDescricao.getText())) {
                 JOptionPane.showMessageDialog(null, "! este produto ja foi cadastrado");b=true; break;
             }
         
       
         for (Produto lisprof1 : lisprof) 
             if (lisprof1.getNomeProduto().equals(tDescricao.getText())) {
                 g=true;break;
             }
         
      
       
            if(b==false) 
                if(ValidarData()==true)
             {  
                
   new ProdutoFornecedorDao().gravarProdutoFornecedor( criarProdutoFornecedor(criarProduto(t),f));
  Produto ppp= new ProdutoDao().buscarProdloNome(tDescricao.getText());
   Metodos.salvar( criarREntrada(ppp,g));
   
                 preencherTabela();
                  limpar();   
              } else JOptionPane.showMessageDialog(null, "!verifica a validade do produto");
        }  else JOptionPane.showMessageDialog(null, "! um ou mais campos nao esta corretamente preenchido ");

  
        
    }//GEN-LAST:event_bRegistarActionPerformed

    private void tabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyPressed

    }//GEN-LAST:event_tabelaKeyPressed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

        if(this.isSelected()) {
             bAtualizar.setEnabled(true);
            bRemover.setEnabled(true); 
             fecharCampos();
            String Nome=  (tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            prod= new ProdutoDao().buscarProdutoN(Nome);
            preencherCampos(prod,tabela.getSelectedRow());
            bRegistar.setEnabled(false);
               alterar=false;      
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void tQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tQuantidadeKeyTyped
        char c= evt.getKeyChar();

        if(c<'0'||c>'9'){
            evt.consume();
            tocarSom("naoavanca");
        }
    }//GEN-LAST:event_tQuantidadeKeyTyped

    private void tQuantidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tQuantidadeMouseExited
        try{int e= Integer.parseInt(tEstMax.getText());
            int min=Integer.parseInt(tEstMin.getText());
            int qua=Integer.parseInt(tQuantidade.getText());
            Produto pA=   new  ProdutoDao().buscarProdutoN(tDescricao.getText());
            if(pA!=null)
            {  if(e >pA.getEstoqueMax()||e<qua)
                JOptionPane.showMessageDialog(null, "! O valor introduzido supera estoque maximo deste produto ");
                else  if(min>pA.getEstoqueMin()||min> qua )
                JOptionPane.showMessageDialog(null, "! O valor introduzido e inferior ao estoque minimo deste produto ");
            }else   { if(e<qua)
                JOptionPane.showMessageDialog(null, "! O valor introduzido supera estoque maximo deste produto ");
                else if(min> qua )
                JOptionPane.showMessageDialog(null, "! O valor introduzido e inferior ao estoque minimo deste produto ");
            }
        }catch(NumberFormatException e){  }
    }//GEN-LAST:event_tQuantidadeMouseExited

    private void tQuantidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tQuantidadeMouseEntered
        tQuantidade.setText(""); tQuantidade.requestFocus();
    }//GEN-LAST:event_tQuantidadeMouseEntered

    private void tEstMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tEstMinKeyTyped
        char c= evt.getKeyChar();

        if(c<'0'||c>'9'){
            evt.consume();
            tocarSom("naoavanca");
        }
    }//GEN-LAST:event_tEstMinKeyTyped

    private void tEstMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEstMinActionPerformed

    }//GEN-LAST:event_tEstMinActionPerformed

    private void tEstMaxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tEstMaxKeyTyped
        char c= evt.getKeyChar();

        if(c<'0'||c>'9'){
            evt.consume();
            tocarSom("naoavanca");
        }
    }//GEN-LAST:event_tEstMaxKeyTyped

    private void tEstMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tEstMaxMouseExited

    }//GEN-LAST:event_tEstMaxMouseExited

    private void tVaVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tVaVendaKeyTyped
        char c= evt.getKeyChar();

        if(c<'0'||c>'9'){
            evt.consume();
            tocarSom("naoavanca");
        }
    }//GEN-LAST:event_tVaVendaKeyTyped

    private void tVaCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tVaCompraKeyTyped
        char c= evt.getKeyChar();

        if(c<'0'||c>'9'){
            evt.consume();
            tocarSom("naoavanca");
        }
    }//GEN-LAST:event_tVaCompraKeyTyped

    private void tVaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tVaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tVaCompraActionPerformed

    private void tPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPesquisaKeyReleased
        preencherTabelaPesquisa();
    }//GEN-LAST:event_tPesquisaKeyReleased

    private void tCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCodigoKeyTyped
  char c= evt.getKeyChar();

        if(c<'0'||c>'9'){
            evt.consume();
            tocarSom("naoavanca");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tCodigoKeyTyped

    private void tDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tDescricaoKeyTyped
      char c= evt.getKeyChar();

        if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
           
        }       
    }//GEN-LAST:event_tDescricaoKeyTyped

    private void tMedidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tMedidaKeyTyped
             char c= evt.getKeyChar();

        if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
           
        }
    }//GEN-LAST:event_tMedidaKeyTyped

    private void bAcrescimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAcrescimoActionPerformed
                  
        if( tabela.getSelectedRow()>=0){
            if(validarProduto1()){
        Tipoproduto t=    new TipoprodutoDao().buscarTipoPeloNome(cTipoProduto.getSelectedItem().toString());      
        Fornecedor f= new FornecedorDao().buscarForneloNome(cFornecedor.getSelectedItem().toString());
          
        
         new ProdutoDao().actualizar(criarProdutoId(t,prod));
         Produto ppp=new ProdutoDao().buscarProdloNome(tDescricao.getText());
         Metodos.salvar( criarREntrada(ppp,true));
          limpar();
        tCodigo.requestFocus();
        bAtualizar.setEnabled(false);
        bRemover.setEnabled(false);
        bRegistar.setEnabled(true);
        bAcrescimo.setVisible(false);
        butaoNovo();
        preencherTabela();
         
            prod=null;
            }
        }else
        JOptionPane.showMessageDialog(null,"Seleciona uma linha por favor ","ERRO",JOptionPane.ERROR_MESSAGE);
    
    }//GEN-LAST:event_bAcrescimoActionPerformed

    
     private void butaoNovo(){
    tDescricao.setEnabled(true);
    tEstMax.setEnabled(true);
    tEstMin.setEnabled(true);
    tVaCompra.setEnabled(true);
    tVaVenda.setEnabled(true);
    tMedida.setEnabled(true);
    tCodigo.setEnabled(true);
    tQuantidade.setEnabled(true);
    cValidade.setEnabled(true);
    cFornecedor.setEnabled(true);
    cTipoProduto.setEnabled(true);
   
    }
     
       public void tocarSom(String som){
     URL url= CadProduto1.class.getResource(som+".wav"); 
     AudioClip audio = Applet.newAudioClip(url);
   audio.play();
   }
       
    @SuppressWarnings("unchecked")
  public void preencherTabelaPesquisa(){
      
                     TextAutoCompleter auto= new TextAutoCompleter(tPesquisa);
                            ArrayList dados= new ArrayList();
                 String [] colunas= {"CODIGO","DESCRICAO","FORNECEDOR","QUANTIDADE","UNIDADE","V.COMPRA",
                   "V.VENDA","VALIDADE"};
           lisprof= new ProdutoDao().pesquisaPeloNome1(tPesquisa.getText());
             
        for (Produto lisprof1 : lisprof) {
            String n=null;
            Produto pf = lisprof1; 
            try{
       
            if(pf.getProdutoFornecedor()!=null)
           n=pf.getProdutoFornecedor().getFornecedor().getNomeFornecedor();
            }catch(NullPointerException e){}
            
            auto.addItem(pf.getNomeProduto());
            Object[] pfp= new Object[]{pf.getCodigoBarras(),pf.getNomeProduto(),n
                    ,pf.getQuantidade(),pf.getUnidade(),pf.getValorCompra(),pf.getValorVenda(),pf.getValidade()};
            dados.add(pfp);
        }
           
       try{
        Modelo     modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
         }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);}
        tabela.getColumnModel().getColumn(0).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(0).setResizable(false);
         tabela.getColumnModel().getColumn(1).setPreferredWidth(170);
        tabela.getColumnModel().getColumn(1).setResizable(false);
         tabela.getColumnModel().getColumn(2).setPreferredWidth(160);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(3).setResizable(false);
         tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(4).setResizable(false);
         tabela.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(5).setResizable(false);
         tabela.getColumnModel().getColumn(6).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(6).setResizable(false);
         tabela.getColumnModel().getColumn(7).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(7).setResizable(false);
    
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        tabela.setRowHeight(25);    
}
  
    @SuppressWarnings({"unchecked", "unchecked"})
       public void preencherTabela(){
                ArrayList dados= new ArrayList();
                 String [] colunas= {"CODIGO","DESCRICAO","FORNECEDOR","QUANTIDADE","UNIDADE","V.COMPRA",
                   "V.VENDA","VALIDADE"};
           lisprof= new ProdutoDao().listarTodos();
             
        for (Produto lisprof1 : lisprof) {
            String n=null;
            Produto pf = lisprof1; 
            try{
       
            if(pf.getProdutoFornecedor()!=null)
           n=pf.getProdutoFornecedor().getFornecedor().getNomeFornecedor();
            }catch(NullPointerException e){}
            Object[] pfp= new Object[]{pf.getCodigoBarras(),pf.getNomeProduto(),n
                    ,pf.getQuantidade(),pf.getUnidade(),pf.getValorCompra(),pf.getValorVenda(),pf.getValidade()};
            dados.add(pfp);
        }
           
       try{
        Modelo     modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
         }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);}
        tabela.getColumnModel().getColumn(0).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(0).setResizable(false);
         tabela.getColumnModel().getColumn(1).setPreferredWidth(170);
        tabela.getColumnModel().getColumn(1).setResizable(false);
         tabela.getColumnModel().getColumn(2).setPreferredWidth(160);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(3).setResizable(false);
         tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(4).setResizable(false);
         tabela.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(5).setResizable(false);
         tabela.getColumnModel().getColumn(6).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(6).setResizable(false);
         tabela.getColumnModel().getColumn(7).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(7).setResizable(false);
    
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        tabela.setRowHeight(25);
}

               public void fecharCampos(){
              tCodigo.setEnabled(false);
              tEstMax.setEnabled(false);
             tDescricao.setEnabled(false);
             tQuantidade.setEnabled(false);
            tEstMin.setEnabled(false);
            tMedida.setEnabled(false);
            tVaCompra.setEnabled(false);
            tVaVenda.setEnabled(false);
            cFornecedor.setEnabled(false);
            cTipoProduto.setEnabled(false);
            cValidade.setEnabled(false);
        
         }
               
               
               
    public RelatorioEntrada criarREntrada(Produto p,boolean b){
    RelatorioEntrada entrada= new RelatorioEntrada();
  
            if(b)
            { entrada.setQuantAnteriorR(p.getQuantidade());
             entrada.setQuantidadePosteriorR(Integer.parseInt(tQuantidade.getText())+p.getQuantidade());}
           else
            {  entrada.setQuantAnteriorR(0);
          entrada.setQuantidadePosteriorR(Integer.parseInt(tQuantidade.getText()));
            }
   
    entrada.setAcrescimo(Integer.parseInt(tQuantidade.getText()));
    entrada.setData(new Date());
    entrada.setProduto(p);
    return  entrada;
   }  
    
    
     public RelatorioEntrada criarREntradaID(int id,Date data){
       RelatorioEntrada entrada= new RelatorioEntrada();
           
        Produto p =new ProdutoDao().buscarProdutoN(tDescricao.getText());
        if(p!=null)
        {entrada.setQuantAnteriorR(p.getQuantidade());
        entrada.setQuantidadePosteriorR(Integer.parseInt(tQuantidade.getText())+p.getQuantidade());
        }else {
        entrada.setQuantAnteriorR(0);
        entrada.setQuantidadePosteriorR(Integer.parseInt(tQuantidade.getText()));
        }  
       entrada.setAcrescimo(Integer.parseInt(tQuantidade.getText()));
       entrada.setData(data);
       entrada.setIdREntrada(id);
       
    //   entrada.setProdutos();
    return  entrada;
   }  
       
       private Produto criarProduto(Tipoproduto t){           
      Produto produto= new Produto();        
       
      produto.setNomeProduto(tDescricao.getText());
      produto.setTipoproduto(t); 
      produto.setUnidade(tMedida.getSelectedItem().toString());
        
        
         try{
         produto.setCodigoBarras(Integer.parseInt(tCodigo.getText()));
         produto.setValorCompra(Double.parseDouble(tVaCompra.getText()));
         produto.setValorVenda(Double.parseDouble(tVaVenda.getText()));
         produto.setEstoqueMax(Integer.parseInt(tEstMax.getText()));
         produto.setEstoqueMin(Integer.parseInt(tEstMin.getText()));
         produto.setQuantidade(Integer.parseInt(tQuantidade.getText()));
         } catch(NumberFormatException e){}
         
          produto.setDesconto(0.0);
          produto.setValidade(cValidade.getDate());
//new ProdutoDao().salvar(produto);
           return produto;
       }
       
   public Produto criarProdutoId(Tipoproduto t,Produto pp){           
      Produto produto= new Produto();        
       
      produto.setNomeProduto(tDescricao.getText());
      produto.setTipoproduto(t); 
      produto.setUnidade(tMedida.getSelectedItem().toString());
        
        
         try{
         produto.setCodigoBarras(Integer.parseInt(tCodigo.getText()));
         produto.setValorCompra(Double.parseDouble(tVaCompra.getText()));
         produto.setValorVenda(Double.parseDouble(tVaVenda.getText()));
         produto.setEstoqueMax(Integer.parseInt(tEstMax.getText()));
         produto.setEstoqueMin(Integer.parseInt(tEstMin.getText()));
         produto.setQuantidade(Integer.parseInt(tQuantidade.getText())+pp.getQuantidade());
         } catch(NumberFormatException e){}
         
          produto.setDesconto(0.0);
          produto.setValidade(cValidade.getDate());
          produto.setIdProduto(pp.getIdProduto());
           return produto;
       }
       
 
 
  private boolean validarProduto1(){
 if((tDescricao.getText()==null||"".equals(tDescricao.getText())))
         return false;
 else
     if((tQuantidade.getText()==null||"".equals(tQuantidade.getText())))
         return false;
 else
     if(( tEstMax.getText()==null|| "".equals(tEstMax.getText()))) 
         return false;
 else
        if((tEstMin.getText()==null||"".equals(tEstMin.getText()))) 
            return false;
 else
     if(( tCodigo.getText()==null|| "".equals(tCodigo.getText())))
         return false;
         else
       if((tVaCompra.getText()==null||"".equals(tVaCompra.getText()))) 
           return false;
           else
        if((tVaCompra.getText()==null||"".equals(tVaCompra.getText()))) 
            return false;
 else
            return!(tVaVenda.getText()==null||"".equals(tVaVenda.getText()));
 } 
 
 private boolean ValidarData(){
 int dA,mA, aA ,dV,mV, aV; 
 dA= new Date().getDay();
 aA= new Date().getYear();
 mA =new Date().getMonth();
 
 
 dV=cValidade.getDate().getDay();
 mV=cValidade.getDate().getMonth();
 aV=cValidade.getDate().getYear();
 
 if(aA>aV)
return false;
 else if(aA==aV && mA>mV)
     return false;
 else if(aA==aV && mA==mV && dA>dV)
     return false;
 
 return true;
 }
         
          private ProdutoFornecedor criarProdutoFornecedor( Produto pp,Fornecedor f){            
       ProdutoFornecedor pF=new ProdutoFornecedor();
          
                    if(f!=null)
                    { 
                       pF.setFornecedor(f);
                    }else   pF.setFornecedor(null);
                        
             pF.setAuxiliar("Nulo");
             pF.setProduto(pp);
              
     return pF;
          }
          
       private ProdutoFornecedor criarProdutoFornecedorId( Produto pp,Fornecedor f){            
       ProdutoFornecedor pF=new ProdutoFornecedor();
        
                    if(f!=null)
                    {  
                     pF.setFornecedor(f);
                    }else  pF.setFornecedor(null);
                        
             pF.setAuxiliar("Nulo");
             pF.setProduto(pp);
        
    return pF;
          }         
  
    public boolean isSelected(){
        return this.tabela.getSelectedRow()!=-1;
    }
    
   public void preencherCampos(Produto pro,int lin){
     
       tDescricao.setText(pro.getNomeProduto());
      tQuantidade.setText(pro.getQuantidade()+"");
      tEstMax.setText(pro.getEstoqueMax()+"");
      tEstMin.setText(pro.getEstoqueMin()+"");
      tMedida.setSelectedItem(pro.getUnidade());
      tVaCompra.setText(pro.getValorCompra()+"");
      tVaVenda.setText(pro.getValorVenda()+"");
     tCodigo.setText(pro.getCodigoBarras()+"");
 
        cValidade.setDate(pro.getValidade());
        
      cTipoProduto.setSelectedItem(pro.getTipoproduto().getNomeTipo());
      try{
      cFornecedor.setSelectedItem(lisprof.get(lin).getProdutoFornecedor().getFornecedor().getNomeFornecedor());
      }  catch(NullPointerException e){ cFornecedor.setSelectedItem("");}
      }  
   
     public void limpar(){
         tCodigo.setText(null);
         tEstMax.setText(null);
         tDescricao.setText(null);
         tQuantidade.setText("0");
         tEstMin.setText(null);
         tMedida.setSelectedIndex(0);
         tVaCompra.setText(null);
         tVaVenda.setText(null);
         cFornecedor.setSelectedIndex(0);
         cTipoProduto.setSelectedIndex(0);
 
        cValidade.setDate(new Date());
       }  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAcrescimo;
    private javax.swing.JButton bAtualizar;
    private javax.swing.JButton bNovo;
    private javax.swing.JButton bRegistar;
    private javax.swing.JButton bRemover;
    private javax.swing.JComboBox cFornecedor;
    private javax.swing.JComboBox cTipoProduto;
    private com.toedter.calendar.JDateChooser cValidade;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tDescricao;
    private javax.swing.JTextField tEstMax;
    private javax.swing.JTextField tEstMin;
    private javax.swing.JComboBox tMedida;
    private javax.swing.JTextField tPesquisa;
    private javax.swing.JTextField tQuantidade;
    private javax.swing.JTextField tVaCompra;
    private javax.swing.JTextField tVaVenda;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
