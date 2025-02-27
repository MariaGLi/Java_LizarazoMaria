package trabajorefuerzo;
/**
 *
 * @author María Lizarazo
 */
import java.util.*;

public class TrabajoRefuerzo {
    
    
    
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        PartidosLiga partido = null;
                
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
                        System.out.println("Registremos un partido de liga:");
                        
                        Scanner numJor = new Scanner(System.in);
                        System.out.println("Número de jornada: ");
                        int jornada1 = numJor.nextInt();
                        
                        Scanner nombreEquipo1 = new Scanner(System.in);
                        System.out.println("Nombre del equipo local: ");
                        String equipoLocal1 = nombreEquipo1.nextLine();
                        
                        Scanner nombreEquipo2 = new Scanner(System.in);
                        System.out.println("Nombre del equipo visitante: ");
                        String equipoVisitante1 = nombreEquipo2.nextLine();
                        
                        Scanner cesta = new Scanner(System.in);
                        System.out.println("Cestas equipo local: ");
                        int cestasEqLocal1 = cesta.nextInt();
                        
                        Scanner cesta2 = new Scanner(System.in);
                        System.out.println("Cestas equipo visitante: ");
                        int cestasEqVisit1 = cesta2.nextInt();
                                                
                        Scanner fecha = new Scanner(System.in);
                        System.out.println("Fecha del partido (dd/mm/yyyy): ");
                        String fechaPartido1 = fecha.nextLine();
                                             
                        partido = new PartidosLiga(jornada1, equipoLocal1, equipoVisitante1, cestasEqLocal1, cestasEqVisit1, booleano, fechaPartido1);
                        break;
                        
                    }
                
                
                
                    case 2 -> {
                        System.out.println("Registremos un partido de play off:");
                        
                        break;
                    }

                    case 3 -> {
                        System.out.println("Finalizar partido: ");
                        break;

                    }
                    
                    case 4 -> {
                        System.out.println("Ver información de un partido: ");
                        System.out.println(partido.mostrarPartidoLiga());
                        
                        break;

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
