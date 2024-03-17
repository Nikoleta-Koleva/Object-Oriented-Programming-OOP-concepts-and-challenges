package OOP.Encapsulation;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        //Call the main constructor from the empty constructor with default values
        this("56789", 2.50, "Default name",
                "Default address", "default phone");

        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName,
                       String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.number = number;
    }

    public String getAccountNumber() {
        return this.number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double funds) {
        this.balance += funds;
    }

    public void withdrawFunds(double funds) {
        if (this.balance - funds < 0) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= funds;
            System.out.println("Withdrawal processed.");
        }
    }
}
