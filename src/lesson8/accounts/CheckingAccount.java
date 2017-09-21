package lesson8.accounts;

/**
 * Created by Ps1X on 21.09.2017.
 */
public class CheckingAccount extends Account{
    int limitOFExpenses;

    public CheckingAccount(String bankName, String ownerName, int moneyAmount, int limitOFExpenses) {
        super(bankName, ownerName, moneyAmount);
        this.limitOFExpenses = limitOFExpenses;
    }
    void withDraw (int amount) {
        if (amount > limitOFExpenses)
            return;
        moneyAmount -= amount;
    }
    void changeOwnerName(String newOwnerName){
        if (newOwnerName == "Jack" || newOwnerName == "Ann")
            ownerName = newOwnerName;
        else
            System.out.println("Sorry, you can't change owner name of this saving account");
    }
}
