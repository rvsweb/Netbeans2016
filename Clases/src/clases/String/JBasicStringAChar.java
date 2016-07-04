/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.String;

/**
 *
 * @author TED
 */
public class JBasicStringAChar {

 public static char[] charArray1;

 public static void main(String[] args) {

  String cta = "ctaAsuntoSelect";
  String con = cta.substring(0, 3);
  String unir = " Asunto ";
  for (int i = 0; i < cta.substring(0, 3).length(); i++) {
   if (i == cta.charAt(i)) {
    String concat = con.concat(unir);
    System.out.println(concat);
   }
  }
  cadena("palabra");
 }

 public static void cadena(String str) {
  String almacenar = null;
  for (int i = 0; i < str.length(); i++) {
   char pala = str.charAt(i);
   almacenar = String.valueOf(pala);
  }
  System.out.print(almacenar);
 }
}
