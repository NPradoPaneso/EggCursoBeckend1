/*
 */ 
package Guia3_EstructuraDeControl;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio8Practica {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadro : ");
        int tamaño = sc.nextInt();
        
        // dibujar la primera fila del cuadrado
        for (int i = 0; i < tamaño; i++) {
            System.out.print("* ");
        }
        System.out.println(); // pasar a la siguiente línea
        
        // dibujar las filas intermedias del cuadrado
        for (int i = 0; i < tamaño - 2; i++) {
            System.out.print("* "); // dibujar el primer asterisco de la fila
            
            // dibujar los espacios en blanco de la fila
            for (int j = 0; j < tamaño - 2; j++) {
                System.out.print("  ");
            }
            
            System.out.println("*"); // dibujar el último asterisco de la fila y pasar a la siguiente línea
        }
        
        // dibujar la última fila del cuadrado
        for (int i = 0; i < tamaño; i++) {
            System.out.print("* ");
        }
        System.out.println("");
    }
}
    