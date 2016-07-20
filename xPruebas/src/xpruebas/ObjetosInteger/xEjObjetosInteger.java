/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.ObjetosInteger;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class xEjObjetosInteger {

 public static void main(String[] args) {
  Integer i = new Integer("1"); // Reservado trozo memoria para almacenar valor , crear objeto que sera referenciado por la variable i

  Integer i1 = i; // Las 2 ref apunta al mismo objeto

  System.out.println("referencias : " + i1.toString());
  System.out.println("referencias : " + i.toString());

  System.out.println("Integer i : " + i);
  System.out.println("Integer i1 : " + i1);

  Integer i2 = null;

  i2 = Integer.sum((int) 1.9, new Integer(3));

  System.out.println("Suma total : " + i2);

  i2 = (int) ((Math.random() * 1 + 10) + 10);

  long longValue = i2.longValue();

  System.out.println("Valores : " + i2);
  System.out.println("Valores L : " + longValue);
  System.out.println(Math.PI);

 }

}
