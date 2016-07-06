package librojavarama.T6LecturaEscrituraInformacion.FicheroSecuencial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6PagFileInputStreamParaLeerBytesFichero {

 public static void main(String[] args) {
  String s = "c:\\x\\FileOutputStream.txt";
  LeerBytesFichero.leerFichero(s);
 }
}

class LeerBytesFichero {

 public static void leerFichero(String nomb_fichero) {
  FileInputStream fis = null;
  String s = "";
  char c = '0';
  try {
   fis = new FileInputStream(nomb_fichero);
   int size = fis.available(); // almacena 89 
   for (int i = 0; i < size; i++) {
//    System.out.println(size);
    c = (char) fis.read();
    s = s + c;
   }
  } catch (FileNotFoundException ex) {
   Logger.getLogger(LeerBytesFichero.class.getName()).log(Level.SEVERE, null, ex);
  } catch (IOException ex) {
   Logger.getLogger(LeerBytesFichero.class.getName()).log(Level.SEVERE, null, ex);
  } finally {
   System.out.println(s);
   try {
    if (fis != null) {
     fis.close();
    }
   } catch (IOException ex) {
    Logger.getLogger(LeerBytesFichero.class.getName()).log(Level.SEVERE, null, ex);
   }
  }
 }
}


