package test.designPattern.observer.push;

public class NewsPaper extends Subject {
	private String content;
	public void setContent(String data) {
		this.content = data;
		this.notifyReader(content);
	}
	public String getContent() {
		return this.content;
	}
}
