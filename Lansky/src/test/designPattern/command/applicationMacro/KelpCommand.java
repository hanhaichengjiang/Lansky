package test.designPattern.command.applicationMacro;

/** 
 * @ClassName: KelpCommand 
 * @Description: 海带凉拌(属于凉菜)
 * @author Lansky
 * @date 2016年10月30日 上午8:33:42 
 *  
 */
public class KelpCommand implements Command {
	CookerApi cooker = null;
	String dishName = "";
	@Override
	public void execute() {
		this.cooker.cook(dishName);
	}

	public void setCooker(CookerApi cooker) {
		this.cooker = cooker;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

}
