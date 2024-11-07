package OOP.LabTask4.Third;

public class Main {
    public static void main(String[] args){
        
        animal n1=new animal("jack",3);
        animal n2=new animal(n1);
        System.out.println("orignal animal name :");
        n1.show();
        System.out.println("copy of 1st instance by copy constructor: ");
        n2.show();
    }
}
