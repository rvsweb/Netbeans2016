package librojavarama.T6LecturaEscrituraInformacion.ClaseFile;

import java.io.File;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6Pag161ClaseFileTrabajarDirectorios {

 public static void main(String[] args) {

  LecturaDeDirectorioMostrarContenido.directorio("c:\\x\\");
 }
}

class LecturaDeDirectorioMostrarContenido {

 public static void directorio(String ruta_absoluta) {
  File dir = new File(ruta_absoluta);
  if (dir.exists()) {
   System.out.println("Existe el directorio : " + dir.getName());
  } else {
   System.out.println("No Existe el directorio : ");
  }
  if (dir.canRead()) {
   System.out.println("El directorio existe y tiene permiso de Lectura");
  }
  if (dir.canWrite()) {
   System.out.println("El directorio existe y tiene permiso de Escritura");
  }

  File[] ficheros = dir.listFiles();
  for (File fichero : ficheros) {
   System.out.println(fichero.getName());
  }
 }
}
