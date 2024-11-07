package OOP.LabTask4.Second;

public class Main {
    public static void main(String[] args) {
       B e=new B();
       //System.out.println(e.a); //a is private
       System.out.println(e.b); // b is protected
       System.out.println(e.c); //c is public
    }
}
