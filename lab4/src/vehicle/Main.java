package vehicle;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		//MENU
		System.out.println("Which Vehicle You want to drive...");
		System.out.println("1. Cars");
		System.out.println("2. Other 4 Wheelers");
		System.out.println("3. 2 Wheelers");
		int choice = scanner.nextInt();
		System.out.println("Enter Vehicle Type : ");
		String vtype = scanner.next();
		
		switch (choice) {
		case 1: {
			Car car = new Car();
			car.drive(vtype);
			break;
		}
		case 2:{
			VehicleAdapter adapter = new VehicleAdapter(new FourWheeler());
			adapter.drive(vtype);
			break;
		}
		case 3:{
			VehicleAdapter adapter = new VehicleAdapter(new TwoWheeler());
			adapter.drive(vtype);
			break;
		}
		default:
			System.out.println("Invalid Choice...");
		}
	}
}
