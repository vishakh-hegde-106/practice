package abstruction;

public class LaserJet extends Printer{

	public LaserJet(String ink) {
		super(ink);
	}

	@Override
	void configuration() {

		System.out.println("Configuration of Laser Jet Printer");
	}

	@Override
	void display() {
		System.out.println("Display of Laser Jet Printer");
	}

	

}
