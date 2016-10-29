package test.designPattern.command.paramConfig;

public class Box {
	private OpenCommand openCommand;
	private ResetCommand resetCommand;
	public void setOpenCommand(OpenCommand openCommand) {
		this.openCommand = openCommand;
	}
	public void setResetCommand(ResetCommand resetCommand) {
		this.resetCommand = resetCommand;
	}
	public void pressOpenButton() {
		this.openCommand.execute();
	}
	public void pressResetButton() {
		this.resetCommand.execute();
	}
}
