/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.Recursividad;

/**
 *
 * @author Portatil
 */
public class T4Pag96Recursividad {

 public static void main(String[] args) {

  int x = Recursividad.potencia(2, 3);
  System.out.println(x);
 }
}

class Recursividad {

 Recursividad() {
 }

 public static int potencia(int x, int y) {
  if (y == 1) {
   return x;
  } else {
   return x * potencia(x, y - 1);
  }

 }

}
