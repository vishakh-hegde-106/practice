package generics;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        UpperBoundWildCard genericList = new UpperBoundWildCard();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a number");
            System.out.println("2. Calculate sum");
            System.out.println("3. Sort numbers");
            System.out.println("4. Exit");
            System.out.println("--------------------------");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number (Integer or Double): ");
                    if (scanner.hasNextInt()) {
                        genericList.addNumber(scanner.nextInt());
                    } else if (scanner.hasNextDouble()) {
                        genericList.addNumber(scanner.nextDouble());
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // Consume the invalid input
                    }
                    break;
                case 2:
                    System.out.println("Sum of numbers: " + genericList.sum());
                    break;
                case 3:
                    genericList.sort();
                    System.out.println("Sorted numbers: " + genericList.getNumbers());
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close(); // Close the Scanner before exiting
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

	}

}
