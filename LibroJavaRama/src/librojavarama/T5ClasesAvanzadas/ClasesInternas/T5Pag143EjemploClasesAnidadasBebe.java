package librojavarama.T5ClasesAvanzadas.ClasesInternas;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T5Pag143EjemploClasesAnidadasBebe {

 public static void main(String[] args) {

  System.out.println("El bebe se ha despertado y va a pedir cosas ");
  System.out.println("El bebe dice : " + Bebe.str1);

  Bebe.pedir("mama pipi", "mama caca", "mama agua");
  Bebe.pedir(new String[]{"papa jugar", "mama me aburro", "papa sed", "papa dormir", "papa tengo sed"});

 }

 static Bebe bebe1 = new Bebe();
 static Bebe bebe2 = new Bebe();
 static Bebe bebe3 = new Bebe();

}

class Bebe {

 static void pedir() {
  System.out.println(str1 + " , " + str2 + " , " + str3);
 }

 static void pedir(String... argumentos) {
  for (String str : argumentos) {
   System.out.println(str);
  }
 }

 static {
  str2 = "• Mama Pipi";
  str3 = "◘ Mama Agua";
 }

 public Bebe() {
  System.out.println("Nacimiento de Bebe");
 }

 static String str2, str3, str1 = "papa tengo caca";

}
