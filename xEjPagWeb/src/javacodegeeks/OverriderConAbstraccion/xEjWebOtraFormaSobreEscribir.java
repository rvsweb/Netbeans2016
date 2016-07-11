/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodegeeks.OverriderConAbstraccion;

import javacodegeeks.*;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class xEjWebOtraFormaSobreEscribir {

}

/* Produce Error esta Overrider 
class Test1 {

 Object x() { // NO
  return "abc";
 }

 String x() { // NO
  return "123";
 }
}
 */
//
//
// Solucion 
abstract class Parent<T> {

 abstract T x();
}

class Child extends Parent<String> {

 @Override
 String x() {
  return "abc";
 }
}
