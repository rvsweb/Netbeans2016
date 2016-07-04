package librojavarama.T5ClasesAvanzadas.ClasesAbstractas.NuevoEjemplo;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class TestForma {

 public static void main(String[] args) {
  Forma3 f = new Circulo3();
  f.identidad();
  Circulo3 c = new Circulo3();
  ((Forma3) c).identidad();
//  La clases Abstractas no pueden instanciar Objetos
// Si se hace se implementara el metodo desde la clase invocada
  Forma3 f2 = new Forma3() {
   @Override
   public String toString() {
    return "Forma3 Sobreescrito dentro de TestForma";
   }
  };

  f2.identidad();
  f.identidad();

 }
}
