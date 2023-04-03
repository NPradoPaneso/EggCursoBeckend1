/*
 *Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
(incluyendo a las vocales acentuadas) se mantienen sin cambios.

        a    e    i    o    u   
        @    #    $    %    *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package Guia4_Subprogramas;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio11GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
        System.out.println("escriba una frase");
        String frase = leer.nextLine();
        frase = frase.toLowerCase();        
        
        System.out.println(" la nueva frase es: " + reemplazarVocal (frase) );
    }   
    

    public static String reemplazarVocal(String frase) {
        String nuevaFrase= "";
         
        for (int i = 0; i < frase.length(); i++) {
            nuevaFrase = switch (frase.substring(i, i+1))
            {
                case "a" -> nuevaFrase.concat("@");
                case "e" -> nuevaFrase.concat("#");
                case "i" -> nuevaFrase.concat("$");
                case "o" -> nuevaFrase.concat("%");
                case "u" -> nuevaFrase.concat("*");
                default -> nuevaFrase.concat(frase.substring(i, i+1));
            };

           
        }
                 return nuevaFrase;
    }
}    
   