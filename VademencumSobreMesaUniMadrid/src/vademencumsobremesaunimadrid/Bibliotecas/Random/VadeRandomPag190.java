/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Random;

import java.util.Random;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeRandomPag190 {

 /**
  * Objetos de esta clase sirven para generar numeros aleatorio
  *
  * @param args
  */
 public static void main(String[] args) {

//  2 Constructores
//• Crea un objeto que genera num aleatorio
  Random r = new Random();
//• Crea objeto que generan numero aleatorio con la
//  particularidad de que si se crean dos objetos con la misma semilla , ambos objetos
//  generaran la misma serie de numeros
  Random r1 = new Random(100);
//  ♦ Metodos
  boolean nextBoolean = r1.nextBoolean();
  System.out.println("Verdadero : ? " + nextBoolean);
  int entero_aleatorio = r.nextInt();
  System.out.println("entero aleatorio : " + entero_aleatorio);
  long long_aleatorio2 = r.nextLong();
  System.out.println("numero aleatorio : " + long_aleatorio2);

  byte[] b = new byte[10];
  r.nextBytes(b);
  for (int i = 0; i < b.length; i++) {
   System.out.print("|" + b[i]);
  }
  System.out.println("");

  double aleatorio_double = r.nextDouble();
  System.out.println("-• " + aleatorio_double * 100);

  float aleatorio_float = r.nextFloat();
  System.out.println("-♦ " + aleatorio_float * 100);

  /**
   * Un real aleatorio con una distribucion estandar de media 0.0 y deviacion
   * tipica 1.0
   *
   */
  double siguiente_gaussian = r.nextGaussian();
  System.out.println("-♣ " + siguiente_gaussian);
 }
}
