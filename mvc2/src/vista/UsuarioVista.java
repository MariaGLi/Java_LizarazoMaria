package vista;



import java.util.List;
import java.util.Scanner;
import modelo.Usuario;

/*Vista*/
/*La vista maneja la interacción con el usuario.*/
public class UsuarioVista {
    public void mostrarUsuarios(List<Usuario> usuarios){
        System.out.println("Lista de usuarios:");
        for (Usuario u : usuarios){
            System.out.println(u);
        }
    }

    public Usuario agregarUsuario(){
        System.out.println("Datos para nuevo usuario");
        System.out.println("Nombre:");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Email");
        String email = sc.nextLine();
        return new Usuario(nombre,email);
    }
}
