package ejecucion;

import explicaciones.Detalle;
import menu.MenuPrincipal;
import menu.SubMenu;
import programas.*;

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
                                ProgCond edadClas = new ProgCond();
                                edadClas.clasificarEdad();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                        }
                    }while (opcionSubMenu !=5);
                    break;
                case 6:
                    do {
                        SubMenu.switc();
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu) {

                            case 1:
                                Detalle.expSwitc();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:
                                ProgSwitc clasCal = new ProgSwitc();
                                clasCal.clasfCali();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                        }
                    }while (opcionSubMenu !=3);
                    break;
                case 7:
                    do {
                        SubMenu.condTerna();
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu) {

                            case 1:      /*Esta listo*/
                                Detalle.expTern();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:      /*Esta listo*/
                                ProgTern terna = new ProgTern();
                                terna.parImp();
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
                        SubMenu.bucleDoW();
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu) {

                            case 1:      /*Esta listo*/
                                Detalle.expDoW();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:      /*Esta listo*/
                                ProgDoW adNum = new ProgDoW();
                                adNum.adivNum();
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
                        SubMenu.bucleWhi();
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu) {

                            case 1:      /*Esta listo*/
                                Detalle.expWhi();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:      /*Esta listo*/
                                ProgWhi sumato = new ProgWhi();
                                sumato.sumEnt();
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
                        SubMenu.blucleFor();
                        opcionSubMenu = scanner.nextInt();
                        switch (opcionSubMenu) {

                            case 1:      /*Esta listo*/
                                Detalle.expFor();
                                scanner.nextLine();
                                scanner.nextLine();
                                break;
                            case 2:      /*Esta listo*/
                                ProgFor sumaE = new ProgFor();
                                sumaE.sum();
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