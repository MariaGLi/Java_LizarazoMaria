package trabajorefuerzo;
/**
 *
 * @author María Lizarazo
 */
import java.util.*;

public class TrabajoRefuerzo {
    
    static List<PartidosLiga> pL = new ArrayList<>();
    static List<PartidosPlayOff> pO = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        
        //Datos Prueba
        pL.add(new PartidosLiga(1, "Boston Celtics", "LA Lakers", 106, 99, true, "25/02/2025"));
        pL.add(new PartidosLiga(2, "Chicago Bulls", "Toronto Raptors", 106, 99, true, "24/02/2025"));
        
        pO.add(new PartidosPlayOff("Octavos", "New York Knicks", "Dallas Mavericks", 120, 110, true, "22/02/2025"));
        pO.add(new PartidosPlayOff("Cuartos", "Miami Heat", "Philadelphia 76ers", 99, 101, true, "23/02/2025"));
        pO.add(new PartidosPlayOff("Final", "Utah Jazz", "Houston Rockets", 88, 107, true, "26/02/2025"));
        
        boolean booleano = true;
        int opcion;
        while (booleano) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrar un partido de liga.");
            System.out.println("2. Registrar un partido play off.");
            System.out.println("3. Finalizar partido.");
            System.out.println("4. Ver información de un partido.");
            System.out.println("0. Salir.");
            System.out.println("Selecciona una de las opciones: ");
            opcion = sn.nextInt();
            sn.nextLine(); // Limpiar la data
            
            try{
                
                switch(opcion){
                    case 1 -> {
                        Scanner numJor = new Scanner(System.in);
                        System.out.print("Número de jornada: ");
                        int jornada1 = numJor.nextInt();
                        
                        Scanner nombreEquipo1 = new Scanner(System.in);
                        System.out.println("Nombre del equipo local: ");
                        String equipoLocal1 = nombreEquipo1.nextLine();
                        
                        Scanner nombreEquipo2 = new Scanner(System.in);
                        System.out.print("Nombre del equipo visitante: ");
                        String equipoVisitante1 = nombreEquipo2.nextLine();
                        
                        Scanner cesta = new Scanner(System.in);
                        System.out.print("Cestas equipo local: ");
                        int cestasEqLocal1 = cesta.nextInt();
                        
                        Scanner cesta2 = new Scanner(System.in);
                        System.out.print("Cestas equipo visitante: ");
                        int cestasEqVisit1 = cesta2.nextInt();
                                                
                        Scanner fecha = new Scanner(System.in);
                        System.out.print("Fecha del partido (dd/mm/yyyy): ");
                        String fechaPartido1 = fecha.nextLine();
                                             
                        pL.add(new PartidosLiga(jornada1, equipoLocal1, equipoVisitante1, cestasEqLocal1, cestasEqVisit1, booleano, fechaPartido1));
                        System.out.println(pL);
                    }
                
                
                
                    case 2 -> {
                        System.out.println("Bienvenido Trainer");
                        break;
                    }

                    case 3 -> {
                        System.out.println("Bienvenido Estudiante");


                    }

                    case 0 -> {
                        booleano = false;
                        System.out.println("Fin del programa.");            
                    }

                    default -> {
                        System.out.println("Ojo, las opciones son entre 1 y 4.");
                    }
                }
            }catch(InputMismatchException e) {
            System.out.println("Cuidado, aca debe insertar un numero.");
            sn.next();
            }       
        }
    }
    
}
