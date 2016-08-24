/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.SobreCarga;

/**
 * @see - 135
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeSobreCargaPag135 {

}

/**
 * Dos metodos pueden diferir en tipos de argumentos que sin ser identicos
 * pueden admitir datos comunes , bien por promocion automatica ( Tipo
 * Primitivos ) bien por Upcasting ( Tipo OBJETO )
 *
 * En tiempo de compilacion Java opta por el metodo que no requiera ni
 * 'Promocion' ni 'Upcasting'
 *
 * @author remoto
 */
class SobrecargaPromocionUpcasting {

}

/**
 * Con Promocion
 *
 * @author remoto
 */
class Promocion {

// metodo con int x 
 void metodo(int x) {
 }

// metodo con long x 
 void metodo(long x) {
 }

}

class Upcasting {

}

class A {

}

class B extends A {

 void metodo(A a) {
 }

 void metodo(B b) {
 }
}

class Main {

 /**
  * Las decisiones se realizan en tiempo de compilacion
  *
  * En Tiempo de Ejecucion puede entrar en juego la existencia de metodos
  * redefinidos , en cuyo caso se aplicaran los metodos 'Polimorficos' sobre el
  * metodo seleccionado en tiempo de ejecucion
  *
  * @param args
  */
 public static void main(String[] args) {

//  PROMOCION 
  int v = 5;
  Promocion pro = new Promocion();
  pro.metodo(v); // El metodo prefiere dato primitivo 'int'

// UPCASTING
  B b = new B();
  b.metodo(b); // Prefiere el metodo (B)
 }
}
