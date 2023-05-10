// implementation added to test the program
class Employee {
    String name;
    String desig;
    String dept;

    Employee(String name, String desig, String dept) {
        this.name = name;
        this.desig = desig;
        this.dept = dept;
    }

    void display() {
        System.out.println(name + " " + desig + " " + dept);
    }
}

public class Personnel extends Employee {
    int bsalary;
    int incentive;
    int netSalary;

    Personnel(String name, String desig, String dept, int bsalary) {
        // calling super class constructor
        super(name, desig, dept);
        this.bsalary = bsalary;
        incentive = desig.equals("manager") ? 5000 : 0;

    }

    void calcSalary() {
        netSalary = bsalary + incentive;
    }

    void display() {
        super.display();
        System.out.println("Net Salary: " + netSalary);
    }
}
