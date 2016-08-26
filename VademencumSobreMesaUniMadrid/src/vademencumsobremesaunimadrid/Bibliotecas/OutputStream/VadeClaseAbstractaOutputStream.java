/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeClaseAbstractaOutputStream {

}

/**
 * Madre de un conjunto de clases para escribir ficheros 'byte' a 'byte'
 *
 *
 *
 * @author remoto
 */
class Uso_OutPutStream {

 /**
  *
  * @param fichero
  * @param bytes
  * @throws FileNotFoundException
  * @throws IOException
  */
 public void escribeBytes(String fichero, byte[] bytes) throws FileNotFoundException, IOException {
  OutputStream os = new FileOutputStream(fichero);
  os.write(bytes);
  os.close();
 }

 /**
  *
  * @param args
  * @throws FileNotFoundException
  * @throws IOException
  */
 public static void main(String[] args) throws FileNotFoundException, IOException {
//  Clases derivadas mas habitales : FileOutputStream
  String ruta = "c:\\x\\texto.txt";
  FileOutputStream fos = new FileOutputStream(ruta);

  FileOutputStream fos1 = new FileOutputStream(ruta, true);

  FileOutputStream fos2 = new FileOutputStream("c:\\x\\texto.txt");

  FileOutputStream fos3 = new FileOutputStream("c:\\x\\texto.txt", true);

  System.out.println("• Escribe en el fichero el array de bytes ");
  byte[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 12, 13, 14, 15, 16, 17, 18, 19};
  fos.write(b);

  System.out.println("• Escribe 'n' bytes en el fichero , concretamente los array 'b' "
          + "empezando en la posicion 'star' ");
  fos.write(b, 0, b.length);

  Uso_OutPutStream uops = new Uso_OutPutStream();
  uops.escribeBytes(ruta, b);

//  Clases derivadas mas habitales : OutputStream
  System.out.println("• Cierra fichero : Asegura que todo queda bien escrito en el fichero en disco ");
  fos.close();

 }
}
