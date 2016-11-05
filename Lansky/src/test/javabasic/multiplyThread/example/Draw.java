package test.javabasic.multiplyThread.example;

public class Draw implements Runnable{

	private Account account;
	private String threadName;
	private double drawAmount;
	public Draw(String threadName, Account account, double drawAmount) {
		this.threadName = threadName;
		this.account = account;
		this.drawAmount = drawAmount;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			account.draw(this.drawAmount);
			System.out.println(threadName+"---successful");
		}
	}

}
