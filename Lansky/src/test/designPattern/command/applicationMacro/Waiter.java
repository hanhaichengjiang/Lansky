package test.designPattern.command.applicationMacro;

public class Waiter {
	MenuCommand menuCommand = new MenuCommand();
	public void orderDish(Command command) {
		if (command instanceof DuckCommand) {
			HotCooker cooker = new HotCooker();
			((DuckCommand) command).setCooker(cooker);
		} else if (command instanceof KelpCommand) {
			ColdCooker cooker = new ColdCooker();
			((KelpCommand) command).setCooker(cooker);
		} else if (command instanceof HotSoupCommand) {
			HotCooker cooker = new HotCooker();
			((HotSoupCommand) command).setCooker(cooker);
		}
		menuCommand.addCommand(command);
	}
	public void orderOver() {
		this.menuCommand.execute();
	}
}
