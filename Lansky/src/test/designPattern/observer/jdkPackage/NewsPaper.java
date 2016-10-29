package test.designPattern.observer.jdkPackage;

import java.util.Observable;

public class NewsPaper extends Observable{
	private String conetent;

	public String getContent() {
		return conetent;
	}

	public void setConetent(String conetent) {
		this.conetent = conetent;
		//此方法是必须调用
		this.setChanged();
		//默认是拉方式
		//this.notifyObservers();
		
		//这里使用推方式
		this.notifyObservers(this.getContent());
	}
}
