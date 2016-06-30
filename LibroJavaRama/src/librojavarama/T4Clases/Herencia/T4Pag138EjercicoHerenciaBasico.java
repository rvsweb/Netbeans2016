package librojavarama.T4Clases.Herencia;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T4Pag138EjercicoHerenciaBasico {

 public static void main(String[] args) {

  Empleado e1 = new Encargado(); // Usara el metodo de la Subclase con la implementacion propia
  e1.sueldobase = 1000;
  int v = e1.getSueldo();
  System.out.println("Sueldo Encargado con 10% : " + v);

  Empleado c1 = new Chofer(); // Usara el metodo de la SuperClase 
  c1.sueldobase = 2000;
  int v1 = c1.getSueldo();
  System.out.println("Sueldo Chofer con 10% : " + v1);
 }
}

class Empleado {

 protected int sueldobase;

 public int getSueldo() {
  System.out.println("-> Soy SuPerClase");
  return sueldobase;
 }
}

class Encargado extends Empleado {

 @Override
 public int getSueldo() {
  System.out.println("• Soy SubClase");
  return sueldobase += (sueldobase * 10 / 100);
 }

}

class Chofer extends Empleado {

 public Chofer() {
 }

// @Override
// public int getSueldo() {
//  return (int) (sueldobase * 1.1);
// }
}
