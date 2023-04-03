/*
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
   de equipo y define su tipo de dato de tal manera que te permita alojar sus 
   nombres más adelante.
 */
package Guia5_ArreglosVectores_y_Matrices;

import java.util.Scanner;

/**
 *
 * @author nicop
 */
public class Ejercicio13GuiaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println();
        String[] Equipo = new String[5];
            Equipo[0] = "Nico";
            Equipo[1] = "Isa";
            Equipo[2] = "Alberto";
            Equipo[3] = "Daniela";
            Equipo[4] = "Lucas";       
                
            
        System.out.println(Equipo[0]);
        System.out.println(Equipo[1]);
        System.out.println(Equipo[2]);
        System.out.println(Equipo[3]);
        System.out.println(Equipo[4]);
        System.out.println();
                
               
    }
    
}
