package test.designPattern.observer.jdkPackage;

import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer {
	private String name;

	//两个参数，一个是pull方式传过来的对象，另一个是push方式推送过来的参数
	@Override
	public void update(Observable pull_obj, Object push_argument) {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + "---接到报纸更新通知，内容为： " + push_argument);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
