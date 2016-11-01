/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceemJdialogo;

import DaoClasse.TipoprodutoDao;
import Modelo.Tipoproduto;
import Modelo.Usuario;
import abstratclass.Modelo;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author ILIDIOP
 */
public class TipoProduto1 extends javax.swing.JDialog {

    /**
     * Creates new form TipoProduto1
     */
    public TipoProduto1(java.awt.Frame parent, boolean modal,Usuario u) {
        super(parent, modal);
        initComponents();
        bAlterar.setVisible(u.getPerfil().getProdutoPerfil().isActualizarProduto());
        bExcluir.setVisible(u.getPerfil().getProdutoPerfil().isExcluirProduto());
        bRegistar.setVisible(u.getPerfil().getProdutoPerfil().isCadastrarProduto());
        setLocationRelativeTo(null);
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        tPesquisa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bRegistar = new javax.swing.JButton();
        bExcluir = new javax.swing.JButton();
        bAlterar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de produto:");

        tNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tNomeKeyTyped(evt);
            }
        });

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
        jScrollPane1.setViewportView(tabela);

        tPesquisa.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tPesquisaMouseReleased(evt);
            }
        });
        tPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tPesquisaKeyReleased(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Script-Edit.png"))); // NOI18N
        jButton1.setText("Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bRegistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Save.png"))); // NOI18N
        bRegistar.setText("Registrar");
        bRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistarActionPerformed(evt);
            }
        });

        bExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/delete_to_bin_24.png"))); // NOI18N
        bExcluir.setText("Excluir");
        bExcluir.setEnabled(false);
        bExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExcluirActionPerformed(evt);
            }
        });

        bAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Refresh.png"))); // NOI18N
        bAlterar.setText("Alterar");
        bAlterar.setEnabled(false);
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/Undo.png"))); // NOI18N
        jButton5.setText("Voltar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/imagens/search1.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setBackground(new java.awt.Color(50, 87, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("REGISTRO DO TIPO DE PRODUTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(tPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bRegistar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRegistar)
                    .addComponent(bExcluir)
                    .addComponent(bAlterar)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExcluirActionPerformed
   if(tabela.getSelectedRow()>=0){
        int codigo=(Integer) tabela.getValueAt(0,tabela.getSelectedRow());
   new TipoprodutoDao().apagarTipoproduto(codigo);}
   else JOptionPane.showMessageDialog(this, "seleciona a linha que deseja remover");
        preencherTabela();
    }//GEN-LAST:event_bExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     bAlterar.setEnabled(false);
     bExcluir.setEnabled(false);
     bRegistar.setEnabled(true);
    
     tNome.setText("");
     tNome.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistarActionPerformed
    new TipoprodutoDao().salvarTipoproduto(criartipo());
       preencherTabela();
       tNome.setText(" ");
       bRegistar.setEnabled(false);
       
    }//GEN-LAST:event_bRegistarActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
     Tipoproduto tp= new TipoprodutoDao().buscarTipoproduto((Integer)(tabela.getValueAt(tabela.getSelectedRow(),0)));
     Tipoproduto tp1= new Tipoproduto ();
     tp1.setIdTipoProduto(tp.getIdTipoProduto());
     tp1.setNomeTipo(tNome.getText());
     new TipoprodutoDao().actualizar(tp1); 
     tNome.setText(" ");
        preencherTabela();
    }//GEN-LAST:event_bAlterarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
         if(tabela.getSelectedRow()>=0){
        int codigo=(Integer) tabela.getValueAt(tabela.getSelectedRow(),0);
     Tipoproduto tp=   new TipoprodutoDao().buscarTipoproduto(codigo);
     
        tNome.setText(tp.getNomeTipo());
  
         bAlterar.setEnabled(true);
         bExcluir.setEnabled(true);
         bRegistar.setEnabled(true);
         }
   else JOptionPane.showMessageDialog(this, "seleciona a linha que deseja remover");
        
    }//GEN-LAST:event_tabelaMouseClicked

    private void tPesquisaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPesquisaMouseReleased
    
    }//GEN-LAST:event_tPesquisaMouseReleased

    private void tPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPesquisaKeyReleased
      preencherTabelaPesquisa();
    }//GEN-LAST:event_tPesquisaKeyReleased

    private void tNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tNomeKeyTyped
      char c= evt.getKeyChar();

        if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
           
        }    
    }//GEN-LAST:event_tNomeKeyTyped

    

   public void preencherTabelaPesquisa(){
        ArrayList dados= new ArrayList();
       String [] colunas= new String[]{"CODIGO","TIPO DE PRODUTO"};
       
      TextAutoCompleter auto= new TextAutoCompleter(tPesquisa);
     List l =(List) new TipoprodutoDao().pesquisaPeloNome(tPesquisa.getText());
       int tamanho= l.size();
       
           for(int i=0;i<tamanho;i++){
         Tipoproduto tipo=(Tipoproduto) l.get(i);
         auto.addItem(tipo.getNomeTipo());
       Object[] ob= new Object[]{tipo.getIdTipoProduto(),tipo.getNomeTipo()};
        dados.add(ob); }
       try{
      
          Modelo modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
     
        
         }catch(NullPointerException e){
   
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);}
    
        tabela.getColumnModel().getColumn(0).setPreferredWidth(136);
        tabela.getColumnModel().getColumn(0).setResizable(false);
         tabela.getColumnModel().getColumn(1).setPreferredWidth(395);
        tabela.getColumnModel().getColumn(1).setResizable(false);
       
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabela.setRowHeight(23);
        
   }   
    
    
    @SuppressWarnings("unchecked")
  private void  preencherTabela(){
           
        ArrayList dados= new ArrayList();
       String [] colunas= new String[]{"CODIGO","TIPO DE PRODUTO",};
     
     
      List l= new TipoprodutoDao().listarTodos();
        for (Object l1 : l) {
            Tipoproduto tpro = (Tipoproduto) l1;
            Object[] ob= new Object[]{tpro.getIdTipoProduto(),tpro.getNomeTipo()};
            dados.add(ob);
        }
           
       try{
        Modelo     modelo= new Modelo(dados,colunas);
        tabela.setModel(modelo);
         }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null, "Erro ao preencher a tabela" +e);
         }
    
        tabela.getColumnModel().getColumn(0).setPreferredWidth(136);
        tabela.getColumnModel().getColumn(0).setResizable(false);
         tabela.getColumnModel().getColumn(1).setPreferredWidth(375);
        tabela.getColumnModel().getColumn(1).setResizable(false);
      
        
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
   }
  
  private Tipoproduto criartipo(){
  Tipoproduto tp= new Tipoproduto();
  tp.setNomeTipo(tNome.getText());
  
  return tp;
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bExcluir;
    private javax.swing.JButton bRegistar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tPesquisa;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
