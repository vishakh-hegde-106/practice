package Threading;


public class Main {
	public static void main(String[] args) {
		//create state or new state
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		//running state
		thread1.start();
		
		//waiting state
		try {
			Thread.sleep(100);
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		//running state
		thread2.start();
		
		//interupting
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread1.interrupt();
		thread2.interrupt();
		
		//joining the threads with main thread
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// terminated state
		if(thread1.isAlive() && thread2.isAlive()) {
			System.out.println("thread is still alive");
		}else {
			System.out.println("threads are stopped");
		}
	}
}
