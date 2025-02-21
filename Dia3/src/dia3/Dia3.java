package dia3;

import java.util.*;

public class Dia3 {
    
    //Funcion ejercicio 24.
    public static int convertHexaDeci(String hexadecimal){
        final String DIGITOS = "0123456789ABCDEF";
        hexadecimal = hexadecimal.toUpperCase();
        
        int decimal = 0;
        for (int i = 0; i < hexadecimal.length(); i++) {
            char caracter = hexadecimal.charAt(i);
            int digit = DIGITOS.indexOf(caracter);
            
            decimal = 16 * decimal + digit;
        }
        return decimal;
    }
    

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        
        while(!salir) {
            System.out.println("\n1. Números naturales de 1 a n");
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
                        while(x != 0){
                            int digit = x % 10;
                            revers = revers * 10 + digit;
                            x/=10;
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
                        System.out.print("Ingrese el primer número: ");
                        int num1 = sn.nextInt();
                        System.out.print("Ingrese el segundo número: ");
                        int num2 = sn.nextInt();
                        
                        while (num2 != 0) {                            
                            int temp = num2;
                            num2 = num1 % num2;
                            num1 = temp;
                        }
                        System.out.println("MCD = " + num1);
                    }
                    
                    case 19 -> {
                        System.out.println("Ingresar números hasta que el usuario lo desee y, al final, muestre la\n cantidad de números positivos, negativos y ceros ingresados");
                        int positivo = 0, negativo = 0, cero = 0;
                        int opc = -1;
                        
                        while (opc != 2) {                            
                            System.out.print("Ingrese un número: ");
                            int num = sn.nextInt();
                            
                            if(num>0) positivo++;
                            if(num<0) negativo++;
                            else if(num == 0) cero ++;
                            
                            System.out.print("¿Desea continuar? [1 = Si / 2 = No] ");
                            opc = sn.nextInt();
                        }
                        System.out.println("Los positivos son: " + positivo + " Los negativos son: " + negativo + " Los ceros son: " + cero);
                    }
                    
                    case 20 -> {
                        System.out.println("Ingresar números hasta que el usuario lo desee y, al final, muestre el\n número más grande y el más pequeño ingresado");
                        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
                        int opc2 = -1;
                        
                        while (opc2 != 2) {                            
                            System.out.print("Ingrese un número: ");
                            int num = sn.nextInt();
                            
                            if(num > max) max = num;
                            if(num < min) min = num;
                            
                            System.out.print("¿Desea continuar? [1 = Si / 2 = No] ");
                            opc2 = sn.nextInt();
                        }
                        System.out.println("Número mayor = " + max + " Número menor = " + min);
                    }
                    
                    case 21 -> {
                        System.out.println("Encontrar los números y la suma de todos los enteros\n entre 100 y 200 que sean divisibles por 9");
                        int sum = 0;
                        for (int i = 100; i <= 200; i++) {
                            if (i % 9 == 0) {
                                System.out.println(i);
                                sum+=i;
                            }
                        }
                        System.out.println("La suma total de los divisores de 9 es: " + sum);
                    }
                    
                    case 22 -> {
                        System.out.println("Convertir un número binario a decimal sin usar arreglos,\n funciones ni bucles while");
                        System.out.println("Escribe el número binario: ");
                        String bin = sn.next();
                        
                        int decimal = 0;
                        for (int i = bin.length() -1; i >= 0; i--) {
                            if (bin.charAt(i) == '1') {
                                decimal += Math.pow(2,(bin.length()-i-1));
                            }
                        }
                        System.out.println("Decimal: " + decimal);
                    }
                    
                    case 23 -> {
                        System.out.println("Verificar si un número es un Número Fuerte o no");
                        
                        System.out.println("Escribe cualquier número: ");
                        int numerito = sn.nextInt();
                        
                        int fuerte = numerito;
                        int sumaFactoriales = 0;
                        while(numerito > 0){
                           int digito  = numerito % 10;
                           int factorial = 1;
                           
                            for (int i = 1; i <= digito; i++) {
                                factorial*= i;
                            }
                            sumaFactoriales += factorial;
                            numerito /= 10;
                        }
                        if(sumaFactoriales == fuerte){
                            System.out.println("Este es un número fuerte.");
                            break;
                        }else {
                            System.out.println("Este no es un número fuerte");
                            break;
                        }
                    }
                    
                    case 24 -> {
                        System.out.println("Convertir un número hexadecimal a decimal");
                        System.out.println("Escribe el hexadecimal: ");
                        String hexadecimal = sn.next();
                        System.out.println(convertHexaDeci(hexadecimal));
                    }
                    
                    case 25 -> {
                        System.out.println("Convertir un número hexadecimal a octal");
                        System.out.print("Escribe el hexadecimal: ");
                        String hexadecimal = sn.next(); 
                        
                        int decimal = Integer.parseInt(hexadecimal, 16);
                        String octal = Integer.toOctalString(decimal);
                        System.out.println("El octal es: " + octal);
                    }
                    
                    case 26 -> {
                        System.out.println("Convertir un número hexadecimal a binario");
                        
                        System.out.print("Escribe el hexadecimal: ");
                        String hexadecimal = sn.next(); 
                        
                        int decimal = Integer.parseInt(hexadecimal, 16);
                        String binario = Integer.toBinaryString(decimal);
                        System.out.println("El número binario es: " + binario);
                    }
                    
                    case 27 -> {
                        System.out.println("Convertir un número decimal a hexadecimal");
                        System.out.print("Escribe el Decimal: ");
                        int decimal = sn.nextInt();
                        
                        String hexadecimal = Integer.toHexString(decimal);
                        System.out.println("El hexadecimal es: " + hexadecimal);
                    }
                    
                    case 28 -> {
                        System.out.println("Convertir un número decimal a octal");
                        System.out.print("Escribe el Decimal: ");
                        int decimal = sn.nextInt();
                        
                        String octal = Integer.toOctalString(decimal);
                        System.out.println("El octal es: " + octal);
                    }
                    
                    case 29 -> {
                        System.out.println("Convertir un número decimal a binario");
                        System.out.print("Escribe el Decimal: ");
                        int decimal = sn.nextInt();
                        
                        String binario = Integer.toBinaryString(decimal);
                        System.out.println("El binario es: " + binario);
                    }
                    
                    case 30 -> {
                        System.out.println("Convertir un número binario a octal");
                        System.out.print("Escribe el binario: ");
                        String binario = sn.next();
                        
                        int decimal = Integer.parseInt(binario, 2);
                        String octal = Integer.toOctalString(decimal);
                        System.out.println("El Octal es: " + octal);
                    }
                    
                    case 31 -> {
                        System.out.println("Convertir un número binario a decimal");
                        System.out.print("Escribe el binario: ");
                        String binario = sn.next();
                        
                        int decimal = Integer.parseInt(binario, 2);
                        System.out.println("El decimal es: " + decimal);
                    }
                    
                    case 32 -> {
                        System.out.println("Convertir un número binario a hexadecimal");
                        System.out.print("Escribe el binario: ");
                        String binario = sn.next();
                        
                        int hexadecimal = Integer.parseInt(binario, 2);
                        String hexa = Integer.toHexString(hexadecimal);
                        System.out.println("El Hexadecimal es: " + hexa);
                    }
                    
                    case 33 -> {
                        System.out.println("Convertir un número octal a binario");
                        System.out.print("Escribe el octal: ");
                        String octal = sn.next();
                        
                        int oct = Integer.parseInt(octal, 8);
                        String binario = Integer.toBinaryString(oct);
                        System.out.println("El binario es: " + binario);
                    }
                    
                    case 34 -> {
                        System.out.println("Convertir un número octal a decimal");
                        System.out.print("Escribe el octal: ");
                        String octal = sn.next();
                        
                        int decimal = Integer.parseInt(octal, 8);
                        System.out.println("El decimal es: " + decimal);
                    }
                    
                    case 35 -> {
                        System.out.println("Convertir un número octal a hexadecimal");
                        System.out.print("Escribe el octal: ");
                        String octal = sn.next();
                        
                        int hexaDecimal = Integer.parseInt(octal, 8);
                        String hexa = Integer.toHexString(hexaDecimal).toUpperCase();
                        System.out.println("El decimal es: " + hexa);
                    }
                    
                    case 36 -> {
                        System.out.println("Encontrar el complemento a 1 de un número en Java");
                        System.out.println("Escriba un número: ");
                        int numero = sn.nextInt();
                        
                        int complemento = ~numero;
                        System.out.println("El complemento a 1 del número es: " + complemento);
                    }
                    
                    case 37 -> {
                        System.out.println("Encontrar el complemento a 2 de un número binario en Java");
                        System.out.print("Escribe el binario: ");
                        String binario = sn.nextLine();
                        
                    }
                    
                    case 38 -> {
                        System.out.println("Imprimir la serie de Fibonacci hasta n términos");
                        System.out.print("Introduce la cantidad de números que deseas ver de la serie de Fibonacci: ");
                        int n = sn.nextInt();

                        // Variables iniciales para la serie de Fibonacci
                        int num1 = 0, num2 = 1;

                        System.out.print("Serie de Fibonacci:\n");

                        // Imprimir los primeros n términos de la serie de Fibonacci
                        for (int i = 1; i <= n; ++i) {
                            System.out.println(num1 + " ");
                            int siguienteNumero = num1 + num2;  // Calcular el siguiente término
                            num1 = num2;  // Actualizar num1
                            num2 = siguienteNumero;  // Actualizar num2
                        }
                    }
                    
                    case 39 -> {
                        System.out.println("Verificar si un número es un Número Fuerte o no");
                        System.out.println("Escribe cualquier número: ");
                        int numerito = sn.nextInt();
                        
                        int fuerte = numerito;
                        int sumaFactoriales = 0;
                        while(numerito > 0){
                           int digito  = numerito % 10;
                           int factorial = 1;
                           
                            for (int i = 1; i <= digito; i++) {
                                factorial*= i;
                            }
                            sumaFactoriales += factorial;
                            numerito /= 10;
                        }
                        if(sumaFactoriales == fuerte){
                            System.out.println("Este es un número fuerte.");
                            break;
                        }else {
                            System.out.println("Este no es un número fuerte");
                            break;
                        }
                    }
                    
                    case 40 -> {
                        System.out.println("Imprimir todos los Números Fuertes del 1 al 100000");
                        for (int i = 1; i <= 100000; i++) {
                            int suma = 0;
                            int temp = i;
                            while (temp != 0) {
                                int digito = temp % 10;
                                int factorial = 1;
                                for (int j = 1; j <= digito; j++) {
                                    factorial *= j;  // Calcular el factorial del dígito
                                }
                                suma += factorial;  // Sumar el factorial del dígito
                                temp /= 10;  // Eliminar el último dígito
                            }
                            if (suma == i) {
                                System.out.println(i);  // Imprimir el número si es fuerte
                            }
                        }
                    }
                    
                    case 41 -> {
                        System.out.println("Imprimir todos los Números Perfectos del 1 al 10000");
                        for (int i = 1; i <= 10000; i++) {
                            int suma = 0;
                            // Encontrar y sumar los divisores propios de i
                            for (int j = 1; j < i; j++) {
                                if (i % j == 0) {
                                    suma += j;
                                }
                            }
                            // Verificar si la suma de los divisores es igual al número
                            if (suma == i) {
                                System.out.println(i);
                            }
                        }
                    }
                    
                    case 42 -> {
                        System.out.println("Verificar si un número es un Número Perfecto o no");
                        System.out.print("Introduce un número: ");
                        int numero = sn.nextInt();
                        int suma = 0;

                        // Encontrar y sumar los divisores propios del número
                        for (int i = 1; i < numero; i++) {
                            if (numero % i == 0) {
                                suma += i;
                            }
                        }
                        // Verificar si la suma de los divisores es igual al número
                        if (suma == numero) {
                            System.out.println(numero + " es un Número Perfecto.");
                        } else {
                            System.out.println(numero + " no es un Número Perfecto.");
                        }
                    }
                    
                    case 43 -> {
                        System.out.println("Imprimir todos los Números de Armstrong entre 1 y 1000");
                        for (int i = 1; i <= 1000; i++) {
                            int numero = i;
                            int suma = 0;
                            int longitud = String.valueOf(numero).length(); // Encontrar la longitud del número

                            // Calcular la suma de los dígitos elevados a la potencia del número de dígitos
                            int temp = numero;
                            while (temp != 0) {
                                int digito = temp % 10;
                                suma += Math.pow(digito, longitud);
                                temp /= 10;
                            }
                            // Verificar si la suma es igual al número original
                            if (suma == numero) {
                                System.out.println(numero);
                            }
                        }
                    }
                    
                    case 44 -> {
                        System.out.println("Verificar si un número es un Número de Armstrong o no");
                        System.out.print("Introduce un número: ");
                        int numero = sn.nextInt();

                        int temp = numero;
                        int suma = 0;
                        int longitud = String.valueOf(numero).length();  // Encontrar la longitud del número

                        // Calcular la suma de los dígitos elevados a la potencia del número de dígitos
                        while (temp != 0) {
                            int digito = temp % 10;
                            suma += Math.pow(digito, longitud);
                            temp /= 10;
                        }
                        // Verificar si la suma es igual al número original
                        if (suma == numero) {
                            System.out.println(numero + " es un Número de Armstrong.");
                        } else {
                            System.out.println(numero + " no es un Número de Armstrong.");
                        }
                    }
                    
                    case 45 -> {
                        System.out.println("Imprimir los factores primos en Java");
                        System.out.print("Introduce un número: ");
                        int numero = sn.nextInt();
                        System.out.print("Los factores primos de " + numero + " son: ");

                        // Encontrar y imprimir los factores primos
                        for (int i = 2; i <= numero; i++) {
                            while (numero % i == 0) {
                                System.out.print(i + " ");
                                numero /= i;
                            }
                        }
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