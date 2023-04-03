/*
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está 
   entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package Guia3_EstructuraDeControl;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio08GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nota de 0 a 10");
        int nota = leer.nextInt();
        
        while (nota < 0 || nota > 10){
            System.out.println("Ingrese la nota nuevamente");
            nota = leer.nextInt();
        }
            System.out.println("Su nota es" + nota);
        
    }
    
}
