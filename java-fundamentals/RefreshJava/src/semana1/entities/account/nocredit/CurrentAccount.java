package semana1.entities.account.nocredit;

import semana1.entities.account.Account;
import semana1.entities.card.Card;

public class CurrentAccount extends Account {
    private final String accountNumber;
    private final String cci;
    private double amount = 0;
    private Card card;

    public CurrentAccount(boolean state, double amount) {
        super(state);
        this.accountNumber = generateAccountNumber();
        this.cci = generateCCI();
        this.amount = amount;
        this.card = null;
    }

    public double getAmount() {
        return amount;
    }

    public void depositMoney(double amount) {
        depositMoney(amount, "");
    }

    public void depositMoney(double amount, String accountNumber) {
        if (accountNumber.isBlank()) {
            this.amount += amount;
        } else {
            //TODO: Implementar búsqueda de cuentas con archivos planos.
        }
    }

    public void withdrawAmount(double amount) {
        if (amount > this.amount) {
            System.out.println("Dinero insuficiente.");
            return;
        }
        this.amount -= amount;
    }

    public void generateCard() {
        this.card = new Card();

    }

    private String generateAccountNumber() {
        return String.valueOf((long) (Math.random() * 8999999999.0) + 1000000000.0);
    }

    private String generateCCI() {
        return "001100" + String.valueOf((long) (Math.random() * 89999999999999.0) + 10000000000000.0);
    }
}
