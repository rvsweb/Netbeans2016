/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Set.ConjuntoObjetos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeSet_Conjunto_ObjetosPag195 {

}

/**
 * Conjuntos se utilizan indicando el 'tipo de objetos' que pueden contener
 *
 * Tambien se pueden utilizar 'conjuntos' sobre 'Objetos' en general
 *
 * Lo que permite conjuntos heterogeneos a cambio de ser (tipicamente) necesario
 * el uso de 'downcasting' en la recuperacion de los elementos
 *
 * @author remoto
 */
class Conjunto_Object {

 public static void main(String[] args) {
  Set conjuntos = new HashSet();
  conjuntos.add(1);
  conjuntos.add(9);
  conjuntos.add(5);
  conjuntos.add(7);
  conjuntos.add(9);

  System.out.println("• Conjunto " + conjuntos.size());

  for (Iterator it = conjuntos.iterator(); it.hasNext();) {
   int n = (int) it.next();
   System.out.println(n + " ");
  }

  System.out.println();
  Set conjuntos2 = new HashSet();
  X x = new X(3);
  conjuntos2.add("1");
  conjuntos2.add(9);
  conjuntos2.add("1");
  conjuntos2.add(7);
  conjuntos2.add("4");
  conjuntos2.add(1);
  conjuntos2.add(x);

  System.out.println("• Conjunto 2 : " + conjuntos2.size());

  for (Iterator it = conjuntos2.iterator(); it.hasNext();) {
   Object next = it.next();
   System.out.println("<-> valor : " + next + " ");
   if (next instanceof Integer) {
    System.out.println("• Soy Integer : " + next.getClass().getName());
   }
   if (next instanceof String) {
    System.out.println(next.getClass().getName());
    System.out.println("♦ Soy String : " + next.getClass().getName());
   }
   if (next instanceof X) {
    System.out.println("-•- Soy X - " + next.getClass().getName());
    int x1 = x.getX();
    System.out.println("-•- Soy 'X' - " + x1 * 3);
   }
  }
  System.out.println();
 }
}

class X {

 private int x;

 public X() {
  x = 0;
 }

 public X(int x) {
  this.x = x;
 }

 public int getX() {
  return x;
 }
}
