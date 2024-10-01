package programas;

import java.util.Scanner;

public class ProgCond {
    public void clasificarEdad(){
        Scanner scanner = new Scanner(System.in);

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
            } else if (edad > 12 && edad <= 20) {
                System.out.println("Usted es un joven \uD83E\uDDD2");
            } else if (edad > 20 && edad <= 60) {
                System.out.println("Usted es un adulto \uD83E\uDDD4\u200D \uFE0F");
            } else if (edad > 60 && edad <= 150) {
                System.out.println("Usted es de tercera edad \uD83D\uDC74");
            } else if (edad < 0) {
                System.out.println("Edad inválida");
            } else {
                System.out.println("Edad muy vieja, ya estaría usted muerto ☠️");
            }
        }
    }
}
