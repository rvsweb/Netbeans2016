/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.ClasesInternasStatic;

import java.util.Comparator;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class Objeto {

 private int campo1;
 private String campo2;
 private static int campo3;
 private static int campo5;
 private static int campo4 = inicializaCampo();

 public Objeto(int campo1, String campo2) {
  this.campo1 = campo1;
  this.campo2 = campo2;
 }

 static {
  campo3 = 10;
 }

 private static int inicializaCampo() {
  return 10;
 }

 private void setCambiarValor() {
  Objeto.campo5 = 3;
 }

 private static class ObjetoComparator implements Comparator<Objeto> {

  @Override
  public int compare(Objeto o1, Objeto o2) {
   return o2.campo1 - o1.campo1;
  }

  public static void main(String[] args) {

   Objeto o1 = new Objeto(1, "");
   System.out.println(Objeto.campo5);

  }
 }
}
