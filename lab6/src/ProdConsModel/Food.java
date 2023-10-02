package ProdConsModel;

import java.util.LinkedList;

public class Food {

	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 1;

	// Function called by producer thread
	public synchronized void produce() throws InterruptedException
	{
		int value = 0;
		while (true) {
			
			while (list.size() == capacity) {
				wait();
			}
			System.out.println("Chef produced-"+ value);

			list.add(value++);
		
			notify();
			
			Thread.sleep(1000);
		}
	}

	// Function called by consumer thread
	public synchronized void consume() throws InterruptedException
	{
		while (true) {
			
			
			while (list.size() == 0)
				wait();

			int val = list.removeFirst();

			System.out.println("Customer consumed-"+ val);

			notify();

			Thread.sleep(1000);
			
		}
	}
}
