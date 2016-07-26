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
public class BasicUsoThisDentroMetodos2v {

}

class Ejemplo2 {

 private int a = 3;
 private String valor = "22";
 private String valor_para_this = "333";

 public Ejemplo2() {
  this.valor = null;
 }

 public Ejemplo2(String valor) {
  this.valor = valor;
 }

 public String getValor() {
  return valor;
 }

 public void setValor(String valor) {
  this.valor = valor;
 }

 /**
  * El 'this' hace referencia al objeto que hay dentro
  */
 public void usarThisDentroDelMetodo() {
//  valor = "1";
  String valor1 = "1";
  a = 2;
  boolean b = false;
  System.out.println("this desde dentro del metodo");
  System.out.println(this);
  System.out.println("this desde dentro del metodo apunta 'this.a' : ");
  System.out.print(this.a);
  System.out.println("\nthis desde dentro del metodo apunta 'this.b' : ");
  System.out.print(this);
  System.out.println("\n");
 }

 public void usarThis() {
  System.out.println(this); // Hace referencia al objeto Instanciado
 }

 public void usarThisConRefAtributoInstancia() {
  this.valor_para_this = "4444";
  System.out.println(this); // this - Se referie al objeto que se instanciara.
 }

 public static void main(String[] args) {

  Ejemplo2 e = new Ejemplo2();
//  System.out.println("Ver Valor : " + e);
//  System.out.println("e.valor : " + e.valor);
//  System.out.println("----------");
  e.usarThis();

  Ejemplo2 e1 = new Ejemplo2();
  e1.usarThis();
  e1.usarThisConRefAtributoInstancia();

  new Ejemplo2().usarThis();

  Ejemplo2 e2 = new Ejemplo2();
  e2.usarThis();
  e2.usarThisConRefAtributoInstancia();

 }
}
