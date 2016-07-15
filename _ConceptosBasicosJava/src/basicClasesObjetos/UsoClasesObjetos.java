/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicClasesObjetos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class UsoClasesObjetos {

// ATRIBUTOS PRIMITIVOS de INSTANCIA ( muchas copia ) 
 private byte b_num; // Iniciado y declarado : Almacena valor 
 private double d_num1 = 10.1; // iniciado y declarado
 
 private boolean is_true = true;
// Constantes de instancia
 private final double fd_num = 20.2;
 private final double fd_num1 = 20.2d;
 private final boolean is_false = true;

// ATRIBUTOS PRIMITIVOS de CLASE ( 1 copia ) 
 private static int i_num;
 private static float f_num = (float) 30.3;
 private static float f_num2 = 30.3f;
// Constantes de clase 
 private static final long l_num = (long) 10.1;
 private static final long l_num2 = 100L;
 private static final long l_num3 = 100l;

// ATRIBUTOS OBJETOS de INSTANCIA ( muchas copias )
 private String objeto_cadena;
 private String objeto_cadena1 = null;
 private String objeto_cadena2 = "objeto";
 private String objeto_cadena3 = new String("Llamada constructor para declara objeto con valores predeterminados");
// Inicializacion y Declaracion : Objeto array para pasarlo constructor del String
 private byte[] b_array = {1, 2, 4, 5, 6, 7, 8, 9, 10};
 private String objeto_cadena_con_array = new String(b_array);
 private String objeto_cadena_Constructor_num = new String(new StringBuffer(11111));
 private String objeto_cadena_Constructor = new String(new StringBuffer("Estoy declarando Objeto dentro constructor"));

// Inicializacion,Declaracion: Objeto br invoca dentro Constructor,otro Constructor que tiene por parametro una CONSTASTE
 private BufferedReader br_objeto_sin_referencia = null;
 private BufferedReader br_objeto_con_referencia = new BufferedReader(new InputStreamReader(System.in));

// ATRIBUTOS CONSTANTE DE OBJETOS de INSTANCIA ( 1 sola copia )
 private final BufferedReader br_final_sin_referencia = null;
 private final BufferedReader br_final_con_referencia = new BufferedReader(new InputStreamReader(System.in));
 private final String objeto_cadena_constante_sin_datos = null;
 private final String objeto_cadena_constante_con_datos = "Instanciado objeto sin Constructor";
 private final String objeto_cadena_constante_con_referencia = new String("Instanciado_con_Constructor");

// ATRIBUTOS OBJETOS STATIC ( 1 sola copia ) 
 private static String objeto_cadena_static;
 private static String objeto_cadena_static1 = null;
 private static String objeto_cadena_static2 = "objeto cadena static";
 private static BufferedReader br_static = new BufferedReader(new InputStreamReader(System.in));

 // ATRIBUTOS STATIC CONSTANTE ( 1 sola copia ) 
 private static final String objeto_cadena_static_constante = null;
 private static final String objeto_cadena_static_constante1 = "Objeto Cadena Static Constante";
 private static final BufferedReader br_static_final_sin_referencia = null;
 private static final BufferedReader br_static_final_con_referencia = new BufferedReader(new InputStreamReader(System.in));

}
