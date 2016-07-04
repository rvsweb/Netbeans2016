/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T2POO;

/**
 * Propiedades , metodos de los objetos
 *
 * @author Portatil
 */
public class T2Pajaro {

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

  public void pintcolor() {
    switch (color) {
      case 'v':
        System.out.println("verde");
        break;
      case 'a':
        System.out.println("azul");
        break;
      case 'g':
        System.out.println("gris");
        break;
      case 'r':
        System.out.println("rojo");
        break;
      case 'b':
        System.out.println("blanco");
        break;
      default:
        System.out.println("Sin color");
        break;
    }
  }

  public static void main(String[] args) {

    final String hola = "";
    T2Pajaro tp = new T2Pajaro();
    tp.setedad(5);
    tp.printedad();
  }
}
