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
public class T2Pag54EjerRebajas {

  public static void main(String[] args) {

    double descubrePorcentaje = Rebajas.descubrePorcentaje(100, 80);
    System.out.println(descubrePorcentaje);
  }
}

class Rebajas {

  public static double descubrePorcentaje(double original, double actual) {
    return (original - actual) * 100 / original;
  }

}
