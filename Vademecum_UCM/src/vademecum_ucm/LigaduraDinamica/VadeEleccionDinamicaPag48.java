/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.LigaduraDinamica;

/**
 * @see - Cuando una variable es POLIMORFICA y puede referirse a OBJETOS de
 * varias subclases , el metodo que se ejecuta depende del tipo del OBJETO en
 * TIEMPO de Ejecucion ( NO DEPENDE DEL TIPO de la VARIABLE , SINO DEL TIPO DEL
 * OBJETO )
 *
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeEleccionDinamicaPag48 {

 public static void main(String[] args) {

  A a = new A();
  B b = new B();
  A ab = new B(); // upcasting 

  System.out.println(a.getMe());
  System.out.println(b.getMe());
  System.out.println(ab.getMe()); // Sabe que es B 

 }
}

/**
 * Sean dos clases A y B
 *
 * Sea B una extension de A
 *
 * A define un metodo
 *
 * B redefine el mismo metodo
 *
 * Cuando una variable de tipo A se refiere a un objeto de tipo B las llamadas
 * al metodo que existe en ambas clases , elige el metodo de B
 *
 * @author Portatil
 */
class A {

 public String getMe() {
  return "• Soy A";
 }
}

class B extends A {

 @Override
 public String getMe() {
  return "♦ Soy B";
 }

}
