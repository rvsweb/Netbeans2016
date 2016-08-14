/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Finally;

/**
 * @see - 70
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeFinallyPag70algoritmo {

}

class Funcion {

 private static final double ERROR = 1E-12;

 public double y(double x) {
  return Math.tan(x);
 }

 public double cero(double a, double z)
         throws Exception {
  if (a > z) {
   throw new Exception("a > z");
  }
  double fa = y(a);
  double fz = y(z);
  if (Math.abs(fa) < ERROR) {
   return a;
  }
  if (Math.abs(fz) < ERROR) {
   return z;
  }
  if (fa * fz > 0) {
   throw new Exception("no pasa por cero en el intervalo");
  }
  double m = (a + z) / 2;
  double fm = y(m);
  if (Math.abs(fm) < ERROR) {
   return m;
  }
  if (Math.abs(a - z) < ERROR) {
   throw new Exception("función discontinua");
  }
  if (fa * fm < 0) {
   return cero(a, m);
  } else {
   return cero(m, z);
  }
 }

 public static void main(String[] args)
         throws Exception { // nadie captura la excepción
  long t0 = System.currentTimeMillis();
  try {
   Funcion f = new Test();
   System.out.println("raíz= " + f.cero(1, 3));
  } finally {
   long t2 = System.currentTimeMillis();
   System.out.println((t2 - t0) + "ms");
  }
 }

 private static class Test extends Funcion {

  public Test() {
  }
 }
}
