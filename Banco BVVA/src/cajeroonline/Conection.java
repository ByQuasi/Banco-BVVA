
package cajeroonline;
import java.sql.*;
import javax.swing.JOptionPane;


public class Conection {
    public static Connection getConnection(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bvva_banco","Quasiman","losperrosdos56");
            return cn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo obtener conexion");
        }
        return null;
    }
  
}
