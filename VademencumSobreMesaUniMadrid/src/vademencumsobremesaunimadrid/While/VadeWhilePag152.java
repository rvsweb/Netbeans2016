/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.While;

/**
 * @see - 152
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeWhilePag152 {

 static int factorial(int n) {
  int fact = 1;
  while (n > 0) {
   fact *= n;
   n--;
  }
  return fact;
 }

 public static void main(String[] args) {

  int f = factorial(112);
  System.out.println(f);

 }
}
