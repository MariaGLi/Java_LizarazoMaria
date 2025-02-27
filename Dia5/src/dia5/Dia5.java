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
    static int sigIdEmpleado = 4; //Id asignado en continuación
    static int sigIdPaciente = 4;
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
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
            System.out.println("6. Agrega.");
            System.out.println("7. Elimina.");
            System.out.println("0. Salir.");
            System.out.print("Seleccione una opción: ");
            int opcion = sn.nextInt();
            sn.nextLine(); // Limpiar la data
            
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
                   
               case 6 -> {
                   boolean opc = true;
                   while(opc) {
                        System.out.println("1. Agrega un empleado.");
                        System.out.println("2. Agrega un paciente.");
                        System.out.println("0. Salir.");
                        System.out.print("Seleccione una opción: ");
                        int opcion2 = sn.nextInt();
                        sn.nextLine(); // Limpiar la data
                        
                        switch (opcion2) {
                            case 1 -> {
                                System.out.println("Inserte los datos del empleado que desea agregar: ");
                                System.out.println("Ingrese el nombre del empleado: ");
                                String nombre = sn.nextLine();
                                System.out.println("Ingrese el cargo del empleado: ");
                                String cargo = sn.nextLine();
                                System.out.println("Ingrese la fecha de vinculación del empleado: ");
                                String fecha_vinc = sn.nextLine();
                                System.out.println("Ingrese el salario del empleado: ");
                                String salario = sn.nextLine();
                                System.out.println("Ingrese el teléfono del empleado: ");
                                String tel = sn.nextLine();
                                System.out.println("Ingrese la dirección del empleado: ");
                                String direc = sn.nextLine();
                                Personal empleadito = new Personal(sigIdEmpleado++, nombre, cargo, fecha_vinc, salario, tel, direc);
                                empleados.add(empleadito); // Se agg el empleado a la lista
                                System.out.println("Empleado registrado: " + empleadito.nombre);
                            }
                            
                            case 2 -> {
                                System.out.println("Inserte los datos del paciente que desea agregar: ");
                                System.out.println("Ingrese el nombre del paciente: ");
                                String nombre = sn.nextLine();
                                System.out.println("Ingrese la fecha de nacimiento del paciente: ");
                                String fecha_nac = sn.nextLine();
                                System.out.println("Ingrese el hospital asociado del paciente: ");
                                String hospAsoc = sn.nextLine();
                                System.out.println("Ingrese la fecha de ingreso del paciente: ");
                                String fecha_ing = sn.nextLine();
                                Pacientes paciente = new Pacientes(sigIdPaciente++, nombre, fecha_nac, hospAsoc, fecha_ing);
                                pacientico.add(paciente); // Se agg el empleado a la lista
                                System.out.println("Paciente registrado: " + paciente.nombre);
                            }
                            
                            case 0 -> {
                                System.out.println("¡Has regresado al menú principal!"); // Sale del programa
                                opc = false;                    
                            }
                            default -> System.out.println("Opción no válida.");
                        }
                   }
                }
               
               case 7 -> {
                   Scanner id = new Scanner(System.in);
                   System.out.println("Inserte el id del paciente que desea eliminar: ");
                   String NuevoId = id.nextLine();
                   
                   /*for (int i = 0; i < pacientico.size(); i++) {
                       if(pacientico.remove(i).id.equals(NuevoId)){
                       } else {
                           
                       }
                   }*/
               }
                            
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
            System.out.println(hospi);
        }
    }
    
    private static void verPersonal() {
        for (Personal empleado : empleados) {
            System.out.println(empleado);
        }
    }
    
    private static void verDepartamento() {
        for (Departamentos depa : departamento) {
            System.out.println(depa);
        }
    }
    
    private static void verPabellon() {
        for (Pabellon pabe : pabelloncito) {
            System.out.println(pabe);
        }
    }
    
    private static void verPaciente() {
        for (Pacientes paciente : pacientico) {
            System.out.println(paciente);
        }
    }
}
