package test.designPattern.iterator.applicationSalary;

public class SubSalaryManager extends Aggregate{
	Salary[] salaryArray = new Salary[10];
	
	public Salary[] getSalarys() {
		return salaryArray;
	}
	@Override
	public Iterator createIterator() {
		return new ArrayIteratorImpl(this);
	}
	public int getSize() {
		return salaryArray.length;
	}
	public Salary getSalary(int index) {
		return salaryArray[index];
	}
	
	public void calc() {
		for (int i = 0; i < 10; i++) {
			Salary salary = new Salary();
			salary.setName("Lansky-sub" + i);
			salary.setSalary(Math.random() * 10000);
			salaryArray[i] = salary;
		}
	}
}
