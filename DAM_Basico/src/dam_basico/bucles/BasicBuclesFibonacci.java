/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam_basico.bucles;

import java.util.Scanner;

/**
 * @title..:
 * @todo...:
 * @example:
 * @date...:
 * @author TED
 */
public class BasicBuclesFibonacci {

 private static Scanner teclado = new Scanner(System.in);

 public static void main(String[] args) {
  int num = leerDatos("Introduzca un numero entero positivo: ");
  fib(num);

 }

 public static int leerDatos(String mensage) {
  boolean entero;
  int num = 0;
  do {
   entero = true;
   System.out.print("\n" + mensage);
   try {
    String texto = teclado.next();
    num = Integer.parseInt(texto);
   } catch (NumberFormatException e) {
    System.out.print("\n No introdujo un numero entero.\n " + e.getMessage());
    entero = false;
   }
  } while (entero == false);
  return num;
 }

 public static void fib(int num) {
  int fib;

  if (num == 0) {
   fib = 0;
   System.out.println(fib);
  } else if (num == 1) {
   fib = 0;
   System.out.println(fib);
   fib = 1;
   System.out.println(fib);
  } else {
   int num2 = 0;
   System.out.println(num2);
   int num1 = 1;
   System.out.println(num1);

   for (int i = 2; i <= num; i++) {
    int parc = num1;
    num1 = num1 + num2;
    num2 = parc;
    System.out.println(num1);
   }
  }

  System.out.println("");
  System.out.println("2º forma ");

  int[] fibo = new int[num + 1];
  fibo[0] = 0;
  System.out.println(fibo[0]);
  fibo[1] = 1;
  System.out.println(fibo[1]);
  for (int i = 2; i <= num; i++) { //3
   fibo[i] = fibo[i - 1] + fibo[i - 2];
   System.out.println(fibo[i]);
  }
 }
}
