package test.javabasic.multiplyThread.example;

public class Account {
	private double blance;
	private String accountNo;
	private boolean flag = true;//true已存款， false已取款
	
	public Account(String accountNo, double blance) {
		this.accountNo = accountNo;
		this.blance = blance;
	}
	
	public double getBlance() {
		return blance;
	}
	public void setBlance(double blance) {
		this.blance = blance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public synchronized void draw(double drawAmount) {
		try {
			if (!flag) {
				this.wait();//线程等待，释放对象锁
			} else {
				System.out.println("取款成功--" + "-" + drawAmount);
				this.blance -= drawAmount;
				flag = false;
				this.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void deposit(double depositAmount) {
		try {
			if (flag) {
				this.wait();//线程等待，释放对象锁
			} else {
				System.out.println("存款成功--" + "+" + depositAmount);
				this.blance += depositAmount;
				flag = true;
				this.notify();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
