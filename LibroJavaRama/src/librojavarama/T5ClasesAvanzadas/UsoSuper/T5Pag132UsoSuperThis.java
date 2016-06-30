package librojavarama.T5ClasesAvanzadas.UsoSuper;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T5Pag132UsoSuperThis {

 public static void main(String[] args) {
  SubHijo h1 = new SubHijo(1, 1);
  h1.getDato();
  System.out.println("---------");
  SubHijo h2 = new SubHijo();
  h2.getDato();

 }
}

class SuperPadre {

 protected int dato1, dato2;

 public SuperPadre(int x, int y) {
  dato1 = x;
  dato2 = y;
 }

 /**
  * Constructor referencia a los parametros del anterior Constructor
  *
  */
 public SuperPadre() {
  this(5, 5);
 }

}

class SubHijo extends SuperPadre {

 private int dato1, dato2;

 public SubHijo() {
  dato1 = 3;
  dato2 = 3;
 }

 /**
  * Constructor referencia a los parametros de Constructor SuperClase
  *
  * @param x
  * @param y
  */
 public SubHijo(int x, int y) {
  super(2, 2); //Referencia al THIS de la SuperClase
  dato1 = x;
  dato2 = y;
 }

 public void getDato() {
  System.out.println("Padre dato1 : " + super.dato1);
  System.out.println("Padre dato2 : " + super.dato2);
  System.out.println("Hijo dato1 : " + super.dato1);
  System.out.println("Hijo dato2 : " + super.dato2);
 }
}
