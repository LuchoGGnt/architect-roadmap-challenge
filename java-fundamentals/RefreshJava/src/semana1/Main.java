package semana1;

import semana1.entities.BankAccount;
import semana1.entities.User;
import semana1.features.FBankAccount;
import semana1.features.FPresentation;
import semana1.features.FUser;

import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//
//        boolean buclePrincipal = true;
//        boolean bucleUsuario = true;
//        boolean bucleCuentaBanco = true;
//
//        while (buclePrincipal) {
//            Scanner scanner = new Scanner(System.in);
//
//            FPresentation.presentacion();
//            short opcionPrincipal = Short.parseShort(scanner.nextLine());
//
//            switch (opcionPrincipal) {
//                case 1 -> {     // Crear usuario
//                    while (bucleUsuario) {
//                        FUser.requisitosUsuario();
//                        short opcion = scanner.nextShort();
//                        switch (opcion) {
//                            case 1 -> {
//                                User usuario = FUser.crearUsuario();
//                            }
//                            case 2 -> {
//                                System.out.println("Regresando...");
//                                bucleUsuario = false;
//                            }
//                            default -> {
//                                System.out.println("Opción inválida. Intente de nuevo.");
//                            }
//                        }
//                    }
//                }
//                case 2 -> {     // Crear cuenta de banco
//                    while (bucleCuentaBanco) {
//                        FBankAccount.requisitosCuentabanco();
//                        short opcion = scanner.nextShort();
//                        switch (opcion) {
//                            case 1 -> {
//                                User usuario = FUser.crearUsuario();
//                                BankAccount cuentaBanco = FBankAccount.crearCuentaBanco(usuario);
//                            }
//                            case 2 -> {
//                                System.out.println("Regresando...");
//                                bucleCuentaBanco = false;
//                            }
//                            default -> {
//                                System.out.println("Opción inválida. Intente de nuevo.");
//                            }
//                        }
//                    }
//                }
//                case 3 -> {     // salir
//                    System.out.println("¡Hasta pronto!");
//                    buclePrincipal = false;
//                }
//            }
//        }
//
//
//    }

}
