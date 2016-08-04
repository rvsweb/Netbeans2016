/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.Constructor;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xEjContadorObjetos {

 public static void main(String[] args) {
  Objeto o1 = new Objeto();
  int ver_num = o1.getNumero();
  System.out.println("♦ " + ver_num);

  Objeto o2 = new Objeto();
  int ver_num1 = o2.getNumero();
  System.out.println("♦ " + ver_num1);

  Objeto o3 = new Objeto();
  int ver_num2 = o3.getNumero();
  System.out.println("♦ " + ver_num2);

  Objeto o4 = new Objeto();
  int ver_num3 = o4.getNumero();
  System.out.println("♦ " + ver_num3);

  Objeto o5 = new Objeto();
  int ver_num4 = o5.getNumero();
  System.out.println("♦ " + ver_num4);

  int ver = o5.getContador();
  System.out.println("• " + ver);
 }
}

class Objeto {

 private String cadena = null;
 private int numero;
 private static int contador = 0;

 /**
  * 1º paso
  */
 public Objeto() {
  cadena = "Cadena";
  numero++;
  contador++;
 }

 public int getContador() {
  return Objeto.contador;
 }

 public int getNumero() {
  return numero;
 }

 @Override
 public String toString() {
  return "• " + this.cadena + " - " + this.numero + " - " + contador;
 }

}
