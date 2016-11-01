/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstratclass;

import Modelo.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ILIDIOP
 */
public class LogInClass {

    private Usuario usua;
    private String username;
    private String senha;
    public LogInClass() {
        usua= new Usuario();
        
    }

    public Usuario getUsua() {
        return usua;
    }

    public void setUsua(Usuario usua) {
        this.usua = usua;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
   

    
    
 public boolean VerSrnha(){
 if(senha.equals(usua.getSenha()) && username.equals(usua.getUsername()) )
 return true;
 
 return false;
}  
}
