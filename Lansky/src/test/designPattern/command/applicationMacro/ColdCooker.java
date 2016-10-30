package test.designPattern.command.applicationMacro;

public class ColdCooker implements CookerApi {

	@Override
	public void cook(String dishName) {
		System.out.println("冻凉菜的师傅正在做：" + dishName);
	}

}
