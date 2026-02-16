package semana1.entities.account.nocredit;

import semana1.entities.account.Account;
import semana1.entities.card.Card;

public class SavingsAccount extends Account {
    private final String accountNumber;
    private final String cci;
    private double amount;
    private double interestRate;
    private double maintenanceAmount;
    private Card card;

    public SavingsAccount(double amount, double interestRate, double maintenanceAmount, boolean state) {
        super(state);
        this.accountNumber = generateAccountNumber();
        this.cci = generateCCI();
        this.amount = amount;
        this.interestRate = interestRate;
        this.maintenanceAmount = maintenanceAmount;
        this.card = null;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
    public String getCCI() {
        return this.cci;
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount() {
        this.amount = amount;
    }

    public double getMaintenanceAmount() {
        return this.maintenanceAmount;
    }

    public void setMaintenanceAmount(double maintenanceAmount) {
        /* Dependiendo de las reglas de negocio, el monto de
        mantenimiento puede variar. */
        this.maintenanceAmount = maintenanceAmount;
    }

    public void generateCard() {
        this.card = new Card();
    }
    public void depositMoney(double amount) {
        depositMoney(amount, "");
    }

    public void depositMoney(double amount, String accountNumber) {
        /* Los depósitos también pueden ser entre cuentas */
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

    public void calculateInterest() {
        this.amount *= (1.0 + interestRate);
    }

    public void calculateMaintenance() {
        this.amount -= maintenanceAmount;
    }
    private String generateAccountNumber() {
        return String.valueOf((long) (Math.random() * 8999999999.0) + 1000000000.0);
    }

    private String generateCCI() {
        return "001100" + String.valueOf((long) (Math.random() * 89999999999999.0) + 10000000000000.0);
    }
}
