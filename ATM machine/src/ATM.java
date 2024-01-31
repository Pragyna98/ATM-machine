public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    public ATM(){

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositBalance(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawBalance(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
