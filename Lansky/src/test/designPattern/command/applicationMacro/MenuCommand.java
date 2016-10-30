package test.designPattern.command.applicationMacro;

import java.util.ArrayList;
import java.util.List;

public class MenuCommand implements Command {

	List<Command> commandList = new ArrayList<Command>();
	@Override
	public void execute() {
		for (Command command : commandList) {
			command.execute();
		}
	}
	public void addCommand(Command command) {
		commandList.add(command);
	}
	public void removeCommand(Command command) {
		commandList.remove(command);
	}
}
