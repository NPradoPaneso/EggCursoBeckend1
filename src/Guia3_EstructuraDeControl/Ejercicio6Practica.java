/*Realizar un programa que pida dos números enteros positivos por teclado y muestre 
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa 
deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá
ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona 
la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje 
de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona 
el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 * 
 */
package Guia3_EstructuraDeControl;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio6Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1 , num2 , opcion;
        boolean val = true;
                
        String confirmacion;
        
        // pida dos números enteros positivos por teclado
       
        System.out.println("Ingrese el primero numero");
        num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero ");
        num2 = leer.nextInt();
        
        //muestre por pantalla el siguiente menú
        
        do{
            System.out.println("====================");
            System.out.println("|       MENU       |");
            System.out.println("====================");
            System.out.println("| 1. Sumar         |");
            System.out.println("| 2. Restar        |");
            System.out.println("| 3. Multiplicar   |");
            System.out.println("| 4. Dividr        |");
            System.out.println("| 5. Salir         |");
            System.out.println("====================");
            
            System.out.println("Elija una opcion");
            opcion = leer.nextInt();
            
            /*El usuario deberá elegir una opción y el programa 
            deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá
            ejecutarse hasta que se elija la opción 5
            */
            
            switch (opcion){
                case 1 : 
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2 :
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3 :
                    System.out.println("La multiplicacion es: " + (num1 * num2));
                    break;
                case 4 : 
                    if (num2 == 0){
                        System.out.println("Recuerde, no se puede dividir por 0");
                    } else {
                      System.out.println("La division es: " + ((double)num1 / num2));
                    }
                    break;
            /* Tener en cuenta que, si el usuario selecciona 
            la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje 
            de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona 
            el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú       
            */        
                case 5 :
                    System.out.println("¿Esta Seguro que desea salir del programa (S/N)? ");
                    confirmacion = leer.next();
                    if (confirmacion.toLowerCase().equals("s") == true){
                      System.out.println("Saliendo del programa");
                      val = false; 
                    }
                    
                    break;
                default : 
                    System.out.println("De vuelta al menu");
                    
                        
            }
            
        } while(val==true); 
        
    }
    
}
