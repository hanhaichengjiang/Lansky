package test.designPattern.command.applicationMacro;

/** 
 * @ClassName: DuckCommand 
 * @Description: 北京烤鸭(属于热菜)
 * @author Lansky
 * @date 2016年10月30日 上午8:34:07 
 *  
 */
public class DuckCommand implements Command {
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
