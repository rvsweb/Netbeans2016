/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademecum_ucm.getClassMetodo;

/**
 * @see - 84
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class VadeMetodoGetClassPag80 {
}

/**
 * Metodo estandar disponible todos los objetos
 *
 * Devuelve un objeto de tipo Class que permite saber cosas sobre la clase de
 * objetos que estamos manejando
 *
 * @author Portatil
 */
class Ejemplo {

 public static void main(String[] args) {
  Ejemplo x = new Ejemplo();
  Class tipo = x.getClass();

  System.out.println("toString() = " + tipo.toString());
  System.out.println("getSimpleName() = " + tipo.getSimpleName());
  System.out.println("getName() = " + tipo.getName());
  System.out.println("getCanonicalName() = " + tipo.getCanonicalName());
  System.out.println("getPackage() = " + tipo.getPackage());
  System.out.println("getSuperClass() = " + tipo.getSuperclass());

 }
}
