package controlador;

import java.util.InputMismatchException;
import java.util.List;
import modelo.Usuario;
import modelo.UsuarioDAO;
import vista.UsuarioVista;

import java.util.Scanner;

//Controlador
//Permite manejar los datos
// entre el modelo y la vista
public class UsuarioControlador {
    private UsuarioDAO usuarioDAO;
    private UsuarioVista usuarioVista;
    private Scanner scanner;

    public UsuarioControlador(UsuarioDAO usuarioDAO, UsuarioVista usuarioVista) {
        this.usuarioDAO = usuarioDAO;
        this.usuarioVista = usuarioVista;
        this.scanner = scanner = new Scanner(System.in);
    }

    public void iniciar(){
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        
        while (!salir){
            System.out.println("------- Menu principal -------");
            System.out.println("1. Crear usuario");
            System.out.println("2. Ver usuarios");
            System.out.println("3. Actualizar usuario");
            System.out.println("4. Eliminar usuario");
            System.out.println("0. Salir.");
            
            try{
                System.out.println("Selecciona una de las opciones: ");
                opcion = sn.nextInt();
            
                switch (opcion){
                    case 1 -> {
                        Usuario nuevoUsuario = usuarioVista.agregarUsuario();
                        usuarioDAO.insertar(nuevoUsuario);
                        System.out.println("Usuario Agregado!");
                        break;
                    }
                    case 2 -> {
                        List<Usuario> usuarios = usuarioDAO.obtenerTodos();
                        usuarioVista.mostrarUsuarios(usuarios);
                        break;
                    }
                    case 3 -> {
                        Usuario usuarioActualizado = usuarioVista.actusuario();
                        usuarioDAO.actualizar(usuarioActualizado);
                        System.out.println("Usuario actualizado!");
                        break;
                    }
                    case 4 -> {
                        System.out.println("Ingrese el ID del usuario a eliminar:");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer
                        usuarioDAO.eliminar(id);
                        System.out.println("Usuario eliminado!");
                        break;
                    }
                    case 0 -> {
                        salir = true;
                    }

                    default -> {
                        System.out.println("Ojo, las opciones son entre 1 y 4");
                    }
                }                
            }catch(InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
        System.out.println("Fin del menú");
    }
}
