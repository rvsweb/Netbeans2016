/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.Array;

import java.util.Random;

/**
 * @see - Libro Vademecum
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicNumAleatorioBasico {

 public static void main(String[] args) {

  Random random = new Random();
  int valor = 1 + random.nextInt(9);
  int valor1 = 100 + random.nextInt(100);
  System.out.println("nº aleatorio 9 : " + valor);
  System.out.println("nº aleatorio 100 : " + valor1);

 }
}
