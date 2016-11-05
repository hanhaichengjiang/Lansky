package test.javabasic.comparable;

public class Student implements Comparable<Student>{
	private String name;
	private String sex;
	private int age;
	
	public int compareTo(Student obj) {
		int thisAge = this.getAge();
		int objAge = obj.getAge();
		if (thisAge > objAge) {
			return 1;
		} else if (thisAge == objAge) {
			return 0;
		}
		return -1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
