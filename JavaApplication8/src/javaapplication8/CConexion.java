/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author axel suazo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
 
public class CConexion {
    
    Connection conectar = null;
    
    String usuario = "root";
    String contrasenia = "axelgero12";
    String bd = "pulperia";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
    
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            //JOptionPane.showMessageDialog(null,"La conexión se ha realizado con éxito");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al conectarse a la base de datos, erro: "+ e.toString());
        }
        return conectar;
    }
    
}
