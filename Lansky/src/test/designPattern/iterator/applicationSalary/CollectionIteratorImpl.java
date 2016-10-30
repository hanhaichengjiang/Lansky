package test.designPattern.iterator.applicationSalary;

public class CollectionIteratorImpl implements Iterator{
	int index = -1;
	MainSalaryManager mainSalaryMananger = null;
	public CollectionIteratorImpl(MainSalaryManager mainSalaryMananger) {
		this.mainSalaryMananger = mainSalaryMananger;
	}
	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if (index < mainSalaryMananger.getSize()) {
			index++;
		}
	}

	@Override
	public boolean isDone() {
		return index == mainSalaryMananger.getSize() ? true : false;
	}

	@Override
	public Object currentItem() {
		Salary salary = null;
		if (index < mainSalaryMananger.getSize()) {
			salary = mainSalaryMananger.getSalary(index);
		}
		return salary;
	}

}
