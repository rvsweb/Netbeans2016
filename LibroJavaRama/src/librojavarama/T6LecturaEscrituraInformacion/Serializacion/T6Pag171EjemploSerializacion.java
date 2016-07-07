package librojavarama.T6LecturaEscrituraInformacion.Serializacion;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6Pag171EjemploSerializacion {

}

class Amigo implements java.io.Serializable {

 protected String nombre;
 protected long telefono;

 public Amigo() {
  nombre = null;
  telefono = 0;
 }

 public Amigo(String nombre, long telefono) {
  this.nombre = nombre;
  this.telefono = telefono;
 }

 public void print() {
  System.out.println(nombre + " -> " + telefono);
 }

}

class TestFichero3 {

 public static void main(String[] args) {
  String[] amigos = {"Pepe 1 ", "Pepe 2 ", "Pepe 3 ", "Pepe 4 "};
  long[] telefonos = {
   (long) (Math.random() * (600000000 - 699999999) + 699999999),
   (long) (Math.random() * (600000000 - 699999999) + 699999999),
   (long) (Math.random() * (600000000 - 699999999) + 699999999),
   (long) (Math.random() * (600000000 - 699999999) + 699999999),};

  try {
   FileOutputStream fs = new FileOutputStream("c:\\x\\serializacion.txt");
   ObjectOutputStream oos = new ObjectOutputStream(fs);
   for (int i = 0; i < 4; i++) {
    Amigo a = new Amigo(amigos[i], telefonos[i]);
    oos.writeObject(a); // Escribe salida del objeto
   }
   if (oos != null) {
    oos.close();
    fs.close();
   }
  } catch (IOException io) {
   System.out.println(io.getMessage());
  }

  try {
// lectura del fichero
   File f = null;
   FileInputStream fe = null;
   ObjectInputStream ois = null;

   try {
    f = new File("c:\\x\\serializacion.txt");
    if (f.exists()) {
     fe = new FileInputStream(f);
     ois = new ObjectInputStream(fe);
     while (true) {
      Amigo a = null;
      a = (Amigo) ois.readObject();
      a.print();
      System.out.println("");
     }
    }
   } catch (EOFException eof) {
    System.out.println("..................." + eof.getLocalizedMessage());
   } catch (FileNotFoundException ex) {
    System.out.println("" + ex.getLocalizedMessage());
   } catch (IOException ex) {
    System.out.println("" + ex.getLocalizedMessage());
   } catch (ClassNotFoundException t) {
    System.out.println("" + t.getLocalizedMessage());
   } finally {
    if (ois != null) {
     ois.close();
     fe.close();
    }
   }
  } catch (IOException io) {
   System.out.println("Excepcion general : " + io.getLocalizedMessage());
  }
 }
}
