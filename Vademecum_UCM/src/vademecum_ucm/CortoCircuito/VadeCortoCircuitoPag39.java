/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.CortoCircuito;

/**
 * @see - CortoCircuito sirve para acelerar la ejecucion , evitando calculos
 * innecesarios o para evitar errores de ejecucion proporcionando una
 * escapatoria para los casos particulares
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeCortoCircuitoPag39 {

 public static void main(String[] args) {
  // CortoCircuito :  Caso en el que para Evaluar una expresion booleana solo se evalua uno
  //          * de los operandos, el primero 

  int x1 = 10;
  int y1 = 11;

//  Evalua 'x' ; si es falso , devuelve FALSE , si no , evalue 'y' 
  if ((x1 <= 10) && (y1 >= 11)) {
   System.out.println(" • " + x1 + " |-| " + y1);
  }

  boolean valor = (x1 < 110) && (y1 >= 11);
  System.out.println(" •  true ^ y = y -> " + valor);

  if ((x1 > 110) && (y1 >= 11)) {
   System.out.println(x1 + y1);
  }

  boolean valor1 = (x1 > 110) && (y1 >= 11);
  System.out.println(" • false ^ y = false -> " + valor1);

  System.out.println("------- CORTO CIRCUITO ---------- ");
  double x = 1.0;
  if (Math.abs(x) < 0.01 || Math.sin(x) < 0.01) {
   System.out.println("Soy menor");
  }

  String nombre = "pepe";
  if (nombre == null || nombre.length() == 0) {
   System.out.println(nombre);
  }

  String conjunto = "valor";
  String elemento = "valor1";
  if (conjunto != null && conjunto.contains(elemento)) {
   System.out.println(conjunto);
  }

 }
}
