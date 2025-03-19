package UsuarioDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    // Atributos de la base de datos
    // jdbc: mysql://host:puerto/basededatos
    private String URL = "jdbc:mysql://bj998wxdzi2ajvbulneb-mysql.services.clever-cloud.com:3306/bj998wxdzi2ajvbulneb?useSSL=false&allowPublicKeyRetrieval=true";
    private String USER = "unbrzjbutjd0oi9g";
    private String PASS = "bkqn0vf76R0Ax59xnwZG";

    // Método para conectarnos a la base de datos
    private Connection conectar() throws SQLException {
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // Crear (Create)
    public void insertarUsuario(String nombre, String email) {
        String sql = "INSERT INTO usuarios (nombre, email) VALUES (?, ?)";
        try (
                Connection conexionInterna = conectar(); 
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql)) {
            // Asignando valores a las incógnitas
            solicitud.setString(1, nombre);
            solicitud.setString(2, email);
            // Ejecución de la solicitud
            solicitud.executeUpdate();
            System.out.println("Registro insertado exitosamente");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Leer (Read)
    // select * from usuarios;
    public List<String> obtenerUsuarios() {
        String sql = "SELECT * FROM usuarios";
        List<String> listaUsuarios = new ArrayList<>();
        try (
                Connection conexionInterna = conectar(); 
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql); 
                ResultSet resultado = solicitud.executeQuery();
            ) {
            while (resultado.next()) {
                listaUsuarios.add(resultado.getInt("id")
                        + " - " + resultado.getString("nombre") + " - "
                        + resultado.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }

    // Actualizar (Update)
    // update usuarios set nombre = pedrito, email = pedrito@gmail.com where id = 3
    public void actualizarUsuario(int id, String nombre, String email) {
        String sql = "UPDATE usuarios SET nombre=?, email=? WHERE id=?";
        try (
                Connection conexionInterna = conectar(); PreparedStatement solicitud = conexionInterna.prepareStatement(sql)) {
            // Asignando valores a las incógnitas
            solicitud.setString(1, nombre);
            solicitud.setString(2, email);
            solicitud.setInt(3, id);
            // Ejecución de la solicitud
            int filas = solicitud.executeUpdate();
            if (filas > 0) {
                System.out.println("Usuario actualizado exitosamente!");
            } else {
                System.out.println("No se pudo actualizar el usuario con ID " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Eliminar (Delete)
    // Delete usuarios por ID
    public void eliminarUsuario(int id) {
        String sql = "DELETE FROM usuarios WHERE id=?";
        try (
                Connection conexionInterna = conectar(); PreparedStatement solicitud = conexionInterna.prepareStatement(sql)) {
            solicitud.setInt(1, id);
            int filas = solicitud.executeUpdate();
            if (filas > 0) {
                System.out.println("El usuario con el id:  " + id + " fue  eliminado exitosamente!");
            } else {
                System.out.println("No se pudo encontrar el usuario con el ID " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Mostrar resultados por id
    public void buscarIdUsuarios() {
        String sql = "SELECT id FROM usuarios ORDER BY id ASC";
        try (
                Connection conexionInterna = conectar(); 
                PreparedStatement solicitud = conexionInterna.prepareStatement(sql); 
                ResultSet resultado = solicitud.executeQuery()
            ) {
            while (resultado.next()) {
                int id = resultado.getInt("id");
                System.out.println("id : " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
