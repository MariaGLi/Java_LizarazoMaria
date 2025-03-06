package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Enemy> enemies;
    // Declaramos la lista que nos almacenará los enemigos del juego
    private boolean endGame = false;
    // Declaramos una variable que nos controlará la finalización del juego.
    
        public void init() {
        enemies = new ArrayList<>();
        enemies.add(new KnifeEnemy());
        enemies.add(new GunEnemy());
        // Este metodo nos permitira agg más enemigos a cualquiera de las dos clases.
    }

// Este  metodo ejecutara el bucle While hasta que endGame sea verdadero
    void run() {
        while (!endGame) {
            for (Enemy enemy : enemies) {
                enemy.doAction();
            }
        }
    }
    
// Se crea la instancia Game, se llama a init para que inicie el juego
// y se llama a run para que inicie el bucle hasta llegar a true y acabar el juego.
    public static void main(String[] args) {
        Game game = new Game();
        game.init();
        game.run();
    }
}
