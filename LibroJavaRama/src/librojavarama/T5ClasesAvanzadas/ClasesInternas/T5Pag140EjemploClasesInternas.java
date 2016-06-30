package librojavarama.T5ClasesAvanzadas.ClasesInternas;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T5Pag140EjemploClasesInternas {

 public static void main(String[] args) {

  Huevo h = new Huevo();

 }
}

class Huevo {

 class Yema {

  Yema() {
   System.out.println("Inicializa yema");
  }

  class Clara {

   Clara() {
    System.out.println("Inicializa clara ");
   }
  }

  Yema hazYema() {
   return new Yema();
  }

  Clara hazClara() {
   return new Clara();
  }
 }

 public Huevo() {
  System.out.println("Inicializa huevo");
 }

}
