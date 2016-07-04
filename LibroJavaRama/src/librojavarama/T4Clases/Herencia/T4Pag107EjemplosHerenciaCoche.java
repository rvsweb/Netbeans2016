/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.Herencia;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class T4Pag107EjemplosHerenciaCoche {

 public static void main(String[] args) {

 }
}

class Coches {

 public int puertas;
 public int ruedas;

 public Coches() {
  puertas = 0;
  ruedas = 0;
 }

 public Coches(int puertas, int ruedas) {
  this.puertas = 2;
  this.ruedas = 4;
 }

}

class Furgoneta extends Coches {

 private int capacidad;
 private int plaza;

 public Furgoneta(int capacidad, int plaza) {
  super();
 }

}





