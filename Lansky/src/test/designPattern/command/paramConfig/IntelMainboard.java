package test.designPattern.command.paramConfig;

public class IntelMainboard implements Mainboard {

	@Override
	public void launchSystem() {
		System.out.println("Intel 主板引导系统启动");
	}

	@Override
	public void resetSystem() {
		System.out.println("Intel 主板引导系统重启");
	}

}
