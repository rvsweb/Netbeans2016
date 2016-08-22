/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Referencias;

/**
 * @see - 148
 * @since -
 * @version -
 * @author Raul Vela Salas
 */
public class VadeReferenciasPag133 {

}

/**
 * Cuando se crea un objeto , JAVA lo identifica por su REFERENCIA
 *
 * Graficamente , puede concebirse una 'REFERENCIA' como un puntero al 'OBJETO'
 *
 * Cuando a una variable se le asigna un 'OBJETO' , exactamente se carga en la
 * variable una 'Copia Del Valor' de dicho 'puntero'
 *
 * Cuando el valor de una variable se asigna a otra - Ejemplo -> x = y;
 *
 * Se carga en 'x' otra "Copia del Puntero" almacenado en 'y'
 *
 * Se dice que ambas variables se 'Refieren al mismo Objeto' o que el 'Objeto'
 * es compartido por ambas variables
 *
 * Al ser un 'Objeto Compartido' lo que se cambie a traves de una de las
 * variables que lo referencian se ve cambiado para la otra
 */
class Referencias {
}

/**
 * Ejemplo con codigo
 */
class Punto {

 private int x;
 private int y;

 public Punto() {
  this.x = 0;
  this.y = 0;
 }

 public Punto(int x, int y) {
  this.x = x;
  this.y = y;
 }

 public static void main(String[] args) {

  Punto c, d;
  c = new Punto(1, 2);
  d = c;
  c.x = 1;
  c.y = 2;

//     Variables 
//  c: [____]  d: [____]
//        |         | 
//        |         |
//        |         |
//       _↓_________↓_
//      |             |
//      | x: [_1.0_]  |
//      | y: [_2.0_]  | OBJETOS
//      |_____________|
//  
//  Paso de argumentos por Referencia 
//  Cuando una variable no apunta a ningun 'Objeto' 
//  se dice que contiene la referencia 'null' que es la 'Referencia'
//  QUE NO APUNTA A NADA 
//    
//  
//          Variables 
//         a: [____]  
//              |          
//              |         
//              |         
//       _______↓_____
//      |             |
//      |     NULL    | OBJETOS
//      |_____________|
//  
//  
 }
}
