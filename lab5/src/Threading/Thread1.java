package Threading;

public class Thread1 extends Thread{
	@Override
	public synchronized void run() {
		
		try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(this.getName()+" "+i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException occur");
        }
	}
}
