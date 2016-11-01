/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstratclass;

import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class ListaModelo extends AbstractListModel<Object> {
    ArrayList lista=null;
    
 public   ListaModelo(ArrayList ob ){
     setObject(ob);
 
 }

    public ArrayList getObject() {
        return lista;
    }

    public void setObject(ArrayList object) {
        this.lista = object;
    }

    @Override
    public int getSize() {
        return getObject().size();
    }

    @Override
    public Object getElementAt(int index) {
        return getObject().get(index);
    }
}
