package vista;

import java.util.List;
import java.util.Scanner;
import modelo.Usuario;

/*Vista*/
/*La vista maneja la interacción con el usuario.*/
public class UsuarioVista {
    
    Scanner sc = new Scanner(System.in);
    
    public void mostrarUsuarios(List<Usuario> usuarios){
        System.out.println("Lista de usuarios:");
        for (Usuario u : usuarios){
            System.out.println(u);
        }
    }

    public Usuario agregarUsuario(){
        System.out.println("Datos para nuevo usuario");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        return new Usuario(nombre,email);
    }
    
    public Usuario actusuario(){
        System.out.println("Ingresa el id del usuario que desea actualizar: ");
        int id = sc.nextInt();
        System.out.println("Nuevo nombre: ");
        String nom = sc.nextLine();
        System.out.println("Nuevo email: ");
        String em = sc.nextLine();
        return new Usuario(id,nom,em);
    }
}
