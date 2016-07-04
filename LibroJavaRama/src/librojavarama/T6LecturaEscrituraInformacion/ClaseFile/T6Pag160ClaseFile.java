package librojavarama.T6LecturaEscrituraInformacion.ClaseFile;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T6Pag160ClaseFile {

 public static void main(String[] args) {
  File f1 = new File("c:\\z\\datos.txt");
  File f2 = new File("c:\\z\\datos1.txt");
  File f3 = new File("c:\\z\\datos3.txt");
  File dir = new File("c:\\z\\datos2.txt");
  File f4 = new File(dir, "datos_encriptados");

  boolean existe = f1.exists();
  System.out.println("Existe : " + existe);
  boolean esDirectorio = f1.isDirectory();
  System.out.println("es Directorio : " + esDirectorio);
  boolean esFile = f1.isFile();
  System.out.println("es Archivo : " + esFile);
//  boolean borrar = f1.delete();
//  System.out.println("se puede borrar : " + borrar);
  boolean renameTo = f3.renameTo(f1);
  System.out.println("cambio el nombre ? : " + renameTo);
  boolean puedo_leer = f1.canRead();
  System.out.println("puedo leer : " + puedo_leer);
  String ruta_relativa = f1.getPath();
  System.out.println("ruta relativa : " + ruta_relativa);
  File obtener_ruta_absoluta = f1.getAbsoluteFile();
  String ruta_absoluta = obtener_ruta_absoluta.getName();
  System.out.println("saber ruta absoluta : " + ruta_absoluta);
  String directorio_padre = f1.getParent();
  System.out.println("saber directorio padre : " + directorio_padre);
  long longitud = f1.length();
  System.out.println("longitud total " + longitud);

  System.out.println("------------------------------");
  System.out.println("Son iguales estos objetos : " + f1.equals(f3));

  File f_directorio = new File("c:\\z\\directorioZ");
  Metodos_Para_Trabajar_Con_Directorios.crear_directorio(f_directorio);

  File lista_directorio = new File("c:\\z");
  Metodos_Para_Trabajar_Con_Directorios.lista_directorios(lista_directorio);

  System.out.println("----------------------------");
  System.out.println("ver kilobytes : " + lista_directorio.length() / 1024);

  File directorioEclipse = new File("c:\\x");
  long total_longitud = directorioEclipse.length();
  System.out.println("valor total : " + total_longitud);

 }
}

class Metodos_Para_Trabajar_Con_Directorios {

 public static void crear_directorio(File directorio) {
  boolean mkdir = directorio.mkdir();
  System.out.println("directorio creado ? : " + mkdir);
 }

 public static void lista_directorios(File lista) {
  int num = 0;
  String[] lista_array = lista.list();
  System.out.println("lista de directorios : " + lista.length());
  while (num <= lista_array.length) {
   System.out.println("-> " + lista_array);
   System.out.println("directorios: " + num++);
  }
  System.out.println("----------------------");
  for (String string : lista_array) {
   System.out.println("-> " + string);
  }
 }

}
