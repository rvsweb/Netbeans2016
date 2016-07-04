package librojavarama.T6LecturaEscrituraInformacion.ClaseFile;

import java.io.File;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6PagListarFicherosDirectoriosVerPermisos {

}

class TestFichero {

 public static void main(String[] args) {
  File dir = new File("c:\\x\\");
  if (dir.exists()) {
   System.out.println("Existe el directorio : " + dir.getName());
  } else {
   System.out.println("NO existe el directorio : " + dir.getName());
  }
  if (dir.canRead()) {
   System.out.println("El directorio existe y tiene permisos de lectura ");
  }
  if (dir.canWrite()) {
   System.out.println("El directorio puede escribirse ");
  }

  File[] ficheros = dir.listFiles();
  for (File i : ficheros) {
   System.out.println(i.getName());
  }

 }
}
