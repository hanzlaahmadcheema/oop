package OOP.LabTask2;

import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        int i, n, fact = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = inp.nextInt();
        for (i = 1; i <= n; i++)
            fact = fact * i;
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}