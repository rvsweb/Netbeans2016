package librojavarama.T6LecturaEscrituraInformacion.ClaseFileWriter_FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6Pag162TrabajarFlujosCaracteresConLecturaEscritura2 {

 public static void main(String[] args) {

  String clases[] = {"java.lang.Object", "java.io.Writer", "java.io.OutputStreamWriter", "java.io.FileWriter", "java.lang.Object", "java.io.Reader", "java.io.OutputStreamReader", "java.io.FileReader"};

  String ruta = "c:\\x\\ClaseFlujoCaracteres";

//  ESCRIBIR
  File fescritura = new File(ruta);
  try {
   FileWriter fw = new FileWriter(fescritura);
   for (String s : clases) {
    fw.write(s, 0, s.length());
    fw.write("\r\n");
   }
   if (fw != null) {
    fw.close();
   }
  } catch (IOException ex) {
   Logger.getLogger(T6Pag162TrabajarFlujosCaracteresConLecturaEscritura2.class.getName()).log(Level.SEVERE, null, ex);
  }

  //  LEER
  File flectura = new File("c:\\x\\ClaseFlujoCaracteres" /*objeto String */);
  FileReader fr = null;
  if (flectura.exists()) {
   try {
    fr = new FileReader(flectura);
    BufferedReader br = new BufferedReader(fr);
    String s;
    while ((s = br.readLine()) != null) {
     System.out.println(s);
    }
   } catch (IOException ex) {
    Logger.getLogger(T6Pag162TrabajarFlujosCaracteresConLecturaEscritura2.class.getName()).log(Level.SEVERE, null, ex);
   }
   if (fr != null) {
    try {
     fr.close();
    } catch (IOException ex) {
     Logger.getLogger(T6Pag162TrabajarFlujosCaracteresConLecturaEscritura2.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
  }
 }
}
