/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.ArrayList;

import java.util.ArrayList;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class UsoArrayList {

 private ArrayList n_array;
 private String nombre;

 public UsoArrayList() {
  n_array = null;
  nombre = null;
 }

 public UsoArrayList(String nombre) {
  this.nombre = nombre;
 }

 public UsoArrayList(ArrayList n_array, String nombre) {
  this.n_array = n_array;
  this.nombre = nombre;
 }

 public static void main(String[] args) {

  ArrayList a1 = new ArrayList(11);
  a1.add("1");
  a1.add("2");
  a1.add("3");
  a1.add("4");
  a1.add("5");
  a1.add("6");
  a1.add("7");
  a1.add("8");
  a1.add("9");
  a1.add("10");
  a1.add("11");
  a1.add("12");

  for (Object indice : a1) {
   System.out.println(" -> " + indice + " <- ");
  }

 }
}
