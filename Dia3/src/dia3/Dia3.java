package dia3;

import java.util.*;

public class Dia3 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        
        while(!salir) {
            System.out.println("1. Números naturales de 1 a n");
            System.out.println("2. Números naturales en orden inverso");
            System.out.println("3. Tablas de multiplicar");
            System.out.println("4. Tablas de multiplicar orden inverso");
            System.out.println("5. Letras del alfabeto de la A a la Z");
            System.out.println("6. Letras del alfabeto de la A a la Z en orden inverso");
            System.out.println("7. Números pares entre 1 y 100");
            System.out.println("8. Números impares entre 1 y 100");
            System.out.println("9. Suma de todos los números naturales entre 1 y n");
            System.out.println("10. Suma de todos los números pares entre 1 y n");
            System.out.println("11. Suma de todos los números impares entre 1 y n");
            System.out.println("12. Valores ASCII");
            System.out.println("13. Factorial de cualquier número");
            System.out.println("14. Calcular el valor de un número elevado a la potencia de otro");
            System.out.println("15. Invertir los dígitos de un número dado");
            System.out.println("16. Calcular la suma de los dígitos de un número");
            System.out.println("17. Verificar si un número dado es primo o no");
            System.out.println("18. Calcular el MCD (Máximo Común Divisor) de dos números dados");
            System.out.println("19. Ingresar números hasta que el usuario lo desee y, al final, muestre la\n cantidad de números positivos, negativos y ceros ingresados.");
            System.out.println("20. Ingresar números hasta que el usuario lo desee y, al final, muestre el\n número más grande y el más pequeño ingresado");
            System.out.println("21. Encontrar los números y la suma de todos los enteros entre 100 y 200\n que sean divisibles por 9");
            System.out.println("22. Convertir un número binario a decimal sin usar arreglos, funciones ni bucles\n while");
            System.out.println("23. Verificar si un número es un Número Fuerte o no");
            System.out.println("24. Convertir un número hexadecimal a decimal");
            System.out.println("25. Convertir un número hexadecimal a octal");
            System.out.println("26. Convertir un número hexadecimal a binario");
            System.out.println("27. Convertir un número decimal a hexadecimal");
            System.out.println("28. Convertir un número decimal a octal");
            System.out.println("29. Convertir un número decimal a binario");
            System.out.println("30. Convertir un número binario a octal");
            System.out.println("31. Convertir un número binario a decimal");
            System.out.println("32. Convertir un número binario a hexadecimal");
            System.out.println("33. Convertir un número octal a binario");
            System.out.println("34. Convertir un número octal a decimal");
            System.out.println("35. Convertir un número octal a hexadecimal.");
            System.out.println("36. Encontrar el complemento a 1 de un número en Java");
            System.out.println("37. Encontrar el complemento a 2 de un número binario en Java");
            System.out.println("38. Imprimir la serie de Fibonacci hasta n términos");
            System.out.println("39. Verificar si un número es un Número Fuerte o no");
            System.out.println("40. Imprimir todos los Números Fuertes del 1 al 100000");
            System.out.println("41. Imprimir todos los Números Perfectos del 1 al 10000");
            System.out.println("42. Verificar si un número es un Número Perfecto o no");
            System.out.println("43. Imprimir todos los Números de Armstrong entre 1 y 1000");
            System.out.println("44. Verificar si un número es un Número de Armstrong o no");
            System.out.println("45. Imprimir los factores primos en Java");
            System.out.println("46. Salir");
            
            try{
                System.out.println("Selecciona una de las opciones: ");
                opcion = sn.nextInt();

                switch(opcion){
                    case 1 -> {
                        System.out.println("Números naturales de 1 a n.");
                            System.out.println("Ingrese el número hasta el que desea llegar: ");
                            int n = sn.nextInt();
                        for (int i = 1; i <= n; i++) {
                            System.out.println(i);
                        }
                    }

                    case 2 -> {
                        System.out.println("Números naturales en orden inverso");
                        System.out.println("Ingrese el número hasta el que desea llegar: ");
                        int n = sn.nextInt();
                        for (int i = n; i >= 1; i--) {
                            System.out.println(" " + i);
                        }
                    }

                    case 3 -> {
                        System.out.println("Tablas de multiplicar");
                        System.out.println("Que tabla de multiplicar desea: ");
                        int num = sn.nextInt();
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(num + " X " + i + " = " + (i*num));
                        }
                    }

                    case 4 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        System.out.println("Que tabla de multiplicar desea: ");
                        int num = sn.nextInt();
                        for (int i = 10; i >= 1; i--) {
                            System.out.println(num + " X " + i + " = " + (i*num));
                        }
                    }

                    case 5 -> {
                        System.out.println("Letras del alfabeto de la A a la Z");
                        for (char alfa = 'A'; alfa <= 'Z'; alfa++) {
                            System.out.println(alfa);
                        }                        
                    }
                    
                    case 6 -> {
                        System.out.println("Letras del alfabeto de la A a la Z en orden inverso");
                        for (char alfa = 'Z'; alfa >= 'A'; alfa--) {
                            System.out.println(alfa);
                        }
                    }
                    
                    case 7 -> {
                        System.out.println("Números pares entre 1 y 100");
                        for (int i = 1; i <= 100; i++) {
                            if(i % 2 == 0){
                                System.out.println(i);
                            }
                        }
                    }
                    
                    case 8 -> {
                        System.out.println("Números impares entre 1 y 100");
                        for (int i = 1; i <= 100; i+=2) {
                            System.out.println(i);
                        }
                    }
                    
                    case 9 -> {
                        System.out.println("Suma de todos los números naturales entre 1 y n");
                                                
                        System.out.println("Escribe la cantidad n de números que desea sumar de los números naturales: ");
                        int cant = sn.nextInt();
                        int sum = 0;
                        for (int i = 1; i <= cant; i++) {
                            sum += i;
                        }
                        System.out.println("La suma total de los primeros " + cant + " números naturales es: " + sum);
                    }
                    
                    case 10 -> {
                        System.out.println("Suma de todos los números pares entre 1 y n");
                        
                        System.out.println("Escribe la cantidad n de números que desea sumar : ");
                        int cant = sn.nextInt();
                        int sum = 0;
                        for (int i = 2; i <= cant; i += 2) {
                                sum += i;                                                      
                        }
                        System.out.println("La suma total es: " + sum);
                    }
                    
                    case 11 -> {
                        System.out.println("Suma de todos los números impares entre 1 y n");
                        
                        System.out.println("Escribe la cantidad n de números que desea sumar : ");
                        int cnt = sn.nextInt();
                        int suma = 0;
                        for (int i = 1; i <= cnt; i += 2) {
                                suma += i;                                                      
                        }
                        System.out.println("La suma total es: " + suma);
                    }
                    
                    case 12 -> {
                        System.out.println("Valores ASCII");
                        
                        char ascii[] = new char[255];
                        char increment = 0;
                        for (int i = 0; i < ascii.length; i++){
                            ascii[i] = increment;
                            increment++;
                        }
                        for (int i = 0; i < ascii.length; i++) {
                            System.out.println("Código " + i + " es: " + ascii[i]);
                        }
                    }
                    
                    case 13 -> {
                        System.out.println("Factorial de cualquier número");
                        
                        System.out.println("Escribe cualquier número: ");
                        int numerito = sn.nextInt();
                        long factorial = 1;
                        for (int i = 1; i <= numerito; ++i) {
                            factorial *= i;
                        }
                        System.out.println("El factorial de ese número es: " + factorial);
                    }
                    
                    case 14 -> {
                        System.out.println("Calcular el valor de un número elevado a la potencia de otro");
                        
                        System.out.print("Ingrese el valor de la base: ");
                        int base = sn.nextInt();
                        System.out.print("Ingrese el valor de la potencia: ");
                        int powerRaised = sn.nextInt();
                        
                        int resultado = 1;
                        for (int i = 0; i < powerRaised; i++) {
                            resultado *= base;
                        }
                        System.out.println("El número: " + base + " elevado a la: " + powerRaised + " es: " + resultado);
                    }
                    
                    case 15 -> {
                        System.out.println("Invertir los dígitos de un número dado");
                        
                        System.out.print("Ingrese un número: ");
                        int x = sn.nextInt();
                        int revers = 0;
                        for(; x != 0; x /=10){
                            int digit = x % 10;
                            revers = revers * 10 + digit;
                        }
                        System.out.println("El número al revés es: " + revers);
                    }
                    
                    case 16 -> {
                        System.out.println("Calcular la suma de los dígitos de un número");
                        System.out.print("Ingrese un número: ");
                        int y = sn.nextInt();
                        int sumita = 0;
                        while(y>0){
                            int dig = y % 10;
                            sumita += dig;
                            y = y / 10;
                        }
                        System.out.println("La suma es: " + sumita);
                    }
                    
                    case 17 -> {
                        System.out.println("Verificar si un número dado es primo o no");
                        System.out.print("Verifiquemos el número: ");
                        int n = sn.nextInt();
                        int i = 1,  c = 0;
                        while(i <= n){
                            if(n % i == 0){
                                c++;
                            }
                            i++;
                        }
                        if(c == 2){
                            System.out.println("El número " + n + " es primo.");
                        } else{
                            System.out.println("El número " + n + " no es primo.");
                        }
                    }
                    
                    case 18 -> {
                        System.out.println("Calcular el MCD (Máximo Común Divisor) de dos números dados");
                        
                    }
                    
                    case 19 -> {
                        System.out.println("Ingresar números hasta que el usuario lo desee y, al final, muestre la\n cantidad de números positivos, negativos y ceros ingresados");
                        
                    }
                    
                    case 20 -> {
                        System.out.println("Ingresar números hasta que el usuario lo desee y, al final, muestre el\n número más grande y el más pequeño ingresado");
                        
                    }
                    
                    case 21 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 22 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 23 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 24 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 25 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 26 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 27 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 28 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 29 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 30 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 31 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 32 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 33 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 34 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 35 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 36 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 37 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 38 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 39 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 40 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 41 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 42 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 43 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 44 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 45 -> {
                        System.out.println("Tablas de multiplicar en orden inverso");
                        
                    }
                    
                    case 46 -> {
                        salir = true;
                    }

                    default -> {
                        System.out.println("Ojo, las opciones son entre 1 y 45");
                    }
                }
            }catch(InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }       
        }
        
        System.out.println("Fin del menú");        
    }
}