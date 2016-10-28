package test.designPattern.observer;

public class NewsPaper extends Subject {
	private String content;
	public void setContent(String data) {
		this.content = data;
		this.notifyReader();
	}
	public String getContent() {
		return this.content;
	}
}
