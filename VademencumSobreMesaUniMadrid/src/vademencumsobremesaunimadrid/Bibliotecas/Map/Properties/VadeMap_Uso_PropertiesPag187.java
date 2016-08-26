/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vademencumsobremesaunimadrid.Bibliotecas.Map.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/**
 * @see -
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class VadeMap_Uso_PropertiesPag187 {

}

/**
 * Es una variable de Map especializada en texto
 *
 * En los casos de Map<String,String>
 *
 * Tiene metodos para facilitar su uso , escribiendo y leyendo de ficheros de
 * texto
 *
 * @author remoto
 */
class Uso_Properties {

 /**
  * Grabar datos en fichero
  *
  * @param p
  * @param f
  * @throws IOException
  */
 static void guardar(Properties p, File f) throws IOException {
  Writer writer = new FileWriter(f);
  p.store(writer, "mis parejas");
 }

 static void guardarXML(Properties p, File f) throws FileNotFoundException, IOException {
  OutputStream out = new FileOutputStream(f);
  p.storeToXML(out, "mis parejas", "iso-8859-1");
 }

 public static void main(String[] args) throws IOException {

//  java.util.Properties
//  • Property() -> Constructor
//  • Property(Properties defaults) -> Construye un objeto 'Properties' utilizando 
//  otro como defecto , es decir , si el nuevo objeto no tiene la clave que se 
//  solicita , se busca en el 'objeto' default
//  ♦ Object setProperty(String clave,String valor) -> Asocia el valor a la clave
//  devuelve el antiguo valor asociado a la clave o NULL si la clave no existia antes
//  ♦ String getProperty(String clave) -> devuelve el valor asociado a la clave NULL
//  si no hay valor asociado
//  ♦ String getProperty(String clave , String X ) -> devuelve el valor asociado
//  a la clave devuelve X si no hay valor asociado
//  ♦ Set<String> stringPropertyNames() -> conjunto de claves que tienen asociado un valor
//  incluyendo posibles objetos Properties que se usan como respaldo ( ver segundo constructor )
//
//
//  Uso tipico 
  Properties properties = new Properties();
  properties.setProperty("titulo", "Aplicacion Grafica");
  properties.setProperty("ancho", "600");
  properties.setProperty("alto", "400");

  String titulo = properties.getProperty("titulo", "sin nombre");
  System.out.println("• Titulo : " + titulo);
  int ancho = Integer.parseInt(properties.getProperty("ancho", "400"));
  System.out.println("♦ ancho : " + ancho);
//
//  Ficheros 
//  Es facil escribir y leer de ficheros , lo que hace que Properties se utilice 
//  frecuentemente para tener ficheros externos de configuracion
//  
//  java.util.Properties
//  
  Properties p0 = new Properties();
  p0.setProperty("• prueba", "♦ Probando Properties");
  InputStream is = new FileInputStream("c:\\x\\texto2.txt");
  p0.load(is);
  OutputStream ops = new FileOutputStream("c:\\x\\texto2.txt");
  p0.store(ops, "prueba");
  ops.flush();
  ops.close();

  Properties p1 = new Properties();
  Reader r = new FileReader("c:\\x\\texto2.txt");
  p1.load(r);

  String ruta = "c:\\x\\texto2.txt";
  String ruta2 = "c:\\x\\texto4.txt";
  File f = new File(ruta);
  File f2 = new File(ruta2);

  System.out.println("---♦♦♦ Uso de metodos ♦♦♦---");
  guardar(p1, f);
  guardarXML(p1, f2);

 }
}
