package programas;

import java.util.Scanner;

public class ProgTern {

    public void parImp(){
        Scanner scanner = new Scanner(System.in);

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
    }
}
