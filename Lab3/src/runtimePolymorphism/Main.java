package runtimePolymorphism;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vehicle vehicle;
		System.out.println("1. Car Vehicle");
		System.out.println("2. MotorCycle Vehicle");
		System.out.println("Enter choice (1/2) : ");
		int choice = scanner.nextInt();
		switch (choice) {
			case 1: {
				//runtime polymorphism
				vehicle = new Car();
				break;
			}
			case 2: {
				//runtime polymorphism
				vehicle = new MotorCycle();
				break;
			}
			default:
				System.out.println("Invalid Choice.");
				return;
		}
		vehicle.drive();
	}

}
