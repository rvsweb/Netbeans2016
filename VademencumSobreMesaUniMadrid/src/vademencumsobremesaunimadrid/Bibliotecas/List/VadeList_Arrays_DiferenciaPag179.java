/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeList_Arrays_DiferenciaPag179 {

 /**
  * Uso del Array
  */
 public static void usarArray() {
  String[] x;
  x = new String[1000];

  x[20] = "1492";
  String a = x[20];

  for (int i = 0; i < x.length; i++) {
   if (x[i] == null) {
    System.out.println(x[i]);
   } else {
    System.out.print("• Encontrado " + x[20] + " ! " + a + " ! ");
    return;
   }
  }
 }

 /**
  * Usar List instanciando una ArrayList
  */
 public static void usarList() {
  List<String> x = new ArrayList<>();
  x.add("1");
  x.add("2");
  x.add("3");
  x.add("4");
  x.add("5");
  x.add("6");
  x.add("7");

  String posicion_2 = x.get(2);
  System.out.println("posicion 2 : " + posicion_2);

  for (int i = 0; i < x.size(); i++) {
   System.out.println(i + " --- " + x.get(i));
   x.set(2, "1492");
// Despues de la posicion 7 : Se añade infinita veces el objeto x.add(i + " 2001 " );
   x.add(i + " 2001");
   if (i == 100) {
    return;
   }
  }

 }

 public static void main(String[] args) {
  usarArray();
  System.out.println("--------------------");
  usarList();
 }
}
