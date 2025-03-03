package conjuntos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
/**
 *
 * @author María Lizarazo
 */
public class Conjuntos {

    public static void main(String[] args) {
        // Conjuntos, mapas, enumeraciones y excepciones
        // SETS:
        //Los sets son una coleccion desordenada de objetos en la que no se pueden almacenar
        // valores duplicados.
        
        TreeSet<String> treeSet = new TreeSet<>();
        //Agg elementos al TreeSet.
        treeSet.add("Manzana");
        treeSet.add("Fresa");
        treeSet.add("Naranja");
        treeSet.add("Pera");
        //Mostrar los elementos del TreeSet
        System.out.println("Elementos en TreeSet: " + treeSet);
        
        // Iteración en un Árbol
        // 1. Importar "Iterator" y navegar con ese iterador
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
           System.out.println(iterator.next());
        }
        System.out.println("#############################");
        // 2. Con un for-each
        for (String elemento:treeSet){
            System.out.println(elemento);
        }
        
        // Obtener el tamaño del conjunto
        int tamano = treeSet.size(); // Esto almacena el número de elementos del conjunto en la variable tamaño
        System.out.println(tamano);
        
        // Convertir el Set en un String
        String resultado = treeSet.toString(); // Esto almacena una representación en cadena del conjunto en la variable resultado
        System.out.println(resultado);
        
        //MAPAS
        // Los mapas son una estructura de datos que me permite guardar informacion en manera de
        //asociacion de clave / valor muy parecido a los diccionarios.
        Map<String, Integer> hashMap = new HashMap<>();

        // Asignar valores al mapa usando el método put()
        hashMap.put("Juan", 25);
        hashMap.put("María", 30);
        hashMap.put("Luis", 28);
        hashMap.put("Ana", 35);

        // Acceder y mostrar los valores del HashMap
        System.out.println("Edad de Juan: " + hashMap.get("Juan"));
        System.out.println("Edad de María: " + hashMap.get("María"));
        System.out.println("Edad de Luis: " + hashMap.get("Luis"));
        System.out.println("Edad de Ana: " + hashMap.get("Ana"));
        
        //Iterar entre un mapa
        // 1. Importando Iterator
        Iterator<Map.Entry<String, Integer>> iterator2 = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
           Map.Entry<String, Integer> entry = iterator2.next();
           String clave = entry.getKey();
           Integer valor = entry.getValue();
           System.out.println("Nombre: " + clave + ", Edad: " + valor);
        }
        System.out.println("--------------------------------------------");
        // 2. Bucle for-each
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String clave = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("Nombre: " + clave + ", Edad: " + valor);
        }
        System.out.println("////////////////////////////////////////////////");
        
        //Instanciar un enumerador
        Pais francia = Pais.FRANCIA;
        String nombre = francia.name(); //Devuelve un String con el nombre de la constante (FRANCIA).
        System.out.println(nombre);
        System.out.println(francia.toString()); // Develve un String con el nombre de la constante (FRANCIA).
        System.out.println(francia.ordinal()); // Devuelve un entero con la posición del enum según está declarada (1).
        System.out.println(francia.values()); // Devuelve un array que contiene todos los valores del enum.
        
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        
        // Acceder a las constantes de la enumeración
        Pais miPais = Pais.ESPANA;
        
        //Obtener información del país
        String nombrePais = miPais.getNombre();
        String capitalPais = miPais.getCapital();
        
        //Imprimir información del país
        System.out.println("País: " + nombrePais);
        System.out.println("Capital: " + capitalPais);
        
        
    }
    
}
