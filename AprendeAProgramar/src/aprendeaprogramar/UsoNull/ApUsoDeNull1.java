/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.UsoNull;

import java.util.ArrayList;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class ApUsoDeNull1 {

}

class Lista {

 private ArrayList<Integer> lista;

 public Lista() {
  lista = new ArrayList<>();
 }

 /**
  *
  * @return
  */
 public Integer sumar() {
  Integer suma = 0;
  for (Integer numero : lista) {
   suma = suma + numero;
  }
  return suma;
 }

 public void aniadirItem(Integer item) {
  lista.add(item);
 }

 public static void main(String[] args) {

  Lista lista1 = new Lista();
  System.out.println("  Lista lista1 = new Lista(); ");
  if (lista1 == null) {
   System.out.println("No apunta a ningun sitio " + lista1);
  } else {
   System.out.println("Si apunta a 1 sitio " + lista1);
  }

  lista1.aniadirItem(Integer.SIZE);
  Integer sumar = lista1.sumar();
  System.out.println("Ver suma " + sumar);

  System.out.println("  Lista lista = null; ");
  Lista lista = null;
  if (lista == null) {
   System.out.println("No apunta a ningun sitio " + lista);
  } else {
   System.out.println("Si apunta a 1 sitio " + lista);
  }

  System.out.println(" !! Lista lista2 = new Lista(); ");
  Lista lista2 = new Lista();
  lista2.aniadirItem(7);
  System.out.println(" !! Ver valor : " + lista2.sumar());

 }

}
