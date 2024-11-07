package OOP.LabTask2;

import java.util.*;

public class Management {

    public static void main(String[] args) {
System.out.println("Enter 1 for course and 2 for teacher");
    Scanner inp = new Scanner(System.in);
    int option = inp.nextInt();
    switch (option) {
        case 1:
        Course c = new Course();
        System.out.println("Enter 1: for adding course\n2: for removing course\n3: for updating course");
        int choiceC = inp.nextInt();
        switch (choiceC) {
        case 1:
            c.add();
            break;
        case 2:
            c.remove();
            break;
        case 3:
            c.edit();
            break;
        default:
            break;
    }
            break;
        case 2:
        Teacher t = new Teacher();
        System.out.println("Enter 1: for adding teacher\n2: for removing teacher\n3: for updating teacher detail's");
        int choiceT = inp.nextInt();
        switch (choiceT) {
        case 1:
            t.add();
            break;
        case 2:
            t.remove();
            break;
        case 3:
            t.edit();
            break;
        default:
            break;
    }
            break;
        default:
            break;
    }

    }
    
}
