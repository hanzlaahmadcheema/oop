package OOP.LabTask6.Quiz;

import java.util.Scanner;

public class Programmer extends Employee{

    double salary;

    Programmer(String name, String role, double salary){
        super(name, role);
        this.salary = salary;
    }
    
    @Override
    double calculateSalary() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        salary=input.nextDouble();

        return super.calculateSalary();
    }
    
}
