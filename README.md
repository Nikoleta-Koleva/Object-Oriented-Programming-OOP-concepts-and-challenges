A project containing a set of tasks related to the OOP concepts and the Composition design pattern, implemented in Java.

Contains examples of testing with JUnit.

OOP concepts are split into different packages, to improve readability.


The inheritance package contains parent and child classes.
An instance is created from the child classes and its methods are called.

Inheritance challenge:

Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
Finally, create another class, a specific type of Car that inherits from the Car class.

You should be able to hand steering, changing gears, and moving (speed in other words).
You will want to decide where to put the appropriate state and behaviours (fields and methods).
As mentioned above, changing gears, increasing/decreasing speed should be included.
For the specific type of vehicle you will want to add something specific for that type of car.


Polymorphism is showcased in some of the classes, with method overriding (dynamic) and method overloading (static).


The encapsulation package contains BankAccount, Car and VipCustomer classes, showing getter/setter methods, 
how variables are initialised and multiple constructor creation/calling.

Encapsulation challenge 1:

Create a new class for a bank account
Create fields for the account number, balance, customer name, email and phone number

Create getters and setters for each field
Create two additional methods
1. To allow the customer to deposit funds (this should increment the balance field).
2. To allow the customer to withdraw funds. This should increment the balance field,
but not allow the withdrawal to complete if there are insufficient funds.
You will want to create various code in the Main class to confirm your code is working.

Encapsulation challenge 2:

Create a new class VipCustomer
It should have 3 fields - name, credit limit, and email address.
Create 3 constructors.

1st constructor empty should call the constructor with 3 parameters with default values
2nd constructor should pass on the 2 values it received and add a default value for the 3rd
3rd constructor should save all fields

Create getters only for this using code generation of Intellij as setters won't be needed.


The abstraction package contains abstract classes, interfaces and child classes that inherit from the abstract classes. There are examples of abstract methods and method overriding.


The composition package contains a Product class, containing multiple child classes such as ComputerCase, Monitor, Motherboard, Product and PersonalComputer. The PersonalComputer is able to use methods from all other classes.
        
