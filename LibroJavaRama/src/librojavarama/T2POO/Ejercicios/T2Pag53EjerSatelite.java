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
public class T2Pag53EjerSatelite {

  public static void main(String[] args) {

  }

  class Satelite {

    private double meridiano;
    private double paralelo;
    private double distancia_tierra;

    public Satelite() {
      meridiano = paralelo = distancia_tierra = 0;
    }

    Satelite(double meridiano, double paralelo, double distancia_tierra) {
      this.meridiano = meridiano;
      this.paralelo = paralelo;
      this.distancia_tierra = distancia_tierra;
    }

    public void print_posicion() {
      System.out.println("El satelite se encuentra en el paralelo " + paralelo + " meridiano " + meridiano + " distancia_tierra " + distancia_tierra);
    }

  }
}
