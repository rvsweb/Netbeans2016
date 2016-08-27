/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Set.EjemploUso;

import java.util.HashSet;
import java.util.Set;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeSet_Ej_UsoPag195 {

 public static void main(String[] args) {

  Set<Integer> conjunto = new HashSet<>();
  conjunto.add(1);
  conjunto.add(9);
  conjunto.add(5);
  conjunto.add(9);
  conjunto.add(3);
  conjunto.add(2);

  System.out.println("Tamanio : " + conjunto.size());
  for (Integer n : conjunto) {
   System.out.println(n + " - ");
  }

  System.out.println("Tamanio : " + conjunto.size());
  conjunto.stream().forEach((n) -> {
   System.out.println(n + " - ");
  });

  Set<String> conjunto1 = new HashSet<>();
  conjunto1.add("•- 1a");
  conjunto1.add("◘- 3v");
  conjunto1.add("○- 2c");
  conjunto1.add("♦- 5x");
  conjunto1.add("♣- 6e");
  conjunto1.add("♠- 8g");

  for (String indice : conjunto1) {
   System.out.println(indice + " | ");
  }

 }
}
