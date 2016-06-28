/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.Static_e_Instancias;

/**
 *
 * @author Portatil
 */
public class T4Pag90EjemploMetodosInstancia {

}

class MetodoInstancia {

 public static void main(String[] args) {
  Test t = new Test();
  t.prueba();

  Test_2 t2 = new Test_2();
  t2.metodo();
  System.out.println("soy una variable de instancia : " + t2.dato);
  Test_2.metodostatico();
  System.out.println("soy una variable de instancia : " + Test_2.datostatico);
  int valores = t2.valor_static();
  System.out.println("valores : " + valores);
 }

}

class Cuadrado {

 private int lado;

 public Cuadrado(int l) {
  this.lado = l;
 }

 public int getArea() {
  return lado * lado;
 }

}

class Test {

 public static int var;
 public int var2;

 public void prueba() {
  var = 3;
  Test.var = 4;
  var2 = 5;
 }
}

class Test_2 {

 public int dato = 0;
 public static int datostatico = 0;

 public void metodo() {
  this.dato++;
  Test_2.datostatico = 0;
  metodostatico();
 }

 public static void metodostatico() {
  datostatico++;
 }

 public int valor_static() {
  this.dato++;
  Test_2.datostatico = 10;
  return this.dato + Test_2.datostatico;
 }
}
