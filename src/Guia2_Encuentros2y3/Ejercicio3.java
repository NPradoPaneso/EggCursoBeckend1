/*Escribir un programa que pida una frase y la muestre toda en mayúsculas
  y después toda en minúsculas. 
 */
package Guia2_Encuentros2y3;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase");
        String frase = leer.nextLine();    
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        
        
        
        
    }
    
}
