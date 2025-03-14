package jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/MyPrimerJDBC?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "campus2023";
        
        try{
            Connection conexion = DriverManager.getConnection(url, user, password);
            Statement stmt = conexion.createStatement();
            System.out.println("Conexión lista.");
            select(stmt);
            stmt.close();
            conexion.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void select(Statement stm) throws SQLException {
        String ver = "SELECT * FROM persona;";
        ResultSet rs = stm.executeQuery(ver);
        System.out.println("Lista de personas: ");
    
        while (rs.next()){
            System.out.println(rs.getInt("id") + " - " + rs.getString("nombre") + " - " + rs.getString("apellido") + " - " + rs.getString("edad"));
        } rs.close();
    }
    
    public static void create(Statement st, Scanner sc) throws SQLException{
        System.out.println("Ingrese el ID de la persona: ");
        int id = sc.nextInt();
        sc.nextInt();
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido de la persona: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese la edad de la persona: ");
        int edad = sc.nextInt();
        sc.nextInt();
    }
}