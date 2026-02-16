package semana1;

import semana1.entities.account.Account;
import semana1.entities.account.credit.CreditAccount;
import semana1.entities.card.Card;
import semana1.utils.ReadFileObject;
import semana1.utils.WriteFileObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.UUID;

public class Test {
    public static void main(String[] args) {

        String path = "D:\\proyectos-personales\\arq-roadmap\\java-fundamentals\\RefreshJava\\src\\files\\file.txt";
        int n = 50;
        double max = 15000.0, min = 1000.0;
        double amount;
        double interest = 0.5;
        double maintenance = 10.0;

        HashMap<UUID, Account> cuentasBancarias = new HashMap<>();
        WriteFileObject saveFile;

//        for (int i = 0; i < n; i++) {
//            amount = Math.random() * (max - min) + 1;
//            CreditAccount cuentaCredito = new CreditAccount(
//                    true,
//                    amount,
//                    amount,
//                    interest,
//                    maintenance
//            );
//            saveFile = new WriteFileObject(path, cuentaCredito);
//        }

        ReadFileObject readFile = new ReadFileObject(path);
        Account cuentaBancaria = (Account) (readFile.readFile());
        System.out.println(cuentaBancaria.getUuid());
    }
}

