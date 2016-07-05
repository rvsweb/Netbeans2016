package librojavarama.T6LecturaEscrituraInformacion.EjFlujoCaracteres;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6Pag151EjemploDeFlujoCaracteres {

}

class UsarFlujoCaracteres {

 public static void main(String[] args) {

  String s = "Flujo de Caracteres : ";
  s = s + "\n Memoria - StringReader ";
  s = s + "\n Memoria - CharArrayWriter ";

  char arr[] = new char[s.length()];
  int car = 0;
  StringReader flujoInput = new StringReader(s); // Leer el String char a char
  CharArrayWriter flujoOutput = new CharArrayWriter(); // Almacenaje char leidos hasta -1 

  try {
   while ((car = flujoInput.read()) != -1) {
    flujoOutput.write(car);
   }
   arr = flujoOutput.toCharArray(); // Se convierte los valores del String a Array char y se copia dentro del 'arr' 
   System.out.println(arr);
  } catch (IOException io) {
   io.printStackTrace();
  } finally {
   flujoInput.close();
   flujoOutput.close();
  }
 }
}
