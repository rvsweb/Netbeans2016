/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacodegeeks.OperadorTerciario;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class xEjOperadorTerciario {

}

class UsarOperadorTerciario {

 public static void main(String[] args) {
  Object o1 = true ? new Integer(1) : new Double(2.0);
  Object o2 = false ? new Integer(2) : new Double(2.0);

  Object o3;
  if (true) {
   o3 = new Integer(3);
  } else {
   o3 = new Double(3.0);
  }

  System.out.println("Object o1 ; " + o1);
  System.out.println("Object o2 ; " + o2);
  System.out.println("Object o3 ; " + o3);

  Integer i = new Integer(1);
  if (i.equals(1)) {
   i = null;
  }
  Double d = new Double(2.0);
  Object o = true ? i : d;
  System.out.println(o);

 }
}
