/*
 */
package librojavarama.T4Clases.InicializarStatic;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class T4Pag116EjerInicializadoresStaticBebe {

 public static void main(String[] args) {

  new Bebe(8).berrea();
 }
}

class Bebe {

 public Bebe(int i) {
  this("Soy un bebe ");
  System.out.println("Hola , tengo " + i + " meses ");
 }

 public Bebe(String s) {
  System.out.println(s);
 }

 void berrea() {
  System.out.println("Ejecuto el metodo : Llorar");
 }

}
