import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu;
        int opcionSubMenu;

        do {
            // Mostrar menú principal
            System.out.println("\n");
            System.out.println("        *****************************************************");
            System.out.println("        *       CAPITULO/GLOSARIO PROGRAMACION BASICA       *");
            System.out.println("        *                 YVILL13-CMENES1                   *");
            System.out.println("        *                   PRE-HACKATON                    *");
            System.out.println("        *****************************************************");
            System.out.println("        *       1.  Datos Primitivos.                       *");
            System.out.println("        *       2.  String.                                 *");
            System.out.println("        *       3.  Constantes.                             *");
            System.out.println("        *       4.  Tipo de Operadores.                     *");
            System.out.println("        *       5.  Condicional IF, ELSE IF Y ELSE.         *");
            System.out.println("        *       6.  Condicional Switch.                     *");
            System.out.println("        *       7.  Condicional Ternaria.                   *");
            System.out.println("        *       8.  Bucle DO WHILE.                         *");
            System.out.println("        *       9.  Bucle WHILE.                            *");
            System.out.println("        *       10. Bucle FOR.                              *");
            System.out.println("        *       0.  Salir.                                  *");
            System.out.println("        *****************************************************");
            System.out.print("\n Ingrese el número de la opción que desea ver: ");
            opcionMenu = scanner.nextInt();
            System.out.println();

            // Mostrar la explicación según la opción seleccionada
            switch (opcionMenu) {
                case 1:
                    do {
                        System.out.println("\n");
                        System.out.println("        *****************************************************");
                        System.out.println("        *                  DATOS PRIMITIVOS                 *");
                        System.out.println("        *****************************************************");
                        System.out.println("        *       1.  Explicacion byte.                       *");
                        System.out.println("        *       2.  Explicacion short.                      *");
                        System.out.println("        *       3.  Explicacion int.                        *");
                        System.out.println("        *       4.  Explicacion long.                       *");
                        System.out.println("        *       5.  Explicacion float.                      *");
                        System.out.println("        *       6.  Explicacion double.                     *");
                        System.out.println("        *       7.  Explicacion char.                       *");
                        System.out.println("        *       8.  Explicacion boolean.                    *");
                        System.out.println("        *       9.  Atras.                                  *");
                        System.out.println("        *****************************************************");
                        System.out.print("\n Ingrese el número de la opción que desea ver: ");
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu){

                            case 1:      /*Esta listo*/
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
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:      /*Esta listo*/
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
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 3:      /*Esta listo*/
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
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 4:      /*Esta listo*/
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
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 5:      /*Esta listo*/
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
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 6:      /*Esta listo*/
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
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 7:      /*Esta listo*/
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
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 8:      /*Esta listo*/
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
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 9:                          /*Esta listo*/
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opcion no valida, ingrese un valor de 1 a 9");
                                break;
                        }
                    } while (opcionSubMenu !=9);
                    break;
                case 2:
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
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 3:
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
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 4:
                    do {
                        System.out.println("\n");
                        System.out.println("        *****************************************************");
                        System.out.println("        *                 TIPO DE OPERADORES                *");
                        System.out.println("        *****************************************************");
                        System.out.println("        *                                                   *");
                        System.out.println("        *       1.  Aritmeticos.                            *");
                        System.out.println("        *       2.  Relacionales.                           *");
                        System.out.println("        *       3.  Logicos.                                *");
                        System.out.println("        *       4.  Asignacion.                             *");
                        System.out.println("        *       5.  Incremento/Decremento.                  *");
                        System.out.println("        *       6.  Atras.                                  *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *****************************************************");
                        System.out.print("\n Ingrese el número de la opción que desea ver: ");
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu){

                            case 1:
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
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:
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
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 3:
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
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 4:
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
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 5:
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
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 6:
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opcion no valida, ingrese un valor de 1 a 9");
                                break;
                        }
                    } while (opcionSubMenu !=6);
                    break;

                case 5:
                    do {
                        System.out.println("\n");
                        System.out.println("        *****************************************************");
                        System.out.println("        *                   CONDICIONALES                   *");
                        System.out.println("        *                 IF, ELSE IF y ELSE                *");
                        System.out.println("        *****************************************************");
                        System.out.println("        *                                                   *");
                        System.out.println("        *       1.  Explicacion IF.                         *");
                        System.out.println("        *       2.  Explicacion ELSE IF.                    *");
                        System.out.println("        *       3.  Explicacion ELSE.                       *");
                        System.out.println("        *       4.  Programa IF, ELSE IF, ELSE.             *");
                        System.out.println("        *       5.  Atras.                                  *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *****************************************************");
                        System.out.print("\n Ingrese el número de la opción que desea ver: ");
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu) {

                            case 1:
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *                   EXPLICACION IF                  *");
                                System.out.println("        *****************************************************");
                                System.out.println("        *                                                   *");
                                System.out.println("        *   En Java, una instrucción if se utiliza          *");
                                System.out.println("        *   para tomar decisiones en el flujo de            *");
                                System.out.println("        *   ejecución de un programa. Permite ejecutar un   *");
                                System.out.println("        *   bloque de código solo si se cumple una          *");
                                System.out.println("        *   condición específica.                           *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *           Su estructura es la siguiente:          *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *    int x = 10;                                    *");
                                System.out.println("        *    if (x > 5) {                                   *");
                                System.out.println("        *        System.out.println(\"x es mayor que 5\");  *");
                                System.out.println("        *             }                                     *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *****************************************************");
                                System.out.println("\n Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *                EXPLICACION ELSE IF                *");
                                System.out.println("        *****************************************************");
                                System.out.println("        *                                                   *");
                                System.out.println("        *   En Java, else if se utiliza para manejar        *");
                                System.out.println("        *   múltiples condiciones en una estructura de      *");
                                System.out.println("        *   control de flujo después de una instrucción     *");
                                System.out.println("        *   if inicial. Permite verificar varias            *");
                                System.out.println("        *   condiciones secuenciales y ejecutar el bloque   *");
                                System.out.println("        *   de código correspondiente a la primera          *");
                                System.out.println("        *   condición que sea verdadera.                    *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *           Su estructura es la siguiente:          *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *    int x = 10;                                    *");
                                System.out.println("        *    if (x > 15) {                                  *");
                                System.out.println("        *        System.out.println(\"x es mayor que 15\"); *");
                                System.out.println("        *    } else if (x > 5) {                            *");
                                System.out.println("        *        System.out.println(\"x es mayor que 5      *");
                                System.out.println("        *             pero menor o igual a 15\");           *");
                                System.out.println("        *    } else if (x > 0) {                            *");
                                System.out.println("        *        System.out.println(\"x es mayor que 0      *");
                                System.out.println("        *             pero menor o igual a 5\");            *");
                                System.out.println("        *    } else {                                       *");
                                System.out.println("        *        System.out.println(\"x es menor o          *");
                                System.out.println("        *             igual a 0\");                         *");
                                System.out.println("        *    }                                              *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *****************************************************");
                                System.out.println("\n Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 3:
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *                  EXPLICACION ELSE                 *");
                                System.out.println("        *****************************************************");
                                System.out.println("        *                                                   *");
                                System.out.println("        *   En Java, el else se utiliza en una estructura   *");
                                System.out.println("        *   de control de flujo if-else para proporcionar   *");
                                System.out.println("        *   una opción alternativa cuando la condición      *");
                                System.out.println("        *   del if no se cumple. Es una forma de manejar    *");
                                System.out.println("        *   el caso en que ninguna de las condiciones       *");
                                System.out.println("        *   previas es verdadera.                           *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *           Su estructura es la siguiente:          *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *    int x = 8;                                     *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *    if (x > 10) {                                  *");
                                System.out.println("        *       System.out.println(\"x es mayor que 10\");  *");
                                System.out.println("        *    } else {                                       *");
                                System.out.println("        *       System.out.println(\"x es 10 o menos\");    *");
                                System.out.println("        *    }                                              *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *****************************************************");
                                System.out.println("\n Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 4:      /*Esta listo*/
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *               EJEMPLO IF, ELSE IF y ELSE          *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *****************************************************");


                                // EXPLICACION DEL EJEMPLO IF, ELSE IF Y ELSE


                                break;


                        }
                    }while (opcionSubMenu !=5);
                    break;
                case 6:



                    break;
                case 7:



                    break;
                case 8:
                    do {
                        System.out.println("\n");
                        System.out.println("        *****************************************************");
                        System.out.println("        *                  BUCLE DO WHILE                   *");
                        System.out.println("        *****************************************************");
                        System.out.println("        *       1.  Explicacion DO WHILE.                   *");
                        System.out.println("        *       2.  Ejemplo DO WHILE8.                      *");
                        System.out.println("        *       3.  ATRAS                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *****************************************************");
                        System.out.print("\n Ingrese el número de la opción que desea ver: ");
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu) {

                            case 1:      /*Esta listo*/
                                System.out.println("\n");
                                System.out.println("        ************************************************************");
                                System.out.println("        *                  EXPLICACION DO WHILE                       *");
                                System.out.println("        ************************************************************");
                                System.out.println("        *   Los bucles do-while y while en Java te permiten        *");
                                System.out.println("        *   omo su nombre indica (while significa mientras),       *");
                                System.out.println("        *   epetir una acción en un bucle siempre y cuando         *");
                                System.out.println("        *   se cumpla una condición booleana de control            *");
                                System.out.println("        *   Es posible que el código contenido en un.              *");
                                System.out.println("        *   bucle while no se ejecute.  porque no se cumpla        *");
                                System.out.println("        *   la condición.No obstante, el código contenido          *");
                                System.out.println("        *   en un bucle do-while se ejecuta, por lo menos, una vez *");
                                System.out.println("        ************************************************************");
                                System.out.println("\n Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:      /*Esta listo*/
                                System.out.println("\n");
                                System.out.println("        *********************************************************");
                                System.out.println("        *                      EJEMPLO DO WHILE                 *");
                                System.out.println("        *       Digite un numero  para realizar la sumatoria    *");
                                System.out.println("        *             de los números enteros comprendidos       *");
                                System.out.println("        *                 entre el 1 y el 10                    *");
                                System.out.println("        *********************************************************");
                                int suma;
                                System.out.print("\nIngrese el número : ");
                                suma = scanner.nextInt();

                                for (int i = 0; i <= 10; i++) {
                                    suma += i;
                                }
                                ;
                                System.out.println("La sumatoria es: " + suma);

                                System.out.println("\n Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 3:      /*Esta listo*/
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opcion no valida, ingrese un valor de 1 a 3");
                                break;
                        }
                    } while (opcionSubMenu !=3);



                    break;
                case 9:
                    do {
                        System.out.println("\n");
                        System.out.println("        *****************************************************");
                        System.out.println("        *                  BUCLE WHILE                       *");
                        System.out.println("        *****************************************************");
                        System.out.println("        *       1.  Explicacion WHILE.                        *");
                        System.out.println("        *       2.  Ejemplo WHILE.                            *");
                        System.out.println("        *       3.  ATRAS                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *****************************************************");
                        System.out.print("\n Ingrese el número de la opción que desea ver: ");
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu) {

                            case 1:      /*Esta listo*/
                                System.out.println("\n");
                                System.out.println("        ************************************************************");
                                System.out.println("        *                  EXPLICACION WHILE                       *");
                                System.out.println("        ************************************************************");
                                System.out.println("        *   Los bucles do-while y while en Java te permiten        *");
                                System.out.println("        *   omo su nombre indica (while significa mientras),       *");
                                System.out.println("        *   epetir una acción en un bucle siempre y cuando         *");
                                System.out.println("        *   se cumpla una condición booleana de control            *");
                                System.out.println("        *   Es posible que el código contenido en un.              *");
                                System.out.println("        *            bucle while no se ejecute.                    *");
                                System.out.println("        *                      EJEMPLO                             *");
                                System.out.println("        *                                                          *");
                                System.out.println("        *        public static void main(String args[]) {          *");
                                System.out.println("        *             int i = 0;                                   *");
                                System.out.println("        *                           while(i < 10) {                *");
                                System.out.println("        *   System.out.println(\"WHILE\");  // Se ejecuta 10 veces *");
                                System.out.println("        *                           }}                             *");
                                System.out.println("       *************************************************************");
                                System.out.println("\n Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:      /*Esta listo*/
                                System.out.println("\n");
                                System.out.println("        *********************************************************");
                                System.out.println("        *                      EJEMPLO WHILE                    *");
                                System.out.println("        *       Digite un numero  para realizar la sumatoria    *");
                                System.out.println("        *             de los números enteros comprendidos       *");
                                System.out.println("        *                 entre el 1 y el 10                    *");
                                System.out.println("        *********************************************************");
                                int suma;
                                System.out.print("\nIngrese el un número : ");
                                suma = scanner.nextInt();

                                int numero = 0 ;
                                //System.out.print("\nIngrese el segundo número : ");
                                //numero = scanner.nextInt();

                                while (numero <= 10) {
                                    suma += numero;
                                    numero++;
                                }

                                System.out.println("La sumatoria es: " + suma);


                                System.out.println("\n Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 3:      /*Esta listo*/
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opcion no valida, ingrese un valor de 1 a 3");
                                break;
                        }
                    } while (opcionSubMenu !=3);



                    break;
                case 10:
                    do {
                        System.out.println("\n");
                        System.out.println("        *****************************************************");
                        System.out.println("        *                  BUCLE FOR                        *");
                        System.out.println("        *****************************************************");
                        System.out.println("        *       1.  Explicacion FOR.                        *");
                        System.out.println("        *       2.  Ejemplo FOR.                            *");
                        System.out.println("        *       3.  ATRAS                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *****************************************************");
                        System.out.print("\n Ingrese el número de la opción que desea ver: ");
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu) {

                            case 1:      /*Esta listo*/
                                System.out.println("\n");
                                System.out.println("        *******************************************************");
                                System.out.println("        *                  EXPLICACION FOR                    *");
                                System.out.println("        *******************************************************");
                                System.out.println("        *   se usa cuando queremos repetir un conjunto de     *");
                                System.out.println("        *   instrucciones un número finito de veces Con for,  *");
                                System.out.println("        *   las instrucciones se repiten el número de veces   *");
                                System.out.println("        *   que le decimos normalmente le ponemos un número   *");
                                System.out.println("        *   ( o el valor de una variable o una constante).    *");
                                System.out.println("        *                                                     *");
                                System.out.println("        *                      EJEMPLO                        *");
                                System.out.println("        *                                                     *");
                                System.out.println("        *        for (i = 0; i < TOTAL; i++)   {              *");
                                System.out.println("        *              instrucciones                          *");
                                System.out.println("        *                           }                         *");
                                System.out.println("       ********************************************************");
                                System.out.println("\n Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:      /*Esta listo*/
                                System.out.println("\n");
                                System.out.println("        *********************************************************");
                                System.out.println("        *                      EJEMPLO FOR                      *");
                                System.out.println("        *       Digite un numero  para realizar la sumatoria    *");
                                System.out.println("        *             de los números enteros comprendidos       *");
                                System.out.println("        *                 entre el 1 y el 10                    *");
                                System.out.println("        *********************************************************");
                                int suma;
                                System.out.print("\nIngrese el número : ");
                                suma = scanner.nextInt();

                                for (int i = 0; i <= 10000000; i++) {
                                    suma += i;
                                }
                                ;
                                System.out.println("La sumatoria es: " + suma);

                                System.out.println("\n Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 3:      /*Esta listo*/
                                System.out.println("Regresando al menú principal...");
                                break;
                            default:
                                System.out.println("Opcion no valida, ingrese un valor de 1 a 3");
                                break;
                        }
                        } while (opcionSubMenu !=3);

                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número entre 0 y 10.");
                    break;
            }
            System.out.println();
        } while (opcionMenu != 0);

        scanner.close();
    }
}