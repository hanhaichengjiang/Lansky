package test.javabasic.multiplyThread.summary;

import test.javabasic.multiplyThread.impl2.Thread2;

/** 
 * @ClassName: Client 
 * @Description: Thread class方法解释 
 * #sleep(long millis) 当前线程休眠多少毫秒，此时其他线程正常执行(放弃cpu竞争权)
 * #join() 例如：t.join()主线要等到t线程执行完之后，才继续往下执行
 * #yield() 将当前线程的cpu执行权让给其他同等priority的线程
 * #interrupt() 方法，要在线程正处于sleep中时，才回抛出InterruptedException
 * 
 * sleep(0) 让cpu重新选择优先权最高的线程执行(当前线程参与竞选)
 * 
 * @author Lansky
 * @date 2016年11月5日 上午10:04:58 
 *  
 */
public class Client {
	public static void main(String[] args) throws InterruptedException {
		//new Client().testJoinMethod();
		new Client().testInterrupt();
	}
	private void testInterrupt() throws InterruptedException {
		Thread t = new Thread(new Thread3());
		t.start();

		//运行一断时间中断线程
		Thread.sleep(100);
		System.out.println("****************************");
		System.out.println("Interrupted Thread!");
		System.out.println("****************************");
		t.interrupt();
	}
	/*join()方法测试*/
	private void testJoinMethod() {
		System.out.println("主线程开始");
		Thread t1 = new Thread(new Thread2("A"));
		Thread t2 = new Thread(new Thread2("B"));
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (Exception e) {

		}
		System.out.println("====================");
		try {
			t2.join();
		} catch (Exception e) {

		}
		System.out.println("主线程结束");
	}
}
