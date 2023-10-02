package Threading;

public class Thread2 extends Thread {

	@Override
	public synchronized void run() {
		
		try {
            for (int i = 10; i <= 15; i++) {
                System.out.println(this.getName()+" "+i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException occur");
        }
	}
	
}
