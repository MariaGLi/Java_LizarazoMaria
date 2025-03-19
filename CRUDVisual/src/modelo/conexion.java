package modelo;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;

public class conexion {
    Connection con;
    public Connection getConnection(){
        
        String url = "jdbc:mysql://be6r9fm52xjw6nnyzwqj-mysql.services.clever-cloud.com:3306/be6r9fm52xjw6nnyzwqj";
        String user = "uqgspyzbzgjtm4uq";
        String pass = "poWKSbF1RqTjIRHZkHdl";
        
        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          con = (Connection) DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
        }
        return con;
    }
}

