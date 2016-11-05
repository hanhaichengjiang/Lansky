package test.javabasic.multiplyThread.impl1;

public class Client {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1("A");
		Thread1 thread2 = new Thread1("B");
		
		thread1.start();
		thread2.start();
	}
}
