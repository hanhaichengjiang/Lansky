package test.designPattern.singleton;

/** 
* @ClassName: Singleton 
* @Description: 使用类加载线程安全的性质
* @author Nick
* @date 2016年8月8日 下午5:01:46 
*  
*/
public class Singleton {
	private static class SingletonHolder {
		private static Singleton singletonObj = new Singleton();
	}
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return SingletonHolder.singletonObj;
	}
}
