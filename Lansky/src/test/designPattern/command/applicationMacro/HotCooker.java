package test.designPattern.command.applicationMacro;

public class HotCooker implements CookerApi {

	@Override
	public void cook(String dishName) {
		System.out.println("烧菜师傅正在烧：" + dishName);
	}

}
