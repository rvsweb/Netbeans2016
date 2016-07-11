/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodegeeks.Aliases;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class xEjUsoDeAlias {

}

class Test</*Alias*/I extends Integer> {

 </*Alias*/L extends Long> void x(I/*Integer*/ i, L/*Long*/ l) {
  System.out.println(i.intValue()
          + ", " + l.longValue());
 }

 public static void main(String[] args) {
  new Test().x(1, 2L);

 }
}
