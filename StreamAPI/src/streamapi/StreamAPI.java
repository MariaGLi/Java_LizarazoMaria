package streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPI {
    /**
     * Stream API es una forma de expresar y procesar colecciones de objeto. 
     * @param args
     */
    public static void main(String[] args) {
        // Lista de listas de nombres
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        // Crear un conjunto para guardar los resultados intermedios
        Set<String> intermediateResults = new HashSet<>();

        // Canalización de flujos que muestra varias operaciones intermedias
        List<String> result = listOfLists.stream()
                .flatMap(List::stream) // Aplanar la lista de listas en un único flujo
                .filter(s -> s.startsWith("S")) // Filtrar elementos que empiezan por "S"
                .map(String::toUpperCase) // Transforma cada elemento a mayúsculas
                .distinct() // Eliminar elementos duplicados
                .sorted() // ordenar elementos.
                .peek(s -> intermediateResults.add(s)) // Realizar una acción (añadir al conjunto) en cada elemento
                .collect(Collectors.toList());   // Recoger el resultado final en una lista

        // Imprimir los resultados intermedios
        System.out.println("Intermediate Results:");
        intermediateResults.forEach(System.out::println);

        // Imprimir el resultado final
        System.out.println("Final Result:");
        result.forEach(System.out::println);
    }
}
