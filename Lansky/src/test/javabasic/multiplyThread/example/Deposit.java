package test.javabasic.multiplyThread.example;

public class Deposit implements Runnable{
	private Account account;
	private String threadName;
	private double depositAmount;
	public Deposit(String threadName, Account account, double depositAmount) {
		this.threadName = threadName;
		this.account = account;
		this.depositAmount = depositAmount;
	}
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			account.deposit(this.depositAmount);
			System.out.println(threadName+"---successful");
		}
	}

}
