package lesson8;

/**
 * Created by Ps1X on 21.09.2017.
 */
public class Account {
    String bankName;
    String ownerName;
    int moneyAmount;

    public Account(String bankName, String ownerName, int moneyAmount) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
    }
    void changeOwnerName(String newOwnerName){
    ownerName = newOwnerName;
    }
    void depositMoney (int amount) {
        moneyAmount += amount;
    }
    void depositMoney () {
        moneyAmount += 1000;
        System.out.println("deposit was successful");
    }
}
