/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=631:clase-arraylist-del-api-java-metodos-add-size-etc-concepto-de-clase-generica-o-parametrizada-cu00665b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoArrayList2 {

 public static void main(String[] args) {

  System.out.println("Empezamos el programa ");
  System.out.println("Por favor introduzca nombre 1: ");
  EntradaDeTeclado1 entrada1 = new EntradaDeTeclado1();
  System.out.println("Por favor introduzca nombre 2: ");
  EntradaDeTeclado1 entrada2 = new EntradaDeTeclado1();
  System.out.println("Por favor introduzca nombre 3: ");
  EntradaDeTeclado1 entrada3 = new EntradaDeTeclado1();
  System.out.println("Gracias");

//  Objeto lista1 ( tipo ListaNombre ) / Objeto nombreDeLaLista (Tipo String) 
  ListaNombre lista1 = new ListaNombre("Nombres introducidos por usuario");

//  OBJETO lista 1 -> Tiene 2 objetos : tipo String llamado nombreDeLaLista "Constructor" , tipo ArrayList<String> llamado listadeNombres
  lista1.addNombre(entrada1.getEntrada()); // Objeto listaDeNombres ( tipo ArrayList de String )
  lista1.addNombre(entrada2.getEntrada()); // Objeto listaDeNombres ( tipo ArrayList de String )
  lista1.addNombre(entrada3.getEntrada()); // Objeto listaDeNombres ( tipo ArrayList de String )

  System.out.println("La lista ha quedado formada por : " + lista1.getTamanio() + " elementos ");
  System.out.println("Elemento 1 " + lista1.getNombre(0));
  System.out.println("Elemento 2 " + lista1.getNombre(1));
  System.out.println("Elemento 3 " + lista1.getNombre(2));

 }
}
// Esta clase representa una lista de nombres manejada con la clase ArrayList de Java 

class ListaNombre {

// Establecemos un atributo nombre de la lista PARA EL CONSTRUCTOR 
 private String nombreDeLaLista;
// Declaramos un ArrayList que contiene objetos String : Almacena todos los Objetos
 private ArrayList<String> listadeNombres;

 /**
  * Constructor : crea una lista de nombres vacia
  *
  * @param nombre
  */
 public ListaNombre(String nombre) {
  nombreDeLaLista = nombre;
  listadeNombres = new ArrayList<String>(); // Creamos objeto del tipo ArrayList
 }

 /**
  * Añadir objeto al ArrayList
  *
  * @param valor_nombre
  */
 public void addNombre(String valor_nombre) {
  listadeNombres.add(valor_nombre);
 }

 /**
  * Devuelve la posicion solicitada del objeto
  *
  * @param posicion
  * @return
  */
 public String getNombre(int posicion) {
  if (posicion >= 0 && posicion < listadeNombres.size()) {
   return listadeNombres.get(posicion);
  } else {
   return "No existe nombre para la posicion solicitada ";
  }
 }

 /**
  * Devuelve el tamanio del ArrayList
  *
  * @return
  */
 public int getTamanio() {
  return listadeNombres.size();
 }

 public void removeNombre(int posicion) {
  if (posicion >= 0 && posicion < listadeNombres.size()) {
   listadeNombres.remove(posicion);
  } else {
   System.out.println("No se puede borrar la posicion :  " + posicion);
   System.out.println("Tamanio actual" + listadeNombres.size());
  }
 }

}

class EntradaDeTeclado1 {

 private Scanner sc;

 public EntradaDeTeclado1() {
  sc = new Scanner(System.in);
 }

 public String getEntrada() {
  return sc.next();
 }

}
