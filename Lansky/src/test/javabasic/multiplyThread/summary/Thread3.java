package test.javabasic.multiplyThread.summary;

public class Thread3 implements Runnable{
	private double d = 1.1;
	@Override
	public void run() {
		try {
			while(!Thread.interrupted()) {
				System.out.println("I am running!");
				Thread.sleep(100);
				System.out.println("Calculating");
				for (int i = 0; i < 9000000; i++) {
					d = (Math.PI + Math.E) / d;
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Exiting by Exception");
		}
		System.out.println("Thread3.run() interrupted!");
	}

}
