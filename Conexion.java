
package configuration;
import java.sql.Connection;
import java.sql.DriverManager;

// Implementacion de Archivos de Configuracion
public class Conexion {
    Connection conexion;
    
    public Conexion(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBRegistro?useSSL=false","root","admin");
    }catch(Exception e){
    e.printStackTrace();
    System.out.print("La conexion no se ha podido establecer" + e);
    }
    }
    public Connection getConection(){
    return conexion;
    }
    
    
}
