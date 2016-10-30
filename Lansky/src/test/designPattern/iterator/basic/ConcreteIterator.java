package test.designPattern.iterator.basic;

public class ConcreteIterator implements Iterator{

	private int index = -1;
	private ConcreteAggregate aggregate = null;
	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}
	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if (index < aggregate.size()) {
			index++;
		}
	}

	@Override
	public boolean isDone() {
		return index == aggregate.size() ? true : false;
	}

	@Override
	public Object currentItem() {
		if (index < aggregate.size()) {
			return aggregate.getElement(index);
		}
		return null;
	}

}
