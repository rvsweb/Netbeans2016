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
public class ApUsoArrayList {

 public static void main(String[] args) {

  System.out.println("Empezamos el programa");
  System.out.println("Intro nombre 1 ");
  EntradaDeTeclado entrada1 = new EntradaDeTeclado();
  System.out.println("Intro nombre 2 ");
  EntradaDeTeclado entrada2 = new EntradaDeTeclado();
  System.out.println("Intro nombre 3 ");
  EntradaDeTeclado entrada3 = new EntradaDeTeclado();

  ListaNombres lista1 = new ListaNombres("Nombre introducidos por usuario");
  lista1.addNombre(entrada1.getEntrada());
  lista1.addNombre(entrada2.getEntrada());
  lista1.addNombre(entrada3.getEntrada());

  System.out.println("La lista ha quedado formada por : " + lista1.getTamanio());
  System.out.println("Elemento 1 : " + lista1.getNombre(0));
  System.out.println("Elemento 2 : " + lista1.getNombre(1));
  System.out.println("Elemento 3 : " + lista1.getNombre(2));
 }
}

class ListaNombres {

// Atributo de Instancia : objeto String
 private String nombreDeLaLista;
// Atributo de Instancia : ArrayList objetos String
 private ArrayList<String> listadenombres;

 /**
  * Constructor : Crea una Lista de Nombre Vacia
  *
  * @param nombre
  */
 public ListaNombres(String nombre) {
  nombreDeLaLista = nombre;
  listadenombres = new ArrayList<String>(); // Creamos Objeto Tipo ArrayList
 }

 /**
  *
  * @param valor_nombre
  */
 public void addNombre(String valor_nombre) {
  listadenombres.add(valor_nombre);
 }

 /**
  *
  * @param posicion
  * @return
  */
 public String getNombre(int posicion) {
  if (posicion >= 0 && posicion < listadenombres.size()) {
   return listadenombres.get(posicion);
  } else {
   return "No existe nombre para la posicion " + posicion + "solicitada";
  }
 }

 public int getTamanio() {
  return listadenombres.size();
 }

 /**
  *
  * @param posicion
  */
 public void removeNombre(int posicion) {
  if (posicion >= 0 && posicion < listadenombres.size()) {
   listadenombres.remove(posicion);
  } else {
   System.out.println("No hay posicion que borrar : " + posicion);
  }
 }
}

class EntradaDeTeclado {

 private Scanner sc;
 private String linea;

 public EntradaDeTeclado() {
  sc = new Scanner(System.in);
  linea = sc.nextLine();
 }

 public String getEntrada() {
  return this.linea;
 }

}
