package lesson8;

/**
 * Created by Ps1X on 21.09.2017.
 */
public class SavingAccount extends Account{
    int savingPerMonth;
    public SavingAccount(String bankName, String ownerName, int moneyAmount, int savingPerMonth) {
        super(bankName, ownerName, moneyAmount);
        this.savingPerMonth = savingPerMonth;
    }
    void depositMoney(int amount) {
        savingPerMonth += amount;
    }
}
