package intecbrussel.be;

public class ExampleSynchronize2 {

    private boolean enoughBankAccount = false;
    private int moneyBankAccount = 0;

    public boolean isEnoughOnBankAccount() {
        return enoughBankAccount;
    }

    public void setEnoughBankAccount(boolean enoughBankAccount) {
        this.enoughBankAccount = enoughBankAccount;
    }

    public int getMoneyBankAccount() {
        return moneyBankAccount;
    }

    public synchronized void addAmountPerMonth(int yorPay) {

        moneyBankAccount += yorPay;
        if (moneyBankAccount > 3000) {
            enoughBankAccount = true;
        }
        notify();
    }

    public synchronized void payBills(int amountBills) {
        while (enoughBankAccount) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        moneyBankAccount -= amountBills;
        notify();
    }
}
