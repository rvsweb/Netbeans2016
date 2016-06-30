package librojavarama.T5ClasesAvanzadas.UsoSuper;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T5Pag132UsoSuper {
}

class Padre {

 protected int dato;

 public void m() {
  System.out.println("• Metodo clase Padre ");
 }
}

class Hijo extends Padre {

 private int dato;

 @Override
 public void m() {
  System.out.println("• Metodo clase Hijo ");
  super.dato = 10;
  dato = 20;
 }

 public void getDato() {
  System.out.println(super.dato);
 }

 public void mostrar() {
  this.m();
  m();
  super.m();
 }

}

class Test {

 public static void main(String[] args) {
  Hijo h = new Hijo();
  h.mostrar();
  h.getDato();
 }
}
