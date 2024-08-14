import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar menú principal
            System.out.println("        *****************************************************");
            System.out.println("        *       CAPITULO/GLOSARIO PROGRAMACION BASICA       *");
            System.out.println("        *                 YVILL13-CMENES1                   *");
            System.out.println("        *                   PRE-HACKATON                    *");
            System.out.println("        *****************************************************");
            System.out.println("        *       1.  Datos Primitivos.                       *");
            System.out.println("        *       2.  String.                                 *");
            System.out.println("        *       3.  Constantes.                             *");
            System.out.println("        *       4.  Tipo de Operadores.                     *");
            System.out.println("        *       5.  Condicional IF, ELSE IF ELSE.           *");
            System.out.println("        *       6.  Condicional Switch.                     *");
            System.out.println("        *       7.  Condicional Ternaria.                   *");
            System.out.println("        *       8.  Bucle DO WHILE.                         *");
            System.out.println("        *       9.  Bucle WHILE.                            *");
            System.out.println("        *       10. Bucle FOR.                              *");
            System.out.println("        *       0.  Salir.                                  *");
            System.out.println("        *****************************************************");
            System.out.print("Ingrese el número de la opción que desea ver: ");
            opcion = scanner.nextInt();
            System.out.println();

            // Mostrar la explicación según la opción seleccionada
            switch (opcion) {
                case 1:
                    mostrarDatosPrimitivos();
                    break;
                case 2:
                    mostrarString();
                    break;
                case 3:
                    mostrarConstantes();
                    break;
                case 4:
                    mostrarOperadores();
                    break;
                case 5:
                    mostrarCondicionalIF();
                    break;
                case 6:
                    mostrarCondicionalSwitch();
                    break;
                case 7:
                    mostrarCondicionalTernario();
                    break;
                case 8:
                    mostrarBucleDoWhile();
                    break;
                case 9:
                    mostrarBucleWhile();
                    break;
                case 10:
                    mostrarBucleFor();
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número entre 0 y 10.");
                    break;
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarDatosPrimitivos() {
        System.out.println("1. Datos Primitivos:");
        int numeroEntero = 42;
        double numeroDecimal = 3.14;
        char letra = 'J';
        boolean esVerdadero = true;

        System.out.println("Número Entero: " + numeroEntero);
        System.out.println("Número Decimal: " + numeroDecimal);
        System.out.println("Letra: " + letra);
        System.out.println("Es Verdadero: " + esVerdadero);
    }

    private static void mostrarString() {
        System.out.println("2. String:");
        String saludo = "¡Hola, Mundo!";
        System.out.println("Saludo: " + saludo);
    }

    private static void mostrarConstantes() {
        System.out.println("3. Constantes:");
        final int CONSTANTE_NUMERO = 100;
        System.out.println("Constante Número: " + CONSTANTE_NUMERO);
    }

    private static void mostrarOperadores() {
        System.out.println("4. Tipo de Operadores:");
        int a = 10;
        int b = 5;
        System.out.println("Suma (a + b): " + (a + b));
        System.out.println("Resta (a - b): " + (a - b));
        System.out.println("Multiplicación (a * b): " + (a * b));
        System.out.println("División (a / b): " + (a / b));
        System.out.println("Módulo (a % b): " + (a % b));
    }

    private static void mostrarCondicionalIF() {
        System.out.println("5. Condicional IF, ELSE IF, ELSE:");
        int numero = 15;
        if (numero > 10) {
            System.out.println("Número es mayor que 10");
        } else if (numero == 10) {
            System.out.println("Número es igual a 10");
        } else {
            System.out.println("Número es menor que 10");
        }
    }

    private static void mostrarCondicionalSwitch() {
        System.out.println("6. Condicional Switch:");
        int dia = 3; // Representa el miércoles
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido");
                break;
        }
    }

    private static void mostrarCondicionalTernario() {
        System.out.println("7. Condicional Ternaria:");
        int edad = 18;
        String resultado = (edad >= 18) ? "Adulto" : "Menor de edad";
        System.out.println("Edad: " + edad + " - " + resultado);
    }

    private static void mostrarBucleDoWhile() {
        System.out.println("8. Bucle DO WHILE:");
        int contador = 0;
        do {
            System.out.println("Contador DO WHILE: " + contador);
            contador++;
        } while (contador < 3);
    }

    private static void mostrarBucleWhile() {
        System.out.println("9. Bucle WHILE:");
        int contador = 0;
        while (contador < 3) {
            System.out.println("Contador WHILE: " + contador);
            contador++;
        }
    }

    private static void mostrarBucleFor() {
        System.out.println("10. Bucle FOR:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteración FOR: " + i);
        }
    }
}
