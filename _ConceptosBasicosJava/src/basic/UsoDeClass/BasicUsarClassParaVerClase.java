/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.UsoDeClass;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class BasicUsarClassParaVerClase {
}

class ClasePrueba {

 private String cadena;
 private int numero;

 public ClasePrueba() {
  this.cadena = null;
  this.numero = 0;

 }

 public ClasePrueba(String cadena, int numero) {
  this.cadena = cadena;
  this.numero = numero;
 }

}

class VerClase {

 public Class getClaseActual() {
//  Class className = Class.class;
  Class className = VerClase.class;
  System.out.println("Class.class " + className);
  return className;
 }

 public static void main(String[] args) throws ClassNotFoundException {

  VerClase verClase = new VerClase();
  Class claseActual2 = verClase.getClaseActual();
  System.out.println("Ver clase : " + claseActual2);

 }

}
