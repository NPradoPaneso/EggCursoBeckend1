/*
 * Realizar un algoritmo que llene un vector con los 100 primeros números 
   enteros y los muestre por pantalla en orden descendente.
 */
package Guia5_ArreglosVectores_y_Matrices;

/**
 *
 * @author nicop
 */
public class Ejercicio1Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = new int[100];
                
        for (int i = 0; i < num.length; i++){
            num[i] = i + 1;
        } 
        
        for (int i = num.length -1; i >= 0; i--){
            System.out.println(num[i]);
        }
        
    }
    
}
