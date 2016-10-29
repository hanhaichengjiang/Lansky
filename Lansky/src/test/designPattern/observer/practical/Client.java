package test.designPattern.observer.practical;

/** 
 * @ClassName: Client 
 * @Description: 这个比较实用，根据变更内容，决定通知哪一部份观察者
 * @author Lansky
 * @date 2016年10月29日 上午11:54:25 
 *  
 */
public class Client {
	public static void main(String[] args) {
		Watcher w1 = new Watcher();
		w1.setJob("Lansky-Job-1");
		
		Watcher w2 = new Watcher();
		w2.setJob("Lansky-Job-2");
		
		Watcher w3 = new Watcher();
		w3.setJob("Lansky-Job-3");
		
		WaterQuality waterQuality = new WaterQuality();
		waterQuality.addObserver(w1);
		waterQuality.addObserver(w2);
		waterQuality.addObserver(w3);
		
		waterQuality.setPolluteLevel(0);
		waterQuality.setPolluteLevel(1);
		waterQuality.setPolluteLevel(2);
	}
}
