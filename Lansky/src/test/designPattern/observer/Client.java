package test.designPattern.observer;

public class Client {
	public static void main(String[] args) {
		Reader reader1 = new Reader();
		reader1.setName("Lansky1");
		
		Reader reader2 = new Reader();
		reader2.setName("Lansky2");
		
		Reader reader3 = new Reader();
		reader3.setName("Lansky3");
		NewsPaper paper = new NewsPaper();
		paper.addReader(reader1);
		paper.addReader(reader2);
		paper.addReader(reader3);
		
		paper.setContent("设置新闻内容，相当于报社出版新报纸，看看是否有通知预订的读者呢。");
	}
}
