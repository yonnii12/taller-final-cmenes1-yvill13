package programas;

import java.util.Scanner;

public class ProgSwitc {
    public void clasfCali(){
        Scanner scanner = new Scanner(System.in);

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
    }
}
