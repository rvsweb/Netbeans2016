/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T4Clases.UsoThis;

/**
 *
 * @author Portatil
 */
public class T4Pag87UsoMetodoCloneable {
}

class Object implements Cloneable {

 private int ancho;
 private int alto;
 private String nombre;

 @Override
 public Object clone() {
  Object objecto = null;
  try {
   objecto = (Object) super.clone();
  } catch (CloneNotSupportedException cn) {
   System.out.println("Error al duplicar");
  }
  return objecto;
 }
}

class TestClaseClone {

 public static void main(String[] args) {
  Rectangulo r1 = new Rectangulo(5, 7);
  Rectangulo r2 = new Rectangulo(5, 7);
  r1.incrementarAlto();
  r1.incrementarAncho();
  r2.incrementarAlto();
  r2.incrementarAncho();
  System.out.println("Alto : " + r1.getter_alto());
  System.out.println("Ancho : " + r1.getter_ancho());

  System.out.println("Alto : " + r2.getter_alto());
  System.out.println("Ancho : " + r2.getter_ancho());

  System.out.println("Nombre : " + r1.getClass().getName());
  System.out.println("Nombre : " + r2.getClass().getName());

 }
}
