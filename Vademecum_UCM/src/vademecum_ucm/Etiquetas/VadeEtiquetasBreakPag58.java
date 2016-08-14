/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Etiquetas;

/**
 * @see 67
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeEtiquetasBreakPag58 {

}

class TrianguloPitagorico {

 /**
  * Sentencia 'break' fuerce la salida del bucle mas interno en ejecucion
  *
  * Si queremos salir de otro bucle mas externo , lo marcaremos con la etiqueta
  * X y saldremos de el escribiendo
  *
  * break X;
  *
  * @param args
  */
 public static void main(String[] args) {

  int a = -1, b = -1, c = -1;
  busqueda:
  for (int ijk = 1; ijk < 100; ijk++) { // bucle externo
   for (int i = 1; i < ijk; i++) { // bucle interno nivel 1
    for (int j = 1; i + j < ijk; j++) { // bucle interno nivel 2
     for (int k = 1; i + j + k < ijk; k++) { // bucle interno nivel 3
      if (i * i + j * j == k * k) {
       a = i;
       b = j;
       c = k;
       break busqueda;
      }
     }
    }
   }
  }
  System.out.println("a= " + a + "; b= " + b + "; c= " + c + ";");

 }
}
