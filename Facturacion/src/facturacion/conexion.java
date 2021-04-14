package facturacion;
import java.sql.*;

public class conexion {

    // Se define la URL al servidor de bases de datos
    private final String url = "jdbc:mysql://localhost/Inventario";
    PreparedStatement psPrepararSentencia;
    Connection con = null;
   

    // Constructor
    public conexion() {
     try{  
         
         Class.forName("com.mysql.jdbc.Driver");
         //conexion con la base de datos
         con = DriverManager.getConnection(url,"root","tu_contraseña");
         if (con!=null){
            System.out.println("Conexión a base de datos exitosa");
         }
     	}
         catch(SQLException e)
         {
         System.out.println(e);
         }
         catch(ClassNotFoundException e)
         {
          System.out.println(e);
         }
     

    }

    // Devuelven el estado de la conexión
    public Connection conectado(){ 
    	return con;
    }

    public void desconectar(){
      con = null;
      System.out.println("conexion terminada");
    } 
    
    
   
    
}
