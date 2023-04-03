/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla 
   el doble, el triple y la raíz cuadrada de ese número. 
 */
package Guia2_Encuentros2y3;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
               
        System.out.println("Su numero doble es: " + numero * 2 );
        System.out.println("Su numero triple es: " + numero * 3);
        System.out.println("Su raiz cuadrada es de: " + Math.sqrt(numero));              
                    
        
        
        
    }
    
}
