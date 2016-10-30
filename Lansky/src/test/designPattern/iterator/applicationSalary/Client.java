package test.designPattern.iterator.applicationSalary;

public class Client {
	public void operation() {
		System.out.println("主公司系统...");
		MainSalaryManager mainSalaryManager = new MainSalaryManager();
		mainSalaryManager.calc();
		test(mainSalaryManager.createIterator());
		
		System.out.println("子公司系统...");
		SubSalaryManager subSalaryManager = new SubSalaryManager();
		subSalaryManager.calc();
		test(subSalaryManager.createIterator());
	}

	private void test(Iterator it) {
		it.first();
		while(!it.isDone()) {
			Salary salary = (Salary) it.currentItem();
			System.out.println(salary.getName() + " === " + salary.getSalary());
			it.next();
		}
	}
	public static void main(String[] args) {
		new Client().operation();
	}
}
