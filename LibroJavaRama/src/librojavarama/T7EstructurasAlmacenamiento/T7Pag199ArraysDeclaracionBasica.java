/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class T7Pag199ArraysDeclaracionBasica {

}

class ArrayChar {

 public static void main(String[] args) {

//  Todos los arrays son OBJECTOS
  char cha[] = new char[6];
  for (char indice_cha : cha) {
   System.out.println(indice_cha);
  }

  System.out.println("----------------");

  boolean bo[] = new boolean[6];
  for (boolean indice_bo : bo) {
   System.out.println(indice_bo);
  }

  System.out.println("----------------");

  int va[] = new int[6];
  for (int indice_va : va) {
   System.out.println(indice_va);
  }

  System.out.println("----------------");
  String st[] = new String[6];
  int c = 0;
  for (String indice_st : st) {
   System.out.println(indice_st + " - " + ++c);
  }

  String st1[] = new String[6];
  System.out.println("----------------");
  for (int i = 0; i < st1.length; i++) {
   System.out.println(st1[i] + " " + i);
  }

 }
}
