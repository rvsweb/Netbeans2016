/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendeaprogramar.UsoThis;

/**
 * @see ->
 * http://aprenderaprogramar.es/index.php?option=com_content&view=article&id=592:ejemplo-de-codigo-java-basico-clases-con-campos-constructor-y-metodos-la-palabra-clave-this-cu00652b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class APBasicUsoThisConstructor {

}

class Deposito {

// Atributos de Instancia
 private float diametro; // Campos de instancia 
 private float altura; // Campos de instancia 
 private String idDeposito; // Campos de instancia 

 /**
  * Constructor A
  *
  * Este constructor A llama al constructor B de ABAJO
  */
 public Deposito() {
  this(0, 0, "");
 }

 /**
  * Constructor B
  *
  * @param valor_diametro
  * @param altura
  * @param valor_idDeposito
  */
 public Deposito(float valor_diametro, float valor_altura, String valor_idDeposito) {
  if (valor_diametro > 0 && valor_altura > 0) {
   diametro = valor_diametro;
   altura = valor_altura;
   idDeposito = valor_idDeposito;
  } else {
   diametro = 10;
   altura = 5;
   idDeposito = "000";
   System.out.println("Creado deposito con valores por defecto diametro 10 metros altura 5 metros id 000");
  }
 }

 /**
  *
  * @param valor_idDeposito
  * @param valor_diametro
  * @param valor_altura
  */
 public void setValoresDeposito(String valor_idDeposito, float valor_diametro, float valor_altura) {
  idDeposito = valor_idDeposito;
  diametro = valor_diametro;
  altura = valor_altura;

  if (idDeposito != "" && valor_diametro > 0 && valor_altura > 0) {
  } else {
   System.out.println("Valores no admisibles , No se ha establecido valores para el deposito");
// Deposito(0.0f,0.0f,""); // Esto no es posible , un Constructor no es un metodo y por lo tanto no podemos llamarlo
   idDeposito = "";
   diametro = 0;
   altura = 0;
  }

  /**
   * Otra forma de comprobar
   *
   * if (!"".equals(idDeposito) && valor_diametro > 0 && valor_altura > 0) {
   * System.out.println("Valores no admisibles , No se ha establecido valores
   * para el deposito"); idDeposito = ""; diametro = 0; altura = 0; }
   */
 }

 /**
  * metodo de acceso
  *
  * @return
  */
 public float getDiametro() {
  return diametro;
 }

 /**
  *
  * @return
  */
 public float getAltura() {
  return altura;
 }

 /**
  *
  * @return
  */
 public String getIdDeposito() {
  return idDeposito;
 }

 /**
  *
  * @return
  */
 public float valorCapacidad() {
  float capacidad;
  float pi = 3.14169265F;
  capacidad = pi * (diametro / 2) * (diametro / 2) * altura;
  return capacidad;
 }

}

class GrupoDepositos {

// Atributos de 
 private Deposito deposito1;
 private Deposito deposito2;
 private Deposito deposito3;

 private String idGrupo;
 private int numeroDepositoGrupo;

 /**
  * Constructor para la clase
  *
  * En ella se crean objetos de otra clase
  *
  * @param numeroDepositoGrupo
  * @param valor_idGrupo
  */
 public GrupoDepositos(int numeroDepositoGrupo, String valor_idGrupo) {
  idGrupo = valor_idGrupo;
  switch (numeroDepositoGrupo) {
   case 1:
    System.out.println("Un grupo ha de tener mas de un deposito");
    break;
   case 2:
    deposito1 = new Deposito(); // Al crear el objeto automaticamente se llama al constructor del mismo , por defecto , sin parametro
//    Esto es ejemplo de sintaxis de creacion de un objeto , este caso dentro de otro;
    deposito2 = new Deposito();
    numeroDepositoGrupo = 2;
    break;
   case 3:
    deposito1 = new Deposito();
    deposito2 = new Deposito();
    deposito3 = new Deposito();
    numeroDepositoGrupo = 3;
    break;
   default:
    System.out.println("No se admiten mas de 3 depositos ");
    break;
  }
 }

 public int getNumeroDepositosGrupo() {
  return numeroDepositoGrupo;
 }

 public String getIdGrupo() {
  return idGrupo;
 }

 public float capacidadDelGrupo() {
//Este método usa objetos de otra clase e invoca métodos de otra clase
  if (numeroDepositoGrupo == 2) {
   return (deposito1.valorCapacidad() + deposito2.valorCapacidad());
  } else {
   return (deposito1.valorCapacidad() + deposito2.valorCapacidad() + deposito3.valorCapacidad());
  } // Si el grupo se ha creado con un numero de depositos distinto de 2 o 3 saltara un error en tiempo de ejecucion
 }
}

class TestDeposito {

 public static void main(String[] args) {
  Deposito d = new Deposito(10, 10, "depositos 1 ");
  Deposito d1 = new Deposito(20, 20, "depositos 2 ");
  Deposito d2 = new Deposito(30, 30, "depositos 3 ");

  d.setValoresDeposito("id Deposito general ", 5, 5);

  System.out.println("id Deposito 1 : " + d.getIdDeposito());
  System.out.println("id Deposito 2 : " + d1.getIdDeposito());
  System.out.println("id Deposito 3 : " + d2.getIdDeposito());

  GrupoDepositos gd = new GrupoDepositos(3, "Grupo KHP");
  System.out.println("obtener el nº de depositos : " + gd.getNumeroDepositosGrupo());
  System.out.println("obtener el nº de depositos : " + gd.capacidadDelGrupo());
  System.out.println("obtener el nº de depositos : " + gd.getIdGrupo());
 }
}
