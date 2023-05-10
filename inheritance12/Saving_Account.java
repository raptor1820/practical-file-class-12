//Bank class has been implemented to test the program
class Bank {
    String name;
    int accno;
    double balance;

    Bank(String name, int accno, double balance) {
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        balance -= amt;
    }

    void display() {
        System.out.println(name + " " + accno + " " + balance);
    }
}

public class Saving_Account extends Bank {
    double amt;
    double rate;
    double si;

    // parameterized constructor
    Saving_Account(String name, int accno, double balance, double rate) {
        // calling super class constructor
        super(name, accno, balance);
        this.rate = rate;
    }

    void addInterest() {
        si = (balance * rate * 3d / 12d) / 100;
        balance += si;
    }

    void withdraw(double amt) {
        if (balance - amt <= 0) {
            System.out.println("Insufficient Balance");
        } else if (balance - amt < 500) {
            balance -= amt;
            balance = balance - ((500 - balance) / 10); // charging penalty
        } else {
            balance -= amt;
        }
    }

    void display() {
        // calling super class method
        super.display();
        System.out.println("Interest earned: " + si);
    }
}