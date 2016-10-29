package test.designPattern.command.applicationInUndo;

public class PlusCommand implements Command {
	private OperationApi operation = null;
	private int addend;
	
	public PlusCommand(OperationApi operation, int addend) {
		this.operation = operation;
		this.addend = addend;
	}
	@Override
	public void execute() {
		operation.executePlus(this.addend);
	}
	@Override
	public void undo() {
		this.operation.executeSubstract(addend);
	}
	@Override
	public void redo() {
		this.execute();
	}
	

}
