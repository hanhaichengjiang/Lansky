package test.javabasic.multiplyThread.example;

public class Client {
	public static void main(String[] args) {
		Account account = new Account("tttyyy", 329);
		Thread depositThread = new Thread(new Deposit("depositThread", account, 23));
		Thread depositThread2 = new Thread(new Deposit("depositThread2", account, 23));
		Thread depositThread3 = new Thread(new Deposit("depositThread3", account, 23));
		Thread depositThread4 = new Thread(new Deposit("depositThread4", account, 23));
		Thread drawThread = new Thread(new Draw("drawThread", account, 23));
		Thread drawThread2 = new Thread(new Draw("drawThread2", account, 23));
		Thread drawThread3 = new Thread(new Draw("drawThread3", account, 23));
		Thread drawThread4 = new Thread(new Draw("drawThread4", account, 23));
		depositThread.start();
		depositThread2.start();
		depositThread3.start();
		depositThread4.start();
		drawThread.start();
		drawThread2.start();
		drawThread3.start();
		drawThread4.start();
	}
}
