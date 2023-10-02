package ProdConsModel;

public class Chef implements Runnable{
	Food food;
	public Chef(Food f) {
		this.food = f;
	}
	@Override
	public void run() {
		try {
			food.produce();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
