package test.designPattern.command.applicationInUndo;

public class SubstractCommand implements Command {

	OperationApi operation = null;
	int subtrahend;
	SubstractCommand(OperationApi operation, int subtrahend) {
		this.operation = operation;
		this.subtrahend = subtrahend;
	}
	@Override
	public void execute() {
		this.operation.executeSubstract(this.subtrahend);
	}

	@Override
	public void undo() {
		this.operation.executePlus(this.subtrahend);
	}
	@Override
	public void redo() {
		this.execute();
	}

}
