package Ejercicio1;

public class SOLID_Caract {
    /**
    * 1. Principios SOLID
    * Mencione cuáles son los principios denominados SOLID y describa brevemente sus características.
    * 
    * S - Principio de responsabilidad única:
    * Establece que una clase debe tener una única responsabilidad, es decir, una sola razón para cambiar. 
    * Esto implica que la clase debe estar enfocada en una sola tarea o funcionalidad, lo que mejora la cohesión
    * del código y facilita su mantenimiento. La S se refiere precisamente a este principio, donde la 
    * "razón para cambiar" es identificada como "responsabilidad"
    * 
    * O - Principio de Abierto / Cerrado:
    * Establece que las clases deben estar abiertas para su extensión, pero cerradas para su modificación. Esto 
    * significa que se deben poder agregar nuevas funcionalidades a una clase sin modificar su código existente. 
    * Para lograr esto, se puede utilizar la herencia o la implementación de nuevas interfaces.
    * 
    * L -  Principio de sustitución de Liskov:
    * Establece que los objetos de una clase derivada deben poder ser sustituidos por objetos de su clase base 
    * sin afectar el correcto funcionamiento del programa. En otras palabras, las subclases deben ser capaces de 
    * mantener las propiedades y comportamientos de la clase padre.
    * 
    * I - Principio de segregación de interfaz:
    * Sugiere que se deben crear interfaces que sean específicas para un tipo de cliente o una finalidad concreta.
    * En lugar de tener una única interfaz que obligue a las clases a implementar muchos métodos que no utilizarán,
    * es preferible contar con muchas interfaces que definan un número reducido de métodos, cada una enfocada en una
    * funcionalidad específica. De esta manera, las clases solo implementarán las interfaces que realmente necesiten 
    * y evitarán la implementación innecesaria de métodos. El ISP promueve la segregación de interfaces para mantener 
    * la cohesión y prevenir la dependencia de código innecesario.
    * 
    * D - Principio de inversión de dependencias:
    * "Depende de abstracciones, no de clases concretas". Según este principio, los módulos de alto nivel no deben depender 
    * de los módulos de bajo nivel; ambos deben depender de abstracciones. Además, las abstracciones no deben depender de 
    * los detalles, sino que los detalles deben depender de las abstracciones.
    * El objetivo del DIP es reducir las dependencias entre los módulos del código y lograr un bajo acoplamiento entre las clases.
    * Al depender de abstracciones en lugar de clases concretas, el código se vuelve más flexible, reutilizable y fácil de mantener,
    * ya que los cambios en las clases concretas no afectarán a los módulos de alto nivel que dependen de ellas.
    */
}
