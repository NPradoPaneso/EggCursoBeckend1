/*
 * Realizar una multiplacion de un vector por una matriz. Dado un vector 1xN (1 fila por N columna)

   y una matriz NxM, el resultado del producto es 1xM (M=tamaño)

   Ej: vector 1x2 * matriz 2x3 = producto 1x3

    v = |3,5| * m = |4,8,6| = |3*4 + 5*2 , 3*8 + 5*1, 3*6 + 5*7| = |22,29,53|
                    |2,1,7|


 */     

package Egg.introVideos;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Vectores_y_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaracion y creacion de un vector
        //tip[] nombreVector = new tipo[Tamaño]
        
        // Declaracion e inicializacion con valores predeterminados
        int[] vector;
        // Crear en memoria (construir/dimensionar) con el valor por defecto (cero para los enteros)
        vector = new int[2];
        // Los dos pasos en una linea
        int [] producto = new int[3];
        
        // Declaracion y creacion de una matriz
        // Tipo[][] nombreMatriz = new tipo[filas][columnas]
        
        // Declaracion e inicializacion con valores predeterminados
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}};
        
        // Declaracion y creacion de arreglos genericos
        // Tipo[][]...[] nombreArreglo = new tipo[cardinalidad 1][cardinalidad 2].....[cardinalidad N];
           // cuando hay valores predeterminados, no es necesario la cardinalidad
        
        System.out.println("Ingrese los valores del vector de tamaño "+ vector.length +":");
        Scanner leer = new Scanner(System.in);
        // int = 0, porque los subindices de los arreglos en java empiezan en 0
        for (int i = 0; i < vector.length; i++){
            System.out.println("v("+i+")=");
            // Acceder el valor de i del vector
            vector[i] = leer.nextInt();
        }
        
        // Multiplica vector por matriz
        int sum;
        //...para cada columna de la matriz...
        for (int j = 0; j < matriz[0].length; j++){
            sum = 0;
            //...recorro el vector y multiplico
            for (int i = 0; i < vector.length; i++){
                sum += vector[i] * matriz[i][j];
            }
            producto[j] = sum;
        }
        
        String aux = "";
        
        // Mostrar vector
        System.out.println("* vector:");
        // Bucle for  "mejorado" (enhanced)
        // for (tipo elemento: arreglo)
        for (int elemento: vector){
            aux = aux + "  " + elemento;
        }
        System.out.println(aux);
        
        // Mostrar matriz
        System.out.println("\n* Matriz");
        // Para cada fila de la matriz 
        for (int[] fila: matriz){
            aux = "";
            // Para cada elemento de la fila
            for (int elemento: fila){
                aux += " " + elemento;
            }
            System.out.println(aux);
        }
        
        // Mostrar resultado
        aux = "";
        System.out.println("\n* Vector x Matriz");
        for (int elemento: producto){
            aux += "  " + elemento;
        }
        System.out.println(aux);
    }
    
}
