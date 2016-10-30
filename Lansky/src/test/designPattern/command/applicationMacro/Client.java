package test.designPattern.command.applicationMacro;

/** 
 * @ClassName: Client 
 * @Description: 宏指令
 * @author Lansky
 * @date 2016年10月30日 上午8:42:29 
 *  
 */
public class Client {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		DuckCommand duckCommand = new DuckCommand();
		duckCommand.setDishName("北京烤鸭");
		
		KelpCommand kelpCommand = new KelpCommand();
		kelpCommand.setDishName("海带凉拌");
		
		HotSoupCommand hotSoupCommand = new HotSoupCommand();
		hotSoupCommand.setDishName("热汤");
		
		waiter.orderDish(duckCommand);
		waiter.orderDish(kelpCommand);
		waiter.orderDish(hotSoupCommand);
		
		waiter.orderOver();
	}
}
