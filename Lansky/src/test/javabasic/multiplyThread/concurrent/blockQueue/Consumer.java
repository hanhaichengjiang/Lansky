package test.javabasic.multiplyThread.concurrent.blockQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	BlockingQueue<Message> queue = null;
	public Consumer(BlockingQueue<Message> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(500);
			Message e = queue.take();
			System.out.println(e.getHeader());
			System.out.println(e.getContent());
			System.out.println(e.getFooter());
			
			e = queue.take();
			System.out.println(e.getHeader());
			System.out.println(e.getContent());
			System.out.println(e.getFooter());
			
			e = queue.take();
			System.out.println(e.getHeader());
			System.out.println(e.getContent());
			System.out.println(e.getFooter());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
