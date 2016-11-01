/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ILIDIOP
 */
public class ConectaBanco {
   public Statement statment;//responsavel por preparar e realizar pesquizas no banco de dados
   public ResultSet resultse;//responsavel por armazenar o resultado de uma pesquiza passada para o resultset
   private  String driver="com.mysql.jdbc.driver";//responsavel por identificar o servico de banco de dados
   private String caminho="jdbc:Mysql://localhost:3306/negocio";//responsavel por localizar o banco de dados
   private String  usuario="root";
   private String senha="";
   public Connection coneccao;//responsavel por realizar a coneccao com o banco de dados

public void conectar(){//metodo responsavel por realizar a coneccao com o banco
  

            try {
                System.setProperty("jdbc.driver",driver);//seta a propriedade de coneccao
                coneccao=DriverManager.getConnection(caminho,usuario,senha);//realiza a coneccao com o banco
                JOptionPane.showMessageDialog(null, "conectdo com sucesso");
            }    catch (SQLException ex) {//localiza a falha de coneccao
                 JOptionPane.showMessageDialog(null, "erro de coneccao");
            }
}

public void desconectar(){
        try {
            coneccao.close();
            JOptionPane.showMessageDialog(null, "Banco de dados desconectado");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "erro ao fechar a coneccao");
        }
}
public void esecutEql(String sql){
        try {
           
            statment=coneccao.createStatement(resultse.TYPE_SCROLL_SENSITIVE,resultse.CONCUR_READ_ONLY);
        
        resultse=statment.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectaBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}