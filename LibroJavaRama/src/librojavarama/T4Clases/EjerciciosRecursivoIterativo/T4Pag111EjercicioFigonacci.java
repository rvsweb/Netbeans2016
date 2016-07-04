/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.EjerciciosRecursivoIterativo;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class T4Pag111EjercicioFigonacci {

 public static void main(String[] args) {
  int c = 0;
  int num = (int) (Math.random() * (1 + 20) + 10);
  for (int i = 0; i < num; i++) {
   System.out.println(" " + Fibonacci.fibonacci(i) + " , ");
   c++;
  }
  System.out.println(" Total : " + c);
 }
}

class Fibonacci {

 public static int fibonacci(int num) {
  if (num == 0) {
   return 0;
  }
  if (num == 1) {
   return 1;
  }
  return fibonacci(num - 1) + fibonacci(num - 2);
 }
}
