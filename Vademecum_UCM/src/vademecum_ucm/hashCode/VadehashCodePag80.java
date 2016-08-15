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
public class VadehashCodePag80 {

}

/**
 * Devuelve un numero entero propio que caracteriza el objeto
 *
 * Metodo base proporciona en java.lang.Object es heredado por todos los objetos
 * devolviendo un valor unico, exclusivo e inmutable para cada objeto creado
 *
 * Las clases creadas por el programador pueden devolver otro valor con la unica
 * condicion de que :
 *
 * @author Portatil
 */
class Objetos {

 private int x;
 private int y;

 public Objetos() {
  this.x = 0;
  this.y = 0;
 }

 public Objetos(int x, int y) {
  this.x = x;
  this.y = y;
 }

 public int getX() {
  return x;
 }

 public int getY() {
  return y;
 }

 public void setX(int x) {
  this.x = x;
 }

 public void setY(int y) {
  this.y = y;
 }

 public static void main(String[] args) {

  Objetos ob1 = new Objetos();
  Objetos ob2 = new Objetos();

  ob1.equals(ob2);

  /**
   * Si 2 objetos A y B son iguales segun el metodo 'equals()' entonces ambos
   * deben devolver el mismo hashCode
   *
   */
  if (ob1.hashCode() == ob2.hashCode()) {
   System.out.println("♦ Son iguales ");
  } else {
   System.out.println("• No son iguales ");
   System.out.println("ob1.hashCode() : " + ob1.hashCode());
   System.out.println("ob2.hashCode() : " + ob2.hashCode());
  }

  ob1 = ob2;
  if (ob1.hashCode() == ob2.hashCode()) {
   System.out.println("○ Son iguales ");
   System.out.println("ob1.hashCode() : " + ob1.hashCode());
   System.out.println("ob2.hashCode() : " + ob2.hashCode());
  } else {
   System.out.println("♠ Son iguales ");
   System.out.println("ob1.hashCode() : " + ob1.hashCode());
   System.out.println("ob2.hashCode() : " + ob2.hashCode());
  }

  System.out.printf("\u001B[33mEl valor 'hash' sirve para discriminar rapidamente si 2 objetos son diferentes antes de llamar a equals() \n");
  System.out.println("\u001B[35mSi se Redefine 'equals()' se redefine 'hashCode()'");
 }
}
