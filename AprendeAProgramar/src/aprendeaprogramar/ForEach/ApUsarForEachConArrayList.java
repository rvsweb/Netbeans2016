/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ForEach;

import java.util.ArrayList;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsarForEachConArrayList {

}

class TestForExtendido {

 public static void main(String[] args) {
  ArrayList<String> jugadoresDeBaloncesto = new ArrayList<String>();
  jugadoresDeBaloncesto.add("Michael");
  jugadoresDeBaloncesto.add("Kobe");
  jugadoresDeBaloncesto.add("Pau");
  jugadoresDeBaloncesto.add("Drazen");

  int i = 0;

  System.out.println("Los jugadores de baloncesto en la lista son : ");

  for (String nombre : jugadoresDeBaloncesto) {
   System.out.println((i + 1) + ".- " + nombre);
   i++;
  }
  
 }

}
