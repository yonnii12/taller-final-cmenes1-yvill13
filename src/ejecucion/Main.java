package ejecucion;

import explicaciones.Detalle;
import menu.MenuPrincipal;
import menu.SubMenu;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenu;
        int opcionSubMenu;

        do {
            // Mostrar menú principal
            MenuPrincipal.principalMEnu();
            opcionMenu = scanner.nextInt();

            // Mostrar la explicación según la opción seleccionada
            switch (opcionMenu) {
                case 1:
                    do {
                        SubMenu.datosPrimitivos();
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu){

                            case 1:      //Explicacion Byte
                                Detalle.expByte();
                                    scanner.nextLine();
                                    scanner.nextLine();
                                break;
                            case 2:      //Explicacion Short
                                Detalle.expShort();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 3:      //Explicacion Int
                                Detalle.expInt();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 4:      //Explicacion Long
                                Detalle.expLong();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 5:      //Explicacion Float
                                Detalle.expFloat();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 6:      //Explicacion Double
                                Detalle.expDoub();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 7:      //Explicacion Char
                                Detalle.expChar();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 8:      //Explicacion Boolean
                                Detalle.expBoo();
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
                    Detalle.expString();
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 3:
                    Detalle.expConst();
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 4:
                    do {
                        SubMenu.tipoOper();
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu){

                            case 1:      //Explicacion Operadores Aritmeticos
                                Detalle.expOpAri();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:      //Explicacion Operadores Relacionales
                                Detalle.expOpRel();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 3:      //Explicacion Operadores Logiocs
                                Detalle.expOpLog();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 4:      //Explicacion Operadores de Asignacion
                                Detalle.expOpAsig();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 5:      //Explicacion Operadores de Incremento/Decremento
                                Detalle.expOpIncDec();
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
                        SubMenu.condi();
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu) {

                            case 1:
                                Detalle.expIf();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:
                                Detalle.expElIf();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 3:
                                Detalle.expEls();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 4:      /*Esta listo*/
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *            PROGRAMA IF, ELSE IF y ELSE            *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *   El programa realizado usara una estructura      *");
                                System.out.println("        *   IF, ELSE IF, ELSE en la cual solicitara al      *");
                                System.out.println("        *   usuario una edad y este le retornada            *");
                                System.out.println("        *   a que grupo de edad corresponde.                *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *****************************************************");

                                for (int i = 0; i < 4; i++) {
                                    System.out.println("\n Ingrese su edad:");
                                    int edad = scanner.nextInt();

                                    if (edad >= 0 && edad <= 5) {
                                        System.out.println("Usted es un bebe \uD83D\uDC76");
                                    } else if (edad > 5 && edad <= 12) {
                                        System.out.println("Usted es un niño \uD83D\uDC66");
                                    }    else if (edad > 12 && edad <= 20) {
                                            System.out.println("Usted es un joven \uD83E\uDDD2");
                                    } else if (edad > 20 && edad <= 60) {
                                        System.out.println("Usted es un adulto \uD83E\uDDD4\u200D \uFE0F");
                                    } else if (edad > 60 && edad<= 150) {
                                        System.out.println("Usted es de tercera edad \uD83D\uDC74");
                                    } else if (edad < 0) {
                                        System.out.println("Edad inválida");
                                    } else {
                                        System.out.println("edad muy vieja, ya estaria usted muerto ☠\uFE0F");
                                    }

                                }


                                System.out.println("\n Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;


                        }
                    }while (opcionSubMenu !=5);
                    break;
                case 6:
                    do {
                        System.out.println("\n");
                        System.out.println("        *****************************************************");
                        System.out.println("        *                    CONDICIONAL                    *");
                        System.out.println("        *                      SWITCH                       *");
                        System.out.println("        *****************************************************");
                        System.out.println("        *                                                   *");
                        System.out.println("        *       1.  Explicacion SWITCH.                     *");
                        System.out.println("        *       2.  Programa SWITCH.                        *");
                        System.out.println("        *       3.  Atras.                                  *");
                        System.out.println("        *                                                   *");
                        System.out.println("        *****************************************************");
                        System.out.print("\n Ingrese el número de la opción que desea ver: ");
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu) {

                            case 1:
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *                 EXPLICACION SWITCH                *");
                                System.out.println("        *****************************************************");
                                System.out.println("        *                                                   *");
                                System.out.println("        *   En Java, el switch es una estructura de control *");
                                System.out.println("        *   de flujo que permite tomar decisiones basadas   *");
                                System.out.println("        *   en el valor de una expresión.                   *");
                                System.out.println("        *   Es una alternativa al uso de múltiples          *");
                                System.out.println("        *   declaraciones if-else cuando se necesita        *");
                                System.out.println("        *   comparar una variable contra una serie          *");
                                System.out.println("        *   de valores constantes.                          *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *           Su estructura es la siguiente:          *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *    switch (expresión) {                           *");
                                System.out.println("        *        case valor1:                               *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *           break;                                  *");
                                System.out.println("        *        case valor2:                               *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *           break;                                  *");
                                System.out.println("        *        default:                                   *");
                                System.out.println("        *    }                                              *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *****************************************************");
                                System.out.println("\n Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:
                                System.out.println("\n");
                                System.out.println("        *****************************************************");
                                System.out.println("        *                  PROGRAMA SWITCH                  *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *   El programa realizado, utilizara una            *");
                                System.out.println("        *   estructura Switch en la cual le solicitara al   *");
                                System.out.println("        *   usuario ingresar una calificacion del 1 al 10   *");
                                System.out.println("        *   y le retornara la calificacion homologada a     *");
                                System.out.println("        *   letras.                                          *");
                                System.out.println("        *                                                   *");
                                System.out.println("        *****************************************************");

                                int cal;

                                System.out.println("\n Para validar el programa ingrese su calificacion de 1 a 10");
                                Scanner califica = new Scanner(System.in);
                                cal = califica.nextInt();

                                switch (cal){
                                    case 1:
                                    case 2:
                                        System.out.println("Su calificacion es: F");
                                        break;
                                    case 3:
                                    case 4:
                                        System.out.println("Su calificacion es: D");
                                        break;
                                    case 5:
                                    case 6:
                                        System.out.println("Su calificacion es: C");
                                        break;
                                    case 7:
                                    case 8:
                                        System.out.println("Su calificacion es: B");
                                        break;
                                    case 9:
                                    case 10:
                                        System.out.println("Su calificacion es: A");
                                        break;

                                    default:
                                        System.out.println("Número no válido, por favor verifique");
                                }

                                System.out.println("\n Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                        }
                    }while (opcionSubMenu !=3);
                    break;


                case 7:
                    do {
                        System.out.println("\n");
                        System.out.println("        *****************************************************");
                        System.out.println("        *                  CONDICIONAL TERNARIA             *");
                        System.out.println("        *****************************************************");
                        System.out.println("        *       1.  Explicacion TERNARIA.                   *");
                        System.out.println("        *       2.  Ejemplo TERNARIA.                      *");
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
                                System.out.println("        *************************************************************");
                                System.out.println("        *                  EXPLICACION TERNARIA                     *");
                                System.out.println("        *************************************************************");
                                System.out.println("        *   el operador ternario es una forma  concisa              *");
                                System.out.println("        *   de realizar una instrucción condicional.                *");
                                System.out.println("        *   Es una alternativa compacta a una declaración if-else   *");
                                System.out.println("        *   y se usa para asignar un valor a una variable           *");
                                System.out.println("        *   basado en una condición..                               *");
                                System.out.println("        *   La sintaxis del operador ternario es:                   *");
                                System.out.println("        *                                                           *");
                                System.out.println("        * variable = (condición) ? valorSiVerdadero : valorSiFalso; *");
                                System.out.println("        *************************************************************");
                                System.out.println("\n Ingrese Enter para  volver al menu anterior");
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:      /*Esta listo*/
                                System.out.println("\n");
                                System.out.println("        *********************************************************");
                                System.out.println("        *                      EJEMPLO TERNARIA                 *");
                                System.out.println("        *********************************************************");
                                System.out.println("        *                Ingrese un número entero para saber    *");
                                System.out.println("        *                si es par o impar.                     *");
                                System.out.println("        *********************************************************");
                                int numero = scanner.nextInt();

                                // Usar el operador ternario para determinar si el número es par o impar
                                String resultado = (numero % 2 == 0) ? "El número es par" : "El número es impar";

                                // Mostrar el resultado
                                System.out.println(resultado);


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
                case 8:
                    do {
                        System.out.println("\n");
                        System.out.println("        *****************************************************");
                        System.out.println("        *                  BUCLE DO WHILE                   *");
                        System.out.println("        *****************************************************");
                        System.out.println("        *       1.  Explicacion DO WHILE.                   *");
                        System.out.println("        *       2.  Ejemplo DO WHILE.                      *");
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
                                System.out.println("        *   como su nombre indica (while significa mientras),       *");
                                System.out.println("        *   repetir una acción en un bucle siempre y cuando         *");
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
                                System.out.println("        *********************************************************");

                                Random random = new Random();


                                // Generar un número aleatorio entre 1 y 30
                                int numeroSecreto = random.nextInt(30) + 1;
                                int intento;
                                int contadorIntentos = 0;

                                System.out.println("        *********************************************************");
                                System.out.println("        *    ¡Bienvenido al juego de adivinar el número!        *");
                                System.out.println("        *     He elegido un número entre 1 y 30.                *");
                                System.out.println("        *             ¡Intenta adivinarlo!                      *");
                                System.out.println("        *********************************************************");
                                do {
                                    System.out.print("       *           Introduce tu intento:");
                                    intento = scanner.nextInt();
                                    contadorIntentos++;

                                    if (intento < numeroSecreto) {
                                        System.out.println(" * El número es mayor. Intenta de nuevo. *");
                                    } else if (intento > numeroSecreto) {
                                        System.out.println("* El número es menor. Intenta de nuevo.  *");
                                    } else {
                                        System.out.println(" \uD83C\uDF89 \uD83E\uDD73¡Felicidades! Has adivinado el número en " + contadorIntentos + " intentos. \uD83C\uDF89 \uD83E\uDD73");
                                    }
                                } while (intento != numeroSecreto);

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
                                System.out.println("        *   como su nombre indica (while significa mientras)       *");
                                System.out.println("        *   repetir una acción en un bucle siempre y cuando        *");
                                System.out.println("        *   se cumpla una condición booleana de control            *");
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
                                System.out.println("        *           entre el 1 hasta el valor ingresado         *");
                                System.out.println("        *********************************************************");

                                System.out.print("\nIngrese el un número : ");
                                int numero = scanner.nextInt();

                                if (numero < 1) {
                                    System.out.println("El número debe ser mayor o igual a 1.");
                                }

                                int suma = 0;
                                int contador = 1;

                                while (contador <= numero) {
                                    suma += contador;
                                    contador++;
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
                                System.out.println("        *                 entre el 1 y el valor ingresado       *");
                                System.out.println("        *********************************************************");

                                System.out.print("\nIngrese un número entero positivo : ");
                                int numero = scanner.nextInt();

                                if (numero < 1) {
                                    System.out.println("El número debe ser mayor o igual a 1.");
                                }
                                int suma = 0;
                                for (int i = 1; i <= numero; i++) {
                                    suma += i;
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