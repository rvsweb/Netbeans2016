/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodegeeks.SaberTipoVariable.Oracle;

import java.util.Scanner;

/**
 * @see https://docs.oracle.com/javase/7/docs/api/java/lang/Class.html
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xEjSaberTipoObjecto {

 /**
  * Metodo Oracle
  *
  * @param obj
  */
 void printClassName(Object obj) {
  System.out.println("♦ The class of " + obj + " is " + obj.getClass().getTypeName());
  System.out.println("○ The class of " + obj + " is " + obj.getClass().getName());
 }

 public static void main(String[] args) {

  xEjSaberTipoObjecto xe = new xEjSaberTipoObjecto();
  System.out.println("------- 1º Oficial ------");
  System.out.println(" Class representa Dato primitivo como objeto ");
  byte v = 11;
  byte v1 = 11;
  Byte byt0 = new Byte(v);
  Byte byt01 = v1;
  xe.printClassName(byt0);
  xe.printClassName(byt01);
  System.out.println("------- 2ºOficial ------");
  System.out.println("♠ The name of class xEjSaberTipoObjecto is : " + xEjSaberTipoObjecto.class.getName());
  System.out.println("♠ The name of class Byte is : " + Byte.class.getName());
  System.out.println("♠ The name of class Boolean is : " + Boolean.class.getName());
  System.out.println("♠ The name of class String is : " + String.class.getName());
  System.out.println("♠ The name of class Scanner is : " + Scanner.class.getName());

  System.out.println("------- No Oficial ----");
  Byte byt = new Byte("1");
  String by1 = byt.getClass().getCanonicalName();
  String by2 = byt.getClass().getName();
  String by3 = byt.getClass().getSimpleName();
  String by4 = byt.getClass().getTypeName();
  String by5 = byt.getClass().toGenericString();
  System.out.println("Byte : " + by1);
  System.out.println("Byte : " + by2);
  System.out.println("Byte : " + by3);
  System.out.println("Byte : " + by4);
  System.out.println("Byte : " + by5);

  byte lista_byte[] = new byte[20];
  short lista_short[] = new short[20];
  int lista_int[] = new int[20];
  long lista_long[] = new long[20];
  char lista_char[] = new char[20];
  String lista_String[] = new String[20];
  double lista_d[] = new double[20];
  float lista_f[] = new float[20];
  boolean lista_bo[] = new boolean[20];

  String saberby = lista_byte.getClass().getName();
  String sabersh = lista_short.getClass().getName();
  String saberi = lista_int.getClass().getName();
  String saberl = lista_long.getClass().getName();
  String saberc = lista_char.getClass().getName();
  String saberS = lista_String.getClass().getName();
  String saberbo = lista_bo.getClass().getName();
  String saberd = lista_d.getClass().getName();
  String saberf = lista_f.getClass().getName();

  System.out.println("------- Resultado ---------");
  System.out.println("byte " + saberby);
  System.out.println("short " + sabersh);
  System.out.println("int " + saberi);
  System.out.println("long " + saberl);
  System.out.println("char " + saberc);
  System.out.println("String " + saberS);
  System.out.println("double " + saberbo);
  System.out.println("float " + saberd);
  System.out.println("boolean " + saberf);

 }
}
