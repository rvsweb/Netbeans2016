/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.notacion_compacta;

/**
 * @see pag 21
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VademecumAsignacionBasica {

}

class ExpresionesAsignacion {

 public static void main(String[] args) {

  int x = 5;
  int xx = 5;

  x += 1;
  System.out.println("x += 1; " + x);
  x -= 1;
  System.out.println("x -= 1; " + x);
  x *= 1;
  System.out.println("x *= 1; " + x);
  x /= 1;
  System.out.println("x /= 1; " + x);
  x %= 1;
  System.out.println("x %= 1; " + x);
  xx &= 1;
  System.out.println("xx &= 1; " + x);
  xx |= 1;
  System.out.println("xx |= 1; " + x);
  x++;
  System.out.println("x++; " + x);
  ++x;
  System.out.println("++x; " + x);
  x--;
  System.out.println("x--; " + x);
  --x;
  System.out.println("--x; " + x);

  System.out.println("--------------------------------------");

  int y = 2;
  y &= 2;
  System.out.println(y);
  
  y = y & 2;

 }

}
