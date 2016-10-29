package test.designPattern.command.applicationInUndo;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	private Command plusCommand = null;
	private Command substractCommand = null;
	private List<Command> undoCommandList = new ArrayList<Command>();
	private List<Command> redoCommandList = new ArrayList<Command>();
	public void setPlusCommand(Command plusCommand) {
		this.plusCommand = plusCommand;
	}
	public void setSubstractCommand(Command substractCommand) {
		this.substractCommand = substractCommand;
	}
	public void pressAddButton() {
		this.plusCommand.execute();
		undoCommandList.add(this.plusCommand);
	}
	public void pressSubstractButton() {
		this.substractCommand.execute();
		undoCommandList.add(this.substractCommand);
	}
	public void undo() {
		int commandCount = undoCommandList.size();
		if (commandCount > 0) {
			Command command = undoCommandList.get(commandCount - 1);
			command.undo();
			redoCommandList.add(command);
			undoCommandList.remove(command);
		} else {
			System.out.println("没有可以撤销的操作");
		}
	}
	public void redo() {
		int commandCount = redoCommandList.size();
		if (commandCount > 0) {
			Command command = redoCommandList.get(commandCount - 1);
			command.execute();
			redoCommandList.remove(command);
			redoCommandList.add(command);
		} else {
			System.out.println("没有可以恢复的操作");
		}
	}
}
