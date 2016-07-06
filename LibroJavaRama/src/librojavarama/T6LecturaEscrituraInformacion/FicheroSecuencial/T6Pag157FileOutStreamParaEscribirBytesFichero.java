package librojavarama.T6LecturaEscrituraInformacion.FicheroSecuencial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6Pag157FileOutStreamParaEscribirBytesFichero {

}

class EscribirBytesFichero {

 public static void main(String[] args) {
  String contenido = "Escribir datos en archivos utilizar clase FileOutputStream el cual hereda de OutputStream 2º parte";
  File ff = new File("c:\\x\\FileOutputStream1.txt");
  EscribirBytesFormaApropiada.escribirFichero(ff, contenido);

  FileOutputStream f = null;
  String s = "Escribir datos en archivos utilizar clase FileOutputStream el cual hereda de OutputStream";
  char c = 0;
  try {
   f = new FileOutputStream("c:\\x\\FileOutputStream.txt");
   for (int i = 0; i < s.length(); i++) {
    c = s.charAt(i);
    f.write((byte) c);
   }
   f.flush();
  } catch (IOException ex) {
   Logger.getLogger(EscribirBytesFichero.class.getName()).log(Level.SEVERE, null, ex);
  } finally {
   try {
    f.close();
   } catch (IOException ex) {
    Logger.getLogger(EscribirBytesFichero.class.getName()).log(Level.SEVERE, null, ex);
   }
  }
 }
}

class EscribirBytesFormaApropiada {

 public static void escribirFichero(File fichero, String contenido) {
  FileOutputStream f = null;
  String s = contenido;
  char c = 0;
  try {
   f = new FileOutputStream(fichero);
   for (int i = 0; i < s.length(); i++) {
    c = s.charAt(i);
    f.write((byte) c);
   }
   f.flush();
  } catch (FileNotFoundException ex) {
   Logger.getLogger(EscribirBytesFormaApropiada.class.getName()).log(Level.SEVERE, null, ex);
  } catch (IOException ex) {
   Logger.getLogger(EscribirBytesFormaApropiada.class.getName()).log(Level.SEVERE, null, ex);
  } finally {
   try {
    if (f != null) {
     f.close();
    }
   } catch (IOException ex) {
    System.out.println(ex.getMessage());
   }
  }

 }

}
