/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Equals;

/**
 * @see 61
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeEqualsEquivalenciasPag54 {

 public static void main(String[] args) {

  Fraccion f1 = new Fraccion(1, 2);
  Fraccion f2 = new Fraccion(1, 2);
  boolean equivalentes = f1.equals(f2);
  System.out.println("• Son equivalentes : " + equivalentes);
 }

}

class Fraccion {

 private int num;
 private int den;

 /**
  *
  */
 public Fraccion() {
  this.num = 0;
  this.den = 0;

 }

 /**
  *
  * @param num
  * @param den
  */
 public Fraccion(int num, int den) {
  this.num = num;
  this.den = den;
 }

 /**
  *
  * @param x
  * @return
  */
 @Override
 public boolean equals(Object x) {
  if (x == this) {
   return true;
  }
  if (x == null) {
   return false;
  }
//  Si la clase x es distinta de estas clase
  if (x.getClass() != this.getClass()) {
   return false;
  }

  Fraccion fraccion = (Fraccion) x;
  return this.num * fraccion.den == this.den * fraccion.num;
 }

 /**
  * REGLA : Si se Redefine 'equals' , se debe de Redefinir 'hashCode'
  *
  * @return
  */
 @Override
 public int hashCode() {
  return num ^ den;
 }
}
