/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T2POO;

/**
 *
 * @author Portatil
 */
public class T2Pag42POOPajaro {

}

class Pajaro {

  private char color;
  private int edad;

  public void setedad(int e) {
    edad = e;
  }

  public void printedad() {
    System.out.println(edad);
  }

  public void setcolor(char c) {
    color = c;
  }

  public void printcolor() {
    switch (color) {
      case 'v':
        System.out.println("verde");
        break;
      case 'a':
        System.out.println("azul");
        break;
      case 'r':
        System.out.println("rojo");
        break;
      case 'g':
        System.out.println("gris");
        break;
      case 'n':
        System.out.println("negro");
        break;
      case 'b':
        System.out.println("blanco");
        break;
      default:
        System.out.println("color no establecido");
        break;
    }
  }
}

class Test {

  public static void main(String[] args) {

    Pajaro p = new Pajaro();
    p.setcolor('v');
    p.printcolor();
    p.setedad(4);
    p.printedad();
  }
}
