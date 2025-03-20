package mvc2;

import controlador.UsuarioControlador;
import modelo.UsuarioDAO;
import vista.UsuarioVista;

public class Mvc2 {

    public static void main(String[] args) {
        UsuarioDAO usuaridao = new UsuarioDAO();
        UsuarioVista usuariovista = new UsuarioVista();
        UsuarioControlador usuariocontrolador =new UsuarioControlador(usuaridao, usuariovista);
        
        usuariocontrolador.iniciar();        
    }    
}
