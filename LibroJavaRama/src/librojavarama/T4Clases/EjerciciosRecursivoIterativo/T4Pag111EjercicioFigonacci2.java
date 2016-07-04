/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.EjerciciosRecursivoIterativo;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class T4Pag111EjercicioFigonacci2 {

 public static void main(String[] args) {
  int n = 2;
  int num1 = 0, num2 = 1, nums;

  if (n == 1) {
   System.out.println(n - 1);
  }
  if (n == 2) {
   System.out.println((n - 2) + " \n " + (n - 1));
  }
  if (n > 2) {
   System.out.println(num1);
   for (int i = 2; i < n; i++) {
    nums = num1 + num2;
    num2 = num1;
    num1 = nums;
    System.out.println(nums);
   }
  }

 }
}
