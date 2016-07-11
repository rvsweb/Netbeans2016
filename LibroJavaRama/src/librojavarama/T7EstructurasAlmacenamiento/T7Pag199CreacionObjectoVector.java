/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T7EstructurasAlmacenamiento;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class T7Pag199CreacionObjectoVector {

}

class Empleado {

 private String nombre;
 private double sueldo;

 public Empleado() {
  this.nombre = null;
  this.sueldo = 0;
 }

 public Empleado(String nombre, double sueldo) {
  this.nombre = nombre;
  this.sueldo = sueldo;
 }

 public static void main(String[] args) {

  System.out.println("---------------");
  Empleado[] empleado = new Empleado[3];
  empleado[0] = new Empleado("Pepe", 1000);
  empleado[1] = new Empleado("Ana", 3000);
  empleado[2] = new Empleado("Juan", 2000);

  for (Empleado indice : empleado) {
   System.out.println(indice.nombre + " - " + indice.sueldo);
  }

  System.out.println("---------------");

  int x = 3;
  Empleado[] empleado1 = new Empleado[x];
  empleado1[0] = new Empleado("xPepe", 1000);
  empleado1[1] = new Empleado("yAna", 3000);
  empleado1[2] = new Empleado("zZuan", 2000);

  for (Empleado indice1 : empleado1) {
   System.out.println(indice1.nombre + " . " + indice1.sueldo);
  }
  System.out.println("---------------");
 }
 
 
}
