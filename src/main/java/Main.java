public class Main {
    public static void main(String[] args) {
        BankAccount Super = new BankAccount();
        Super.transfer(50);
        Super.withdraw(20);
        Super.transfer(200);
        Super.getAccountBalance();
        Super.withdraw(50);
    }
}
