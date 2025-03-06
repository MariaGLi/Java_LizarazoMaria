package Ejercicio7;

public class GunEnemy implements Enemy{
    // Implementamos la interfaz enemy 
    
    public void doActionShoot() {
        // doActionShoot nos va a definir la acción específica que va a realizar
        System.out.println("Dispara");
    }
    
    @Override
    public void doAction() {
        //Nos va a implementar el metodo de la interfaz y nos llamará a doActionShoot.
        doActionShoot();
    }
    
}


