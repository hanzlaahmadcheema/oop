package OOP.LabTask2;
import java.util.Scanner;
public class Teacher {
    private String name;
    private String id;
    private int NoOfcourses;
    private String gender;
    private String department;

    Teacher(){
        name = "";
        id = "";
        NoOfcourses = 0;
        gender = "";
        department = "";
    }
    void add(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter teacher name: ");
        name = inp.next();
        System.out.print("Enter teacher id: ");
        id = inp.next();
        System.out.print("Enter Number Of Courses: ");
        NoOfcourses = inp.nextInt();
        System.out.print("Enter gender: ");
        gender = inp.next();
        System.out.print("Enter department: ");
        gender = inp.next();
    }
    void remove(){
        
    }
    void edit(){
        
    }
}