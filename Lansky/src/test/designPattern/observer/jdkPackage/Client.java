package test.designPattern.observer.jdkPackage;

/** 
 * @ClassName: Client 
 * @Description: 利用java jdk自带的观察者类
 * 					Subject具体对象去继承java.util.Obserable类
 * 					观察者类则实现java.util.Observer接口
 * @author Nick
 * @date 2016年10月29日 上午10:07:31 
 *  
 */
public class Client {
	public static void main(String[] args) {
		Reader reader1 = new Reader();
		reader1.setName("Lansky-1");
		
		Reader reader2 = new Reader();
		reader2.setName("Lansky-2");
		
		Reader reader3 = new Reader();
		reader3.setName("Lansky-3");
		
		NewsPaper newsPaper = new NewsPaper();
		newsPaper.addObserver(reader1);
		newsPaper.addObserver(reader2);
		newsPaper.addObserver(reader3);
		
		newsPaper.setConetent("设置新闻内容，相当于报社出版新报纸，看看是否有通知预订的读者呢。");
	}
}
