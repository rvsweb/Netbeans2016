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

  PrintWriter pantalla = new PrintWriter(System.out);
  char array[] = {'B', 'u', 'f', 'f', 'e', 'r', 'e', 'd', 'R', 'e', 'a', 'd', 'e', 'r'};
  String str = new String("new InputStreamReader");
  pantalla.write(array, 0, 14);
  pantalla.print(" ");
  pantalla.write(str);
  pantalla.println(" ! ! ! ");
  pantalla.flush();
 }
}
