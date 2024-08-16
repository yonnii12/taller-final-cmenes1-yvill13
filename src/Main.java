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
                                System.out.println("        *   'double pi = 3.141592653589793;'                               *");
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
                            case 4:
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *               EXPLICACION ASIGNACION              *");
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
                            case 5:
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *         EXPLICACION INCREMENTO/DECREMENTO         *");
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



                    break;
                case 6:



                    break;
                case 7:



                    break;
                case 8:



                    break;
                case 9:



                    break;
                case 10:



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

//    private static void mostrarDatosPrimitivos() {
//        System.out.println("1. Datos Primitivos:");
//        int numeroEntero = 42;
//        double numeroDecimal = 3.14;
//        char letra = 'J';
//        boolean esVerdadero = true;
//
//        System.out.println("Número Entero: " + numeroEntero);
//        System.out.println("Número Decimal: " + numeroDecimal);
//        System.out.println("Letra: " + letra);
//        System.out.println("Es Verdadero: " + esVerdadero);
//    }
//
//    private static void mostrarString() {
//        System.out.println("2. String:");
//        String saludo = "¡Hola, Mundo!";
//        System.out.println("Saludo: " + saludo);
//    }
//
//    private static void mostrarConstantes() {
//        System.out.println("3. Constantes:");
//        final int CONSTANTE_NUMERO = 100;
//        System.out.println("Constante Número: " + CONSTANTE_NUMERO);
//    }
//
//    private static void mostrarOperadores() {
//        System.out.println("4. Tipo de Operadores:");
//        int a = 10;
//        int b = 5;
//        System.out.println("Suma (a + b): " + (a + b));
//        System.out.println("Resta (a - b): " + (a - b));
//        System.out.println("Multiplicación (a * b): " + (a * b));
//        System.out.println("División (a / b): " + (a / b));
//        System.out.println("Módulo (a % b): " + (a % b));
//    }
//
//    private static void mostrarCondicionalIF() {
//        System.out.println("5. Condicional IF, ELSE IF, ELSE:");
//        int numero = 15;
//        if (numero > 10) {
//            System.out.println("Número es mayor que 10");
//        } else if (numero == 10) {
//            System.out.println("Número es igual a 10");
//        } else {
//            System.out.println("Número es menor que 10");
//        }
//    }
//
//    private static void mostrarCondicionalSwitch() {
//        System.out.println("6. Condicional Switch:");
//        int dia = 3; // Representa el miércoles
//        switch (dia) {
//            case 1:
//                System.out.println("Lunes");
//                break;
//            case 2:
//                System.out.println("Martes");
//                break;
//            case 3:
//                System.out.println("Miércoles");
//                break;
//            case 4:
//                System.out.println("Jueves");
//                break;
//            case 5:
//                System.out.println("Viernes");
//                break;
//            case 6:
//                System.out.println("Sábado");
//                break;
//            case 7:
//                System.out.println("Domingo");
//                break;
//            default:
//                System.out.println("Día no válido");
//                break;
//        }
//    }
//
//    private static void mostrarCondicionalTernario() {
//        System.out.println("7. Condicional Ternaria:");
//        int edad = 18;
//        String resultado = (edad >= 18) ? "Adulto" : "Menor de edad";
//        System.out.println("Edad: " + edad + " - " + resultado);
//    }
//
//    private static void mostrarBucleDoWhile() {
//        System.out.println("8. Bucle DO WHILE:");
//        int contador = 0;
//        do {
//            System.out.println("Contador DO WHILE: " + contador);
//            contador++;
//        } while (contador < 3);
//    }
//
//    private static void mostrarBucleWhile() {
//        System.out.println("9. Bucle WHILE:");
//        int contador = 0;
//        while (contador < 3) {
//            System.out.println("Contador WHILE: " + contador);
//            contador++;
//        }
//    }
//
//    private static void mostrarBucleFor() {
//        System.out.println("10. Bucle FOR:");
//        for (int i = 0; i < 3; i++) {
//            System.out.println("Iteración FOR: " + i);
//        }
//    }


}
