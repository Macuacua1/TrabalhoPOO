/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstratclass;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ILIDIOP
 */
public class Modelo extends AbstractTableModel{
 private String []colunas=null;
 private ArrayList linhas=null;

    public Modelo(ArrayList lin,String[]col) { 
        setLinhas(lin);
        setColunas(col);
    }
 
   public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }
 
 
    @Override
    public int getRowCount() {
        if(linhas==null)
            return 0;
      return linhas.size();
    }

    @Override
    public int getColumnCount() {
       return colunas.length;
    }

    @Override
    public Object getValueAt(int nlinhas, int nColun) {
        try{
        Object[]linha=(Object[])getLinhas().get(nlinhas);
     return linha[nColun];}
        catch(NullPointerException ex ){}
        return null;
        
    }
    
public Object getColClass(int column){
return column;
}
    
    
    @Override
    public String getColumnName(int col) {  
        return colunas[col];
    }
       
}
