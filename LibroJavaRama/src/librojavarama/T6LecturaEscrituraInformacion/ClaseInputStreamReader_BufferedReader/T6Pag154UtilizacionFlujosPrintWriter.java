package librojavarama.T6LecturaEscrituraInformacion.ClaseInputStreamReader_BufferedReader;

import java.io.PrintWriter;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6Pag154UtilizacionFlujosPrintWriter {

}

class UtilizarClasePrintWriter {

 public static void main(String[] args) {

  PrintWriter pantalla = new PrintWriter(System.out, false);
  char array[] = {'P', 'r', 'i', 'n', 't', 'W', 'r', 'i', 't', 'e', 'r'};
  String str = new String("\n Con flush desactivado necesita ejecutar al final el metodo flush");
  pantalla.write(array, 0, 11);
  pantalla.print(" ");
  pantalla.write(str);
  pantalla.println("!!!!!!!!!!!!!!!!!!!!"); // Se muestra porque el objeto no ha descargado toda la memoria que tiene almacenada
  pantalla.flush(); // Este es mas eficiente.
  pantalla.println("!!!!!!!!!!!!!!!!!!!!"); // No se muestra porque el objeto ha descargado toda la memoria despues del flush

  PrintWriter pantalla1 = new PrintWriter(System.out, true);
  char array1[] = {'P', 'r', 'i', 'n', 't', 'W', 'r', 'i', 't', 'e', 'r'};
  String str1 = new String("\n Con flush activado NO necesita ejecutar al final el metodo flush");
  pantalla1.write(array1, 0, 10);
  pantalla1.print(" ");
  pantalla1.write(str1);
  pantalla1.println("\n ! ! ! ! ! $");
 }
}
