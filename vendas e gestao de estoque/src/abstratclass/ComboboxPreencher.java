package abstratclass;

import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author MACUACUA
 */
public class ComboboxPreencher {
    
    
    
       public void preencheCombo(JComboBox cb, List <String> lista){
        if(lista.size()<1) return;
        cb.removeAllItems();
        for(String alvo: lista){
            cb.addItem(alvo);
        }
    }
    
    
}
