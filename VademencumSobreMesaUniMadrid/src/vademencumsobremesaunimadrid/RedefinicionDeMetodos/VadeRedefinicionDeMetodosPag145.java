/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.RedefinicionDeMetodos;

/**
 *
 * Herencia : En la 'subclase' se puede usar metodos de la 'SUBclase' y metodos
 * de la 'SUPERClase' teniendo en cuenta que cuando un metodo de la 'SUPERclase'
 * ha sido redefinido , el acceso directo es a la redefinicion en la 'SUBclase'
 *
 * No obstante , todos los metodos de la 'SUPERClase' son accesibles por medio
 * de 'SUPER'
 *
 * @Override le pide al compilador que verifique que efectivamente estamos
 * redefiniendo un metodo de la 'SuperClase'.
 *
 * @see 145
 * @since -
 * @version -
 * @author Raul Vela Salas
 */
public class VadeRedefinicionDeMetodosPag145 {

 /**
  * Cuando se van a utilizar las clases derivadas , se aplica el polimorfismo
  *
  * @param args
  */
 public static void main(String[] args) {

  Operacion opA = new Operacion();
  Operacion opB = new Duplica();
  Operacion opC = new Suma(3);

  double aplica = opA.aplica(7);
  String nombre_clase = opA.getClass().getSimpleName();
  System.out.println("Nombre Clase : " + nombre_clase + " - valor :  " + aplica);
  double aplica1 = opB.aplica(7);
  String nombre_clase1 = opB.getClass().getSimpleName();
  System.out.println("Nombre Clase : " + nombre_clase1 + " - valor :  " + aplica1);
  double aplica2 = opC.aplica(7);
  String nombre_clase2 = opC.getClass().getSimpleName();
  System.out.println("Nombre Clase : " + nombre_clase2 + " - valor :  " + aplica2);

 }
}

/**
 * Cuando un metodo cambia su contenido sin cambiar su signatura
 *
 * Cuando una clase 'B' extiende a otra 'A' y 'B' tiene un metodo con la misma
 * signatura que un metodo de 'A'
 *
 * @author remoto
 */
class Operacion {

 /**
  *
  * @param x
  * @return
  */
 public double aplica(double x) {
  System.out.println("• Aplico Operacion : Metodo original ");
  return x;
 }

}

/**
 *
 * @author remoto
 */
class Duplica extends Operacion {

 /**
  * Metodo Redefinido
  *
  * @param x
  * @return
  */
 @Override
 public double aplica(double x) {
  System.out.println("♦ Aplico Duplica");
  return 2 * x;
 }
}

/**
 *
 * @author remoto
 */
class Suma extends Operacion {

 private double k;

 /**
  *
  * @param k
  */
 public Suma(double k) {
  this.k = k;
 }

 /**
  * Redefine el metodo
  *
  * @param x
  * @return
  */
 @Override
 public double aplica(double x) {
  System.out.println("♦ Aplico Suma");
  return x + k;
 }
}
