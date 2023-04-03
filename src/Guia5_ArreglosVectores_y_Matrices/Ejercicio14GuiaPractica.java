/*
 *Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus 
  ompañeros de equipo
 */
package Guia5_ArreglosVectores_y_Matrices;

/**
 *
 * @author nicop
 */
public class Ejercicio14GuiaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] Equipo = new String[5];

        for (int i = 0; i < Equipo.length; i++)
        {
            switch (i)
            {
                case 0 ->
                    Equipo[i] = "Nicolas";
                case 1 ->
                    Equipo[i] = "Isa";
                case 2 ->
                    Equipo[i] = "Alberto";
                case 3 ->
                    Equipo[i] = "Daniela";
                case 4 ->
                    Equipo[i] = "Lucas";

            }
        }
        for (int i = 0; i < Equipo.length; i++){
          System.out.println(Equipo[i]);  
        }
        
    }

}
