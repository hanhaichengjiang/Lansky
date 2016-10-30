package test.designPattern.iterator.basic;

public class ConcreteAggregate extends Aggregate{
	String[] ss = null;
	public ConcreteAggregate(String[] ss) {
		this.ss = ss;
	}
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	public Object getElement(int index) {
		Object obj = null;
		if (index < this.ss.length) {
			obj = this.ss[index];
		}
		return obj;
	}
	
	public int size() {
		return this.ss == null ? -1 : this.ss.length;
	}
}
