package test.designPattern.iterator.basic;

/** 
 * @ClassName: Iterator 
 * @Description: 迭代器接口
 * @author Lansky
 * @date 2016年10月30日 下午3:52:16 
 *  
 */
public interface Iterator {
	public void first();
	
	public void next();
	
	public boolean isDone();
	
	public Object currentItem();
}
