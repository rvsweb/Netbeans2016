/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.DownCasting;

/**
 * @see -
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeDownCastingPag46 {

 public static void main(String[] args) {

 }
}

// Cuando el contenido de una variable de 
// tipo A se asigna a una variable de tipo B 
// siendo B subclase de A 
class A {

}

class B extends A {

 public static void main(String[] args) {

// Solo funciona si 'a' contiene un 
// objeto de clase B 
// "De lo contrario lanza una ClassCastException"
  A a = new A();
  B b = (B) a;

 }
}
