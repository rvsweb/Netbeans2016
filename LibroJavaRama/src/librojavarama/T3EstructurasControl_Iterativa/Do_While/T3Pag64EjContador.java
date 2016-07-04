/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T3EstructurasControl_Iterativa.Do_While;

/**
 *
 * @author Portatil
 */
public class T3Pag64EjContador {

 public static int potencia(int x, int y) {
  return (int) Math.pow(x, y);
 }

 public static void main(String[] args) {

  int num = 1;
  int num2 = 10;

  int num3 = 1;
  int num4 = 10;
  do {
   System.out.println("valores : " + num);
  } while (num++ < --num2);

  System.out.println(" num3 " + num3);
  System.out.println(" num4 " + num4);
  while (num3++ <= potencia(1, 3)) {
   System.out.println("valores 2 : " + potencia(num3, num4));
  }
 }
}
