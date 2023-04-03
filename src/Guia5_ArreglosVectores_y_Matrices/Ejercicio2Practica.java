/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
   y le pida al usuario un número a buscar en el vector. El programa mostrará dónde
   se encuentra el numero y si se encuentra repetido
 */
package Guia5_ArreglosVectores_y_Matrices;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio2Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random numAleatorio = new Random();
        
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++){
            num[i] = numAleatorio.nextInt(n);           
        }
            
        
        System.out.println("Ingrese el numero a buscar");
        int numBuscado = leer.nextInt();
        int numPosicion = -1;
        int numRepeticiones = 0;
        
          System.out.println("El vector es: ");
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i] + " ");
        }
        System.out.println();
        
        
        for (int i = 0; i < num.length; i++){
            if (num[i] == numBuscado){
                if (numPosicion == -1){
                    numPosicion = i;
                }
                numRepeticiones++;
            }
        }
        
        if (numPosicion != -1){
           System.out.println("El numero " + numBuscado + " se encuentra en la posicion " + numPosicion);
           if (numRepeticiones > 1){
               System.out.println("el numero " + numBuscado + " esta repetido" + (numRepeticiones - 1) + " veces");
           }
        } else {
            System.out.println("El numero " + numBuscado + " no se ha encontrado en el vector" );    
                
        }
                
    }
    
}
