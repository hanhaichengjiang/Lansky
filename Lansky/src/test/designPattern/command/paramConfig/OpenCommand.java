package test.designPattern.command.paramConfig;

public class OpenCommand implements Command {
	private Mainboard mainboard;

	public OpenCommand(Mainboard mainboard) {
		this.mainboard = mainboard;
	}
	@Override
	public void execute() {
		this.mainboard.launchSystem();
	}

}
