/*
 * 
 */
package Guia4_Subprogramas;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio12GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    
    /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
    usuario, validando que el primer número múltiplo del segundo e imprima si el 
    primer número es múltiplo del segundo, sino informe que no lo son.
    */    
public static void main(String[] args) {
    
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = leer.nextInt();
        
        esMultiplo(num1, num2);
    }
    
    public static void esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
    }
    
}
