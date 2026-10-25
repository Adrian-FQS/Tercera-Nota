**-----Apuntes propios de JAVA-----


**En Java siempre se inicia con:**

package prueba; // Se pone el nombre del paquete/carpeta donde está el archivo.


public class Prueba4 { // El nombre de la clase debe ser igual al nombre del archivo (Prueba4.java).


    public static void main(String[] args) {
        // Aquí va el código.
    }
}


* Siempre al final se tiene que poner ;


// Se usa para copiar texto y que la terminal no la lea, es decir, no la ejecute.

* Comentarios de varias líneas:

/*
texto
*/

* var = variable local (inferencia de tipos).
 

* System.out.println(): Imprime un mensaje en la consola y luego hace un salto de línea.


* System.out.print(): Imprime un mensaje en la consola sin hacer un salto de línea.



**Clases de String

String es una clase (no un tipo primitivo) que sirve para manejar texto. Se puede crear de dos formas:

String name = "Adrian";              // Forma común (literal)
var surname = new String("Felipe");  // Forma explícita con new

Tabla de métodos principales:

* Método              Qué hace                                                    Ejemplo
+                     Concatena (une) dos strings                                 name + surname → AdrianFelipe
.length()             Devuelve la cantidad de caracteres                          name.length() → 6
.charAt(i)            Devuelve el carácter en la posición i (empieza en 0)        name.charAt(1) → d
.substring(i)         Devuelve el texto desde la posición i hasta el final        name.substring(2) → rian
.substring(i, f)      Devuelve el texto entre la posición i y f (sin incluir f)   name.substring(1, 3) → dr
.toUpperCase()        Convierte todo a mayúsculas                                 ADRIAN
.toLowerCase()        Convierte todo a minúsculas                                 adrian
.contains(texto)      Devuelve true/false si contiene ese texto                   "Hola java".contains("ava") → true
.equals(texto)        Compara si el contenido es exactamente igual (sensible)     name.equals("Adrian") → true
.equalsIgnoreCase(t)  Compara igual que .equals() pero ignora mayúsculas/minús.   name.equalsIgnoreCase("adrian") → true
.trim()               Elimina espacios en blanco al inicio y al final             " Hola ".trim() → "Hola"
.replace(a, b)        Reemplaza todas las apariciones de a por b                  .replace(" ", "_") → Hola_me_llamo_Adrian
String.format()       Construye un texto insertando variables con formato         String.format("Hola %s, tengo %d años.", name, age)
 


* Especificadores de String.format() / print:

Código    Tipo de dato
%s        String (texto)
%d        Entero (int)
%f        Decimal (float/double)



**SCANNER (es una clase de la librería java.util.Scanner que sirve para leer y analizar datos de entrada como los que escribe un usuario mediante el teclado)**

* (import java.util.Scanner;): Le dice a Java que vas a usar la clase Scanner, la cual sirve para leer datos ingresados por el usuario desde la consola (como texto o números) o desde un archivo.


* Scanner scanner = new Scanner(System.in);: Crea otro escáner.


* (Scanner sc = new Scanner(System.in);): Crea un objeto de lectura llamado sc y lo conecta a la consola para recibir lo que el usuario escribe mediante el teclado. (Antes de copiar código hay que poner esto en los escáneres, es obligatorio cada vez que quieras leer algo que el usuario escribe por teclado en la consola).


* sc.nextDouble(): Toma la variable sc (tu lector de Scanner) y espera a que el usuario escriba un número decimal por teclado para leerlo y devolverlo como un valor de tipo double.


**Métodos Comunes del Objeto `Scanner`:**
  - **`nextInt()`:** Lee un número entero.
  - **`nextDouble()`:** Lee un número decimal.
  - **`nextLine()`:** Lee una línea completa de texto.
  - **`next()`:** Lee una palabra.

* leer.close(); (Cierra el escáner).



**Variables: Son espacios de memoria que pueden cambiar de valor durante la ejecución del programa.

Usa variables cuando el valor puede variar (como edad, puntaje, saldo).


* String: Es una clase especial que sirve para manejar texto (palabras, frases, símbolos).


* char → Un solo carácter (ejemplo: 'A'). Se declara con comillas simples ' '. Se pueden comparar directamente usando operadores como ==, <, >, etc., ya que son tipos primitivos.


* byte → Números enteros pequeños (-128 a 127). Útil para ahorrar memoria en arrays grandes o trabajar con datos binarios.


* short → Enteros más grandes (-32,768 a 32,767). Se usa cuando el rango es limitado y quieres ahorrar memoria.


* int → Enteros comunes (hasta 2 mil millones aprox.). El más usado para operaciones numéricas.


* long → Enteros muy grandes. Se usa para valores muy grandes. Se indica con una L al final.


