package programas;

import java.util.Scanner;

public class ProgWhi {

    public void sumEnt(){
        Scanner scanner = new Scanner(System.in);

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

    }
}
