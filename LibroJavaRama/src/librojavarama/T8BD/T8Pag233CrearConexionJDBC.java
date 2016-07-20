/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librojavarama.T8BD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @see -> Libro
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class T8Pag233CrearConexionJDBC {

 public static void printSQLException(SQLException ex) {
  ex.printStackTrace(System.err);
  System.out.println("SQLState : " + ex.getSQLState());
  System.out.println("Code Error : " + ex.getErrorCode());
  System.out.println("Message : " + ex.getMessage());
  Throwable t = ex.getCause();
  while (t != null) {
   System.out.println("Cause : " + t);
   t = t.getCause();
  }
 }

 public static void createEQUIPO(Connection con, String BDNombre) {
  String createString = "create table " + BDNombre + ".EQUIPO "
          + "(TEAM_ID integer NOT NULL,"
          + "EQ_NOMBRE varchar(40) NOT NULL,"
          + "ESTADIO varchar(40) NOT NULL,"
          + "POBLACION varchar(20) NOT NULL,"
          + "PROVINCIAS varchar(20) NOT NULL,"
          + "COD_POSTAL char(5),"
          + "PRIMARY KEY(TEAM_ID))";
  Statement stmt = null;
  try {
   stmt = con.createStatement();
   stmt.executeUpdate(createString);
  } catch (SQLException ex) {
   Logger.getLogger(T8Pag233CrearConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
   printSQLException(ex);
  } finally {
   try {
    stmt.close();
   } catch (SQLException ex) {
    Logger.getLogger(T8Pag233CrearConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
   }
  }
 }

 public static void createJUGADORES(Connection con, String BDNombre) {
  String createString = "create table " + BDNombre + ".JUGADORES"
          + "(PLAYER_ID integer NOT NULL,"
          + "TEAM_ID integer NOT NULL,"
          + "NOMBRE varchar(40) NOT NULL,"
          + "DORSAL integer NOT NULL,"
          + "EDAD integer NOT NULL,"
          + "PRIMARY KEY (PLAYER_ID),"
          + "FOREIGN KEY (TEAM_ID) REFERENCES EQUIPO (TEAM_ID))";
  Statement stmt = null;
  try {
   stmt = con.createStatement();
   stmt.executeUpdate(createString);
  } catch (SQLException ex) {
   Logger.getLogger(T8Pag233CrearConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
   printSQLException(ex);
  } finally {
   try {
    stmt.close();
   } catch (Exception e) {
    System.out.println("- Mensaje : " + e.getMessage() + " - Localizacion : " + e.getLocalizedMessage());
   }
  }
 }

 public static void cargarEquipo(Connection con, String BDNombre) {
  Statement stmt = null;
  try {
   stmt = con.createStatement();
   stmt.executeUpdate("INSERT INTO " + BDNombre + ".EQUIPO VALUES (1,'ESTEPONA','MONTERROSO','ESTEPONA','MALAGA','29680')");
   stmt.executeUpdate("INSERT INTO " + BDNombre + ".EQUIPO VALUES (2,'ALCORCON','SANTO DOMINGO','ALCORCON','MADRID','28924')");
   stmt.executeUpdate("INSERT INTO " + BDNombre + ".EQUIPO VALUES (3,'PORCUNA','SAN CRISTOBAL','PORCUNA','JAEN','23790')");
  } catch (SQLException ex) {
   Logger.getLogger(T8Pag233CrearConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
   printSQLException(ex);
  } finally {
   try {
    stmt.close();
   } catch (Exception e) {
    System.out.println(e.getMessage() + " " + e.getLocalizedMessage());
   }
  }
 }

 public static void cargaJugadores(Connection con, String BDNombre) {
  Statement stmt = null;
  try {
   stmt = con.createStatement();
   stmt.executeUpdate("INSERT INTO " + BDNombre + ".JUGADORES VALUES (1,1,'JOSE ANTONIO',1,42)");
   stmt.executeUpdate("INSERT INTO " + BDNombre + ".JUGADORES VALUES (2,1,'IGNACIO',2,62)");
   stmt.executeUpdate("INSERT INTO " + BDNombre + ".JUGADORES VALUES (3,1,'DIEGO',3,20)");
   stmt.executeUpdate("INSERT INTO " + BDNombre + ".JUGADORES VALUES (4,2,'TURRION',1,37)");
   stmt.executeUpdate("INSERT INTO " + BDNombre + ".JUGADORES VALUES (5,2,'LUIS ABEL',2,37)");
   stmt.executeUpdate("INSERT INTO " + BDNombre + ".JUGADORES VALUES (6,2,'ISAAC',3,40)");
   stmt.executeUpdate("INSERT INTO " + BDNombre + ".JUGADORES VALUES (7,3,'JUAN FRANCISCO',1,33)");
   stmt.executeUpdate("INSERT INTO " + BDNombre + ".JUGADORES VALUES (8,3,'PARRA',2,37)");
   stmt.executeUpdate("INSERT INTO " + BDNombre + ".JUGADORES VALUES (9,3,'RAUL',3,19)");
  } catch (SQLException e) {
   printSQLException(e);
  } finally {
   try {
    stmt.close();
   } catch (Exception e) {
    System.out.println(e.getMessage() + " - " + e.getLocalizedMessage());
   }
  }
 }

 /**
  * Recuperar varias columnas que tienen el mismo nombre
  *
  * @param con
  * @param BDNombre
  */
 public static void verEQUIPO(Connection con, String BDNombre) {
// Interfaz para crear sentencias SQL 
  Statement stmt = null;
// Consulta
  String query = "select EQ_NOMBRE , ESTADIO , POBLACION , PROVINCIAS from " + BDNombre + ".EQUIPO";
  try {
//        Conexion 
   stmt = con.createStatement();
//   Cursor ResultSet para moverse por las filas de la bd
   ResultSet rs = stmt.executeQuery(query);
   while (rs.next()) {
// getString para recuperar datos varchar o char 
    String equipo = rs.getString("EQ_NOMBRE");
    System.out.println("Equipo : " + equipo);
    String estadio = rs.getString("ESTADIO");
    System.out.println("Equipo : " + estadio);
    String provincia = rs.getString("PROVINCIAS");
    System.out.println("Equipos : " + provincia);
    System.out.println("****************************");
   }
  } catch (SQLException e) {
   System.out.println(e.getMessage() + " - " + e.getLocalizedMessage());
  } finally {
   try {
    stmt.close();
   } catch (Exception e) {
    System.out.println("Error message : " + e.getMessage() + " Error localizacion mensaje : " + e.getLocalizedMessage());
   }
  }
 }

 /**
  * Otra forma de recuperar los datos de la base de datos
  *
  * @param con
  * @param BDNombre
  * @throws SQLException
  */
 public static void verEQUIPO2(Connection con, String BDNombre) throws SQLException {
  Statement stmt = null;
  String query = "select EQ_NOMBRE , ESTADIO , POBLACION , PROVINCIAS from " + BDNombre + ".EQUIPO";

  try {
   stmt = con.createStatement();
   ResultSet rs = stmt.executeQuery(query);
   while (rs.next()) {
    String equipo = rs.getString(1);
    System.out.println("Equipo : " + equipo);
    String estadio = rs.getString(2);
    System.out.println("Estadio : " + estadio);
    String poblacion = rs.getString(3);
    System.out.println("Poblacion : " + poblacion);
    String provincia = rs.getString(4);
    System.out.println("Provincias : " + provincia);
    System.out.println("---------------------------");
   }
  } catch (SQLException ee) {
   System.out.println("" + ee.getLocalizedMessage() + " " + ee.getMessage());
  } finally {
   stmt.close();
  }
 }

 public static void modificaEQUIPO(Connection con, String BDNombre) {

  Statement stmt = null;
  try {
   stmt = con.createStatement();
   stmt.executeUpdate("UPDATE " + BDNombre + ".EQUIPO SET ESTADIO = 'Marraque' WHERE TEAM_ID = 1 ");
  } catch (Exception e) {
   System.out.println(e.getLocalizedMessage() + " - " + e.getMessage());
  } finally {
   try {
    stmt.close();
   } catch (Exception e) {
    System.out.println(e.getLocalizedMessage() + " - " + e.getMessage());
   }
  }

 }

 /**
  * ! Crear ResultSet bidireccional y actualizar datos bd
  *
  * Metodo para modificar la edad de los jugadores , actualiza la edad y le suma
  * el valor introducido en el parametro entero cuantoMas
  *
  * @param con
  * @param BDNombre
  * @param cuantoMas
  */
 public static void modificaEdadJugadores(Connection con, String BDNombre, int cuantoMas) {
  Statement stmt = null;
  try {
   stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
   ResultSet rs = stmt.executeQuery("select * from " + BDNombre + ".JUGADORES");
   while (rs.next()) {
    int i = rs.getInt("EDAD");
    rs.updateInt("EDAD", i + cuantoMas);
    rs.updateRow();
   }
  } catch (SQLException ex) {
   printSQLException(ex);
  } catch (Exception e) {
   System.out.println(e.getMessage() + " -  " + e.getLocalizedMessage());
  }

 }

 /**
  *
  * @param con
  * @param BDNombre
  * @param player_id
  * @param team_id
  * @param nombre
  * @param dorsal
  * @param edad
  */
 public static void insertarJUGADOR(Connection con, String BDNombre, int player_id, int team_id, String nombre, int dorsal, int edad) {

  Statement stmt = null;
  try {
   stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
   ResultSet rs = stmt.executeQuery("select * from " + BDNombre + ".JUGADORES");
   rs.moveToInsertRow();
   rs.updateInt("PLAYER_ID", player_id);
   rs.updateInt("TEAM_ID", team_id);
   rs.updateString("NOMBRE", nombre);
   rs.updateInt("DORSAL", dorsal);
   rs.updateInt("EDAD", edad);
   rs.insertRow();
   rs.beforeFirst();
  } catch (Exception e) {
   System.out.println(e.getMessage() + " - " + e.getLocalizedMessage());
  } finally {
   try {
    stmt.close();
   } catch (Exception e) {
    System.out.println(e.getMessage() + " -  " + e.getLocalizedMessage());
   }
  }
 }

 public static void transaccion(Connection con, String BDNombre, int cuentaA, int cuentaB, int cantidad) {
  Statement stmt = null;
  String actualizaA = "update " + BDNombre + ".CUENTAS " + "set SALDO = SALDO - " + cantidad + " where NUMCUENTA = " + cuentaA;
  String actualizaB = "update " + BDNombre + ".CUENTAS " + "set SALDO = SALDO - " + cantidad + " where NUMCUENTA = " + cuentaB;

  try {
   con.setAutoCommit(false);
   stmt = con.createStatement();
   stmt.executeUpdate(actualizaA);
   stmt.executeUpdate(actualizaB);
  } catch (Exception e) {
   System.out.println(e);
   if (con != null) {
    System.out.println("Roll back de la Transaccion");
    try {
     con.rollback();
    } catch (SQLException sqle) {
     System.out.println(sqle.getMessage() + " - " + sqle.getLocalizedMessage() + " - " + sqle.getNextException());
    } finally {
     try {
      stmt.close();
      con.setAutoCommit(true);
     } catch (SQLException ex) {
      Logger.getLogger(T8Pag233CrearConexionJDBC.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
   }
  }
 }

 public static void getJugadores(Connection con, String BDNombre) {
  Statement stmt = null;
  String query = "select dimeCuantos() FROM DUAL";

  try {
   stmt = con.createStatement();
   ResultSet rs = stmt.executeQuery(query);
   while (rs.next()) {
    String cuantos = rs.getString(1);
    System.out.println("Existen " + cuantos + " jugadores en nuestra base de datos");
    System.out.println("***********************************************************");
   }
  } catch (SQLException sqle) {
   System.out.println("" + sqle.getLocalizedMessage() + " - " + sqle.getMessage());
  }
 }

 public static void getJugadoresProcedimientoAlmacenado(Connection con) {
  try {
   CallableStatement cs = con.prepareCall("{call cuantosJugadores (?)}");
   cs.registerOutParameter(1, Types.INTEGER);
   cs.execute();
   int cuantos = cs.getInt(1);
   System.out.println("Existen " + cuantos + " jugadores en nuestra base de datos");
  } catch (SQLException sqle) {
   printSQLException(sqle);
  }
 }

 public static void getOtrosTiposDeDatosParaProcedimientos(Connection con) throws SQLException {
  try {

   CallableStatement cs;
//  LLamada a un procedimiento sin parametros
   cs = con.prepareCall("{call miproc}");
   cs.execute();
//  LLamada a un procedimiento con un parametro OUT
   cs = con.prepareCall("{call miproc_out(?)}");
//  Hay que registrar el parametro OUT con su tipo
   cs.registerOutParameter(1, Types.VARCHAR);
//  Ejecutar el procedimiento y recuperar el parametro
   cs.execute();

   String dato = cs.getString(1);

//  LLamada a un procedimiento con un parametro IN
   cs = con.prepareCall("{call miproc_in(?)}");
//  Hay que actualizar el valor del parametro IN
   cs.setString(1, "HOLA");
//  Execute the Stored 
   cs.execute();

//  LLamada a un procedimiento con un parametro IN/OUT
   cs = con.prepareCall("{call miproc_inout(?)}");
//  Hay que registrar el parametro IN/OUT con su tipo
   cs.registerOutParameter(1, Types.VARCHAR);
//  Hay que actualizar el valor del parametro IN/OUT
   cs.setString(1, "HOLA");
//  Execute the stored procedure and retrieve the IN/OUT value
   cs.execute();
   dato = cs.getString(1); // OUT parameter
  } catch (SQLException e) {
   printSQLException(e);
  }
 }

 public static void main(String[] args) {

  Connection con = null;
  try {
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libro", "root", "1234");
//   Statement stmt = con.createStatement(); // -> Se utiliza para ejecutar cualquier consulta 
   System.out.println("Connection Succeed" + con.toString());
  } catch (SQLException sqle) {
   System.out.println(sqle.getMessage());
  } catch (Exception e) {
   System.out.println(e.getMessage());
  }
//  Crear base de datos : Correcto
//  createEQUIPO((Connection) connection, "equipo");
//  createEQUIPO((Connection) con, "libro");
//  createJUGADORES((Connection) connection, "jugadores");
//  createJUGADORES((Connection) con, "libro");
//  cargarEquipo(con, "libro");
//  cargaJugadores(con, "libro");
//  verEQUIPO(con, "libro");
/*
  try {
   verEQUIPO2(con, "libro");
  } catch (SQLException e) {
   printSQLException(e);
  }
   */
//  modificaEQUIPO(con, "libro");

//  modificaEdadJugadores(con, "libro", 3);
//  insertarJUGADOR(con, "libro", 10, 1, "PEPE ", 10, 22);
//  getJugadores(con, "libro");
  getJugadoresProcedimientoAlmacenado(con);
 }
}
