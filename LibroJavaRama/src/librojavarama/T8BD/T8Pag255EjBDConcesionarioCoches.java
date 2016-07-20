/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T8BD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T8Pag255EjBDConcesionarioCoches {

 public static void main(String[] args) {
  Connection con = null;
  try {
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/concesionario", "root", "1234");
   Concesionario.cargaTablaCoches(con, "concesionario", "c:\\x\\coches.txt");

  } catch (Exception e) {
   System.out.println("Error " + e.getLocalizedMessage() + " - " + e.getMessage());
  }
 }

}

class Concesionario {

 /**
  * Sentencia create table
  *
  * @param con
  * @param BDNombre
  */
 public static void creaTablaCoches(Connection con, String BDNombre) {
  String createString = "create table " + BDNombre + ".COCHES "
          + "(MATRICULA char(8) NOT NULL,"
          + "MARCA varchar(40) NOT NULL,"
          + "MODELO varchar(40) NOT NULL,"
          + "COLOR varchar(20) NOT NULL,"
          + "ANIO integer NOT NULL, "
          + "PRECIO integer NOT NULL,"
          + "PRIMARY KEY (MATRICULA))";
  Statement stmt = null;
  try {
   stmt = con.createStatement();
   stmt.executeUpdate(createString);
  } catch (SQLException sqle) {
   System.out.println(sqle.getLocalizedMessage() + " - " + sqle.getMessage());
  } finally {
   try {
    stmt.close();
   } catch (Exception e) {
    System.out.println("Error al cerrar el bd " + e.getLocalizedMessage() + " - " + e.getMessage());
   }
  }
 }

 /**
  * sentencia : INSERT Los datos dentro del archivo deben de tener este formato
  * Entrada -> 1111111 opel a1 rojo 1990 2000
  */
 public static void cargaTablaCoches(Connection con, String BDNombre, String archivo) {
  Statement stmt = null;
  try {
   stmt = con.createStatement();
   File fentrada = new File(archivo);
   FileReader fr_lector = new FileReader(fentrada);
   BufferedReader br = new BufferedReader(fr_lector);
   String scontenido = null;
   while ((scontenido = br.readLine()) != null) {
    StringTokenizer st_SaltaEspacios;
    st_SaltaEspacios = new StringTokenizer(scontenido);
    String comando = "INSERT INTO " + BDNombre + ".COCHES VALUES ("
            + "'" + st_SaltaEspacios.nextToken() + "'," // MATRICULA
            + "'" + st_SaltaEspacios.nextToken() + "'," // MARCA
            + "'" + st_SaltaEspacios.nextToken() + "'," // MODELO
            + "'" + st_SaltaEspacios.nextToken() + "'," // COLOR
            + "" + st_SaltaEspacios.nextToken() + "," // ANIO
            + "" + st_SaltaEspacios.nextToken() + "" // PRECIO
            + ")";
    stmt.executeUpdate(comando);
   }
   if (fr_lector != null) {
    fr_lector.close();
   }

  } catch (FileNotFoundException ex) {
   Logger.getLogger(Concesionario.class.getName()).log(Level.SEVERE, null, ex);
  } catch (SQLException | IOException ex) {
   Logger.getLogger(Concesionario.class.getName()).log(Level.SEVERE, null, ex);
  } catch (Throwable t) {
   System.out.println("Error de programa : " + t.getLocalizedMessage() + " - " + t.getMessage());
   String ver_causa = t.getCause().toString();
  } finally {
   try {
    stmt.close();
   } catch (SQLException sqle) {
    System.out.println("Error en la bd : " + sqle.getLocalizedMessage() + " - " + sqle.getMessage());
   }
  }
 }
}
