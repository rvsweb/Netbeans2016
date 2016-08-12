/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Desbordamiento_Igual_OverFlow;

/**
 * @see Se intenta meter mas datos en un contenedor de los que caben 'buffer
 * overflow' para indicar que no caben TANTOS DATOS EN UN BUFFER
 *
 * Aritmética se aplica cuando un valor excede el maximo previsto
 *
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeOverFlowDesbordamientoPag42 {

 public static void main(String[] args) {

  byte b = Integer.BYTES;
  short s = Integer.BYTES;
  int i = Integer.BYTES;
  long l = Integer.BYTES;
  System.out.println(b);
  System.out.println(s);
  System.out.println(i);
  System.out.println(l);

  byte valor = (byte) (1000000 * 10);
  System.out.println("• " + valor);
  int valor1 = 1000000000 * 10;
  System.out.println(valor1);

 }
}
