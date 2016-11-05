package test.javabasic.multiplyThread.impl1;

public class Thread1 extends Thread{
	 private String threadName;
	 Thread1(String threadName) {
         this.threadName = threadName;
     }

     public void run() {
         for (int i = 0; i < 5; i++) {
        	 System.out.println(threadName + "线程执行：" + i);
         }
     }

}
