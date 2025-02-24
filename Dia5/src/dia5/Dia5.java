package dia5;
/**
 *
 * @author María Lizarazo
 */

import java.util.*;

public class Dia5 {
    /**
     * @param args the command line arguments
     */
    
    static List<Hospital> hospitales = new ArrayList<>();
    static List<Personal> empleados = new ArrayList<>();
    static List<Departamentos> departamento = new ArrayList<>();
    static List<Pabellon> pabelloncito = new ArrayList<>();
    static List<Pacientes> pacientico = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Datos prueba.
        hospitales.add(new Hospital(1, "ESE Hospital Regional Norte", "40%"));
        hospitales.add(new Hospital(2, "Hospital Universitario Erasmo Meoz", "60%"));
        hospitales.add(new Hospital(3, "Clínica Medical Duarte", "50%"));
        
        empleados.add(new Personal(1, " Jair Molina", "Auxiliar de enfermería", "11/05/2024", "1.300.000", "0123456789", "Avenida 11E # 8 - 41"));
        empleados.add(new Personal(2, " Isabel Correa", "Enfermera", "26/02/2024", "2.100.000", "9876543210", "Calle 26E # 8 - 41"));
        empleados.add(new Personal(3, " Leidy Gonzalez", "Doctora", "30/07/2024", "3.500.000", "0123459876", "Carrera 3 # 8 - 41"));
        
        departamento.add(new Departamentos(1, "Servicio de enfermería"));
        departamento.add(new Departamentos(2, "Cuidados intensivos y enfermería"));
        departamento.add(new Departamentos(3, "Medicina interna"));
        
        pabelloncito.add(new Pabellon(1, "Pabellón de quemados", "80%"));
        pabelloncito.add(new Pabellon(2, "Pabellón de urgencias", "70%"));
        
        pacientico.add(new Pacientes(1, "Sandra Leal", "07/08/1974", "ESE Hospital Regional Norte", "11/05/2024"));
        pacientico.add(new Pacientes(2, "María Ibarra", "28/10/2003", "Hospital Universitario Erasmo Meoz", "26/02/2024"));
        pacientico.add(new Pacientes(3, "Lina Guzman", "27/08/1999", "Clínica Medical Duarte", "30/07/2024"));
        
        boolean booleano = true; 
        while (booleano) {
            System.out.println("\n----- Sistema Integrado Hospitalario SIH -----");
            System.out.println("1. Ver los hospitales.");
            System.out.println("2. Ver el personal.");
            System.out.println("3. Ver los departamentos.");
            System.out.println("4. Ver los pabellones.");
            System.out.println("5. Ver los pacientes.");          
            System.out.println("0. Salir.");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar la data
            
            switch (opcion) {
               case 1 -> 
                   verHospitales();
                   
               case 2 -> 
                   verPersonal();
                   
               case 3 -> 
                   verDepartamento();
                   
               case 4 -> 
                   verPabellon();
                   
               case 5 -> 
                   verPaciente();
                            
               case 0 -> {
                    System.out.println("¡Fin de la consulta!"); // Sale del programa
                    booleano = false;                    
                }
                default -> System.out.println("Opción no válida.");
            }
        }   
    }
    
    private static void verHospitales() {
        for (Hospital hospi : hospitales) {
            System.out.println(hospi); // Muestra cada concierto con sus detalles
        }
    }
    
    private static void verPersonal() {
        for (Personal empleado : empleados) {
            System.out.println(empleado); // Muestra cada concierto con sus detalles
        }
    }
    
    private static void verDepartamento() {
        for (Departamentos depa : departamento) {
            System.out.println(depa); // Muestra cada concierto con sus detalles
        }
    }
    
    private static void verPabellon() {
        for (Pabellon pabe : pabelloncito) {
            System.out.println(pabe); // Muestra cada concierto con sus detalles
        }
    }
    
    private static void verPaciente() {
        for (Pacientes paciente : pacientico) {
            System.out.println(paciente); // Muestra cada concierto con sus detalles
        }
    }
}
