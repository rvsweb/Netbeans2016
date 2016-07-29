/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpruebas.ClasesAbstractas;

/**
 * @see @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public class xEjClasesAbstractasUsoBasico {

 public static void main(String[] args) {

// Tipo Elemento   Variable ref           =   invocacion/Reserva Espacio en la memoria                    Constructor
      Figura             f1               =            new                                                 Circulo();

  f1.setNombre("Ref 'Figura' apunta a la posicion de memoria Objeto 'Circulo' ");   // Crear el metodo setNombre -> Lo genera dentro de la Clase Abstracta Figura
  String ref = f1.getNombre();
  System.out.println(ref);

//  Al crear una Referencia a un objeto de tipo Figura que es abstracto 
//  Tengo que redefinir todos los metodos de la clase abstracta
  System.out.println("-----------------------------------------");
  Figura f2 = new Figura() {
   @Override
   public int getX() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public int getY() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public void setX(int x) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public void setY(int y) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public String getNombre() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public void setNombre(String nom) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

  }; // CIERRE DEL CONSTRUCTOR 

 }
}

abstract class Figura {

 private int x;
 private int y;
 private String nombre;

 public abstract int getX();

 public abstract int getY();

 public abstract void setX(int x);

 public abstract void setY(int y);

 public abstract String getNombre();

 public abstract void setNombre(String nom);

}

class Circulo extends Figura {

 private int x1;
 private int y1;
 private String nombre1;

 @Override
 public int getX() {
  return x1;
 }

 @Override
 public int getY() {
  return y1;
 }

 @Override
 public void setX(int x) {
  this.x1 = x;
 }

 @Override
 public void setY(int y) {
  this.y1 = y;
 }

 @Override
 public String getNombre() {
  return nombre1;
 }

 @Override
 public void setNombre(String nom) {
  this.nombre1 = nom;
 }

}
