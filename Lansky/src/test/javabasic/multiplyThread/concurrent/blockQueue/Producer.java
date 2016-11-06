package test.javabasic.multiplyThread.concurrent.blockQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	BlockingQueue<Message> queue = null;
	public Producer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		try {
			Message e1 = new Message();
			e1.setContent("content1");
			e1.setFooter("footer1");
			e1.setHeader("header1");
			queue.put(e1);
			System.out.println("1=============");
			//Thread.sleep(500);
			Message e2 = new Message();
			e2.setContent("content2");
			e2.setFooter("footer2");
			e2.setHeader("header2");
			queue.put(e2);
			System.out.println("2=============");
			//Thread.sleep(500);
			Message e3 = new Message();
			e3.setContent("content3");
			e3.setFooter("footer3");
			e3.setHeader("header3");
			queue.put(e3);
			System.out.println("3=============");
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}
