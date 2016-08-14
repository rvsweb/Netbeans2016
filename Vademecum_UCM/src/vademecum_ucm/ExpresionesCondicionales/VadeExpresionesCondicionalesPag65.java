/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.ExpresionesCondicionales;

/**
 * @see 71
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeExpresionesCondicionalesPag65 {

 public static void main(String[] args) {

  int x = 5;
  int y = 1;
//  Tipo variable = condicion ? v1 : v2;

  int r0 = x > y ? 1 : 0;
  System.out.println("valor de r : " + r0);
  int r1 = x > y ? x : y;
  System.out.println("valor de r : " + r1);

  boolean b0 = x > y;
  System.out.println("b0 es : " + b0);
  String s0 = x > y ? "Si" : "No";
  System.out.println("s0 es : " + s0);

  String cad = "a";
  String cad1 = "b";
  String s1 = cad != cad1 ? cad : cad1;
  System.out.println("" + s1);
  String s2 = (cad == null ? cad1 != null : !cad.equals(cad1)) ? cad : cad1;
  System.out.println("" + s2);
  String s3 = !cad.equals(cad1) ? cad : cad1;
  System.out.println("" + s3);

  int[] a = new int[]{1, 2, 3, 4, 5};
  int[] ba = new int[]{11, 22, 33, 44, 55};

  int va1 = a[0] > ba[0] ? 1 : 2;
  System.out.println("Valor del array " + va1);
  int va2 = a[0] > ba[0] ? a[1] : ba[0];
  System.out.println("Valor del array " + va2);

 }
}
