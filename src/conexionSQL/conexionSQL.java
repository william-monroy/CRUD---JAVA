
package conexionSQL;
import javax.swing.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class conexionSQL {
    
    Connection conectar = null;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/escuela?characterEncoding=latin1", "root", "12345678");
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de Conexion: "+e.getMessage());
        }
        return conectar;
    }
    
    
}
