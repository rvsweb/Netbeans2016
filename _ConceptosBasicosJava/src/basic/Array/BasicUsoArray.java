/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.Array;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicUsoArray {

 public static void main(String[] args) {
//                  0  1  2  3  4  5  6  7
  int[] miArray1 = {1, 2, 3, 4, 5, 6, 7, 8};

  for (int i = 0; i < miArray1[4]; i++) {
   System.out.println(miArray1[i]);
  }

  System.out.println("--------------------------");

//     INICIO     CONDICION        INCREMENTO              
  for (int i = 0; i < miArray1[i]; i++) {
   System.out.println(miArray1[i]);
   if (miArray1[i] == 8) {
//    return; // Con Return : SE TERMINA EL FLUJO DE EJECUCION  
    break; // Con BREAK : Permite que continue el FLUJO DE EJECUCION
   }
  }

  System.out.println("--------------------------");

//              CONDICION NO MODIFICA EL INCREMENTO : SOLO ACORTA EL RECORRIDO DEL BUCLE
  for (int i = 0; i + 2 < miArray1.length; i++) {
   System.out.println(miArray1[i]);
  }

  System.out.println("--------------------------");
// Realiza salto de 2 en 2 
  for (int i = 0; i < miArray1.length; i = i + 2) {
   System.out.println(miArray1[i]);
  }

 }

}
