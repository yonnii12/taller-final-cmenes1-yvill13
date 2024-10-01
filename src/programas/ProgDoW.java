package programas;

import java.util.Random;
import java.util.Scanner;

public class ProgDoW {
    public void adivNum(){
        Scanner scanner = new Scanner(System.in);

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

    }
}
