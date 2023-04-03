/*
 * 
 */
package Guia4_Subprogramas;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio2Practica {

    /**
     * @param args the command line arguments
     */
    
    /*
    Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
    de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
    Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
    mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        String nombre;
        int edad, n;
        String respuesta;
        
        do {
            System.out.println("Ingrese el numero de personas que desea añadir");
            n = leer.nextInt();
            leer.nextLine();
            
            
            for(int i=1; i <= n; i++){
                System.out.println("Persona #" + i + " :");
                System.out.println("Ingrese el nombre: ");
                nombre = leer.nextLine();
                System.out.println("Ingrese la edad: ");
                edad = leer.nextInt();
                leer.nextLine();
                
                
                System.out.println("Nombre: "+ nombre +" Edad: "+ edad);
                if(edad >= 18){
                    System.out.println("Es mayor de edad");
                } else {
                    System.out.println("Es menor de edad");
                }
                    System.out.println();
                }
                System.out.println("Desea ingresar mas persona? Ingrese NO para salir");
                respuesta = leer.nextLine();
            } while (!respuesta.equalsIgnoreCase("NO"));
            
            System.out.println("El programa ha finalizado2");
        }
        
        
    }
    

