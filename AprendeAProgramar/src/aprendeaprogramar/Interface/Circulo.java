/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Interface;

/**
 * @see - Clase Implementa la interface Figura
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class Circulo implements Figura {

 private float diametro;

 public Circulo(float diametro) {
  this.diametro = diametro;
 }

 @Override
 public float area() {
  return (PI * diametro * diametro / 4f);
 }

}
