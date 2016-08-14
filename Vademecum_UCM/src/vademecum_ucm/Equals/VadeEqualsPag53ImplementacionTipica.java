/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Equals;

/**
 * @see 63
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeEqualsPag53ImplementacionTipica {

 public static void main(String[] args) {

  Cc c = new Cc();
  Cc c1 = new Cc();

  boolean equivalentes = c.equals(c);
  System.out.println("• c.equals(c) -> " + equivalentes);
  boolean equivalentes1 = c.equals(c1);
  System.out.println("• c.equals(c1) -> " + equivalentes1);
  c = c1;
  System.out.println("• c = c1; ");
  int chas = c.hashCode();
  System.out.println("♦ c.hashCode() -> " + chas);
  int c1has = c1.hashCode();
  System.out.println("♦ c1.hashCode() -> " + c1has);

 }
}

class Cc {

 @Override
 public boolean equals(Object x) {
  if (x == this) {
   return true;
  }
  if (x == null) {
   return false;
  }
  if (x instanceof C == false) {
   return false;
  }
  return false;
 }

 @Override
 public int hashCode() {
  int hash = 7;
  return hash;
 }
}
