package test.designPattern.iterator.applicationSalary;

public class ArrayIteratorImpl implements Iterator{
	private int index = -1;
	SubSalaryManager subSalaryManager = null;
	public ArrayIteratorImpl(SubSalaryManager subSalaryManager) {
		this.subSalaryManager = subSalaryManager;
	}
	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if (index < subSalaryManager.getSize()) {
			index++;
		}
	}

	@Override
	public boolean isDone() {
		return index == subSalaryManager.getSize() ? true : false;
	}

	@Override
	public Object currentItem() {
		Salary salary = null;
		if (index < subSalaryManager.getSize()) {
			salary = subSalaryManager.getSalary(index);
		}
		return salary;
	}

}
