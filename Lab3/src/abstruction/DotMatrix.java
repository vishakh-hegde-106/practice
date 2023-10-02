package abstruction;

public class DotMatrix extends Printer{
	public DotMatrix(String ink) {
		super(ink);
	}

	@Override
	void configuration() {
		System.out.println("Configuration of Dot Martrix Printer with "+this.ink);
	}

	@Override
	void display() {
		System.out.println("Display of Dot Matrix Printer");
	}

	
}
