/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Encapsulacion;

/**
 * @see - 59
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeEncapsulacionPag49 {

}

/**
 * Criterio de diseño de clases que recomienda juntar en una misma clase las
 * variables y los metodos que las gestionan
 *
 * Una buena encapsulacion debe llevar a que todos los 'campos' de los objetos
 * sean PRIVATE y solo se puedan acceder o alterar a traves de los metodos de la
 * clase
 *
 * Ventaja que se obtiene en un absoluto control sobre el acceso a dichos campos
 *
 * Un caso Extremo de encapsulacion es el denominado "TIPO Abstracto de Datos
 * (TAD)
 *
 * Se dice que una clase es un "TAD" cuando se puede "CAMBIAR" completamente la
 * "Representacion interna del estado del objeto" sin que otras clases que la
 * usan lo perciban , es decir , "Cuando los metodos ocultan completamente la
 * representacion interna" , la ventaja que se obtiene es la "Posibilidad de
 * cambiar el codigo de la clase" sin tocar otras clases del programa
 *
 * Ej - Optimizar el tiempo de ejecucion
 *
 *
 * @author Portatil
 */
class Encapsulacion {

 private int x;
 private int y;

 public Encapsulacion() {
  this.x = 0;
  this.y = 0;

 }

 public Encapsulacion(int x, int y) {
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

}
