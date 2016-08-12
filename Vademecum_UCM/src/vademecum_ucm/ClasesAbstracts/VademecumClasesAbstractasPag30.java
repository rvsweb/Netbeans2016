/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.ClasesAbstracts;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VademecumClasesAbstractasPag30 {

}

abstract class Serie {

 private final int t0;

 protected Serie(int t0) {
  this.t0 = t0;
 }

 public abstract int termino(int n);

 /**
  *
  * @return
  */
 public int t0() {
  return t0;
 }

 /**
  *
  * @param n
  * @return
  */
 public int suma(int n) {
  int suma = 0;
  for (int i = 0; i < n; i++) {
   suma += termino(i);
  }
  return suma;
 }
}

class ClaseNormal extends Serie {

 public ClaseNormal(int t0) {
  super(t0);
 }

 @Override
 public int termino(int n) {
  return n;
 }

}
