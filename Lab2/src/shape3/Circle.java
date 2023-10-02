package shape3;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getPerimeter() {
		return 4*Math.PI*this.radius;
	}
	
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
}
