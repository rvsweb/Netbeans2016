/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.casting;

/**
 * @see pag27
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeUsoCastingPag27 {

 public static void main(String[] args) {

// Una variable de tipo A recibe el valor de una variable de tipo B
  System.out.println("Upcasting");
  B b = new B();
  A a = (A) b; // explicito : no es necesario
  A aa = b; // implicito
  System.out.println("Downcasting");
  A a1 = new A();
//  B b1 = (B) a1; //explicito -> es necesario ERROR

  A a2 = new B();
  B b2 = (B) a2; //explicito -> es necesario

  System.out.println(" Factible ");
  A a3 = new B();
  B b3 = (B) a3;

  System.out.println(" ClassCastException ");
  A a4 = new A();
//  B b4 = (B) a4; // Produce Error
 }
}

class A {

}

class B extends A {

}
