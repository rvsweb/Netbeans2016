/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.bloque;

/**
 * @see Pag22
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeBloqueSentenciasPag22 {

 private static double distancia;

 /**
  * Bloque conjunto de sentencias entre llaves
  *
  * @return
  */
 public static void bloqueSentencias() {
  Punto p = new Punto();
  Punto q = new Punto();

  double dx = p.x - q.x;
  double dy = p.y - q.y;
  distancia = Math.sqrt(dx * dx + dy * dy);

 }

 public static void main(String[] args) {
  System.out.println(" - " + distancia);
 }
}

class Punto {

 public int x;
 public int y;
 public static int distancia;

 Punto() {
  this.x = 0;
  this.y = 0;
 }

 Punto(int x, int y) {
  this.x = x;
  this.y = y;
 }

}
