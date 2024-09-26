package explicaciones;

public class Detalle {

    public static void expByte(){
        System.out.println("\n");
        System.out.println("        *****************************************************");
        System.out.println("        *                  EXPLICACION BYTE                 *");
        System.out.println("        *****************************************************");
        System.out.println("        *   Se utiliza para datos pequeños y optimizacion   *");
        System.out.println("        *   de memoria en arrays grandes.                   *");
        System.out.println("        *                                                   *");
        System.out.println("        *       Tamaño = 1 byte                             *");
        System.out.println("        *       Rango = -128 a 127                          *");
        System.out.println("        *                                                   *");
        System.out.println("        *                      EJEMPLO                      *");
        System.out.println("        *                                                   *");
        System.out.println("        *   'byte edad = 25;'                               *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void ejemplo(){
    }

    public static void expShort(){
        System.out.println("\n");
        System.out.println("        *****************************************************");
        System.out.println("        *                 EXPLICACION SHORT                 *");
        System.out.println("        *****************************************************");
        System.out.println("        *   Util para datos numericos mas grandes que un    *");
        System.out.println("        *   'byte' pero aun pequeños.                       *");
        System.out.println("        *                                                   *");
        System.out.println("        *       Tamaño = 2 bytes                            *");
        System.out.println("        *       Rango = -32.768 a 32.767                    *");
        System.out.println("        *                                                   *");
        System.out.println("        *                      EJEMPLO                      *");
        System.out.println("        *                                                   *");
        System.out.println("        *   'short año = 2025;'                             *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void expInt(){
        System.out.println("\n");
        System.out.println("        *****************************************************");
        System.out.println("        *                  EXPLICACION INT                  *");
        System.out.println("        *****************************************************");
        System.out.println("        *                                                   *");
        System.out.println("        *   El tipo de dato entero mas comunmente usado.    *");
        System.out.println("        *                                                   *");
        System.out.println("        *       Tamaño = 4 bytes                            *");
        System.out.println("        *       Rango = -2^31 a 2^31-1                      *");
        System.out.println("        *                                                   *");
        System.out.println("        *                      EJEMPLO                      *");
        System.out.println("        *                                                   *");
        System.out.println("        *   'int salario = 1000000;'                        *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void expLong(){
        System.out.println("\n");
        System.out.println("        *****************************************************");
        System.out.println("        *                  EXPLICACION LONG                 *");
        System.out.println("        *****************************************************");
        System.out.println("        *                                                   *");
        System.out.println("        *   Se utiliza para valores enteros muy grandes.    *");
        System.out.println("        *                                                   *");
        System.out.println("        *       Tamaño = 8 bytes                            *");
        System.out.println("        *       Rango = -2^63 a 2^63-1                      *");
        System.out.println("        *                                                   *");
        System.out.println("        *                      EJEMPLO                      *");
        System.out.println("        *                                                   *");
        System.out.println("        *   'long distancia = 150000000000L;'               *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void expFloat(){
        System.out.println("\n");
        System.out.println("        *****************************************************");
        System.out.println("        *                 EXPLICACION FLOAT                 *");
        System.out.println("        *****************************************************");
        System.out.println("        *                                                   *");
        System.out.println("        *   Numeros en coma flotante de precision simple.   *");
        System.out.println("        *                                                   *");
        System.out.println("        *       Tamaño = 4 bytes                            *");
        System.out.println("        *       Rango = ±1.43-45 a ±3.4028235E38            *");
        System.out.println("        *                                                   *");
        System.out.println("        *                      EJEMPLO                      *");
        System.out.println("        *                                                   *");
        System.out.println("        *   'float precio = 19.99f;'                        *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void expChar(){
        System.out.println("\n");
        System.out.println("        *****************************************************");
        System.out.println("        *                  EXPLICACION CHAR                 *");
        System.out.println("        *****************************************************");
        System.out.println("        *                                                   *");
        System.out.println("        *   Almacena un solo caracter Unicode.         .    *");
        System.out.println("        *                                                   *");
        System.out.println("        *       Tamaño = 2 bytes                            *");
        System.out.println("        *       Rango = 0 a 65,535 (caracteres Unicode)     *");
        System.out.println("        *                                                   *");
        System.out.println("        *                      EJEMPLO                      *");
        System.out.println("        *                                                   *");
        System.out.println("        *   'char inicial = 'A';'                           *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void expBoo(){
        System.out.println("\n");
        System.out.println("        *****************************************************");
        System.out.println("        *               EXPLICACION BOOLEAN                 *");
        System.out.println("        *****************************************************");
        System.out.println("        *                                                   *");
        System.out.println("        *   Almacena valores de verdad.                     *");
        System.out.println("        *                                                   *");
        System.out.println("        *       Tamaño = 1 byte (dependiendo de la JVM)     *");
        System.out.println("        *       Rango = 'true' o 'false'                    *");
        System.out.println("        *                                                   *");
        System.out.println("        *                      EJEMPLO                      *");
        System.out.println("        *                                                   *");
        System.out.println("        *   'boolean esMayorDeEdad = true;'                 *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void expDoub(){
        System.out.println("\n");
        System.out.println("        *****************************************************");
        System.out.println("        *                EXPLICACION DOUBLE                 *");
        System.out.println("        *****************************************************");
        System.out.println("        *                                                   *");
        System.out.println("        *   Numeros en coma flotante de doble precision.    *");
        System.out.println("        *                                                   *");
        System.out.println("        *       Tamaño = 8 bytes                            *");
        System.out.println("        *       Rango = ±4.9E-324 a                         *");
        System.out.println("        *               ±1.7976931348623157E308             *");
        System.out.println("        *                                                   *");
        System.out.println("        *                      EJEMPLO                      *");
        System.out.println("        *                                                   *");
        System.out.println("        *   'double pi = 3.141592653589793;'                *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void expString(){
        System.out.println("        *****************************************************");
        System.out.println("        *                EXPLICACION STRING                 *");
        System.out.println("        *****************************************************");
        System.out.println("        *                                                   *");
        System.out.println("        *   En Java, los String son un objeto el cual       *");
        System.out.println("        *   nos permite almacenarmuchos caracteres.         *");
        System.out.println("        *                                                   *");
        System.out.println("        *                      EJEMPLO                      *");
        System.out.println("        *                                                   *");
        System.out.println("        *         String nombre = 'Juan';                   *");
        System.out.println("        *         String mensaje = 'Hola' + nombre;         *");
        System.out.println("        *                                                   *");
        System.out.println("        *           El resultado del mensaje sera:          *");
        System.out.println("        *                                                   *");
        System.out.println("        *                     Hola Juan                     *");
        System.out.println("        *                                                   *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void expConst(){
        System.out.println("        *****************************************************");
        System.out.println("        *               EXPLICACION CONSTANTES              *");
        System.out.println("        *****************************************************");
        System.out.println("        *                                                   *");
        System.out.println("        *   En Java, una constante es un valor que no       *");
        System.out.println("        *   cambia durante laejecución del programa.        *");
        System.out.println("        *                                                   *");
        System.out.println("        *   Las constantes se utilizan para representar     *");
        System.out.println("        *   valores fijos y de lectura única, lo que ayuda  *");
        System.out.println("        *   a que el código sea más legible                 *");
        System.out.println("        *   menos propenso a errores. Las constantes        *");
        System.out.println("        *   en Java se declaran usando la palabra           *");
        System.out.println("        *   clave final.                                    *");
        System.out.println("        *                                                   *");
        System.out.println("        *                      EJEMPLO                      *");
        System.out.println("        *                                                   *");
        System.out.println("        *    'public static final int TIEMPO_ESPERA = 30;'  *");
        System.out.println("        *                                                   *");
        System.out.println("        *    'public static final booblean VALOR = true;'   *");
        System.out.println("        *                                                   *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void expOpAri(){
        System.out.println("\n");
        System.out.println("        *****************************************************");
        System.out.println("        *               EXPLICACION ARITMETICOS              ");
        System.out.println("        *****************************************************");
        System.out.println("        *                                                   *");
        System.out.println("        *   Son operadores que realiza operaciones          *");
        System.out.println("        *   matemáticas básicas entre valores.              *");
        System.out.println("        *   Los operadores aritméticos principales son:     *");
        System.out.println("        *                                                   *");
        System.out.println("        *   Suma: (+)  Suma dos valores.                    *");
        System.out.println("        *                                                   *");
        System.out.println("        *           'int suma = 5 + 3;'                     *");
        System.out.println("        *                                                   *");
        System.out.println("        *   Resta: (-) Resta el segundo valor del primero.  *");
        System.out.println("        *                                                   *");
        System.out.println("        *            'int resta = 5 - 3;'                   *");
        System.out.println("        *                                                   *");
        System.out.println("        *   Multiplicación: (*) Multiplica dos valores.     *");
        System.out.println("        *                                                   *");
        System.out.println("        *         'int multiplicacion = 5 * 3;'             *");
        System.out.println("        *                                                   *");
        System.out.println("        *    Division: (/) Divide el primer valor entre     *");
        System.out.println("        *                        el segundo.                *");
        System.out.println("        *                                                   *");
        System.out.println("        *              'int division = 5 / 3;'              *");
        System.out.println("        *                                                   *");
        System.out.println("        *    Modulo: (%) Devuelve el residuo de la          *");
        System.out.println("        *           division entre dos valores.             *");
        System.out.println("        *                                                   *");
        System.out.println("        *              'int modulo = 5 % 3;'                *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void expOpRel(){
        System.out.println("\n");
        System.out.println("        *****************************************************");
        System.out.println("        *              EXPLICACION RELACIONALES             *");
        System.out.println("        *****************************************************");
        System.out.println("        *                                                   *");
        System.out.println("        *   Los operadores relacionales se utilizan para    *");
        System.out.println("        *   comparar dos valores y determinar la relacion   *");
        System.out.println("        *   entre ellos.                                    *");
        System.out.println("        *                                                   *");
        System.out.println("        *   Igual a: (==) Verifica si dos valores son       *");
        System.out.println("        *                    iguales.                       *");
        System.out.println("        *                                                   *");
        System.out.println("        *            'boolean esIgual = (5==3);'            *");
        System.out.println("        *                                                   *");
        System.out.println("        *   Diferente de: (!=) Verifica si dos valores      *");
        System.out.println("        *                 no son iguales.                   *");
        System.out.println("        *                                                   *");
        System.out.println("        *            'boolean noIgual = (5!=3);'            *");
        System.out.println("        *                                                   *");
        System.out.println("        *    Mayor que: (>) Verifica si el primer valor     *");
        System.out.println("        *              es mayor que el segundo.             *");
        System.out.println("        *                                                   *");
        System.out.println("        *             'boolean mayor = (5>3);'              *");
        System.out.println("        *                                                   *");
        System.out.println("        *    Menor que: (<) Verifica si el primer valor     *");
        System.out.println("        *              es menor que el segundo.             *");
        System.out.println("        *                                                   *");
        System.out.println("        *             'boolean menor = (5<3);'              *");
        System.out.println("        *                                                   *");
        System.out.println("        *    Mayor o igual que: (>=) Verifica si el primer  *");
        System.out.println("        *         valor es mayor o igual al segundo.        *");
        System.out.println("        *                                                   *");
        System.out.println("        *            'boolean MayorOIgual = (5>=3);'        *");
        System.out.println("        *                                                   *");
        System.out.println("        *    Menor o igual que: (<=) Verifica si el primer  *");
        System.out.println("        *         valor es menor o igual al segundo.        *");
        System.out.println("        *                                                   *");
        System.out.println("        *            'boolean MayorOIgual = (5<=3);'        *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void expOpLog(){
        System.out.println("\n");
        System.out.println("        *****************************************************");
        System.out.println("        *                EXPLICACION LOGICOS                *");
        System.out.println("        *****************************************************");
        System.out.println("        *                                                   *");
        System.out.println("        *   Los operadores logicos en Java son utilizados   *");
        System.out.println("        *   para combinar o invertir valores booleanos:     *");
        System.out.println("        *                                                   *");
        System.out.println("        *   AND: (&&) Devuelve true solo si ambos           *");
        System.out.println("        *         operandos son true:                       *");
        System.out.println("        *                                                   *");
        System.out.println("        *            booleanResult = (5>3 && 3<4);          *");
        System.out.println("        *                                                   *");
        System.out.println("        *    OR: Devuelve true si al menos uno de los       *");
        System.out.println("        *         operandos es true:                        *");
        System.out.println("        *                                                   *");
        System.out.println("        *            booleanResult = (5>3 || 3<4);          *");
        System.out.println("        *                                                   *");
        System.out.println("        *     NOT: Invierte el valor del operando.          *");
        System.out.println("        *         Devuelve true si el operando es false     *");
        System.out.println("        *                   y viceversa.                    *");
        System.out.println("        *                                                   *");
        System.out.println("        *              booleanResult =!(5>3);               *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void expOpAsig(){
        System.out.println("\n");
        System.out.println("        *****************************************************");
        System.out.println("        *               EXPLICACION ASIGNACION              *");
        System.out.println("        *****************************************************");
        System.out.println("        *                                                   *");
        System.out.println("        *   Los operadores de asignación en Java se         *");
        System.out.println("        *   utilizan para asignar valores a las             *");
        System.out.println("        *   variables                                       *");
        System.out.println("        *                                                   *");
        System.out.println("        *     '=': Este operador asigna el valor del        *");
        System.out.println("        *          operando derecho al operando izquierdo   *");
        System.out.println("        *                                                   *");
        System.out.println("        *                     int a = 5;                    *");
        System.out.println("        *                                                   *");
        System.out.println("        *     '+=' Este operador suma el operador derecho   *");
        System.out.println("        *          al operador izquierdo y asigna el        *");
        System.out.println("        *          resultado al operador izquierdo          *");
        System.out.println("        *                                                   *");
        System.out.println("        *                 int a = 5; a += 3;                *");
        System.out.println("        *                                                   *");
        System.out.println("        *     '-=' Este operador resta el operando derecho  *");
        System.out.println("        *          del operando izquierdo y asigna el       *");
        System.out.println("        *          resultado al operando izquierdo          *");
        System.out.println("        *                                                   *");
        System.out.println("        *                 int a = 5; a -= 3;                *");
        System.out.println("        *                                                   *");
        System.out.println("        *     '*=' Este operador multiplica el operando     *");
        System.out.println("        *          derecho por el operando izquierdo y      *");
        System.out.println("        *          asigna el resultado al operando          *");
        System.out.println("        *          izquierdo                                *");
        System.out.println("        *                                                   *");
        System.out.println("        *                 int a = 5; a *= 3;                *");
        System.out.println("        *                                                   *");
        System.out.println("        *     '/=' Este operador divide el operando         *");
        System.out.println("        *          izquierdo por el operando derecho y      *");
        System.out.println("        *          asigna el resultado al operando          *");
        System.out.println("        *          izquierdo                                *");
        System.out.println("        *                                                   *");
        System.out.println("        *                 int a = 6; a /= 3;                *");
        System.out.println("        *                                                   *");
        System.out.println("        *     '%=' Este operador calcula el modulo del      *");
        System.out.println("        *          operando izquierdo por el operando       *");
        System.out.println("        *          derecho y asigna el resultado al         *");
        System.out.println("        *          operando izquierdo                       *");
        System.out.println("        *                                                   *");
        System.out.println("        *                 int a = 5; a %= 3;                *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void expOpIncDec(){
        System.out.println("\n");
        System.out.println("        *****************************************************");
        System.out.println("        *         EXPLICACION INCREMENTO/DECREMENTO         *");
        System.out.println("        *****************************************************");
        System.out.println("        *                                                   *");
        System.out.println("        *   Los operadores de incremento y decremento       *");
        System.out.println("        *   en Java se utilizan para aumentar o disminuir   *");
        System.out.println("        *   el valor de una variable en una unidad.         *");
        System.out.println("        *                                                   *");
        System.out.println("        *     '++': Incrementa el valor del operando en 1   *");
        System.out.println("        *                                                   *");
        System.out.println("        *                 int a = 5; a++;                   *");
        System.out.println("        *                                                   *");
        System.out.println("        *     '--': Decrementa el valor del operando en 1   *");
        System.out.println("        *                                                   *");
        System.out.println("        *                 int a = 5; a--;                   *");
        System.out.println("        *                                                   *");
        System.out.println("        *****************************************************");
        System.out.println("\n Ingrese Enter para  volver al menu anterior");
    }
    public static void ejemplo(){
    }
    public static void ejemplo(){
    }
}
