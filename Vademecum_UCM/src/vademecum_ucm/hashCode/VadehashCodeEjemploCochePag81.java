/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.hashCode;

import java.awt.Color;

/**
 * @see - 86
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadehashCodeEjemploCochePag81 {

 public static void main(String[] args) {
  Coche c1 = new Coche("A1", "auno", 4, 1000, Color.yellow);
  Coche2 c2 = new Coche2("B2", "bdos", 2, 5000, Color.BLACK);
  Coche2 c22 = new Coche2();

  int c1hash = c1.hashCode();
  System.out.println("♦ " + c1hash);
  int c2hash_comprobacion = c2.hashCode();
  System.out.println("♦ " + c2hash_comprobacion);
  int c22hash_comprobacion = c22.hashCode();
  System.out.println("• " + c22hash_comprobacion);

 }
}

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
  * Definido como iguales 2 coches con igual marca , modelo , num de puertas
  *
  * @return
  */
 @Override
 public int hashCode() {
  int hc = 17;
  hc = 31 * hc + marca.hashCode();
  hc = 31 * hc + modelo.hashCode();
  hc = 31 * hc + puertas;
  return hc;
 }
}

class Coche2 {

 private String marca;
 private String modelo;
 private int puertas;
 private int km;
 private Color color;

 public Coche2() {
 }

 public Coche2(String marca, String modelo, int puertas, int km, Color color) {
  this.marca = marca;
  this.modelo = modelo;
  this.puertas = puertas;
  this.km = km;
  this.color = color;
 }

 @Override
 public int hashCode() {
  int hc = 17;
  if (marca != null) {
   hc = 31 * hc + marca.hashCode();
  }
  if (modelo != null) {
   hc = 31 * hc + modelo.hashCode();
  }
  hc = 31 * hc + puertas;
  return hc;
 }

}
