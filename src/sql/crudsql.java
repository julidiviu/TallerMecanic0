package sql;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class crudsql {
    conexionsql con=new conexionsql();
    
    public void insertarVehiculos(String plavehiculo, String tipvehiculo, String modvehiculo, String colvehiculo, String marvehiculo, String obsvehiculo, String cedcliente  ){
        try {
            Connection conexion=con.conectar();
            java.sql.Statement st= conexion.createStatement();
            String sql="insert into vehiculos(plavehiculo,tipvehiculo,modvehiculo,colvehiculo,marvehiculo,obsvehiculo,cedcliente) values('"+plavehiculo+"','"+tipvehiculo+"','"+modvehiculo+"','"+colvehiculo+"','"+marvehiculo+"','"+obsvehiculo+"','"+cedcliente+"');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se guardó correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardó "+e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertarCliente(String cedula,String nombre,String apellido,String direccion,String telefono,String mail,String ciudad,String fecha ){
        try {
            Connection conexion=con.conectar();
            java.sql.Statement st=conexion.createStatement();
            String sql="insert into clientes(cedcliente,nomcliente,apecliente,dircliente,telcliente,mailcliente,ciucliente,feccliente) values('"+cedula+"','"+nombre+"','"+apellido+"','"+direccion+"','"+telefono+"','"+mail+"','"+ciudad+"','"+fecha+"')";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null,"registro exitoso","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"nahh"+e,"Mensaje",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
