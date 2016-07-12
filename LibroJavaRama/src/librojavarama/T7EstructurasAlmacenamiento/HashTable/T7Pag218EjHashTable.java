/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento.HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class T7Pag218EjHashTable {

}

class Diccionario {

 public static void main(String[] args) {

//  1º declaro el objeto Hashtable
  Hashtable dic = new Hashtable();
//  2º Añado con put clave valor 
  dic.put("HOLA", "hello");
  dic.put("ADIOS", "bye");
  dic.put("MESA", "table");
  dic.put("SILLA", "chair");
  dic.put("CABEZA", "head");
  dic.put("CARA", "face");
//  3º Obtengo el valor mediante get
  String saludo = (String) dic.get("HOLA");
  String despedida = (String) dic.get("ADIOS");
  String brazo = (String) dic.get("BRAZO");
//  4º Muestro el valor 
  System.out.println("HOLA : " + saludo);
  System.out.println("ADIOS : " + despedida);
  System.out.println("BRAZO : " + brazo);
//  5º Metodo para saber longitud 
  System.out.println("- Objeto dic contiene " + dic.size() + " pares. ");
//  6º Metodo para saber si contiene el valor    
  if (dic.containsKey("HOLA")) {
   System.out.println("dic contiene HOLA como clave");
  } else {
   System.out.println("dic NO contiene HOLA como clave");
  }
  System.out.println("Mostrando todos los datos de la tabla HASH ");
  System.out.println("Mostramos las llaves keys");
// 7º objeto Interfaz : Enumeration almacena todos los valores 
  Enumeration k = dic.keys(); // Solo obtiene las llaves 
  while (k.hasMoreElements()) {
   System.out.println(k.nextElement());
   System.out.println("Mostramos todos los elementos de la tabla HASH...");
  }
  System.out.println("Mostramos todos los elements ");
  Enumeration e = dic.elements();
  while (e.hasMoreElements()) {
   System.out.println("Eliminando el dato : " + dic.remove("HOLA"));
   System.out.println(e.nextElement());
  }

 }
}
