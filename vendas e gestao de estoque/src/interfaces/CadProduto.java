/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


import abstratclass.Modelo;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;

/**
 *
 * @author MACUACUA
 */
public class CadProduto extends javax.swing.JFrame {

    /**
     * Creates new form CadProduto
     */
    public CadProduto() {
        initComponents();
        setLocationRelativeTo(null);
  
       
        
      jcFornecedor.addItem("");
      jcFornecedor.addItem("Mario Carlitos Macuacua");
      jcFornecedor.addItem("Ilidio Pedro Muchanga");
         jtQuant.setText("0");        
         jtStockActual.setText("0");
         jtStockMin.setText("0");
         
          JTableHeader header = tabela.getTableHeader();
        header.setFont(new Font("Serif",Font.BOLD,14));
        header.setBackground(Color.ORANGE);
           preencherTabela();  
           lookAndFeel(2);
           
       
    }

           private void lookAndFeel(int a){
   try{
   UIManager.setLookAndFeel(UIManager.getInstalledLookAndFeels()[a].getClassName());
   SwingUtilities.updateComponentTreeUI(this);
   }catch(NullPointerException e){}catch(Exception e){}
   }
    
         public void preencherTabela(){
        ArrayList dados= new ArrayList();
       String [] colunas= {"CODIGO","TIPO DE PRODUTO","DESCRICAO","QUANTIDADE","UNIDADE","V.COMRA","V.VENDA","FORNECEDOR","VALIDADE"};
       try{
        Modelo     modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
         }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);}
    
        tabela.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(0).setResizable(false);
         tabela.getColumnModel().getColumn(1).setPreferredWidth(160);
        tabela.getColumnModel().getColumn(1).setResizable(false);
         tabela.getColumnModel().getColumn(2).setPreferredWidth(150);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(3).setResizable(false);
         tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(4).setResizable(false);
         tabela.getColumnModel().getColumn(5).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(5).setResizable(false);
         tabela.getColumnModel().getColumn(6).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(6).setResizable(false);
         tabela.getColumnModel().getColumn(7).setPreferredWidth(160);
        tabela.getColumnModel().getColumn(7).setResizable(false);
         tabela.getColumnModel().getColumn(8).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(8).setResizable(false);
        
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
   }
         
         private void bNovo(){
         bAtualizar.setEnabled(true);
         bExcluir.setEnabled(true);
         bRegistar.setEnabled(true);
         jtQuant.setEnabled(true);
         jtDescricao.setEnabled(true);
         jtUnidadeMed.setEnabled(true);
         jtStockMin.setEnabled(true);
         jtVendaUnit.setEnabled(true);
         jtCodigo.setEnabled(true);
         jtValorCusto.setEnabled(true);
         jtValidade.setEnabled(true);
         tEstoqueMax.setEnabled(true);
         }
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlDescricao = new javax.swing.JLabel();
        jtDescricao = new javax.swing.JTextField();
        jlValorCusto = new javax.swing.JLabel();
        jlValorVendaUnt = new javax.swing.JLabel();
        jlQuant = new javax.swing.JLabel();
        jlUnidadeMedida = new javax.swing.JLabel();
        jCTipoProduto = new javax.swing.JComboBox();
        jlTipoProduto = new javax.swing.JLabel();
        jtUnidadeMed = new javax.swing.JTextField();
        jtQuant = new javax.swing.JTextField();
        jtVendaUnit = new javax.swing.JTextField();
        jlFornecedor = new javax.swing.JLabel();
        jcFornecedor = new javax.swing.JComboBox();
        jtValorCusto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jlStockMinim = new javax.swing.JLabel();
        jlStockActual = new javax.swing.JLabel();
        jtStockMin = new javax.swing.JTextField();
        jtStockActual = new javax.swing.JTextField();
        tEstoqueMax = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtValidade = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        panelGrupoComplement = new javax.swing.JPanel();
        bRegistar = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        bAtualizar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bNovo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro do Produto");
        setFont(new java.awt.Font("Serif", 1, 14));
        setForeground(new java.awt.Color(51, 255, 51));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(-1,true));
        jPanel1.setForeground(new java.awt.Color(-9511836,true));

        jlDescricao.setFont(new java.awt.Font("Serif", 1, 14));
        jlDescricao.setForeground(new java.awt.Color(-9511836,true));
        jlDescricao.setText("Descricao do Produto");

        jtDescricao.setEnabled(false);
        jtDescricao.setMinimumSize(new java.awt.Dimension(6, 26));
        jtDescricao.setPreferredSize(preferredSize());

        jlValorCusto.setFont(new java.awt.Font("Serif", 0, 18));
        jlValorCusto.setForeground(new java.awt.Color(-9511836,true));
        jlValorCusto.setText("Valor de compra");

        jlValorVendaUnt.setFont(new java.awt.Font("Serif", 0, 18));
        jlValorVendaUnt.setForeground(new java.awt.Color(-2880502,true));
        jlValorVendaUnt.setText("Valor de venda");

        jlQuant.setFont(new java.awt.Font("Serif", 1, 14));
        jlQuant.setForeground(new java.awt.Color(-9511836,true));
        jlQuant.setText("Quantidade:");

        jlUnidadeMedida.setFont(new java.awt.Font("Serif", 1, 14));
        jlUnidadeMedida.setForeground(new java.awt.Color(-9511836,true));
        jlUnidadeMedida.setText("Unidade de Medida:");

        jCTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipoProdutoActionPerformed(evt);
            }
        });

        jlTipoProduto.setFont(new java.awt.Font("Serif", 1, 14));
        jlTipoProduto.setForeground(new java.awt.Color(-9511836,true));
        jlTipoProduto.setText("Tipo ou Categoria do Produto");

        jtUnidadeMed.setEnabled(false);
        jtUnidadeMed.setPreferredSize(new java.awt.Dimension(8, 20));
        jtUnidadeMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtUnidadeMedActionPerformed(evt);
            }
        });

        jtQuant.setEnabled(false);

        jtVendaUnit.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jtVendaUnit.setEnabled(false);
        jtVendaUnit.setMinimumSize(new java.awt.Dimension(6, 26));
        jtVendaUnit.setPreferredSize(getPreferredSize());
        jtVendaUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtVendaUnitActionPerformed(evt);
            }
        });

        jlFornecedor.setFont(new java.awt.Font("Serif", 1, 14));
        jlFornecedor.setForeground(new java.awt.Color(-9511836,true));
        jlFornecedor.setText("Fornecedor(nao obrigatorio)");

        jcFornecedor.setMinimumSize(new java.awt.Dimension(28, 26));
        jcFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcFornecedorActionPerformed(evt);
            }
        });

        jtValorCusto.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jtValorCusto.setEnabled(false);
        jtValorCusto.setPreferredSize(new java.awt.Dimension(6, 26));

        jPanel2.setBackground(new java.awt.Color(-1,true));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        jlStockMinim.setFont(new java.awt.Font("Serif", 1, 14));
        jlStockMinim.setForeground(new java.awt.Color(-2880502,true));
        jlStockMinim.setText("Estoque minimo:");

        jlStockActual.setFont(new java.awt.Font("Serif", 1, 14));
        jlStockActual.setForeground(new java.awt.Color(-9511836,true));
        jlStockActual.setText("Estoque Actual:");

        jtStockMin.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jtStockMin.setEnabled(false);

        jtStockActual.setEnabled(false);

        tEstoqueMax.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        tEstoqueMax.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14));
        jLabel1.setForeground(new java.awt.Color(-2880502,true));
        jLabel1.setText("Estoque maximo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlStockMinim))
                    .addComponent(jtStockMin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tEstoqueMax, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtStockActual, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 17, Short.MAX_VALUE)
                        .addComponent(jlStockActual)
                        .addGap(29, 29, 29))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlStockMinim)
                    .addComponent(jLabel1)
                    .addComponent(jlStockActual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtStockMin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tEstoqueMax, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtStockActual))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(-1,true));

        jtValidade.setEnabled(false);
        jtValidade.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14));
        jLabel2.setForeground(new java.awt.Color(-9511836,true));
        jLabel2.setText("Validade:");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14));
        jLabel3.setForeground(new java.awt.Color(-9511836,true));
        jLabel3.setText("Codigo/Codigo de barra:");

        jtCodigo.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtValidade, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jlValorCusto)
                        .addGap(253, 253, 253)
                        .addComponent(jlTipoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCTipoProduto, 0, 319, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jlDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlFornecedor)
                        .addGap(18, 18, 18)
                        .addComponent(jcFornecedor, 0, 308, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlUnidadeMedida)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtUnidadeMed, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jtValorCusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlValorVendaUnt)
                                        .addComponent(jtVendaUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlQuant)
                            .addGap(18, 18, 18)
                            .addComponent(jtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDescricao)
                    .addComponent(jtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFornecedor)
                    .addComponent(jcFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValorCusto)
                    .addComponent(jlTipoProduto)
                    .addComponent(jCTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlValorVendaUnt))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtVendaUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtUnidadeMed, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUnidadeMedida)
                    .addComponent(jtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlQuant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jtUnidadeMed, jtValorCusto, jtVendaUnit});

        panelGrupoComplement.setBackground(new java.awt.Color(-1,true));

        bRegistar.setBackground(new java.awt.Color(-1,true));
        bRegistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Save.png"))); // NOI18N
        bRegistar.setText("Registar");
        bRegistar.setEnabled(false);
        bRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistarActionPerformed(evt);
            }
        });

        bSair.setBackground(new java.awt.Color(-1,true));
        bSair.setText("Fechar");
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });

        bAtualizar.setBackground(new java.awt.Color(-1,true));
        bAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Refresh.png"))); // NOI18N
        bAtualizar.setText("Actualizar");
        bAtualizar.setEnabled(false);

        bExcluir.setBackground(new java.awt.Color(-1,true));
        bExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/delete_to_bin_24.png"))); // NOI18N
        bExcluir.setText("Excluir");
        bExcluir.setEnabled(false);

        bNovo.setBackground(new java.awt.Color(-1,true));
        bNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Script-Edit.png"))); // NOI18N
        bNovo.setText("Novo");
        bNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGrupoComplementLayout = new javax.swing.GroupLayout(panelGrupoComplement);
        panelGrupoComplement.setLayout(panelGrupoComplementLayout);
        panelGrupoComplementLayout.setHorizontalGroup(
            panelGrupoComplementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGrupoComplementLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bExcluir)
                .addGap(36, 36, 36)
                .addComponent(bAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                .addComponent(bSair, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelGrupoComplementLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bAtualizar, bExcluir, bNovo, bRegistar, bSair});

        panelGrupoComplementLayout.setVerticalGroup(
            panelGrupoComplementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGrupoComplementLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelGrupoComplementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRegistar)
                    .addComponent(bSair)
                    .addComponent(bNovo)
                    .addComponent(bExcluir)
                    .addComponent(bAtualizar))
                .addContainerGap())
        );

        panelGrupoComplementLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bAtualizar, bExcluir, bNovo, bRegistar, bSair});

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel4.setText("CADASTRO DE PRODUTOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel4)
                .addContainerGap(361, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela);

        jPanel5.setBackground(new java.awt.Color(-1,true));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGrupoComplement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGrupoComplement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTipoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTipoProdutoActionPerformed

    private void jcFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcFornecedorActionPerformed

    private void jtVendaUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtVendaUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtVendaUnitActionPerformed

    private void jtUnidadeMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtUnidadeMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtUnidadeMedActionPerformed

    private void bNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoActionPerformed
     bNovo();
    }//GEN-LAST:event_bNovoActionPerformed

    private void bRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRegistarActionPerformed

    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
       dispose();
    }//GEN-LAST:event_bSairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       dispose();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CadProduto().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bNovo;
    private javax.swing.JButton bRegistar;
    private javax.swing.JButton bSair;
    private javax.swing.JComboBox jCTipoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcFornecedor;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlFornecedor;
    private javax.swing.JLabel jlQuant;
    private javax.swing.JLabel jlStockActual;
    private javax.swing.JLabel jlStockMinim;
    private javax.swing.JLabel jlTipoProduto;
    private javax.swing.JLabel jlUnidadeMedida;
    private javax.swing.JLabel jlValorCusto;
    private javax.swing.JLabel jlValorVendaUnt;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescricao;
    private javax.swing.JTextField jtQuant;
    private javax.swing.JTextField jtStockActual;
    private javax.swing.JTextField jtStockMin;
    private javax.swing.JTextField jtUnidadeMed;
    private com.toedter.calendar.JDateChooser jtValidade;
    private javax.swing.JTextField jtValorCusto;
    private javax.swing.JTextField jtVendaUnit;
    private javax.swing.JPanel panelGrupoComplement;
    private javax.swing.JTextField tEstoqueMax;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
