package controlador;

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
        
        while (!salir){
            System.out.println("Menu principal ");
            System.out.println("1. Crear usuario");
            System.out.println("2. Ver usuarios");
            System.out.println("3. Actualizar usuario");
            System.out.println("4. Eliminar usuario");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> {
                    Usuario nuevoUsuario = usuarioVista.agregarUsuario();
                    usuarioDAO.insertar(nuevoUsuario);
                    System.out.println("Usuario Agregado!");
                    break;
                }
            }
        }
    }
}
