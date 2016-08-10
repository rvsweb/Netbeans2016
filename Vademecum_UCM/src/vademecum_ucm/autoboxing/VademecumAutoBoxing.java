/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.autoboxing;

import java.util.ArrayList;
import java.util.List;

/**
 * @see pag 22
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VademecumAutoBoxing {

 public static void main(String[] args) {

  System.out.println("\n------- UsaConversionExplicita ---------");
  UsaConversionExplicita uce = new UsaConversionExplicita();
  List<Integer> lista = new ArrayList<>();
  uce.inserta(lista, 1);
  uce.inserta(lista, 2);
  uce.inserta(lista, 3);
  uce.inserta(lista, 4);

  for (Integer indice : lista) {
   System.out.print(indice + " ");
  }

  System.out.println("");

  for (int i = 0; i < lista.size(); i++) {
   System.out.print(" " + uce.extrae(lista, i));
   if (uce.extrae(lista, i) == 3) {
    System.out.println("\n • Encontrado el \"3\" - Posicion : " + i);
    int extrae = uce.extrae(lista, i);
    System.out.println("• Mi valor es : " + extrae);
    for (int j = 1; j < 11; j++) {
     int v = extrae * j;
     System.out.println("tabla multiplicar : " + v);
    }
   }

  }

  System.out.println("\n------- UsaAutoBoxing ---------");
  UsaAutoBoxing uab = new UsaAutoBoxing();
  List<Integer> lista1 = new ArrayList<>();
  uab.inserta(lista1, 1);
  uab.inserta(lista1, 2);
  uab.inserta(lista1, 3);
  uab.inserta(lista1, 4);

  for (Integer indice1 : lista1) {
   System.out.print(indice1 + " ");
  }

  for (int i = 0; i < lista1.size(); i++) {
   uab.extrae(lista1);
  }

  System.out.println("");

 }
}

class UsaConversionExplicita {

 void inserta(List<Integer> lista, int valor) {
  lista.add(valor);
 }

 public int extrae(List<Integer> lista, int i) {
  Integer x = lista.get(i);
  return x;
 }

}

class UsaAutoBoxing {

 void inserta(List<Integer> lista, int valor) {
  lista.add(valor);
 }

 int extrae(List<Integer> lista) {
  return lista.get(0);
 }
}
