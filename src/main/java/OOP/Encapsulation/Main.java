package OOP.Encapsulation;

public class Main {
    public static void main (String args[]) {
        //Instance Method of a class
        Car porsche = new Car();
        Car holden = new Car();

        System.out.println("Encapsulation - Training task");

        System.out.println("Model is: " + porsche.getModel());
        porsche.setModel("911");
        System.out.println("Model is: " + porsche.getModel());

        /*
        Challenge
        Create a new class for a bank account
        Create fields for the account number, balance, customer name, email and phone number

        Create getters and setters for each field
        Create two additional methods
        1. To allow the customer to deposit funds (this should increment the balance field).
        2. To allow the customer to withdraw funds. This should increment the balance field,
        but not allow the withdrawal to complete if there are insufficient funds.
        You will want to create various code in the Main class to confirm your code is working.

        Add some System.out.println's in the two methods above as well.
        */

        System.out.println("Encapsulation - First task");

        BankAccount acc = new BankAccount();

        /*
        Calls the main constructor and sets values
        BankAccount acc = new BankAccount("123", 700.0, "Nikoleta",
                "nikoleta819@gmail.com", "089 992 8650");
         */

        acc.withdrawFunds(500.0);

        acc.depositFunds(700.0);
        System.out.println(acc.getBalance());

        /*
        Create a new class VipCustomer
        it should have 3 fields name, credit limit, and email address
        create 3 constructors

        1st constructor empty should call the constructor with 3 parameters with default values
        2nd constructor should pass on the 2 values it received and add a default value for the 3rd
        3rd constructor should save all fields

        create getters only for this using code generation of Intellij as setters won't be needed
        */

        System.out.println("Encapsulation - Second task");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 1500);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 700, "default email");
        System.out.println(person3.getName());
    }
}
