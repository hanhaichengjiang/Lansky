package test.javabasic.multiplyThread.impl2;

public class Client {
	public static void main(String[] args) {
		new Thread(new Thread2("B")).start();
		new Thread(new Thread2("C")).start();
		new Thread(new Thread2("D")).start();
	}
}
