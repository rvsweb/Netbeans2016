/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.InicializarObjetos;

/**
 * @see
 * http://chuwiki.chuidiang.org/index.php?title=Inicializaci%C3%B3n_de_Objetos_en_Java
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class InicializarObjetos {

}

class Padre3 {

 protected int P1 = 2;
 protected int P2 = 2 * P1;

 public static void main(String[] args) {
  Padre3 padre = new Padre3();

  System.out.println(padre.P1);
  System.out.println(padre.P2);
 }
}

class Padre2 {

 protected int P2 = 3;
 protected int P1 = 2 * P2;

 public static void main(String[] args) {

  Padre2 padre = new Padre2();

 }
}

class Padre1 {

 protected int P1 = getP1();
 protected int P2 = 3;

 public Padre1() {
  System.out.println("P1: " + this.P1 + " P2 : " + this.P2);
 }

 public int getP1() {
  return this.P2 * 2;
 }

 public static void main(String[] args) {

  Padre1 padre = new Padre1();

 }
}

class Padre {

 /**
  * Atributo instancia de tipo primitivo de la clase Padre que declara el valor
  * de la variable P1
  */
 protected int P1 = 1;
 protected int P2 = 2;
 protected static int P3 = 3;

 public Padre() {
  this.setP1(); // metodo de instancia invocado
  System.out.println("1º v - P1: " + this.P1 + " P2: " + this.P2);
  setP1();
  System.out.println("2º v - P1: " + this.P1 + " P2: " + this.P2 + " P3: " + P3/* esta ejecutando el atributo de clase */);
  setP3();
  System.out.println("2º v - P1: " + this.P1 + " P2: " + this.P2 + " P3: " + P3/* esta ejecutando la referencia de clase */);
 }

 public void setP1() {
  this.P1 = 5;
 }

 public static void setP3() {
  P3 = 4;
 }

 public static void main(String[] args) {

//  Padre padre = new Padre()/*1º forma : Al ejecuta el constructor se ejecutan las demas operaciones */;
  new Padre();/*2º forma : Al ejecuta el constructor se ejecutan las demas operaciones */

 }
}

class Hijo extends Padre {

 protected int H1 = 7;
 protected int H2 = 11;

 public Hijo() {
  System.out.println("H1: " + this.H1 + " H2: " + this.H2);
 }

 public void setP1() {
  this.P1 = this.H1 * 2;
 }

 public static void main(String[] args) {
//  Hijo hijo = new Hijo();

  /*Lanzo Padre e Hijo porque Hijo hereda de Padre */
  new Hijo();
 }

}
