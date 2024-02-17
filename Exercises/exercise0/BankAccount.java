public class BankAccount{
    //Properties
    private double balance;
    private double interestRate;
    private double creditLimit;
    private String bank;
    private String accountHolder;
    private int accountNumber;
    private boolean isActive;
    private boolean isVerified;

    //Constructor
    public BankAccount(String bank) {
        System.out.println("a bank account in " + bank + " created");
    }

    //Methods
    public void calculateBalance() {

    }

    public void calculateInterest() {

    }

    public void closeAccount() {
        isActive = false;
    }


}