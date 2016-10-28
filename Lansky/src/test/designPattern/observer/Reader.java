package test.designPattern.observer;

public class Reader implements Observer {

	private String name;
	
	@Override
	public void update(Subject subject) {
		System.out.println(this.getName() + "收到报纸，报纸内容：" + ((NewsPaper)subject).getContent());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
