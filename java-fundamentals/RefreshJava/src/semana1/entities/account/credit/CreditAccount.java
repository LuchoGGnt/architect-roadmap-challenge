package semana1.entities.account.credit;

import semana1.entities.account.Account;
import semana1.entities.card.Card;

public class CreditAccount extends Account {
    private double amountLimit;
    private double realAmount;
    private double interestRate;
    private double maintenanceAmount;
    private Card card;

    public CreditAccount(
            boolean state,
            double amount,
            double realAmount,
            double interestRate,
            double maintenanceAmount
    ) {
        super(state);
        this.amountLimit = amountLimit;
        this.realAmount = realAmount;
        this.interestRate = interestRate;
        this.maintenanceAmount = maintenanceAmount;
        this.card = null;
    }

    public double getAmountLimit() {
        return this.amountLimit;
    }
    public void setAmountLimit(double amountLimit) {
        /* El historial crediticio del cliente puede mejorar,
        por lo que puede intrementarse el saldo de la cuenta.*/
        this.amountLimit = amountLimit;
    }

    public double getRealAmount() {
        return this.realAmount;
    }
    public void setRealAmount(double realAmount) {

        this.realAmount = realAmount;
    }

    public double getInterestRate() {
        return this.interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMaintenanceAmount() {
        return this.maintenanceAmount;
    }
    public void setMaintenanceAmount(double maintenanceAmount) {
        this.maintenanceAmount = maintenanceAmount;
    }

    public void generateCard() {
        this.card = new Card();
    }
    public Card getCard() {
        return this.card;
    }
}
