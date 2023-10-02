package abstruction;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Printer printer;
		System.out.println("1. Dot Matrix Printer");
		System.out.println("2. Laser Jet Printer");
		System.out.println("Enter choice (1/2) : ");
		int choice = scanner.nextInt();
		switch (choice) {
			case 1: {
				printer = new DotMatrix("black");
				break;
			}
			case 2: {
				printer = new LaserJet("multicolor");
				break;
			}
			default:
				System.out.println("Invalid Choice.");
				return;
		}
		printer.configuration();
		printer.display();
	}
}
