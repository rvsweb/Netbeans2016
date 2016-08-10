/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.notacion_compacta;

/**
 * @see pag 21
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VademecumAsignacionBasicaIncrementos {

}

class ExpresionesAsignacion2 {

 public static void main(String[] args) {

  int x = 0;
  System.out.println("1º numero \n2º asignacion : " + x++);

  System.out.println("--------------------");
  int xx = 0;
  xx++;
  System.out.println("1º numero \n2º asignacion\n3º incremento : xx++ -> " + xx++);

  System.out.println("--------------------");
  int xx1 = 0;
  ++xx1;
  System.out.println("1º numero \n2º asignacion\n3º incremento : ++xx1 -> " + xx1);

  System.out.println("--------------------");
  int xx2 = 0;
  xx2++;
  System.out.println("1º numero \n2º asignacion\n3º incremento : xx2++ -> " + xx2);

  System.out.println("--------------------");
  int xxx = 0;
  System.out.println("1º numero \n2º asignacion\n3º incremento : ++xxx -> " + ++xxx);

 }

}
