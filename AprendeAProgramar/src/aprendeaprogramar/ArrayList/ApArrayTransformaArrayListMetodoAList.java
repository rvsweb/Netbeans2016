/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=649:transformar-un-array-en-arraylist-java-metodo-aslist-clase-arrays-ejemplo-constructores-cu00679b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApArrayTransformaArrayListMetodoAList {

 public static void main(String[] args) {

  int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
  Arrays.asList(a);
  for (int i = 0; i < a.length; i++) {
   System.out.print(a[i]);
  }
  System.out.println("");
  System.out.println("----------- Metodo asList -------------");
  System.out.println("");

// Interface    necesita          una clase para implementarse
  List<String> miListaDePalabras = new ArrayList<String>();
  String[] miArrayDePalabras = {"Oso", "Leon", "Buey", "Guepardo"};
  System.out.println("Contenido inicial del ArrayList : " + miListaDePalabras);
  miListaDePalabras = Arrays.asList(miArrayDePalabras);
  System.out.println("Contenido actual del ArrayList : " + miListaDePalabras);

// Interface    necesita          una clase para implementarse
  List<Integer> miListaDeEnteros = new ArrayList<Integer>();
  Integer[] miArrayDeEnteros = {11, -34 - 56, 78};
  System.out.println("Contenido inicial del ArrayList" + miListaDeEnteros);
  miListaDeEnteros = Arrays.asList(miArrayDeEnteros);
  System.out.println("Contenido actual del ArrayList : " + miListaDeEnteros);

  System.out.println("");
  System.out.println("----------- Metodo asList 2º Parte -----------");
  System.out.println("");

// Interface
  List<String> miListaDeString = new ArrayList<String>();
  String[] miArrayDeString = {"Gosling", "Ritchie", "Thompson", "Linus"};
  System.out.println("Contenido inicial del ArrayList : " + miListaDeString + " - No tiene nada ");
  miListaDeString = Arrays.asList(miArrayDeString);
  System.out.println("Contenido actual del ArrayList : " + miListaDeString);

  System.out.println("--------------------------------------------------------------");
  List<Integer> miListaDeNum = new ArrayList<Integer>(/*Podemos pasarle una Collection */);
  Integer[] miArrayDeNum = {Integer.valueOf((int) (Math.random() * Math.max(1, 100))), Integer.valueOf((int) (Math.random() * Math.max(1, 100)))};
  System.out.println("Contenido inicial del ArrayList : " + miListaDeNum + " - No tiene nada ");
  miListaDeNum = Arrays.asList(miArrayDeNum);
  System.out.println("Contenido actual del ArrayList : " + miListaDeNum);

  System.out.println("--------------------------------------------------------------");
  List<Integer> miListaDeNum1 = new ArrayList<>(/*Podemos pasarle una Collection */);
  Integer[] miArrayDeNum1 = {(int) (Math.random() * Math.max(1, 100)), (int) (Math.random() * Math.max(1, 100))};
  System.out.println("Contenido inicial del ArrayList : " + miListaDeNum1 + " - No tiene nada ");
  miListaDeNum1 = Arrays.asList(miArrayDeNum1);
  System.out.println("Contenido actual del ArrayList : " + miListaDeNum1);

  
  
  
 }
}
