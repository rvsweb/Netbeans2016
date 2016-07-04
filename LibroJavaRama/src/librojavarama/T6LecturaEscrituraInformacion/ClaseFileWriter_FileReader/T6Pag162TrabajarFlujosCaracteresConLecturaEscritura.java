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
public class T6Pag162TrabajarFlujosCaracteresConLecturaEscritura {

 public static void main(String[] args) {
  LecturaEscrituraFujoCaracteres.ejecutar_metodo_Lectura_Escritura();
 }
}

class LecturaEscrituraFujoCaracteres {

 public static void leer_grabar(String valor, String ruta_del_fichero) {
  String cadena[] = null;
  File f = new File(ruta_del_fichero);
  try {
   FileWriter fw = new FileWriter(f);
   for (String i : cadena) {
    fw.write(i, 0, i.length());
    fw.write("\r\n");
   }
   if (fw != null) {
    fw.close();
   }
  } catch (IOException ex) {
   Logger.getLogger(LecturaEscrituraFujoCaracteres.class.getName()).log(Level.SEVERE, null, ex);
  }
  if (f.exists()) {
   try {
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    String s = null;
    while ((s = br.readLine()) != null) {
     System.out.println(s + " ");
    }
    System.out.println("");
    if (fr != null) {
     fr.close();
    }
   } catch (IOException e) {
    System.out.println(e.getMessage());
   }
  }

 }

 public static void ejecutar_metodo_Lectura_Escritura() {

  String amigos[] = {"P1", "P2", "P3", "P4", "P5", "P6", "P7", "P8", "P9"};
  File fs = new File("c:\\x\\amigos.txt");
  fs.mkdir();
  try {
   FileWriter fw = new FileWriter(fs);
   for (String i : amigos) {
    fw.write(i, 0, i.length());
    fw.write("\r\n");
   }
   if (fw != null) {
    fw.close();
   }
  } catch (IOException ex) {
   Logger.getLogger(LecturaEscrituraFujoCaracteres.class.getName()).log(Level.SEVERE, null, ex);
  }
  File fe = new File("c:\\x\\amigos.txt");
  FileReader fr = null;
  if (fe.exists()) {
   try {
    fr = new FileReader(fe);
    BufferedReader br = new BufferedReader(fr);
    String s = null;
    while ((s = br.readLine()) != null) {
     System.out.print(s + "  ");
    }
    System.out.println("");
    if (fr != null) {
     fr.close();
    }
   } catch (FileNotFoundException ex) {
    Logger.getLogger(LecturaEscrituraFujoCaracteres.class.getName()).log(Level.SEVERE, null, ex);
   } catch (IOException ex) {
    Logger.getLogger(LecturaEscrituraFujoCaracteres.class.getName()).log(Level.SEVERE, null, ex);
   }
  } else {
   System.out.println("Archivo no existe ");
  }
 }
}
