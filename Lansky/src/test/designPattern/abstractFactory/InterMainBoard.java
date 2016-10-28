package test.designPattern.abstractFactory;

public class InterMainBoard implements MainBoardApi {

	private int feetNum = 177;

	public void cluster() {
		System.out.println("InterMainBoard can cluster and number of feet is " + feetNum);
	}

}
