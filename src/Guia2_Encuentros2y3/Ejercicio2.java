/*Escribir un programa que pida tu nombre, lo 
  guarde en una variable y lo muestre por pantalla.
 */
package Guia2_Encuentros2y3;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apelllido");
        String nombre = leer.nextLine();
        System.out.println("Su nombre y apellido es " + nombre);
        
        
        
    }
    
}
