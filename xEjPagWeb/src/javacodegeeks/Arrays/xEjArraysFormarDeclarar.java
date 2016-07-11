/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodegeeks.Arrays;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class xEjArraysFormarDeclarar {

 int[][] a() {
  return new int[0][];
 }

 int[] b                     () 
  [] {
  return new int[0][];
 }

 int c                   () 
  [][]{
   return new int[0][];
 }

}

class Test {

 int[][] a = {{}};
 int[] b[] = {{}};
 int c[][] = {{}};
}

// Usando JSR-308 / Java 8 type annotations sobre el codigo anterior 
class UsandoJSR308 {

 @Target(ElementType.TYPE_USE)
 @interface Crazy {
 }

 class Test {

  @Crazy
  int[][] a1 = {{}};
  int @Crazy []   
  [] a2 = {{}};
int [] @Crazy [] a3 = {{}};

  @Crazy
  int[] b1[] = {{}};
  int @Crazy [] b2[] = {{}};
  int[] b3 @Crazy []  = {{}};

  @Crazy
  int c1[][] = {{}};
  int c2 @Crazy []  
  [] = {{}};
  int c3 [] @Crazy []  = {{}};
 }

}
