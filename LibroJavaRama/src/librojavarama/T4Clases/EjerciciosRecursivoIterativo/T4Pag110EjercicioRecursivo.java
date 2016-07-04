/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.EjerciciosRecursivoIterativo;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class T4Pag110EjercicioRecursivo {

 public static void main(String[] args) {

  System.out.println("El factorial recursivo de 0 es : " + FactorialRecursivo.factorial_recursivo(0));
  System.out.println("El factorial recursivo de 1 es : " + FactorialRecursivo.factorial_recursivo(1));
  System.out.println("El factorial recursivo de 2 es : " + FactorialRecursivo.factorial_recursivo(2));
  System.out.println("El factorial recursivo de 3 es : " + FactorialRecursivo.factorial_recursivo(3));
  System.out.println("El factorial recursivo de 4 es : " + FactorialRecursivo.factorial_recursivo(4));
  System.out.println("El factorial recursivo de 5 es : " + FactorialRecursivo.factorial_recursivo(5));
  System.out.println("");
  System.out.println("El factorial iterativo de 0 es : " + FactorialIterativo.factorial_iterativo(0));
  System.out.println("El factorial iterativo de 1 es : " + FactorialIterativo.factorial_iterativo(1));
  System.out.println("El factorial iterativo de 2 es : " + FactorialIterativo.factorial_iterativo(2));
  System.out.println("El factorial iterativo de 3 es : " + FactorialIterativo.factorial_iterativo(3));
  System.out.println("El factorial iterativo de 4 es : " + FactorialIterativo.factorial_iterativo(4));
  System.out.println("El factorial iterativo de 5 es : " + FactorialIterativo.factorial_iterativo(5));

 }
}

class FactorialRecursivo {

 public static int factorial_recursivo(int num) {
  if (num == 0) {
   return 1;
  }
  return num * factorial_recursivo(num - 1);
 }
}

class FactorialIterativo {

 public static int factorial_iterativo(int num) {
  int factorial = 1;
  while (num > 0) {
   factorial *= num;
   num--;
  }
  return factorial;
 }
}
