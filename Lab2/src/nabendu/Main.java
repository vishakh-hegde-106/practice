package nabendu;

import shape.Triangle;

import shape2.Square;
import shape3.Circle;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Menu:-");
		System.out.println("1. Square");
		System.out.println("2. Triangle");
		System.out.println("3. Circle");
		System.out.println("Enter your choice : ");
		int choice = scanner.nextInt();
		switch (choice) {
			case 1: {
				System.out.println("Enter the side of the square : ");
				double s = scanner.nextDouble();
				Square square = new Square(s);
				System.out.println("Square Perimeter : "+square.getPermiter());
				System.out.println("Square Area: "+square.getArea());
				break;
			}	
			case 2: {
				System.out.println("Enter the sides of the Triangle : ");
				double a = scanner.nextDouble();
				double b = scanner.nextDouble();
				double c = scanner.nextDouble();
				double h = scanner.nextDouble();
				Triangle triangle = new Triangle(a, b, c, h);
				System.out.println("Triangle Perimeter : "+triangle.getPerimeter());
				System.out.println("Triangle Area: "+ triangle.getArea());
				break;
			}
			case 3: {
				System.out.println("Enter the radius of the Circle : ");
				double r = scanner.nextDouble();
				Circle circle = new Circle(r);
				System.out.println("Circle Perimeter : "+circle.getPerimeter());
				System.out.println("Circle Area : "+ circle.getArea());
				break;
			}
		default:
			System.out.println("Invalid Choice");
			
		}
		
	}
}
