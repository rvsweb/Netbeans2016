/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodegeeks;

import java.sql.SQLException;

/**
 * @see
 * https://www.javacodegeeks.com/2014/11/10-things-you-didnt-know-about-java.html?utm_content=buffera8bb8&utm_medium=social&utm_source=facebook.com&utm_campaign=buffer
 * @author Portatil
 */
//
//1. There is no such thing as a checked exception
//
public class xExcepcionesControladasProvocanError {
}

class Test {

 /**
  * @param args the command line arguments
  */
 public static void main(String[] args) {
  doThrow(new SQLException());

 }

 private static void doThrow(SQLException sqlException) {
  Exception e = null;
  Test.<RuntimeException>doThrow0(e);
 }

 static <E extends Exception>
         void doThrow0(Exception e) throws E {
  throw (E) e;
 }
}
