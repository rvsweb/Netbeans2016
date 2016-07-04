/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T2POO;

/**
 * @see
 *
 * Puedo crear una variable de instancia con la clase y
 * @author Portatil
 */
public class T2Pag46Ej1Pajaro {

  public static void main(String[] args) {
//Puedo usar atributos y metodos de una clase creando un objeto de la clase
    Pajaro p = new Pajaro();
    Pajaro1 p1 = new Pajaro1();
//  Creo un objeto de la clase Pajaro1 e invoco al objeto de la clase Pajaro para utilizar sus metodos
    p1.p0.setedad(3);
    p1.p0.printedad();

    p.setedad(4);
    p.printedad();

    Pajaro1 p2 = new Pajaro1('a', 5);

  }
}

class Pajaro1 {

//  Para evitar que muestre NullPointerException tengo que instanciar el objeto
  Pajaro p0 = new Pajaro();

  public char color;
  public int edad;

  public Pajaro1() {
    color = 'v';
    edad = 0;
  }

  public Pajaro1(char color, int edad) {
    this.color = color;
    this.edad = edad;
  }
}
