package arreglos_estructuradedatos;
/**
 *
 * @author María Lizarazo
 */
//import java.util.*;

public class Arreglos_EstructuraDeDatos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int [] arreglito;
        
        int [] arreglito2 = new int [5];
        arreglito2[0]=8;
        System.out.println(arreglito2[0]);
        System.out.println(arreglito2.length);
        
        for (int i = 0; i < arreglito2.length; i++) {
            System.out.println(arreglito2[i]);
        }
        System.out.println("-----------------------------------");
        
        //Matrices:
        //Las matrices son arreglos multidimensionales, donde java se crea
        //comúnmente las de dos dimensiones.
        int cantFilas = 3;
        int cantColumnas = 2;
        
        int[][] matriz = new int [cantFilas][cantColumnas]; // tipo de dato [cantidad de filas] [cantidad de columnas]
        matriz [0][0]= 1;
        matriz [0][1]= 2;
        matriz [1][0]= 3;
        matriz [1][1]= 4;
        matriz [2][0]= 5;
        matriz [2][1]= 6;
        
        for (int i = 0; i < cantFilas; i++) {
            for (int q = 0; q < cantColumnas; q++) {
                System.out.println(matriz[i][q]);
            }
        }
        
        // Declaración de un ArrayList de 'String'. Puede ser de cualquier otro elemento u objeto(float, boolean, object, ...)
        ArrayList<String> nombreArrayList = new ArrayList<String>(); 
        
        // Añade el elemento al ArrayList 
        nombreArrayList.add("Elemento"); 
        
        // Añade el elemento al ArrayList en la posición 'n' 
        nombreArrayList.add(5,  "Elemento 2"); 
        
        // Devuelve el numero de elementos del ArrayList 
        nombreArrayList.size(); 
        
        // Devuelve el elemento que esta en la posición '2' del ArrayList 
        nombreArrayList.get( 2); 
        
        // Comprueba se existe del elemento ('Elemento') que se le pasa como parametro 
        nombreArrayList.contains ("Elemento"); 
        
        // Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList 
        nombreArrayList.indexOf("Elemento"); 
        
        // Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList 
        nombreArrayList.lastIndexOf ("Elemento"); 
        
        // Borra el elemento de la posición '5' del ArrayList 
        nombreArrayList.remove(5); 
        
        // Borra la primera ocurrencia del 'Elemento que se le pasa como parametro. 
        nombreArrayList.remove("Elemento"); 
        
        //Borra todos los elementos de ArrayList 
        nombreArrayList.clear(); 
        
        // Devuelve True si el ArrayList esta vacio. Sino Devuelve False 
        nombreArrayList.isEmpty();
        
        // Copiar un ArrayList 
        ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();
        
        //Pasa el Arraylist a un Array
        //object[] array = nombreArrayList.toArray();
        */
        System.out.println("-------------------------------------------");
        
        int n = 3;
        String [][] matrix = new String [n][n];
        int a = 0;
        int b = n-1;
        int valor=1;
        for (int j = 0; j < matrix.length; j++) {
            // llenar fila superior
            for (int i = a; i <= b; i++) {
                matrix[a][i] = valor++ + " ";
            }

            // llenar columna del extremo derecho
            for (int i = a+1; i <= b; i++) {
                matrix[i][b] = valor++ + " ";
            }

            // llenar la fila inferior de derecha a izquierda
            for (int i = b-1; i >= a; i--) {
                matrix[b][i] = valor++ + " ";
            }

            // llenar la columna del extremo izquierdo de abajo hacia arriba
            for (int i = b-1; i >= a+1; i--) {
                matrix[i][a] = valor++ + " ";
            }
            a++; b--;
        }//fin ciclo externo
        
        //mostrar la matriz
        for (int f = 0; f < matrix.length; f++) {
            for (int i = 0; i < matrix[f].length; i++) {
                System.out.print(matrix[f][i]);
            }
            System.out.println();//cambio de filla se vea un salto de línea
        }
    }
    
}
