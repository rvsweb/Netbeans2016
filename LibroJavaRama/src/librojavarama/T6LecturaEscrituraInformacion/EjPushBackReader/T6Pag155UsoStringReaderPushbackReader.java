package librojavarama.T6LecturaEscrituraInformacion.EjPushBackReader;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6Pag155UsoStringReaderPushbackReader {

}

class LeerCambiarValoresCaracteres {

 public static void main(String[] args) {
  String cadena_a_leer = "a=a+1;c++;b+=5;c=a+b;b++";
  StringReader sr = new StringReader(cadena_a_leer);
  PushbackReader pbr = new PushbackReader(sr);
  try {
   int ultimo = pbr.read();
   int penultimo = 0;
   while (ultimo != -1 /* -1 ultimo valor leido del String*/) {
    switch (ultimo) {
     case '+':
      if ((ultimo = pbr.read()) == '+') {
       System.out.print("=" + (char) penultimo + "+1");
      } else {
       pbr.unread(ultimo);
       System.out.print('+');
      }
      break;
     case ';':
      System.out.println((char) ultimo);
      break;
     default:
      System.out.print((char) ultimo);
    }
    penultimo = ultimo;
    ultimo = pbr.read();
   }
  } catch (IOException ex) {
   Logger.getLogger(LeerCambiarValoresCaracteres.class.getName()).log(Level.SEVERE, null, ex);
  }
  System.out.println("\n ");
 }
}
