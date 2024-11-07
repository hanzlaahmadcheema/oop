package OOP.LabTask2;
import java.util.Scanner;
public class Course {
    private String name;
    private String code;
    private int credits;
    private String instructor;

    Course(){
        name = "";
        code = "";
        credits = 0;
        instructor = "";
    }
    void add(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter course name: ");
        name = inp.next();
        System.out.print("Enter course code: ");
        code = inp.next();
        System.out.print("Enter course credits: ");
        credits = inp.nextInt();
        System.out.print("Enter course instructor: ");
        instructor = inp.next();
    }
    void remove(){
        
    }
    void edit(){
        
    }
}
