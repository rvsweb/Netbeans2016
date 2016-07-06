/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicstring;

import static basicstring.JBasicStringAChar.charArray1;

/**
 *
 * @author TED
 */
public class JBasicStringContarLetrasYCompararlas {

 public static void cadena2(String str) {
  int contador = 0;

  for (int i = 0; i < str.length(); i++) {
   charArray1 = str.toCharArray();
   char l = str.charAt(i);
   if (str.charAt(i) == 'a') {
    contador++;
   }
   if (str.charAt(i) == 'p') {
    System.out.println("soy la letra p");
   }
   System.out.println("Cada Vuelta muestra la siguiente letra  " + l);
  }
  System.out.println("Total de letras '" + str.charAt(1) + "' son : " + contador);

  System.out.println(".....................");
  String palabraCompleta = String.valueOf(charArray1);

  if (palabraCompleta.equals(str)) {
   System.out.println("Si");
   System.out.println(palabraCompleta);
   System.out.println("");
  }

  if (palabraCompleta.compareToIgnoreCase(str) == 0) {
   System.out.println("Tb");
   System.out.println(palabraCompleta);
   System.out.println("");
  }
 }

 public static void main(String[] args) {

  cadena2("palabra");
 }
}
