package semana1.features;

import semana1.entities.user.User;

import java.util.Scanner;

public class FBankAccount {
    public static void requisitosCuentabanco() {
        System.out.print("""
                Requisitos para crear una cuenta bancaria:
                
                - Monto inicial
                - Estado de la cuenta
                - DNI del usuario
                
                1. Continuar
                2. Regresar
                
                Opción: 
                """);
    }

    public static BankAccountOld crearCuentaBanco(User usuario) {
        Scanner scanner = new Scanner(System.in);

        BankAccountOld cuentaBanco;

        System.out.print("\nMonto inicial: ");
        double montoInicial = scanner.nextDouble();
        System.out.print("Estado de la cuenta: ");
        boolean estado = scanner.nextBoolean();

        return cuentaBanco = new BankAccountOld(montoInicial, estado, usuario);
    }

    public static BankAccountOld bankAccountDummy() {
        BankAccountOld cuentaBanco;
        User usuario = FUser.usuarioDummy();
        return cuentaBanco = new BankAccountOld(
                15432.0,
                true,
                usuario
        );
    }
}
