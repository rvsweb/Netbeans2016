package librojavarama.T6LecturaEscrituraInformacion.ClaseInputStreamReader_BufferedReader;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6Pag153UsoInputStreamReader_BufferedReader {

 public static void main(String[] args) {

  System.out.println("Escribe la cadena para ser leida :");
  String cadena = null;
  do {
   cadena = LeerCaracteresConBuffer.leer_cadena();
  } while (!cadena.equals("para"));

 }
}

class LeerCaracteresConBuffer {

 public static String leer_cadena() {
  String cad = "";
  BufferedReader br;
  br = new BufferedReader(new InputStreamReader(System.in));

  try {
   cad = br.readLine();
  } catch (IOException io) {
   io.printStackTrace();
  }
  System.out.println(cad);
  return cad;
 }
}
