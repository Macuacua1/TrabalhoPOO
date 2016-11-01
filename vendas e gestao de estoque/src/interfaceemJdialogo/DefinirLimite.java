/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceemJdialogo;

import DaoClasse.ClienteDao;
import Modelo.Cliente;
import abstratclass.Modelo;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author ILIDIOP
 */
public class DefinirLimite extends javax.swing.JDialog {

    private DefaultTableCellRenderer dtCellr; 
    public DefinirLimite(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        lValor.setVisible(false);
        
          dtCellr =new DefaultTableCellHeaderRenderer();
        dtCellr.setOpaque(false);
       // tabela.setDefaultRenderer(Object.class, dtCellr);
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
        tlinite = new javax.swing.JTextField();
        lunidade = new javax.swing.JLabel();
        lValor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 255), 4, true));
        jPanel2.setOpaque(false);

        bDescontar.setBackground(new java.awt.Color(51, 153, 0));
        bDescontar.setText("Comfirmar");
        bDescontar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDescontarActionPerformed(evt);
            }
        });

        bCancelar.setBackground(new java.awt.Color(51, 153, 0));
        bCancelar.setText("Cancelar ");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 153, 0));
        jButton3.setText("Terminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tlinite.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tlinite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tliniteActionPerformed(evt);
            }
        });
        tlinite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tliniteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tliniteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tliniteKeyTyped(evt);
            }
        });

        lunidade.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        lunidade.setForeground(new java.awt.Color(102, 102, 102));
        lunidade.setText("MT");

        lValor.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lValor.setForeground(new java.awt.Color(255, 0, 0));
        lValor.setText("! verifica o valor introduzido");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Introduz o valor Limite de vale");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tlinite, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lValor, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDescontar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bCancelar, jButton3});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tlinite, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lunidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bDescontar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("LIMITE MAXIMO DE PEDIDOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));

        tabela.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void tliniteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tliniteKeyTyped
 char c= evt.getKeyChar();
 
 if(c<'0'||c>'9')
 {
     evt.consume();
     tocarSom("naoavanca");
 }
        
      
    }//GEN-LAST:event_tliniteKeyTyped

    private void tliniteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tliniteKeyReleased
    
    }//GEN-LAST:event_tliniteKeyReleased

    private void tliniteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tliniteKeyPressed
    
    }//GEN-LAST:event_tliniteKeyPressed

    private void tliniteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tliniteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tliniteActionPerformed

    private void bDescontarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDescontarActionPerformed

        double k=0;
        try {
k=Double.parseDouble(tlinite.getText());
if(Double.parseDouble(tlinite.getText())>0){
             lValor.setVisible(false);
             Descontar();
             }else  
                 lValor.setVisible(true);
}catch(NumberFormatException ex){lValor.setVisible(true);}       
          
    }//GEN-LAST:event_bDescontarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
       
        if(this.isSelected()){
          CancelarLimiteZerado();
     }else
       JOptionPane.showMessageDialog(null, "Selecione uma linha na tabela");  
    }//GEN-LAST:event_bCancelarActionPerformed

 
  
    
        public void tocarSom(String som){
     URL url= DefinirLimite.class.getResource(som+".wav"); 
     AudioClip audio = Applet.newAudioClip(url);
   audio.play();
   }
        
          public boolean isSelected(){
        return this.tabela.getSelectedRow()!=-1;
    }

    @SuppressWarnings("unchecked")
        public void preencherTabela(){
        ArrayList dados= new ArrayList();
       String [] colunas= {"NOME DO CLIENTE","MAXIMO DE VALE"};
      List list= new ClienteDao().listarTodos();
      
        for (Object list1 : list) {
            Cliente cli = (Cliente) list1;
            Object[] ob= new Object[]{cli.getNomeCliente(),cli.getValorLimiteEmprestimo()};
            dados.add(ob);
        }
           
       try{
        Modelo     modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
         }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "problemas ocorridos duramte o carregamento de dados");}
    
        tabela.getColumnModel().getColumn(0).setPreferredWidth(162);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(106);
        tabela.getColumnModel().getColumn(1).setResizable(false);
       
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabela.setRowHeight(25);
       
        
   }
        
      public void DefinirLimite( double maxlimitevale){
        
  @SuppressWarnings("unchecked")
  List< Cliente> clientes=  new  ClienteDao().listarTodos();
 
  ArrayList<Double> limite=new  ArrayList<Double>();
  
   ArrayList< Cliente> cli=new  ArrayList< Cliente>();
   
  for (int i=0;i<tabela.getRowCount();i++){
      if(tabela.isRowSelected(i)){
       if(clientes.get(i).getNomeCliente().equals(tabela.getValueAt(i, 0))) 
        cli.add(clientes.get(i));
      double t=(Double)tabela.getValueAt(i, 1);
      limite.add((t));
      }
  }
      
  for(int j=0;j<limite.size();j++){ 
  Cliente cl = new Cliente();
  
  cl.setIdCliente(cli.get(j).getIdCliente());
  cl.setNomeCliente(clientes.get(j).getNomeCliente());
  cl.setValorLimiteEmprestimo(maxlimitevale);
  cl.setCell1(clientes.get(j).getCell1());
  cl.setCell2(clientes.get(j).getCell2());
 cl.setEndereco(clientes.get(j).getEndereco());
 cl.setObservacao(clientes.get(j).getObservacao());
 
   new ClienteDao().actualizar(cl);
 
  }
 } 
      
 
        
   public void Descontar(){
         
      if(this.isSelected()){
             
                  DefinirLimite(Double.parseDouble(tlinite.getText()));
                     preencherTabela();
                     tlinite.setText("");
      }else
         JOptionPane.showMessageDialog(null, "Selecione linha na tabela!");   
         
         
     }  
   
     public void CancelarLimiteZerado(){
       int [] pos= tabela.getSelectedRows();
        for(int i=0;i<pos.length;i++){
          double desconto=(Double)tabela.getValueAt(pos[i], 1);
          if(desconto>0){
               Cancelarlimite();
                preencherTabela();
         }   
        }
     }

      public void Cancelarlimite( ){
        
  @SuppressWarnings("unchecked")
  List< Cliente> clientes=  new  ClienteDao().listarTodos();
 
  
   ArrayList< Cliente> cli=new  ArrayList< Cliente>();
   
  for (int i=0;i<tabela.getRowCount();i++){
      if(tabela.isRowSelected(i)){
       if(clientes.get(i).getNomeCliente().equals(tabela.getValueAt(i, 0))) 
        cli.add(clientes.get(i));
     
      }
  }
   
  for(int j=0;j<cli.size();j++){ 
  Cliente cl = new Cliente();
  
  cl.setIdCliente(cli.get(j).getIdCliente());
  cl.setValorLimiteEmprestimo(0.0);
  cl.setNomeCliente(clientes.get(j).getNomeCliente());
  cl.setCell1(clientes.get(j).getCell1());
  cl.setCell2(clientes.get(j).getCell2());
  cl.setEndereco(clientes.get(j).getEndereco());
  cl.setObservacao(clientes.get(j).getObservacao());
   new ClienteDao().actualizar(cl);
  }
 }   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bDescontar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lValor;
    private javax.swing.JLabel lunidade;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tlinite;
    // End of variables declaration//GEN-END:variables
}
