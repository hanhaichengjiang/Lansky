package test.javabasic.multiplyThread.example;

public class Client {
	public static void main(String[] args) {
		Account account = new Account("tttyyy", 329);
		Thread depositThread = new Thread(new Deposit("depositThread", account, 23));
		Thread drawThread = new Thread(new Draw("drawThread", account, 23));
		depositThread.start();
		drawThread.start();
	}
}
