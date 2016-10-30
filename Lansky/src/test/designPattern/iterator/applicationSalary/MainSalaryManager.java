package test.designPattern.iterator.applicationSalary;

import java.util.ArrayList;
import java.util.List;

public class MainSalaryManager extends Aggregate{
	List<Salary> list = new ArrayList<Salary>();
	public List<Salary> getList() {
		return list;
	}
	public void addSalary(Salary salary) {
		list.add(salary);
	}
	public int getSize() {
		return list.size();
	}
	public Salary getSalary(int index) {
		return list.get(index);
	}
	
	public void calc() {
		for (int i = 0; i < 10; i++) {
			Salary salary = new Salary();
			salary.setName("Lansky-main" + i);
			salary.setSalary(Math.random() * 10000);
			addSalary(salary);
		}
	}
	@Override
	public Iterator createIterator() {
		return new CollectionIteratorImpl(this);
	}
}
