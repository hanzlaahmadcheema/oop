package OOP.LabTask4.Third;
public class animal {
    String name;
    int age;
     animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

     animal(animal an) {
        this.name = an.name;  
        this.age = an.age;    
    }

    
     void show() {
        System.out.println("Animal Name: " + name + ", Age: " + age);
    }
}