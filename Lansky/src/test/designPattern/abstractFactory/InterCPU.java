package test.designPattern.abstractFactory;

public class InterCPU implements CPUApi {

	private int feetNum = 177;
	public void calc() {
		System.out.println("InterCPU cpu can calculate and number of feet is " + feetNum);
	}

}
