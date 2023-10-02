package abstruction;

public abstract class Printer {
	protected String ink;
	public Printer(String ink) {
		System.out.println("Printer Constructor");
		this.ink = ink;
	}
	abstract void configuration();
	abstract void display();
}
