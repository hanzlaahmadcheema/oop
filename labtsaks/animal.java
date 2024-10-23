package labtsaks;
import java.util.Scanner;
public class animal {
    String name;
    int age;
    Scanner scanner=new Scanner(System.in);
   public animal(){
        name = "Name";
        age = 0;
    }
    animal(animal m){
        this.name=m.name;
        this.age=m.age;
    }
    void Add(){
        System.out.println("enter animal name:");
        name=scanner.nextLine();
        System.out.println("Enter age :");
        age=scanner.nextInt();
    }
    void edit(){
        System.out.println("Enter new data ");
        System.out.println("enter animal name:");
        name=scanner.nextLine();
        System.out.println("Enter age :");
        age=scanner.nextInt();
    }

}
