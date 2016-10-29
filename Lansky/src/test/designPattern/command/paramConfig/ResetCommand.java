package test.designPattern.command.paramConfig;

public class ResetCommand implements Command {
	private Mainboard mainboard;
	public ResetCommand(Mainboard mainboard) {
		this.mainboard = mainboard;
	}
	@Override
	public void execute() {
		this.mainboard.resetSystem();
	}

}
