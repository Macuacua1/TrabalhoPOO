/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceemJdialogo;

import DaoClasse.ProdutoDao;
import Modelo.Produto;
import abstratclass.Modelo;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author ILIDIOP
 */
public class DefinirDesconto1 extends javax.swing.JDialog {

    /**
     * Creates new form DefinirDesconto
     * @param parent
     * @param modal
     */
    public DefinirDesconto1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        lValor.setVisible(false);
        preencherTabela();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        bDescontar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        rPecento = new javax.swing.JRadioButton();
        rValor = new javax.swing.JRadioButton();
        tDescontar = new javax.swing.JTextField();
        lunidade = new javax.swing.JLabel();
        lValor = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));
        jPanel2.setOpaque(false);

        bDescontar.setBackground(new java.awt.Color(102, 204, 0));
        bDescontar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        bDescontar.setForeground(new java.awt.Color(102, 102, 102));
        bDescontar.setText("DESCONTAR");
        bDescontar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDescontarActionPerformed(evt);
            }
        });

        bCancelar.setBackground(new java.awt.Color(102, 204, 0));
        bCancelar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        bCancelar.setForeground(new java.awt.Color(102, 102, 102));
        bCancelar.setText("CANCELAR DESCONTOS");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 204, 0));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("TERMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rPecento);
        rPecento.setSelected(true);
        rPecento.setText("Desconto por precentagem");
        rPecento.setOpaque(false);
        rPecento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPecentoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rValor);
        rValor.setText("Desconto por valor");
        rValor.setOpaque(false);
        rValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rValorActionPerformed(evt);
            }
        });

        tDescontar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tDescontar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDescontarActionPerformed(evt);
            }
        });
        tDescontar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tDescontarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tDescontarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tDescontarKeyTyped(evt);
            }
        });

        lunidade.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lunidade.setText("%");

        lValor.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lValor.setForeground(new java.awt.Color(255, 0, 0));
        lValor.setText("! verifica o valor introduzido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rValor)
                    .addComponent(rPecento)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bDescontar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                    .addComponent(lValor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tDescontar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lunidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rPecento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tDescontar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lunidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bDescontar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bCancelar, bDescontar, jButton3});

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tDescontarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tDescontarKeyTyped
 char c= evt.getKeyChar();
 
 if(c<'0'||c>'9')
 {
     evt.consume();
     tocarSom("naoavanca");
 }
        
      
    }//GEN-LAST:event_tDescontarKeyTyped

    private void tDescontarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tDescontarKeyReleased
    
    }//GEN-LAST:event_tDescontarKeyReleased

    private void tDescontarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tDescontarKeyPressed
    
    }//GEN-LAST:event_tDescontarKeyPressed

    private void rPecentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPecentoActionPerformed
        if(rPecento.isSelected())
            lunidade.setText("%");
    }//GEN-LAST:event_rPecentoActionPerformed

    private void rValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rValorActionPerformed
        if(rValor.isSelected())
            lunidade.setText("MT");
    }//GEN-LAST:event_rValorActionPerformed

    private void tDescontarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDescontarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDescontarActionPerformed

    private void bDescontarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDescontarActionPerformed

        
        try {
Double.parseDouble(tDescontar.getText());
}catch(NumberFormatException ex){lValor.setVisible(true);}       
         if(Double.parseDouble(tDescontar.getText())>0){
             lValor.setVisible(false);
               Descontar();
             }else  
                 lValor.setVisible(true); 
    }//GEN-LAST:event_bDescontarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
       
        if(this.isSelected()){
          CancelarDescontoZerado();
     }else
       JOptionPane.showMessageDialog(null, "Selecione uma linha na tabela");  
    }//GEN-LAST:event_bCancelarActionPerformed

 
   
    
        public void tocarSom(String som){
     URL url= DefinirDesconto1.class.getResource(som+".wav"); 
     AudioClip audio = Applet.newAudioClip(url);
   audio.play();
   }
        
          public boolean isSelected(){
        return this.tabela.getSelectedRow()!=-1;
    }

        public void preencherTabela(){
        ArrayList dados= new ArrayList();
       String [] colunas= {"NOME DO PRODUTO","DESCONTO","VALOR DE VENDA"};
      List l= new ProdutoDao().listarTodos();
      
       
           for(int i=0;i<l.size();i++){
        Produto p=(Produto) l.get(i);  
       Object[] ob= new Object[]{p.getNomeProduto(),p.getDesconto(),p.getValorVenda()};
        dados.add(ob);
           }
           
       try{
        Modelo     modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
         }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);}
    
        tabela.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(97);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(125);
        tabela.getColumnModel().getColumn(2).setResizable(false);
       
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabela.setRowHeight(25);
   }
        
      public void DefinirDescontoValor( double desc){
        
  List<Produto> l=  new ProdutoDao().listarTodos();
 
  ArrayList<Double> tDes=new  ArrayList<Double>();
  
   ArrayList<Produto> pro=new  ArrayList<Produto>();
   
  for (int i=0;i<tabela.getRowCount();i++){
      if(tabela.isRowSelected(i)){
       if(l.get(i).getNomeProduto().equals(tabela.getValueAt(i, 0))) 
        pro.add(l.get(i));
      double t=(Double)tabela.getValueAt(i, 1);
      tDes.add((t));
      }
  }
      
  for(int j=0;j<tDes.size();j++){ 
  Produto p = new Produto();
  p.setCodigoBarras(pro.get(j).getCodigoBarras());
  p.setDesconto(desc);
  p.setValorVenda(pro.get(j).getValorVenda()-desc);
  p.setEstoqueMax(pro.get(j).getEstoqueMax());
  p.setEstoqueMin(pro.get(j).getEstoqueMin());
  p.setNomeProduto(pro.get(j).getNomeProduto());
  p.setQuantidade(pro.get(j).getQuantidade());
  p.setTipoproduto(pro.get(j).getTipoproduto());
  p.setUnidade(pro.get(j).getUnidade());
  p.setValidade(pro.get(j).getValidade());
  p.setValorCompra(pro.get(j).getValorCompra());
 
    if(pro.get(j).getValorVenda()-desc>0)
   new ProdutoDao().actualizar(p);
     else
 JOptionPane.showMessageDialog(null, "Valor de desconto superior ao valor de Venda!");
 
  }
 } 
      
        public void DefinirDescontoPorcento( double desc){
        
  List<Produto> l=  new ProdutoDao().listarTodos();
  ArrayList<Double> tDes=new  ArrayList<Double>();
   ArrayList<Produto> pro=new  ArrayList<Produto>();
   
  for (int i=0;i<tabela.getRowCount();i++){
      if(tabela.isRowSelected(i)){
       if(l.get(i).getNomeProduto().equals(tabela.getValueAt(i, 0))) 
        pro.add(l.get(i));
      double t=(Double)tabela.getValueAt(i, 1);
      tDes.add((t));
      }
  }
   
  for(int j=0;j<tDes.size();j++){ 
  Produto p = new Produto();
  p.setCodigoBarras(pro.get(j).getCodigoBarras());
  double ValorDDesconto =(desc*pro.get(j).getValorVenda())/100;
  
  p.setDesconto(ValorDDesconto);
  p.setValorVenda(pro.get(j).getValorVenda()-ValorDDesconto);
  p.setEstoqueMax(pro.get(j).getEstoqueMax());
  p.setEstoqueMin(pro.get(j).getEstoqueMin());
  p.setNomeProduto(pro.get(j).getNomeProduto());
  p.setQuantidade(pro.get(j).getQuantidade());
  p.setTipoproduto(pro.get(j).getTipoproduto());
  p.setUnidade(pro.get(j).getUnidade());
  p.setValidade(pro.get(j).getValidade());
  p.setValorCompra(pro.get(j).getValorCompra());
  p.setIdProduto(pro.get(j).getIdProduto());
  p.setCodigoBarras(pro.get(j).getCodigoBarras());
      if(pro.get(j).getValorVenda()-ValorDDesconto>0)
   new ProdutoDao().actualizar(p);
     else
 JOptionPane.showMessageDialog(null, "Valor de desconto superior ao valor de Venda!");
 }
  }
        
   public void Descontar(){
         
      if(this.isSelected()){
                  if(rValor.isSelected())
                       DefinirDescontoValor(Double.parseDouble(tDescontar.getText()));
             else 
                  DefinirDescontoPorcento(Double.parseDouble(tDescontar.getText()));
                     preencherTabela();
                     tDescontar.setText("");
      }else
         JOptionPane.showMessageDialog(null, "Selecione um Produto na tabela!");   
         
         
     }  
   
     public void CancelarDescontoZerado(){
       int [] pos= tabela.getSelectedRows();
        for(int i=0;i<pos.length;i++){
          double desconto=(Double)tabela.getValueAt(pos[i], 1);
          if(desconto>0){
               CancelarDesconto();
                preencherTabela();
         }else
          JOptionPane.showMessageDialog(null, "O desconto ja esta nulo!");     
        }
     }

      public void CancelarDesconto( ){
        
  List<Produto> l=  new ProdutoDao().listarTodos();
  ArrayList<Double> tDes=new  ArrayList<Double>();
   ArrayList<Produto> pro=new  ArrayList<Produto>();
   
  for (int i=0;i<tabela.getRowCount();i++){
      if(tabela.isRowSelected(i)){
       if(l.get(i).getNomeProduto().equals(tabela.getValueAt(i, 0))) 
        pro.add(l.get(i));
      double t=(Double)tabela.getValueAt(i, 1);
      tDes.add((t));
      }
  }
   
  for(int j=0;j<tDes.size();j++){ 
  Produto p = new Produto();
  p.setCodigoBarras(pro.get(j).getCodigoBarras());
  p.setDesconto(0.0);
  p.setValorVenda(pro.get(j).getValorVenda()+pro.get(j).getDesconto());
  p.setEstoqueMax(pro.get(j).getEstoqueMax());
  p.setEstoqueMin(pro.get(j).getEstoqueMin());
  p.setNomeProduto(pro.get(j).getNomeProduto());
  p.setQuantidade(pro.get(j).getQuantidade());
  p.setTipoproduto(pro.get(j).getTipoproduto());
  p.setUnidade(pro.get(j).getUnidade());
  p.setValidade(pro.get(j).getValidade());
  p.setValorCompra(pro.get(j).getValorCompra());
 p.setCodigoBarras(pro.get(j).getCodigoBarras());
 p.setIdProduto(pro.get(j).getIdProduto());
  new ProdutoDao().actualizar(p);
  }
 }   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bDescontar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lValor;
    private javax.swing.JLabel lunidade;
    private javax.swing.JRadioButton rPecento;
    private javax.swing.JRadioButton rValor;
    private javax.swing.JTextField tDescontar;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
