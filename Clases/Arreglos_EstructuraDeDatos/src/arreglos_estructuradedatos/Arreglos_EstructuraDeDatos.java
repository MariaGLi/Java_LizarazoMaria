package arreglos_estructuradedatos;
/**
 *
 * @author María Lizarazo
 */
public class Arreglos_EstructuraDeDatos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arreglito;
        
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
    }
    // 
}
