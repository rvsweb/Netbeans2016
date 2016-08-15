/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.hashCode;

/**
 * @see - 86
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadehashCodeFraccionPag82 {

}

/**
 * Equivalencia puede depender de las propiedades algebraicas del tipo de objeto
 * de que se trate
 *
 * @author Portatil
 */
class Fraccion {

 private int num;
 private int den;

 @Override
 public boolean equals(Object x) {
  if (x == this) {
   return true;
  }
  if (x == null) {
   return false;
  }
  if (x.getClass() != this.getClass()) {
   return false;
  }
  Fraccion fraccion = (Fraccion) x;
  return this.num * fraccion.den == this.den * fraccion.num;
 }

 @Override
 public int hashCode() {
  return num ^ den;
 }

 public static void main(String[] args) {

  Fraccion f1 = new Fraccion();
  Fraccion f2 = new Fraccion();

  boolean cierto = f1.equals(f2);
  System.out.println(cierto);

  int fhash1 = f1.hashCode();
  int fhash2 = f2.hashCode();
  System.out.println("- " + fhash1);
  System.out.println("• " + fhash2);

 }
}
