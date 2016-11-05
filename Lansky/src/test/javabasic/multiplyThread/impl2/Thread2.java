package test.javabasic.multiplyThread.impl2;

public class Thread2 implements Runnable{
	private String threadName;
	public Thread2(String threadName) {
		this.threadName = threadName;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(this.threadName + "线程执行：" + i);
		}
	}

}
