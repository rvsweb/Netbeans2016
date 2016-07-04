package xpruebas.AlmacenarEnArrays;

/**
 * @see ->
 * @since 2016
 * @version 1
 * @author Raul Vela Salas
 */
public class BasicRecorrerArray {

 public static void main(String[] args) {

  int i = 0;
  int contador2 = 0;
  String a[] = new String[5];
  String aa[] = {"1", "2", "3", "4", "5"};

//  Asi si avanza el indice dentro del array
  a[++i] = "a";
  System.out.println("indice : " + i);
  a[++i] = "b";
  System.out.println("indice : " + i);
  System.out.println(a[1]);
  System.out.println(a[2]);

 }

}
