/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T6LecturaEscrituraInformacion.ClaseFileWriter_FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * @see @since @version @author Raul Vela Salas
 */
public class T6Pag190EjOrdenarStringNumero {

 public static void main(String[] args) throws IOException {

  Cuenta metodo = new Cuenta();
  String fichero = "c:\\x\\num1.txt";
  metodo.ordenar(fichero);

 }
}

class Cuenta {

 public void ordenar(String fichero) throws FileNotFoundException, IOException {
  File fe = new File(fichero);
  /*Objeto almacena valor de file*/
  FileReader fr = new FileReader(fe);
  /*Objeto almacena valor FileReader*/
  BufferedReader br = new BufferedReader(fr);

  String numeros = new String();
  String s;
  while ((s = br.readLine()) != null) {
   numeros += s + " ";
  }
  System.out.println(numeros);

  if (fr != null) {
   fr.close();
  }
//Dividir String en SubString o Token separador entre ellos mediante un limitador
  StringTokenizer str;
  boolean ordenado = false;
  while (!ordenado) {
   ordenado = true;
   String anterior, posterior = "";
   str = new StringTokenizer(numeros);
   anterior = str.nextToken();
   numeros = "";
   while (str.hasMoreTokens()) {
    posterior = str.nextToken();
    if (Integer.parseInt(anterior) > Integer.parseInt(posterior)) {
     String aux = anterior;
     anterior = posterior;
     posterior = aux;
     ordenado = false;
    }
    numeros += anterior + " ";
    anterior = posterior;
   }
   numeros += posterior;
   System.out.println(numeros);
  }

  File fs = new File(fichero);
  FileWriter fw = new FileWriter(fs);

  str = new StringTokenizer(numeros);
  while (str.hasMoreTokens()) {
   fw.write(str.nextToken());
   fw.write("\r\n");
  }
  if (fw != null) {
   fw.close();
  }

 }
}
