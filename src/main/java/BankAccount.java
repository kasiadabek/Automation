public class BankAccount {
    private float accountBalance;

    public BankAccount() {
        accountBalance = 0;
    }
    public BankAccount(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean whitdraw(float amount) {
        if(amount > this.accountBalance){
            return false;
        }
        else {
            this.accountBalance -=amount;
            return true;
        }
    }

    public void transfer(float amount){
        this.accountBalance += amount;
    }

    public float getAccountBalance(){
        return this.accountBalance;
    }
}
