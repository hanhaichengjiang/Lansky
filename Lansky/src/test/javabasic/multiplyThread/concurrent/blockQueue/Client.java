package test.javabasic.multiplyThread.concurrent.blockQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Client {
	public static void main(String[] args) {
		ArrayBlockingQueue<Message> queue = new ArrayBlockingQueue<>(2);
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		new Thread(producer).start();
		new Thread(consumer).start();
	}
}
