/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Equals;

import java.awt.Color;
import java.util.Objects;

/**
 * @see - 63
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeEqualsPatronObjetosIgualesSiLoSonSusCamposPag53 {

 public static void main(String[] args) {

  Coche c = new Coche("1", "A1", 4, 1000, Color.yellow);
  Coche c1 = new Coche("1", "A1", 4, 1000, Color.yellow);
  Coche c2 = new Coche("2", "A2", 5, 2000, Color.BLUE);

  boolean compara = c.equals(c1);
  System.out.println("- " + compara);

  boolean compara2 = c.equals(c2);
  System.out.println("- " + compara2);

 }
}

/**
 * Regla: si redefine equals(), debe redefinir hashCode().
 *
 * @author Portatil
 */
class Coche {

 private String marca;
 private String modelo;
 private int puertas;
 private int km;
 private Color color;

 public Coche(String marca, String modelo, int puertas, int km, Color color) {
  this.marca = marca;
  this.modelo = modelo;
  this.puertas = puertas;
  this.km = km;
  this.color = color;
 }

 /**
  * Definir como iguales 2 coches con iguales marcas , modelos , numeros de
  * puertas
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
  if (!(x instanceof Coche)) {
   return false;
  }

  Coche otro = (Coche) x; // 2 referencias apuntan al mismo objeto
  if (puertas != otro.puertas) {
   return false;
  }
  if (!marca.equals(otro.marca)) {
   return false;
  }
  if (!modelo.equals(otro.modelo)) {
   return false;
  }
  return true;
 }

 /**
  * Definir como iguales 2 coches con igual marca , modelo y num de puertas
  *
  * @param x
  * @return
  */
 public boolean equals2(Object x) {
  if (x == this) {
   return true;
  }
  if (x == null) {
   return false;
  }
// La Ref. Coche no es del tipo Coche : cambia a true , entra en el condicional devuelte false
  if (!(x instanceof Coche)) {
   return false;
  }

  Coche otro = (Coche) x;
  if (puertas != otro.puertas) {
   return false;
  }
  if (!marca.equals(otro.marca)) {
   return false;
  }
  if (!modelo.equals(otro.modelo)) {
   return false;
  }
  return true;
 }

 /**
  * Algunos campos que son Objetos pueda ser null
  *
  * @param x
  * @return
  */
 public boolean equals3(Object x) {
  if (x == this) {
   return true;
  }
  if (x == null) {
   return false;
  }
  if (!(x instanceof Coche)) {
   return false;
  }

  Coche otro = (Coche) x;
  if (puertas != otro.puertas) {
   return false;
  }
  if (marca == null) {
   if (otro.marca != null) {
    return false;
   }
  } else if (!otro.marca.equals(marca)) {
   return false;
  }
  if (modelo == null) {
   if (otro.modelo != null) {
    return false;
   }
  } else if (!otro.modelo.equals(modelo)) {
   return false;
  }
  return true;
 }

 /**
  *
  * @return
  */
 @Override
 public int hashCode() {
  int hash = 5;
  hash = 53 * hash + Objects.hashCode(this.marca);
  hash = 53 * hash + Objects.hashCode(this.modelo);
  hash = 53 * hash + this.puertas;
  hash = 53 * hash + this.km;
  hash = 53 * hash + Objects.hashCode(this.color);
  return hash;
 }
}
