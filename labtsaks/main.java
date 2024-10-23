package labtsaks;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        animal n1=new animal();
        animal n2=new animal();
        Scanner scanner=new Scanner(System.in);
        int a;
        System.out.println("press 1 to add name and age");
        System.out.println("press 2 to edit info ");
        a=scanner.nextInt();
        switch (a) {
            case 1:
                n1.Add();
                break;
            case 2: 
                n1.edit();
                break;
            case 3:
                n2=
        
            default:
                break;
        }
    }
}
