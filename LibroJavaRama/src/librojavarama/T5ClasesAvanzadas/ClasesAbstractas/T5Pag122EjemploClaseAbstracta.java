/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T5ClasesAvanzadas.ClasesAbstractas;

/**
 *
 * @author Portatil
 */
public class T5Pag122EjemploClaseAbstracta {

 public static void main(String[] args) {

  Coche c = new Coche();
  c.setVelocidadActual(111);
  int vb = c.getVelocidadActual();
  System.out.println(vb);

 }
}

abstract class Vehiculo {

 private int peso;

 private void setPeso(int p) {
  peso = p;
 }

 public abstract int getVelocidadActual();

 public abstract void setVelocidadActual(int v);

}

class Coche extends Vehiculo {

 private int velocidad = 0;

 public Coche() {
 }

 public Coche(int velocidad) {
  this.velocidad = velocidad;
 }

 @Override
 public int getVelocidadActual() {
  return velocidad;
 }

 @Override
 public void setVelocidadActual(int v) {
  this.velocidad = velocidad + v;
 }

}
