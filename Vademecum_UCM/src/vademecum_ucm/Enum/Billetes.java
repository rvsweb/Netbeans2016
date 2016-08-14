/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.Enum;

/**
 * @see Pag 50
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public enum Billetes {

 B5(5), B10(10), B20(20), B50(50), B100(100), B200(200), B500(500);

 private final int valor;

 private Billetes() {
  this.valor = 0;
 }

 private Billetes(int valor) {
  this.valor = valor;
 }

 public int getValor() {
  return valor;
 }

 public static void recorrerObjetos() {
  System.out.println("• Lista de Objetos : ");
  Billetes[] lista_valores = Billetes.values();
  for (Billetes indice : lista_valores) {
   System.out.println(indice);
  }
  System.out.println("---------------------");
 }

 @Override
 public String toString() {
  return valor + " euros";
 }

}

class Principal {

 public static void main(String[] args) {

  Billetes.recorrerObjetos();

  Billetes[] valores = Billetes.values();
  for (int i = 0; i < valores.length; i++) {
   System.out.println(valores[i].getValor());
  }
  System.out.println("---------------------");

  for (int i = 0; i < valores.length; i++) {
   System.out.println(valores[i]);
  }
  System.out.println("---------------------");

 }
}
