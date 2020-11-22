/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author sala18a
 */
public class Conecta {
    public static void main(String[] args) {
       final String DRIVER = "com.mysql.jdbc.Driver";
       final String URL = "jdbc:mysql://localhost:3306/projetoescola";
       try{
           Class.forName(DRIVER);
           Connection connection = DriverManager.getConnection(URL, "root", "123456");
           JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso");
           connection.close();
       }catch(ClassNotFoundException erro) {
           JOptionPane.showMessageDialog(null, "Driver não encontrado!\n"
                   + erro.toString());
                  
       }catch(SQLException erro) {
           JOptionPane.showMessageDialog(null, "Problemas na conexão com a fonte de dados\n"
                   + erro.toString());
       }
    }
}
