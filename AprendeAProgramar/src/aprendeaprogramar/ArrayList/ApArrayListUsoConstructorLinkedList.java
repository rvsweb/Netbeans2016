/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @see
 * <a href = "http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=649:transformar-un-array-en-arraylist-java-metodo-aslist-clase-arrays-ejemplo-constructores-cu00679b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188" />
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApArrayListUsoConstructorLinkedList {

 public static void main(String[] args) {

  System.out.println("  Clase     TIPO   Variable REF.   invoca Constructor \n"
          + "LinkedList<String> miListaString = new LinkedList<String>();\n"
          + "");

//  Clase     TIPO   Variable REF.   invoca Constructor 
  LinkedList<String> miListaString = new LinkedList<String>();
  miListaString.add("Liebre");
  miListaString.add("Perro");

// 1º Creamos un ArrayList pasando como PARAMETRO un TIPO Collection
// 2º LinkedList es una clase que implementa la interface Collection
//    podemos pasarla en este constructor
// 3º ArrayList tiene el contenido inicial que tiene la coleccion
//    que se le pasa como parametro y al ejecutar el programa 
//    obtenemos :
//      - Contenido del LinkedList ["Liebre" , "Perror"]; 
//      - Contenido del ArrayList ["Liebre" , "Perror"];
//  
//
  System.out.println("  Clase    TIPO   Variable REF.       invoca Constructor     Variable REF     \n"
          + "ArrayList<String> miArrayListString = new ArrayList<String>(miListaString/* -> Parametro Tipo Collection <- */);");

//  Clase     TIPO   Variable REF.     invoca Constructor     Variable REF     
  ArrayList<String> miArrayListString = new ArrayList<String>(miListaString);

  System.out.println("Contenido del LinkedList " + miListaString);
  System.out.println("Contenido del ArrayList " + miArrayListString);

  System.out.println("");
  System.out.println("Ejercicio : Usa Interface LIST implementando con ArrayList  ");
  System.out.println("Se convierte en ARRAY usando la CLASE Arrays.asList para convertir ArrayList en un elemento LIST ");
  System.out.println("");

//INTERFACE necesita la clase ArrayList que la implementa 
  List<Boolean> miListaBo = new ArrayList<Boolean>();
  Boolean[] miArrayDeBo = {true, false, true, false, true, false, true, false};
//Variable Ref = Clase.convierte(INTERFACE IMPLEMENTADA POR ARRAYLIST)
  miListaBo = Arrays.asList(miArrayDeBo);
  for (Boolean indice : miListaBo) {
   System.out.println(indice);
  }

  System.out.println("");
  System.out.println("Ejercicio de ArrayList mediante LinkedList Usando Collection ");
  System.out.println("");

  LinkedList<Boolean> miListaBoolean = new LinkedList<Boolean>();
  miListaBoolean.add(true);
  miListaBoolean.add(false);
  miListaBoolean.add(true);
  miListaBoolean.add(false);
  miListaBoolean.add(true);
  miListaBoolean.add(false);

  ArrayList<Boolean> miArrayList_Boolean = new ArrayList<>(miListaBoolean);
  for (Boolean indice : miArrayList_Boolean) {
   System.out.println(indice);
  }

 }
}
