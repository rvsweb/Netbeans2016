/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.Interfaces;

/**
 * @see Libro rama
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class T4Pag105UsoBasicoInterfaces {

 public static void main(String[] args) {

 }
}

interface Intfigura {

 int area();
}

class Rectangulo implements Intfigura {

 private int ancho;
 private int alto;

 public Rectangulo() {
 }

 public Rectangulo(int ancho, int alto) {
  this.ancho = ancho;
  this.alto = alto;
 }

 @Override
 public int area() {
  return ancho + alto;
 }

}
