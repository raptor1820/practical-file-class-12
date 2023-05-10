class Employee {
    int empNo;
    String empName;
    String empDesig;

    Employee(int no, String name, String desig) {
        empNo = no;
        empName = name;
        empDesig = desig;
    }

    void display() {
        System.out.println("Employee number: " + empNo);
        System.out.println("Employee name: " + empName);
        System.out.println("Employee designation: " + empDesig);
    }
}

public class Salary extends Employee {
    float basic;

    // parameterized constructor
    Salary(int no, String name, String desig, float salary) {
        // calling super class constructor
        super(no, name, desig);
        basic = salary;
    }

    void calculate() {
        double da = 0.1 * basic;
        double hra = 0.15 * basic;
        double salary = basic + da + hra;
        double pf = 0.08 * salary;
        salary -= pf;
        System.out.println("Salary is: " + salary);
    }

    void display() {
        // calling super class method
        super.display();
        calculate();
    }

}