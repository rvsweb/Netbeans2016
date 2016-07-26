/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.UsoThis;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicUsoCorrectoThisEntreClasesInternasExternas {

 public static void main(String[] args) {

 }
}

class Outer {

 class Inner {

  void foo() {
// Can also be used to refer to the outer object / Puede tambien se usaba para referenciar a otro objeto
   Outer o = Outer.this;
  }
 }

}
