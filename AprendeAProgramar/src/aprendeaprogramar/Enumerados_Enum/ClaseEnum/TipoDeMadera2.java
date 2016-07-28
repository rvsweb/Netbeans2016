/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.Enumerados_Enum.ClaseEnum;

/**
 *
 * @author Portatil
 */
public enum TipoDeMadera2 {
// 3º SE CREA TODOS LOS OBJETOS DE TIPO 'Enum' con los 'PARAMETROS' que necesitemos
 ROBLE("Castaño", 800),
 CAOBA("Marron oscuro", 700),
 NOGAL("Marron rojizo", 820),
 CEREZO("Marron cereza", 790),
 BOJ("Marron negruzco", 675);

// 1º SE DECLARA TODOS LOS ATRIBUTOS QUE VA A TENER EL CONSTRUCTOR 
 private final String color;
 private final int pesoEspecifico;

 /**
  * 2º SE CREA EL CONSTRUCTOR PARA QUE INICIALICE TODOS LOS VALORES DE LOS
  * OBJETOS DE TIPO 'Enum'
  *
  * @param color
  * @param pesoEspecifico
  */
 private TipoDeMadera2(String color, int pesoEspecifico) {
  this.color = color;
  this.pesoEspecifico = pesoEspecifico;
 }

 /**
  * Devuelve color
  *
  * @return
  */
 public String getColor() {
  return color;
 }

 /**
  * Devuelve peso
  *
  * @return
  */
 public int getPesoEspecifico() {
  return pesoEspecifico;
 }

}
