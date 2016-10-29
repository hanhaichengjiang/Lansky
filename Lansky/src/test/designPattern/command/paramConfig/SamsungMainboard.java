package test.designPattern.command.paramConfig;

public class SamsungMainboard implements Mainboard {

	@Override
	public void launchSystem() {
		System.out.println("三星主板引导系统启动...");
	}

	@Override
	public void resetSystem() {
		System.out.println("三星主板引导系统重启...");
	}

}
