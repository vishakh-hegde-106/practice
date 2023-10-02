package ProdConsModel;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		
		// Object of a class that has both produce()
		// and consume() methods
		final Food food = new Food();

		// Create producer thread
		Thread t1 = new Thread(new Chef(food));

		// Create consumer thread
		Thread t2 = new Thread(new Customer(food));

		// Start both threads
		t1.start();
		t2.start();

		// t1 finishes before t2
		t1.join();
		t2.join();
	}
}