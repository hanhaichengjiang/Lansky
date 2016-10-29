package test.designPattern.observer.push;

public class Reader implements Observer {

	private String name;
	
	@Override
	public void update(String content) {
		System.out.println(this.getName() + "收到报纸，报纸内容：" + content);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
