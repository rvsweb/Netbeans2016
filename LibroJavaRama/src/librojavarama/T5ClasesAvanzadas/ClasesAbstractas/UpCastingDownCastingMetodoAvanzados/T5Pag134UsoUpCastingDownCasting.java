package librojavarama.T5ClasesAvanzadas.ClasesAbstractas.UpCastingDownCastingMetodoAvanzados;

import java.util.logging.Level;
import java.util.logging.Logger;
import static librojavarama.T5ClasesAvanzadas.ClasesAbstractas.UpCastingDownCastingMetodoAvanzados.Circulo.jerarquia;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T5Pag134UsoUpCastingDownCasting {

 public static void main(String[] args) {

  Circulo c = new Circulo();
//  Haciendo UpCasting
  Forma f = (Forma) c;
  f.identidad();
//  Haciendo DownCasting
  if (f instanceof Circulo) {
   ((Circulo) f).identidad();
  } else if (!(f instanceof Circulo)) {
   System.out.println(" f (forma) no es un Circulo");
   jerarquia(c);
  }
 }
}

abstract class Forma {

 public void identidad() {
  System.out.println(this);
 }

 @Override
 abstract public String toString();
}

class Circulo extends Forma {

 @Override
 public String toString() {
  return "circulo";
 }

 public static void jerarquia(Object obj) {
  Object o = obj;
  while (o.getClass().getSuperclass() != null) {
   try {
    System.out.println(o.getClass() + " es una Subclase de " + o.getClass().getSuperclass());
    o = o.getClass().getSuperclass().newInstance();
   } catch (InstantiationException e) {
    System.out.println("Mensaje de error : " + e.getMessage());
    Logger.getLogger(Circulo.class.getName()).log(Level.SEVERE, null, e);
    System.out.println("Imposible instanciar la clase " + o.getClass().getSuperclass());
    break;
   } catch (IllegalAccessException ex) {
    Logger.getLogger(Circulo.class.getName()).log(Level.SEVERE, null, ex);
    System.out.println("No hay acceso");
    break;
   }
  }
 }
}
