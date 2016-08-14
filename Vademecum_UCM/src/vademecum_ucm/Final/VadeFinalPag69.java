/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Final;

import java.util.HashSet;
import java.util.Set;

/**
 * @see - 77
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeFinalPag69 {

}

class Diccionario {

 private static String idioma;

 public Diccionario() {
  this.idioma = null;
 }

 public Diccionario(String idioma) {
  this.idioma = idioma;
 }

 /**
  *
  * @param idioma
  * @return
  */
 public Set<String> diccionario(String idioma) {
  final Set<String> frases = new HashSet<>();
  if (idioma.equalsIgnoreCase("español")) {
   frases.add("hola");
   frases.add("adios");
  }
  if (idioma.equalsIgnoreCase("english")) {
   frases.add("hi");
   frases.add("bye");
  }
//  frases = ... ; Provocaria un error de re-asignacion
  return frases;
 }

 public Set<String> diccionario1(String idioma) {
  final Set<String> frases = new HashSet<>();
  if (idioma.equalsIgnoreCase("español")) {
   frases.add("hola");
   frases.add("adios");
  }
  if (idioma.equalsIgnoreCase("english")) {
   frases.add("hi");
   frases.add("bye");
  }
  frases.add("pepe");
//  frases = ... ; Provocaria un error de re-asignacion
  return frases;
 }

 public static void main(String[] args) {
  Diccionario dic = new Diccionario();
  Set<String> diccionario = dic.diccionario("español");
  for (String indice : diccionario) {
   System.out.println("• " + indice);
  }
  System.out.println("----------------------");
  Set<String> diccionario1 = dic.diccionario("english");
  for (String indice : diccionario1) {
   System.out.println("• " + indice);
  }

  System.out.println("----------------------");
  Set<String> diccionario2 = dic.diccionario("español");
  for (int i = 0; i < diccionario2.size(); i++) {
   System.out.println("♦ " + diccionario2);
  }
  System.out.println("----------------------");
  Set<String> diccionario3 = dic.diccionario("english");
  for (int i = 0; i < diccionario3.size(); i++) {
   System.out.println("♦ " + diccionario3);
  }
  System.out.println("----------------------");
  Set<String> diccionario4 = dic.diccionario1("english");
  for (int i = 0; i < diccionario4.size(); i++) {
   System.out.println("♦ " + diccionario4);
  }

 }
}
