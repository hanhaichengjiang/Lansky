package test.designPattern.abstractFactory;

public class SunxingMainBoard implements MainBoardApi {
	private int feetNum = 155;

	public void cluster() {
		System.out.println("sun xing mainboard can cluster and number of feet is " + feetNum);
	}

}
