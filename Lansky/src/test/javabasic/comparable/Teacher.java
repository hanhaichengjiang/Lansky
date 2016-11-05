package test.javabasic.comparable;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeSet;

import javax.xml.bind.SchemaOutputResolver;

import org.junit.Test;

public class Teacher implements Comparator<Teacher>{
	private String name;
	private String sex;
	private int age;
	
	@Test
	public void test() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(null, 22);
		System.out.println(map.get(null));
		HashSet set = new HashSet();
		set.add(null);
		TreeSet tSet = new TreeSet();
	}
	 
	@Override
	public int compare(Teacher tFirst, Teacher tLast) {
		int tFirstAge = tFirst.getAge();
		int tLastAge = tLast.getAge();
		if (tFirstAge > tLastAge) {
			return 1;
		} else if (tFirstAge == tLastAge) {
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
