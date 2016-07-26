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
public class ApUsoDeNull2 {

}

class ListaNumeros2 {

// Se reserva memoria para este objeto
 private ArrayList<Integer> listaDeNumeros2; // Como el constructor esta vacio la referencia apunta a NULL

// Constructor para inicializar los objetos
 public ListaNumeros2() {
 }

 public ListaNumeros2(String ConstructorConVariableReferencia) {
  listaDeNumeros2 = new ArrayList<>();
 }

 /**
  * Al tratar de hacer un recorrido por el for extendido salta el error que
  * indica que no se puede aplicar ese proceso sobre una variable de referencia
  * a null
  *
  * @return Objeto Integer
  */
 public Integer sumatorio() {
  Integer suma = 0;
//  Error al recorrerlo 
  for (Integer numero : listaDeNumeros2) {
   suma = suma + numero;
  }
  return suma;
 }

 /**
  * Fija el valor del objeto Integer
  *
  * @param item Tipo Integer
  */
 public void añadirItem(Integer item) {
  listaDeNumeros2.add(item);
 }

}

class TestNull1 {

 public static void main(String[] args) {
//Solo puede existir una variable de referencia que apunta a una posicion de memoria

  ListaNumeros2 lista1 = new ListaNumeros2();
//  Error al mostrarlo 
//  System.out.println("El sumatorio actual es : " + lista1.sumatorio());

  ListaNumeros2 lista2 = new ListaNumeros2("ConstructorDeclaraVariableReferencia");
//  ListaNumeros2 lista2 = new ListaNumeros2();
  System.out.println("El sumatorio actual es : " + lista2.sumatorio());

  System.out.println("lista1 == null");
  if (lista1 == null) {
   System.out.println("Variable de Referencia sin posicion en la memoria" + lista1);
  } else {
   System.out.println("!! Variable de Referencia con posicion en la memoria" + lista1);
  }

  System.out.println("lista2 == null");
  if (lista2 == null) {
   System.out.println("Variable de Referencia sin posicion en la memoria" + lista2);
  } else {
   System.out.println("!! Variable de Referencia con posicion en la memoria" + lista2);
  }
 }
}
