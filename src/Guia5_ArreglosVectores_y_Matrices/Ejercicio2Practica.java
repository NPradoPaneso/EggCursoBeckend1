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
        
        // Crear objetos para leer de la entrada estándar y generar números aleatorios
        Scanner leer = new Scanner(System.in);
        Random numAleatorio = new Random();
        
        // Pedir al usuario el tamaño del vector
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        // Crear un vector de tamaño n y llenarlo con valores aleatorios
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++){
            num[i] = numAleatorio.nextInt(n);           
        }
            
        // Pedir al usuario el número a buscar
        System.out.println("Ingrese el numero a buscar");
        int numBuscado = leer.nextInt();
        
        // Inicializar variables para almacenar la posición donde se encontró el número buscado y la cantidad de repeticiones
        int numPosicion = -1;
        int numRepeticiones = 0;
        
        // Imprimir el vector
        System.out.println("El vector es: ");
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i] + " ");
        }
        System.out.println();
        
        // Recorrer el vector para buscar el número buscado y contar sus repeticiones
        for (int i = 0; i < num.length; i++){
            if (num[i] == numBuscado){ // Si el número actual es igual al número buscado
                if (numPosicion == -1){ // Si es la primera vez que se encuentra el número buscado
                    numPosicion = i; // Almacenar la posición donde se encontró el número buscado
                }
                numRepeticiones++; // Incrementar la cantidad de repeticiones
            }
        }
        
        /* Mostrar la posición donde se encontró el número buscado (si se encontró) 
           y la cantidad de repeticiones (si el número está repetido)
        */
        if (numPosicion != -1){
           System.out.println("El numero " + numBuscado + " se encuentra en la posicion " + numPosicion);
           if (numRepeticiones > 1){
               System.out.println("el numero " + numBuscado + " esta repetido " + (numRepeticiones - 1) + " veces");
           }
        } else {
            System.out.println("El numero " + numBuscado + " no se ha encontrado en el vector" );    
                
        }
                
    }
    
}
