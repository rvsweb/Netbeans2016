/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Genericos;

import java.util.ArrayList;
import java.util.List;

/**
 * @param <E>
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class T<E> {

 private E elemento;

 public T() {
  this.elemento = null;
 }

 public T(E elemento) {
  this.elemento = elemento;
 }

 /**
  * Dado un array de datos de tipo T , devuelve el primero que no es null
  *
  * @param <T>
  * @param datos
  * @return
  */
 <T> T primero(T[] datos) {
  for (T t : datos) {
   if (t != null) {
    return t;
   }
  }
  return null;
 }

 /**
  * Dado un dato de tipo T , crea una lista de 2 elementos que son dicho dato
  *
  * @param <T>
  * @param t
  * @return
  */
 static <T> List<T> pareja(T t) {
  List<T> resultado = new ArrayList<>();
  resultado.add(t);
  resultado.add(t);
  return resultado;
 }

 /**
  *
  * @return
  */
 public E getElemento() {
  return elemento;
 }

 /**
  *
  * @param elemento
  */
 public void setElemento(E elemento) {
  this.elemento = elemento;
 }

 /**
  * Metodos pueden recibir o devolver objetos de dichos tipos
  *
  * @param lista
  * @return
  */
 String ultima(List<String> lista) {
  return lista.get(lista.size() - 1);
 }

 public static void main(String[] args) {

  // Cuando se crean objetos de un tipo generico 
  // Hay que proporcionar tipos concretos que determinen que son realmente los
  // tipos formales de la definicion 
  T<String> cadena = new T<>();
  String[] datos = {null, "uno", "dos"};
  for (String dato : datos) {
   cadena.primero(datos);
   System.out.println(dato);
  }

  System.out.println("-----------------");
  T<String> cadena1 = new T<>();
  String verElemento = cadena1.getElemento();
  System.out.println("ver Elemento : " + verElemento);

  System.out.println("-----------------");
  for (String indice : datos) {
   System.out.println(indice);
  }

  System.out.println("-----------------");
  List<String> bora_bora = pareja("bora");
  for (String string : bora_bora) {
   System.out.println(" • " + string);
  }

 }
}
