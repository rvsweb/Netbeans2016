package librojavarama.T6LecturaEscrituraInformacion.ClaseDataInputStreamDataOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
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
public class T6Pag166AlmacenarDatosUTF8enFichero {

 public static void main(String[] args) {

//  InsertarDatosUTF8.insertarUTF8();
  Ej_InsertarDatosUTF8.almacenarDatosUTF8();
 }
}

class InsertarDatosUTF8 {

 public static void insertarUTF8() {
  String datos[] = {"java.lang.Object", "java.io.OutputStream", "java.io.FilterOutputStream", "java.io.DataOutputStream"};
  String datos2[] = {"java.lang.Object", "java.io.InputStream", "java.io.FilterInputStream", "java.io.DataInputStream"};

  long simbolos[] = {1, 2, 3, 4};

  try {
   FileOutputStream fs = new FileOutputStream("c:\\x\\ClaseDataInput_OutputStream.txt");
   DataOutputStream dataOut = new DataOutputStream(fs);
   for (int i = 0; i < 4; i++) {
    dataOut.writeUTF(datos[i].concat("\n" + datos2[i]));
    dataOut.writeLong(simbolos[i]);
   }
   if (dataOut != null) {
    dataOut.close();
    fs.close();
   }
  } catch (FileNotFoundException ex) {
   Logger.getLogger(InsertarDatosUTF8.class.getName()).log(Level.SEVERE, null, ex);
  } catch (IOException ex) {
   Logger.getLogger(InsertarDatosUTF8.class.getName()).log(Level.SEVERE, null, ex);
  }

//  Lectura del fichero
  try {
   File f = null;
   FileInputStream fe = null;
   DataInputStream d = null;

   try {
    f = new File("c:\\x\\ClaseDataInput_OutputStream.txt");
    if (f.exists()) {
     fe = new FileInputStream(f);
     d = new DataInputStream(fe);

     String s = null;
     Long l;
     while (true) { // Lee datos hasta el final del contenido
      s = d.readUTF();
      System.out.println(s);
      l = d.readLong();
      System.out.println("byte del UTF-8 : " + l);
     }
    }
   } catch (EOFException eof) {
    System.out.println("END OF FILE : " + eof.getLocalizedMessage());
   } catch (FileNotFoundException fnf) {
    System.out.println("Fichero no encontrado " + fnf.getLocalizedMessage());
   } catch (IOException io) {
    System.out.println("Error In/Out " + io.getLocalizedMessage() + " mensaje " + io.getMessage());
   } catch (Throwable e) {
    System.out.println("Error de programa" + e.getLocalizedMessage());
    e.printStackTrace();
   } finally {
    if (d != null) {
     try {
      d.close();
      fe.close();
     } catch (IOException ex) {
      Logger.getLogger(InsertarDatosUTF8.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
   }
  } catch (Exception e) {
   System.out.println("Error Exception : General " + e.getLocalizedMessage());
  }
 }
}

class Ej_InsertarDatosUTF8 {

 public static void almacenarDatosUTF8() {
  long m = (long) (Math.random() * (600000000 - 699999999) + 699999999);

  String[] amigos = {"Pepe 1", "Pepe 2", "Pepe 3", "Pepe 4", "Pepe 5 ", "Pepe 6", "Pepe 7", "Pepe 8"};
  long[] telefonos = {
   (long) (Math.random() * (600000000 - 699999999) + 699999999),
   (long) (Math.random() * (600000000 - 699999999) + 699999999),
   (long) (Math.random() * (600000000 - 699999999) + 699999999),
   (long) (Math.random() * (600000000 - 699999999) + 699999999),
   (long) (Math.random() * (600000000 - 699999999) + 699999999),
   (long) (Math.random() * (600000000 - 699999999) + 699999999),
   (long) (Math.random() * (600000000 - 699999999) + 699999999),
   (long) (Math.random() * (600000000 - 699999999) + 699999999)
  };

  try {
   FileOutputStream fs = new FileOutputStream("c:\\x\\data.txt");
   DataOutputStream d = new DataOutputStream(fs);
   for (int i = 0; i < 8; i++) {
    d.writeUTF(amigos[i]);
    d.writeLong(telefonos[i]);
   }
   if (d != null) {
    d.close();
    fs.close();
   }
  } catch (Exception e) {
   e.printStackTrace();
  }

// lectura de fichero   
  File ff = null;
  FileInputStream fe = null;
  DataInputStream d = null;
  try {
   ff = new File("c:\\x\\data.txt");
   if (ff.exists()) {
    fe = new FileInputStream(ff);
    d = new DataInputStream(fe);
    String s;
    Long l;
    while (true) {
     s = d.readUTF();
     System.out.print(s + " -> ");
     l = d.readLong();
     System.out.println(l);
    }
   }
  } catch (EOFException eof) {
   System.out.println("- > " + eof);
  } catch (FileNotFoundException fnf) {
   Logger.getLogger(Ej_InsertarDatosUTF8.class.getName()).log(Level.SEVERE, null, fnf);
  } catch (Exception e) {
   Logger.getLogger(Ej_InsertarDatosUTF8.class.getName()).log(Level.SEVERE, null, e);
  } catch (Throwable t) {
   Logger.getLogger(Ej_InsertarDatosUTF8.class.getName()).log(Level.SEVERE, null, t);
  } finally {
   if (d != null) {
    try {
     d.close();
     fe.close();
    } catch (IOException ex) {
     Logger.getLogger(Ej_InsertarDatosUTF8.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
  }
 }
}
