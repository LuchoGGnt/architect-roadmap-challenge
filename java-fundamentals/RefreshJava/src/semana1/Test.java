package semana1;

import semana1.entities.BankAccount;
import semana1.entities.User;
import semana1.features.FBankAccount;
import semana1.features.FUser;

public class Test {
    public static void main(String[] args) {
        User usuario = FUser.usuarioDummy();
        BankAccount cuentaBanco = FBankAccount.bankAccountDummy();

        System.out.println(usuario.toString());
        System.out.println(cuentaBanco.toString());
    }
}
