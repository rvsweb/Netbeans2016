/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ArrayList;

import java.util.ArrayList;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoArrayListBasicoMetodoGet {

 public static void main(String[] args) {

  ArrayList<Integer> cadena_num = new ArrayList<>();
  cadena_num.add(11);// 0
  cadena_num.add(22);// 1
  cadena_num.add(33);// 2
  cadena_num.add(7); // 3
  cadena_num.add(55);// 4
  cadena_num.add(66);// 5 

  System.out.println("Longitud : " + cadena_num.size());

  System.out.println("1 *****************************");
  System.out.println("• Empieza a contar desde 0 - Recorre todos los elementos desde '0' al '5' ");
  for (int i = 0; i < cadena_num.size(); i++) {
   System.out.println(cadena_num.get(i) + " - " + i); // recorre el ArrayList desde el Indice 1
  }

  System.out.println("2 - El elemento 0 = (11) - No fue alcanzado ");
//  Empieza a contar desde la posicion 1 -> 22
  for (int i = 1; i < cadena_num.size(); i++) {
   System.out.println(cadena_num.get(i) + " - " + i); // recorre el ArrayList desde el Indice 1
  }

  System.out.println("3 - Recorre ArrayList desde Indice 0 al 5 : No llega hasta el ultimo elemento que es 6");
  for (int i = 1; i < cadena_num.size(); i++) {
   System.out.println(cadena_num.get(i - 1) + " - " + i);
  }

  System.out.println("4 - Cadena_num.get(i) Es menor que 10 -> (cadena_num.get(i) < 10) == true)");
  for (int i = 0; i < cadena_num.size(); i++) {
   if ((cadena_num.get(i) < 10) == true) { // condicion booleana : comprueba los valores 
    System.out.println("• Si :  " + cadena_num.get(i) + " -  Es menor que 10");
   } else {
    System.out.println("• No : " + cadena_num.get(i)
    );
   }
  }

  System.out.println("5 - Cadena_num.get(i) Es menor que 10 -> (cadena_num.get(i) + 1)");
  for (int i = 0; i < cadena_num.size(); i++) {
   System.out.print(" • Cuando se imprime por pantalla sin argumentos String - Realiza una suma de los valores : ");
   System.out.println(cadena_num.get(i) + 1);
   System.out.println(" ○ Si lleva argumentos añade el num y NO SUMA:  " + cadena_num.get(i) + 1);

  }
 }
}
