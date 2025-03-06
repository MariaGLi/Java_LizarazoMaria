package Ejercicio7;

public class KnifeEnemy implements Enemy{
// Implementamos la interfaz enemy 
    public void doActionStab() {
        // doActionStab nos va a definir la acción específica que va a realizar
        System.out.println("Apuñale");
    }

    @Override
    public void doAction() {
        //Nos va a implementar el metodo de la interfaz y nos llamará a doActionStab.
        doActionStab();
    }
}
