/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author axel suazo
 */
public class Cpulperia {
    


/**
 *
 * @author blood
 */

    
    int id;
    String nombre;
    String valor;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    

   
    
    public void InsertarProductos( JTextField paramNombres, JTextField paramValores){
    
      
        setNombre(paramNombres.getText());
        setValor(paramValores.getText());
        CConexion objetoConexion = new CConexion();
        
        
        String consulta ="insert into Productos (nombres,valor) values (?,?);";
        
        try {
            
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            
            cs.setString(1, getNombre());
            cs.setString(2, getValor());
            
            cs.execute();
            
            
            JOptionPane.showMessageDialog(null, "Se insertó correctamente el Producto");
            
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "No Se insertó correctamente el Producto, error: "+e.toString());
        }
        
        
    
    }
    
    public void MostrarProductos(JTable paramTablaTotalproductos){
    
        CConexion objetoConexion = new CConexion();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> OrdenarTabla= new TableRowSorter<TableModel>(modelo);
        paramTablaTotalproductos.setRowSorter(OrdenarTabla);
        
        String sql="";
        
        modelo.addColumn("id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Valor");
        
        paramTablaTotalproductos.setModel(modelo); 
        
        
        sql ="select * from Productos;";
        
        
        String[] datos = new String[3];
        Statement st;
        
        try {
            st= objetoConexion.estableceConexion().createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
            
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                
                modelo.addRow(datos);
            }
            
            paramTablaTotalproductos.setModel(modelo);
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"No se pudo mostrar los registros, error: "+ e.toString());
        }
     
    }
    
    public void SeleccionarProducto(JTable paramTablaProductos, JTextField paramId, JTextField paramNombres, JTextField paramValores){
    
        try {
            int fila = paramTablaProductos.getSelectedRow();
            
            if (fila >=0) {
                
                paramId.setText((paramTablaProductos.getValueAt(fila, 0).toString()));
                paramNombres.setText((paramTablaProductos.getValueAt(fila, 1).toString()));
                paramValores.setText((paramTablaProductos.getValueAt(fila, 2).toString()));
            }
            
            else
            {
                JOptionPane.showMessageDialog(null,"Fila no seleccionada");
            }
        } catch (Exception e) {
            
                JOptionPane.showMessageDialog(null,"Error al seleccionar, error: "+ e.toString());
        }
        
    }
    
    
    public void ModificarProductos (JTextField paramCodigo, JTextField paramNombres, JTextField paramValores){
    
        setId(Integer.parseInt(paramCodigo.getText()));
        setNombre(paramNombres.getText());
        setValor(paramValores.getText());
        
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "UPDATE Productos Set productos.Nombres=?,productos.valor=? WHERE productos.id=?";
        
        try {
            
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            
            cs.setString(1, getNombre());
            cs.setString(2, getValor());
            cs.setInt(3, getId());
            
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null,"Modificación Exitosa");
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"No se modificó, error:"+ e.toString());
        }
    }
    
    public void EliminarProductos(JTextField paramCodigo){
    
        setId(Integer.parseInt(paramCodigo.getText()));
        
        CConexion objetoConexion = new CConexion();
        
        String consulta = "DELETE from productos WHERE productos.id=?;";
        
        try {
             CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
             cs.setInt(1, getId());
             cs.execute();
             
             JOptionPane.showMessageDialog(null,"Se eliminó correctamente el Producto");
            
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null,"No se pudo eliminar, error: "+ e.toString());
        }
        
    }
    
    
}

