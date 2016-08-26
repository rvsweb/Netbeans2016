/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Collator;

import java.text.Collator;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeCollatorComparadorLetrasNumerosAcentosPag158 {

}

/**
 * Comparaciones entre String se limitan a usar el orden numerico de los codigos
 * Unicode
 *
 * Orden lexicoGrafico depende de cada idioma : programa muestra como usar la
 * clase java.text.Collator para comparar cadenas con letras Mayusculas ,
 * Minusculas y Carateres acentuados
 *
 * @author remoto
 */
class Comparador {

 public static void compara(String s1, String s2) {
  Collator collator = Collator.getInstance();
  System.out.println("compareTo -> " + s1.compareTo(s2));
  System.out.println("collator -> " + collator.compare(s1, s2));
 }

 public static void main(String[] args) {
  compara("Iñaki", "alberto");
  compara("Iñaki", "Iván");
 }
}
