/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T2POO.Ejercicios;

/**
 *
 * @author Portatil
 */
public class T2Pag52EjerCoche {

  public static void main(String[] args) {

    Coche c1 = new Coche();
    System.out.println("velocidad actual : " + c1.getVelocidad());
    c1.acelerar(100);
    int total_velocidad = c1.getVelocidad();
    System.out.println(total_velocidad);
    c1.desacelerar(20);
    int total_velocidad1 = c1.getVelocidad();
    System.out.println(total_velocidad1);
  }
}

class Coche {

  private int velocidad;
  public int velocidad1;

  public Coche() {
    velocidad = 0;
  }

  public int getVelocidad() {
    return this.velocidad;
  }

  public void acelerar(int mas) {
    this.velocidad = velocidad + mas;
  }

  public void desacelerar(int mas) {
    this.velocidad = velocidad - mas;
  }

}
