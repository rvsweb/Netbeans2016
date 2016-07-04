/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T5ClasesAvanzadas.Wrapper;

import javax.swing.JOptionPane;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class T5Pag118BasicWrapper {

 public static void main(String[] args) {

  BasicInteger bi = new BasicInteger();
  bi.setter(100);
  Integer ter = bi.getter();
  System.out.println(bi.getter());
  System.out.println("Son equivalentes : " + ter.equals(bi.getter()));
  System.out.println(Integer.decode("1"));

  Integer is = new Integer("1");
  Integer ii = new Integer(2);
  Integer iii = 3;

  System.out.println("Constructor Completo String - Integer is = new Integer(\"1\")");
  System.out.println("byteValue()" + is.byteValue());
  System.out.println("doubleValue() " + is.doubleValue());
  System.out.println("hashCode() " + is.hashCode());
  System.out.println("intValue() " + is.intValue());
  System.out.println("longValue() " + is.longValue());
  System.out.println("shortValue() " + is.shortValue());

  System.out.println("Constructor Completo Integer - Integer is = new Integer(2)");
  System.out.println("" + ii.toString());

  int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce valor : ", JOptionPane.QUESTION_MESSAGE));
  if (num < 5) {
   JOptionPane.showMessageDialog(null, "El " + num + " es menor que 5 ");
  } else {
   JOptionPane.showMessageDialog(null, "El " + num + " es mayor que 5 ");

  }

 }
}

class BasicInteger {

 Integer inte;

 public BasicInteger() {
  this.inte = 0;
 }

 public Integer getter() {
  return inte;
 }

 public void setter(Integer inte) {
  this.inte = inte;
 }

}
