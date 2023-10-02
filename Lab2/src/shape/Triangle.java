package shape;


public class Triangle{
	private double side1;
	private double side2;
	private double side3;
	private double height;
	
	public Triangle(double side1,double side2,double side3, double height) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.height = height;
	}
	public double getPerimeter() {
		return this.side1+this.side2+this.side3;
	}
	public double getArea() {
		return 0.5*this.height*this.side3;
	}
}
