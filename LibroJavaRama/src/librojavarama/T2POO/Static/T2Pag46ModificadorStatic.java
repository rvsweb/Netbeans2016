/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T2POO.Static;

/**
 *
 * @author Portatil
 */
public class T2Pag46ModificadorStatic {

  public static void main(String[] args) {

    PajaroStatic p1, p2 = null;
    p1 = new PajaroStatic();
    p2 = new PajaroStatic('a', 13);

    PajaroStatic.muestra_pajaros();

  }
}

class PajaroStatic {

  private static int numeroPajaros = 0;
  private char color;
  private int edad;

  static void nuevopajaro() {
    numeroPajaros++;

  }

  public PajaroStatic() {
    color = 'v';
    edad = 0;
    nuevopajaro();
  }

  PajaroStatic(char c, int e) {
    color = c;
    edad = e;
    nuevopajaro();
  }

  static void muestra_pajaros() {
    System.out.println(numeroPajaros);
  }
}
