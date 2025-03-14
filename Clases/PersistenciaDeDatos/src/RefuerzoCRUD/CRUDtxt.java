package RefuerzoCRUD;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CRUDtxt {
    private static String archivo = "./src/RefuerzoCRUD/data.txt";
    private static List<Persona> personas = new ArrayList<>();
    private static List<Producto> producto = new ArrayList<>();
    
    //Cargar los datos persistentes
    public static void cargarDatos(){
        personas.clear();
        producto.clear();
        try(BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("Persona")){
                    personas.add(Persona.fromString(linea));
                }
                else if(linea.startsWith("Producto")){
                    producto.add(Producto.fromString(linea));
                }                
            }
        }
        catch(Exception e){
            System.out.println("No se puede cargar el archivo. Se procede a crear uno nuevo.");
        }
    }
    
    public static void listarPersonas(){
        if(personas.isEmpty()){
            System.out.println("No hay una lista de personas.");
        }
        else{
            for(Persona p : personas){
                System.out.println(p);
            }
        }
    }
    
    public static void listarProductos(){
        if(personas.isEmpty()){
            System.out.println("No hay una lista de productos.");
        }
        else{
            for(Producto pr : producto){
                System.out.println(pr);
            }
        }
    }
}
