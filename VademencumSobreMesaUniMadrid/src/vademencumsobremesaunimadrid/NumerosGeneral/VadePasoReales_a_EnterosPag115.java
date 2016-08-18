/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.NumerosGeneral;

/**
 * @see -
 * @since -
 * @version -
 * @author Raul Vela Salas
 */
public class VadePasoReales_a_EnterosPag115 {

 public static void main(String[] args) {

  double n = Math.PI;
  System.out.println(n);

  int e = (int) n;
  System.out.println(e);

  double f = n - e;
  System.out.println(f);

  double floor = Math.floor(n);
  System.out.println("suelo : " + floor);

  double ceil = Math.ceil(n);
  System.out.println("techo : " + ceil);

  long round = Math.round(4.45);
  System.out.println("redondeo : " + round);

  long round1 = Math.round(4.45);
  System.out.println("redondeo : " + round1);
 }
}
