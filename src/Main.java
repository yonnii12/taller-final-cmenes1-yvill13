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
            System.out.print("Ingrese el número de la opción que desea ver: ");
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
                        System.out.print("Ingrese el número de la opción que desea ver: ");
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
                                System.out.println("Ingrese Enter para  volver al menu anterior");
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
                                System.out.println("Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 3:                         /*NO ESTA LISTO*/
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *                  EXPLICACION INT                  *");
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
                                System.out.println("Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 4:                          /*NO ESTA LISTO*/
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *                  EXPLICACION LONG                 *");
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
                                System.out.println("Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 5:                          /*NO ESTA LISTO*/
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *                 EXPLICACION FLOAT                 *");
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
                                System.out.println("Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 6:                         /*NO ESTA LISTO*/
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *                EXPLICACION DOUBLE                 *");
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
                                System.out.println("Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 7:                          /*NO ESTA LISTO*/
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *                  EXPLICACION CHAR                 *");
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
                                System.out.println("Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 8:                          /*NO ESTA LISTO*/
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *               EXPLICACION BOOLEAN                 *");
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
                                System.out.println("Ingrese Enter para  volver al menu anterior");
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



                    break;
                case 3:



                    break;
                case 4:



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
