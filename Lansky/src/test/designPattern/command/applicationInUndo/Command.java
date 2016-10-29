package test.designPattern.command.applicationInUndo;

public interface Command {
	public void execute();
	public void undo();
	public void redo();
}
