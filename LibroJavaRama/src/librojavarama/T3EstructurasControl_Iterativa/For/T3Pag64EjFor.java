/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T3EstructurasControl_Iterativa.For;

/**
 *
 * @author Portatil
 */
public class T3Pag64EjFor {

  public static void main(String[] args) {

    For.for_contador(10);
  }
}

class For {

  public static void for_contador(int valor) {

    for (int i = 1; i < valor + 1; i++) {
      System.out.println("valores " + i);
    }

  }
}
