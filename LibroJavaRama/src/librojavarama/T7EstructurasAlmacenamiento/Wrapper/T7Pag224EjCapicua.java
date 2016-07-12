/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento.Wrapper;

/**
 * @see libro ej 8
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class T7Pag224EjCapicua {

 public static boolean esCapicua(int dato) {
  Integer i = new Integer(dato);
  String reverse = new StringBuffer(i.toString()).reverse().toString(/*Este toString convierte el objeto String*/);
//  Comprueba que el valor es igual de forma original a la forma inversa
  System.out.println("La valor es " + dato + " : " + i.toString().equals(reverse));
  return i.toString().equals(reverse.toString());
 }

 public static void main(String[] args) {
  boolean cierto = false;
  int c = 0;
  int nim = 0;
  int max = 1000;

  do {
   System.out.print(++c + " ");
//   cierto = esCapicua((int) (Math.random() * (nim + max) + max));
   cierto = esCapicua((int) ((Math.random() * (Math.max(1, 1999)))));
  } while (!cierto);

 }
}
