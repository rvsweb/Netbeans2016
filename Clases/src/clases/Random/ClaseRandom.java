/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.Random;

import java.util.Random;

/**
 *
 * @author Portatil
 */
public class ClaseRandom {

 private static int valor1;
 private static int valor2;
 private static int c = 0;

 public static void num_aleatorio() {
  Random rnd = new Random();
  int valor = (int) (rnd.nextDouble() * 100 + 100);
  System.out.println(valor);

  if (valor % 2 == 0) {
   System.out.println(" Soy par ");
  } else if (valor % 2 == 1) {
   System.out.println(" Soy inpar ");
  }
 }

 public static void num_aleatorio_max_parte1(int x, int y) {
  int v = (int) (Math.random() * (Math.max(x, y)));
  System.out.println(" • valor generado : " + v);
 }

 public static void num_aleatorio_max_parte2(int x, int y) {
  Random r = new Random();
  valor1 = (int) (r.nextDouble() * (Math.max(x, y)));
  System.out.println(" ♣ valor generado : " + valor1);
 }

 public static void comparar_num() {
  for (int i = 1; i < 110; i++) {
   Random r = new Random();
   valor1 = (int) (r.nextDouble() * (Math.max(1, 100)));
   valor2 = (int) (Math.random() * (Math.max(1, 100)));
   if (valor1 != valor2) {
    System.out.println(valor1 + " =X= " + valor2);
   } else {
    System.out.println(valor1 + " == " + valor2 + " --> Encontrada coincidencia = " + ++c);
   }
  }
  System.out.println("Total de coincidencias : " + c);
 }

 public static void main(String[] args) {

  for (int i = 0; i < 10; i++) {
   num_aleatorio();
  }
  System.out.println("--------------");
  for (int i = 0; i < 10; i++) {
   num_aleatorio_max_parte1(1, 100);
  }
  System.out.println("--------------");
  for (int i = 0; i < 10; i++) {
   num_aleatorio_max_parte2(1, 100);
  }
  System.out.println("--------------");
  comparar_num();

 }
}
