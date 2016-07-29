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
public class Rectangulo implements Figura {

 private float lado;
 private float altura;

 public Rectangulo(float lado, float altura) {
  this.lado = lado;
  this.altura = altura;
 }

 @Override
 public float area() {
  return lado * altura;
 }

}
