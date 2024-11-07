package OOP.LabTask2;

import java.util.Scanner;

public class Sum2D {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int arr[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = inp.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                int sum = 0;
                sum += arr[i][j];
                System.out.print(sum + " ");
            }
        }
    }
}
