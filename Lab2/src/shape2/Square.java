package shape2;

public class Square {
	private double side;
	public Square(double side) {
		this.side = side;
	}
	public double getPermiter() {
		return this.side*4;
	}
	public double getArea() {
		return this.side*this.side;
	}
}
