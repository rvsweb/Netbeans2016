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
public class BasicUsoCorrectoThisDentroMetodosGet {

}

/**
 * CUANDO SE DECLARA 'this' DENTRO DE UN METODO VOID 'set' SIEMPRE REFERENCIARA
 * A LA Variable Referencia OBJETO QUE SE DECLARE DENTRO DEL CONSTRUCTOR
 *
 * @author Portatil
 */
class Ejem22 {

 private String valor = "22";

 public Ejem22() {
  this.valor = null;
 }

 public Ejem22(String valor) {
  this.valor = valor;
 }

 public String getValor() {
  return valor;
 }

 public void setValor(String valor) {
  this.valor = valor;
 }

 public Ejem22 usarThis() {
// this - Se referie al objeto que se instanciara debajo del main().
  System.out.println(this);
  return this;
 }

 public Ejem22 usarThisConRefAtributoInstanciaConstructorAsignaValor() {
// Hace referencia al objeto Instanciado
//  this.valor = "Variable local";
  System.out.println("• Este objeto : " + this); //Referencia al objeto instanciado dentro del main 
  System.out.println("• Variable -> valor : " + valor); //El constructor le asigna un valor 
  System.out.println("• Referencia this.valor " + this.valor); //El constructor le asigna un valor 
  return this;
 }

 public Ejem22 usarThisConRefAtributoInstancia() {
// Hace referencia al objeto Instanciado
  this.valor = "Variable local";
  System.out.println("• Este objeto : " + this); //Referencia al objeto instanciado dentro del main 
  System.out.println("• Variable -> valor : " + valor); //El constructor le asigna un valor 
  System.out.println("• Referencia this.valor " + this.valor); //El constructor le asigna un valor 
  return this;
 }

 public Ejem22 getObjetoActual() {
  return this;
 }

 public Class getClaseActual() {
  Class className = this.getClass();
  return className;
 }

 public Object getObjectoObjectActual() {
  Object objeto_actual = this;
  System.out.println(" ♦ Objeto_actual " + objeto_actual);
  return objeto_actual;
 }

 public Object getMe() {
  return this;
 }

 public static void main(String[] args) {

  System.out.println("--------------------------------");
  Ejem22 objecto_actual_object = new Ejem22();
  Object objectoObjectActual = objecto_actual_object.getObjectoObjectActual();
  System.out.println(" ♦ Object objeto_actual = this; --> " + objectoObjectActual);

  System.out.println("--------------------------------");

  Ejem22 clase_actual = new Ejem22();
  Class claseActual = clase_actual.getClaseActual();
  System.out.println("Cual es la clase Actual --> " + claseActual);

  System.out.println("--------------------------------");

  Ejem22 objeto_actual = new Ejem22();
  Ejem22 direccion_objeto = objeto_actual.getObjetoActual();
  System.out.println("Ver Objeto Actual --> " + direccion_objeto);

  System.out.println("--------------------------------");

  System.out.println(" HEAP : Montículo (heap en inglés) es una estructura "
          + "de datos del tipo árbol con información perteneciente a un conjunto ordenado.");

  System.out.println("");
  System.out.println("-------------------------------------------------------------------");
  System.out.println("TODOS LOS THIS : Tiene la misma Referencia a la HEAP del objeto");
  System.out.println("-------------------------------------------------------------------");
  System.out.println("");

  Ejem22 ej = new Ejem22();
  ej.usarThis(); // Tiene la misma posicion en la memoria la referencia al objeto
  System.out.println(ej); // Tiene la misma posicion en la memoria la referencia al objeto
  System.out.println(ej.usarThis()); // Tiene la misma posicion en la memoria la referencia al objeto

  System.out.println("----------------------");

  Ejem22 ej2 = new Ejem22("Constructor");
  ej2.usarThis(); // Tiene la misma posicion en la memoria la referencia al objeto
  System.out.println(ej2); // Tiene la misma posicion en la memoria la referencia al objeto
  System.out.println(ej2.usarThis()); // Tiene la misma posicion en la memoria la referencia al objeto

  System.out.println("----------------------");

  Ejem22 ej3 = new Ejem22("Constructor");
  ej3.usarThis(); // Tiene la misma posicion en la memoria la referencia al objeto
  System.out.println(ej3); // Tiene la misma posicion en la memoria la referencia al objeto
  System.out.println(ej3.usarThis()); // Tiene la misma posicion en la memoria la referencia al objeto
  System.out.println("---------- AQUI ------------");
  ej3.usarThisConRefAtributoInstanciaConstructorAsignaValor();
  System.out.println("usarThisConRefAtributoInstanciaConstructorAsignaValor() : " + ej3.usarThisConRefAtributoInstanciaConstructorAsignaValor());
  System.out.println("---------- AQUI ------------");
  ej3.usarThisConRefAtributoInstancia();
  System.out.println("usarThisConRefAtributoInstancia() : " + ej3.usarThisConRefAtributoInstancia());

  Ejem22 ej4 = new Ejem22();
  Object devolverObjeto = ej4.getMe();
  System.out.println("devolverObjeto --> : " + devolverObjeto + " <-- Devuelve referencia ");

 }
}
