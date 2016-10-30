package test.designPattern.command.applicationMacro;

public class HotSoupCommand implements Command {
	private CookerApi cooker;
	private String dishName;
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
