package test.designPattern.iterator.basic;

public class Client {
	public void operation() {
		String[] name = {"Lansky-1", "Lansky-2", "Lansky-3", "Lansky-4"};
		ConcreteAggregate aggregate = new ConcreteAggregate(name);
		Iterator it = aggregate.createIterator();
		
		it.first();
		while(!it.isDone()) {
			Object obj = it.currentItem();
			System.out.println(obj);
			it.next();
		}
	}
	public static void main(String[] args) {
		Client client = new Client();
		client.operation();
	}
}
