/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.UsoThis;

/**
 *
 * @author Portatil
 */
public class T4Pag88UsoMetodoEquals {

 public static void main(String[] args) {

  Rectangulo r1 = new Rectangulo(5, 7);
  Rectangulo r2 = new Rectangulo(5, 7);

  Rectangulo r3 = r1;

  if (r1.equals(r2)) {
   System.out.println("Son iguales r1 y r2 ");
  }

  if (r1.equals(r3)) {
   System.out.println("Son iguales r1 y r3 ");
  }
 }
}
