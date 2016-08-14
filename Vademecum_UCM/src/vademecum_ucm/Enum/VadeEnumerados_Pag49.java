/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Enum;

import vademecum_ucm.Enum.Enumerados.Animales;

/**
 * @see 61
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeEnumerados_Pag49 {

 public enum Vocal {
  A, E, I, O, U;
 }

 public static void main(String[] args) {
  Vocal vocal = Vocal.E;

//  Metodos BASICOS
  int comparacionBasica = vocal.compareTo(Vocal.A);
  System.out.println("• Posicion :  --> " + comparacionBasica);

  int comparacionBasica1 = vocal.compareTo(Vocal.E);
  System.out.println("• Posicion :  --> " + comparacionBasica1);

  int comparacionBasica2 = vocal.compareTo(Vocal.U);
  System.out.println("• Posicion : --> " + comparacionBasica2);

  boolean vocal_equivale = vocal.equals(Vocal.A);
  System.out.println("Equivale la letra E : " + vocal_equivale);

  boolean vocal_equivale2 = vocal.equals(Vocal.E);
  System.out.println("Equivale la letra E : " + vocal_equivale2);

  String nombre_vocal = vocal.name();
  System.out.println("Nombre de la vocal : " + nombre_vocal);
  if (nombre_vocal.equals("E")) {
   System.out.println("• Soy E ");
  }

  String nombre_vocal2 = vocal.toString();
  System.out.println("• Nombre de la vocal a toString : " + nombre_vocal2);

  int vocal_ordinal = vocal.ordinal();
  System.out.println("• Vocal Ordinal " + vocal_ordinal);

  System.out.println(" \t \t |||  Metodos propios de los Objetos del Tipo Enum ||| ");
  Vocal vocal_U = Vocal.U;
  String vocal_string = vocal_U.toString();
  System.out.println("\n --- Dado el identificador de una constante : devuelve el objeto correspondiente --- ");
  Vocal objeto_Vocal = Vocal.valueOf(vocal_string);
  System.out.println("• Objeto_Vocal : " + objeto_Vocal);

  System.out.println(" --- Devuelve un array con los valores constantes , Array que puede recorrerse o iterar sobre el --- ");
  Vocal[] array_vocales = Vocal.values();
  for (int i = 0; i < array_vocales.length; i++) {
   System.out.print(" " + array_vocales[i]);
  }

  System.out.println("\n ------------------------------------------------------------------------------------");

  if (vocal.equals(Vocal.A)) {
   System.out.println("Soy la letra : " + vocal);
  }

  Vocal vocal2 = Vocal.O;
  if (vocal2.toString().equals("O")) {
   System.out.println("Soy O");
  }

  Animales animales = Enumerados.Animales.GATO;

  if (animales.toString().equals("GATO")) {
   System.out.println("Soy Gato");
  }

 }
}

/**
 * Son clases con un conjunto explicito finito y fijo de CONSTANTES
 *
 * Se pueden emplear variables de los TIPOS ENUMERADOS definidos
 *
 * @author Portatil
 */
class Enumerados {

 public enum Animales {
  PERRO, GATO, LEON, ELEFANTE
 };

}
