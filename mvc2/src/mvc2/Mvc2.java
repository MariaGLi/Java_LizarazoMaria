
package mvc2;

import modelo.UsuarioDAO;
import modelo.Usuario;

public class Mvc2 {

    public static void main(String[] args) {
        UsuarioDAO usuariodao = new UsuarioDAO();
        Usuario usuario = new Usuario("lolo", "lolo@gmail.com");
        
        usuariodao.insertar(usuario);
    }
    
}
