package semana1.entities.account;

public class SavingsAccount extends Account{
    private final String accountNumber = String.valueOf((long) (Math.random() * 8999999999.0) + 1000000000.0);
    private final String CCI = "001100" + String.valueOf((long)(Math.random() * 89999999999999.0) + 10000000000000.0);
    private double amount;
    private double interestRate;
    private double maintenanceAmount;

    public SavingsAccount(double amount, double interestRate, double maintenanceAmount, boolean state) {
        super(state);
        this.amount = amount;
        this.interestRate = interestRate;
        this.maintenanceAmount = maintenanceAmount;
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
    public void calculateInterest() {
        this.amount *= (1.0 + interestRate);
    }
    public void calculateMaintenance() {
        this.amount -= maintenanceAmount;
    }
}
