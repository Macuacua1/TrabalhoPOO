/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceemJdialogo;

import DaoClasse.ItemvendaDao;
import DaoClasse.PagamentoDao;
import Modelo.ItemVenda;
import Modelo.PagamentoEmprestimo;
import abstratclass.Modelo;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author ILIDIOP
 */
public class RelatorioVendas extends javax.swing.JDialog {

  private  List<ItemVenda> items;
   private  List<PagamentoEmprestimo> pagamento;
    public RelatorioVendas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
         JTableHeader header = tabela.getTableHeader();
         header.setOpaque(false);
         header.setBackground(Color.BLACK);
         header.setForeground(Color.WHITE);
         setLocationRelativeTo(null);
        preencherTabela();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela2 = new javax.swing.JTable();
        tcod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jButton3.setText("GERAR RELATORIO");

        jButton2.setText("ACTUALIZAR");

        jButton1.setText("REMOVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabela.setBackground(new java.awt.Color(0, 0, 0));
        tabela.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tabela.setForeground(new java.awt.Color(255, 255, 255));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabela.setToolTipText("dados relacionados com as vendas");
        tabela.setFillsViewportHeight(true);
        tabela.setGridColor(new java.awt.Color(255, 255, 255));
        tabela.setInheritsPopupMenu(true);
        tabela.setOpaque(false);
        tabela.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tabela.setShowHorizontalLines(false);
        tabela.setShowVerticalLines(false);
        tabela.getTableHeader().setResizingAllowed(false);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        tabela2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tabela2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabela2);

        tcod.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tcod.setForeground(new java.awt.Color(102, 153, 255));
        tcod.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Codigo da venda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(182, 182, 182)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tcod, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
     if(tabela.getSelectedRow()>=0)
     {     preencherTabela2();
       tcod.setText(items.get(tabela.getSelectedRow()).getVenda().getIdVenda()+"");}
    }//GEN-LAST:event_tabelaMouseClicked

    /**
     * @param args the command line arguments
     */
 

     @SuppressWarnings({"unchecked", "unchecked"})
        public void preencherTabela(){
   ArrayList dados= new ArrayList();
   String [] colunas= {"NO VENDA","O CAIXA","PRODUTO","QUANTIDADE","SUBTOTAL","DATA DA VENDA","CLIENTE",};
           items=new ItemvendaDao().listarItens() ;
             
        for (ItemVenda it : items) {    
            String n =null;
            try{
                n=it.getVenda().getCliente().getNomeCliente();
            }catch(NullPointerException e){}
            Object[] pfp= new Object[]{it.getVenda().getIdVenda(),it.getVenda().getUsuario().getNomeUsuario(),
                it.getProduto().getNomeProduto(),it.getQuantidade(),it.getSubtotal(),it.getVenda().getDataEHora(),n,
                };
            
            dados.add(pfp);
        }
           
       try{
        Modelo     modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
         }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);}
        tabela.getColumnModel().getColumn(0).setPreferredWidth(80);
        tabela.getColumnModel().getColumn(0).setResizable(false);
         tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(1).setResizable(false);
         tabela.getColumnModel().getColumn(2).setPreferredWidth(140);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(90);
        tabela.getColumnModel().getColumn(3).setResizable(false);
         tabela.getColumnModel().getColumn(4).setPreferredWidth(90);
        tabela.getColumnModel().getColumn(4).setResizable(false);
         tabela.getColumnModel().getColumn(5).setPreferredWidth(173);
        tabela.getColumnModel().getColumn(5).setResizable(false);
          tabela.getColumnModel().getColumn(6).setPreferredWidth(117);
        tabela.getColumnModel().getColumn(6).setResizable(false);
      
    
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        tabela.setRowHeight(25);
} 
  
     @SuppressWarnings({"unchecked", "unchecked"})
        public void preencherTabela2(){
            int tot=0;
   ArrayList dados= new ArrayList();
   String [] colunas= {"CUSTO","VALOR PAGO","TROCO","DATA DE PAGAMENTO"};
           pagamento=new PagamentoDao().listarTodas() ;
             
        for (PagamentoEmprestimo pag : pagamento)     
            if(pag.getVenda().getIdVenda().equals(tabela.getValueAt(tabela.getSelectedRow(), 0)))
                
            {   for (ItemVenda it : items)
            {  if(it.getVenda().getIdVenda().equals(tabela.getValueAt(tabela.getSelectedRow(), 0)))
                     tot+=it.getSubtotal();}
                Object[] pfp= new Object[]{tot,pag.getValorPago(),pag.getTroco(),pag.getDataPagamento() };
            
            dados.add(pfp);}
        
           
       try{
        Modelo     modelo= new Modelo(dados,colunas);
        tabela2.setModel(modelo);
         }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);}
        tabela2.getColumnModel().getColumn(0).setPreferredWidth(90);
        tabela2.getColumnModel().getColumn(0).setResizable(false);
         tabela2.getColumnModel().getColumn(1).setPreferredWidth(103);
        tabela2.getColumnModel().getColumn(1).setResizable(false);
         tabela2.getColumnModel().getColumn(2).setPreferredWidth(90);
        tabela2.getColumnModel().getColumn(2).setResizable(false);
        tabela2.getColumnModel().getColumn(3).setPreferredWidth(160);
        tabela2.getColumnModel().getColumn(3).setResizable(false);
        
    
        tabela2.getTableHeader().setReorderingAllowed(false);
        tabela2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabela2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        tabela2.setRowHeight(25);
        tabela2.setShowGrid(false);
} 
         
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabela2;
    private javax.swing.JTextField tcod;
    // End of variables declaration//GEN-END:variables
}
