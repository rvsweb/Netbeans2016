/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.UsoNull;

import java.util.ArrayList;

/**
 * @see
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=634:objetos-null-en-java-error-javalangnullpointerexception-autoboxing-unbox-objetos-anonimos-cu00668b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoDeNull {

}

class ListaNumeros {

// listaDeNumeros -> Referencia null
 private ArrayList<Integer> listaDeNumeros;

 public ListaNumeros() {
//  Constructor esta vacio
//  this.listaDeNumeros = new ArrayList<Integer>();
 }

 /**
  *
  * @param listaDeNumeros
  */
 public ListaNumeros(ArrayList<Integer> listaDeNumeros) {
  this.listaDeNumeros = listaDeNumeros;
 }

 /**
  *
  * @return
  */
 public Integer sumatorio() {
  Integer suma = 0;
  for (Integer numero : listaDeNumeros) {
   suma = suma + numero;
  }
  return suma;
 }

 /**
  *
  * @param item
  */
 public void aniadirItem(Integer item) {
  listaDeNumeros.add(item);
 }

// public ListaNumeros(<any> listaDeNumeros) {
//  this.listaDeNumeros = listaDeNumeros;
// }
}

class TestNull {

 public static void main(String[] args) {
  ListaNumeros lista1 = new ListaNumeros();
  System.out.println("El sumatorio actual es : " + lista1.sumatorio());
 }
}
