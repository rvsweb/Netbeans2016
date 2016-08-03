/*
 Abstract (palabra reservada)
Hay métodos abstractos y clases abstractas.
Los métodos abstractos deben estar en clases abstractas.
Las clases abstractas pueden tener métodos abstractos.

Métodos abstractos
Se dice que un Métodoes "abstract" cuando se proporciona su Signatura, resultado y posibles
excepciones; pero no su cuerpo. Es decir, cuando se indica cómo usarlo, pero no se proporciona
el código que lo materializa.
abstract String cifra(String texto, Clave clave);

Clases abstractas

Se dice que una clase es "abstract" cuando alguno de sus métodos es "abstract".
Las clases "abstract":
 no permiten generar objetos; es decir, no se puede hacer un "new"
 pueden tener métodos" abstract" y métodos normales
 pueden extenderse; si la nueva clase proporciona el cuerpo de todos los métodos, será
una clase normal, de lo contrario seguirá siendo "abstract"

Aunque conceptualmente sean cosas distintas, formal o sintácticamente podemos decir que una
"interface" es una clase "abstract" en la que:
 todos los métodos son "public abstract"; de hecho no hay ni que decirlo
 todos los campos son "public static final"; de hecho no hay ni que decirlo

Subclases abstractas
Cuando una clase abstracta se extiende, pero no se proporciona el cuerpo de algún metodo,
heredado o propio
 
*/
package xpruebas.Abstractas;

/**
 * @see - https://web.dit.upm.es/~pepe/libros/vademecum.pdf
 * @since 2016
 * @version 1
 * @author Radwulf Candle
 */
public abstract class ClaseAbstracta {

// abstract = RESUMEN
 abstract String cifra(String texto, Integer cifra);
}
