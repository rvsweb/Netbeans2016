/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.hashCode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

/**
 * @see - 86
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadehashCodeIneficientePag82 {

}

class Cadena {

 private String texto;

 private static Random random = new Random();

 /**
  * @param texto
  */
 public Cadena(String texto) {
  this.texto = texto;
 }

 /**
  *
  * @param x
  * @return
  */
 @Override
 public boolean equals(Object x) {
  if (x == this) {
   return true;
  }
  if (x == null) {
   return false;
  }
//  Condicion para entrar - Si no es objeto Cadena : false
  if (!(x instanceof Cadena)) {
   return false;
  }
  Cadena otro = (Cadena) x;
  return texto.equals(otro.texto);
 }

//   Oficial creado por Netbean
// @Override
// public int hashCode() {
//  int hash = 5;
//  hash = 43 * hash + Objects.hashCode(this.texto);
//  return hash;
// }
// 
 /**
  * Metodo recomendado
  *
  * Si vas a redefinir el metodo hashCode() de una clase es una buena idea hacer
  * experimentos de eficacia para elegir la funcion que no penalice la ejecucion
  *
  * @return
  */
 @Override
 public int hashCode() {
  return texto.hashCode(); // Supuestamente 46ms 
// return 0; // 1307 ms 
 }

 /**
  *
  * @return
  */
 private static String getAlgo() {
  return Long.toString(random.nextLong(), 36);
 }

 public static void main(String[] args) {

//Interfaz              Clase
  Set<Cadena> set = new HashSet<>();
  long t0 = System.currentTimeMillis();

  for (int i = 0; i < 50; i++) {
   Cadena ejemplo = new Cadena(getAlgo());
   set.add(ejemplo);

   if (set.contains(ejemplo) == false) {
    System.out.println("falla");
   }
   long t2 = System.currentTimeMillis();
   System.out.printf("%dms%n", t2 - t0);
  }

 }
}
