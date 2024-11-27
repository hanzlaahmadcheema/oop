package OOP.LabTask8;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Search system = new Search();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAnimal Search System");
            System.out.println("1. Add Animal");
            System.out.println("2. Search Animal by Type");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter animal name: ");
                    String name = scanner.next();
                    System.out.print("Enter animal type (Herbivore/Carnivore): ");
                    String type = scanner.next();
                    system.addAnimal(name, type);
                    break;

                case 2:
                    System.out.print("Enter type to search (Herbivore/Carnivore): ");
                    String searchType = scanner.next();
                    system.searchByType(searchType);
                    break;

                case 3:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}