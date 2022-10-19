package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionsql {
    Connection conn=null;
    
    String usuario="efdbrozqcmvzih";
    String clave="c44845e5854a033fa2d5e04947409a25103972e8c25f09c2b22964a156f09c81";
    
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            String url="jdbc:postgresql://ec2-44-210-228-110.compute-1.amazonaws.com/df0l06ka4e2n4d";
            conn=DriverManager.getConnection(url,usuario,clave);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos"+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }

    
}