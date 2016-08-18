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
public class VadeNumerosRealesFueraRangoPag115 {

 public static void main(String[] args) {

  double n = Double.MAX_VALUE;
  System.out.println("n= " + n);
  System.out.println("2n= " + 2 * n);// overflow
  System.out.println("");

  n = Double.MIN_VALUE;
  System.out.println("n= " + n);
  System.out.println("n/2= " + n / 2);// underflow
  System.out.println("");

 }
}
