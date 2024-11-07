package OOP.LabTask2;
import java.util.Scanner;

public class Sum3D {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int arr[][][] = new int[2][3][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = inp.nextInt();
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    int sum = 0;
                    sum += arr[i][j][k];
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        }
    }
}
