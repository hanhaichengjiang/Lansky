package test.designPattern.abstractFactory;

public class SunaryCPU implements CPUApi {

	private int feetNum = 155;
	public void calc() {
		System.out.println("sunary cpu can calculate and number of feet is " + feetNum);
	}
	
}
