/*Dada una cantidad de grados centígrados se debe mostrar su equivalente 
  en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). 
*/
package Guia2_Encuentros2y3;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados centigrados para convertir a fahrenheit");
        int celcius = leer.nextInt();
        double fahrenheit = 32 + (9 * celcius / 5); 
        System.out.println("Su equivalente en Fahrenheit es de " + fahrenheit + "F°");
        
        
        
        

        
        
        
    }
    
}
