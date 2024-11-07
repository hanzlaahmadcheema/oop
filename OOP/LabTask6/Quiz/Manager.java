package OOP.LabTask6.Quiz;

import java.util.Scanner;

public class Manager extends Employee {

    double salary;
    double allownce;

    Manager(String name, String role, double salary, double allownce) {
        super(name, role);
        this.salary = salary;
        this.allownce = allownce;
    }

    @Override
    double calculateSalary() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        salary = input.nextDouble();
        System.out.println("Enter Allowance: ");
        allownce = input.nextDouble();
        salary+=allownce;

        return super.calculateSalary();
    }

}
