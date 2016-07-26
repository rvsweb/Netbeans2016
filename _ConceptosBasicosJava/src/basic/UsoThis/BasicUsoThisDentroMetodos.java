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
public class BasicUsoThisDentroMetodos {

}

class Ejemplo {

 private String valor;

 public Ejemplo() {
  this.valor = null;
 }

 public Ejemplo(String valor) {
  this.valor = valor;
 }

 public String getValor() {
  return valor;
 }

 public void setValor(String valor) {
  this.valor = valor;
 }
}

class MyThisTest {

 private int a;

 public MyThisTest() {
  this(42); // llamada al constructor copia 
 }

 public MyThisTest(int a) {
// asigna el valor del parametro 'a' a la dato miembro de la clase
  this.a = a;
 }

 public void frobnicate() {
  int a = 1;
//referencia a una variable ambito local 'a'
  System.out.println("variable local : " + a);
//referencia al campo 'a'
  System.out.println("Campo/Field -> private String a = " + this.a);
//referirse al objeto actual en su conjunto, a la totalidad del objeto 
  System.out.println("Conjunto/Totalidad del objeto : ");
  System.out.println(this); // este objeto se refiere a la variable local a = 1;
 }

 @Override
 public String toString() {
  return "$$ MyThisTest a = " + a + "Se ejecuta con toStringC" /*Referencia al CAMPO*/;
 }
 public static void main(String[] args) {

  MyThisTest m = new MyThisTest();
  m.frobnicate();
  System.out.println(" • " + m);
  System.out.println(" • m.a = " + m.a);
 }
}
