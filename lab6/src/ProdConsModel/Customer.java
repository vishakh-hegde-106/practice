package ProdConsModel;

public class Customer implements Runnable{
	Food food;
	public Customer(Food f) {
		this.food = f;
	}
	@Override
	public void run()
	{
		try {
			food.consume();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
