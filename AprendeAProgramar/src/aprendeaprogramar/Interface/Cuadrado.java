/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Interface;

/**
 * @see CLASE QUE IMPLEMENTA LA INTERFACE FIGURA ( LE AÑADE EL CUERPO A LOS
 * METODOS QUE HEREDA ) 
 *
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class Cuadrado implements Figura {

 private float lado;

 public Cuadrado(float lado) {
  this.lado = lado;
 }

 @Override
 public float area() {
  return lado * lado;
 }

}