* float → Números decimales de precisión simple. Se indica con una f al final (es decir, cuando no requiera tanta precisión y represente valores aproximados).


* double → Números decimales de precisión doble. El más usado para cálculos con decimales (es decir, requiere alta precisión en números, cálculos científicos u operaciones financieras).


* boolean → Valores lógicos (true o false). Ideal para condiciones lógicas --- [EN MINÚSCULAS].



**Constantes: Son espacios de memoria que NO pueden cambiar de valor una vez inicializados.**

Usa constantes cuando el valor debe permanecer fijo (como PI = 3.1416, nombre de la empresa, número máximo de intentos, días de la semana).


** final String significa que la variable no puede cambiar su valor después de ser inicializada.


* Nombres en Mayúsculas: Por convención, los nombres de las constantes se escriben en mayúsculas, con palabras separadas por guiones bajos.



**Operadores Aritméticos**

* Suma (`+`):
Descripción: Suma dos operandos.


* Resta (`-`):
Descripción: Resta el segundo operando del primero.


* Multiplicación (`*`):
Descripción: Multiplica dos operandos.


* División (`/`):
Descripción: Divide el primer operando por el segundo.
Nota: En Java, la división entre enteros devuelve un entero. Si necesitas un resultado decimal, uno de los operandos debe ser un número de punto flotante, como float (precisión simple) o double (doble precisión).


* Módulo (`%`):
Descripción: Devuelve el resto de la división entre dos operandos.



**Operadores de Asignación

* Suma y Asignación (`+=`):
Descripción: Suma el valor del operando derecho al operando izquierdo y asigna el resultado al operando izquierdo.


* Resta y Asignación (`-=`):
Descripción: Resta el valor del operando derecho al operando izquierdo y asigna el resultado al operando izquierdo.
 

* Multiplicación y Asignación (`*=`):
Descripción: Multiplica el valor del operando izquierdo por el operando derecho y asigna el resultado al operando izquierdo.


* División y Asignación (`/=`):
Descripción: Divide el valor del operando izquierdo por el operando derecho y asigna el resultado al operando izquierdo.


* Módulo y Asignación (`%=`):
Descripción: Calcula el módulo del operando izquierdo con el operando derecho y asigna el resultado al operando izquierdo.



* Operadores de Comparación

==    Igual a             Compara si dos valores son iguales      5 == 5     true
!=    Diferente de        Compara si dos valores son distintos    5 != 3     true
>     Mayor que           Evalúa si el valor izquierdo es mayor   10 > 20    false
<     Menor que           Evalúa si el valor izquierdo es menor   7 < 12     true
>=    Mayor o igual que   Evalúa si es mayor o si es igual        8 >= 8     true
<=    Menor o igual que   Evalúa si es menor o si es igual        4 <= 2     false


* Operadores Lógicos

&&    AND    Conjunción    Devuelve true solo si AMBAS condiciones son verdaderas.
||    OR     Disyunción    Devuelve true si AL MENOS UNA condición es verdadera.
!     NOT    Negación      Invierte el valor: si es true lo vuelve false, y viceversa.


** Operadores Unarios





**Estructuras de Control Condicional

- if evalúa una condición. Si la condición es verdadera, ejecuta un bloque de código; si es falsa, el bloque de código se omite.


* La sentencia if-else permite elegir entre dos bloques de código: uno se ejecuta si la condición es verdadera y el otro si es falsa.


* Sentencia `if-else if-else`: Permite verificar múltiples condiciones en secuencia. El primer bloque de código cuya condición es verdadera se ejecuta.


* El switch evalúa una expresión y ejecuta el bloque de código correspondiente al valor de la expresión. Al final toca poner (break) en cada caso, de lo contrario seguirá ejecutándose, y al final se pone (default) para terminar y cerrar el código.

* ¿Cómo funciona la elección de opciones?
Cuando tienes múltiples opciones, Java las evalúa en orden de arriba hacia abajo:

Revisa el if. Si la condición es verdadera, ejecuta ese código y descarta todas las demás opciones.

Si fue falsa, pasa al primer else if. Si se cumple, lo ejecuta y termina.

Si sigue siendo falsa, pasa al siguiente else if, y así sucesivamente.

Si ninguna opción previa se cumplió, entra al else (la opción de respaldo).


Entonces: Usa switch cuando comparas UNA sola variable contra varios valores exactos y fijos. Usa if / else if / else cuando evalúas condiciones, rangos, o combinas varias variables.



**Estructuras de Control Iterativas (también conocidas como bucles o ciclos)

* Ciclo `while`: Repite un bloque de código mientras la condición especificada sea verdadera. Se utiliza cuando no sabes cuántas veces se va a repetir el bucle, ya que depende de una condición que puede cambiar en cualquier momento (por