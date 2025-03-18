package jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBC2 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://be6r9fm52xjw6nnyzwqj-mysql.services.clever-cloud.com:3306/be6r9fm52xjw6nnyzwqj";
        String user = "uqgspyzbzgjtm4uq";
        String password = "poWKSbF1RqTjIRHZkHdl";
        
        try{
            Connection conexion = DriverManager.getConnection(url, user, password);
            Statement stmt = conexion.createStatement();
            System.out.println("Conexión lista.");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}