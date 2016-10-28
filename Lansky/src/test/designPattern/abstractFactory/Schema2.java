package test.designPattern.abstractFactory;

public class Schema2 implements CreatorAbstractFactory {

	public Object creator(int type) {
		if (type == 1) {
			return new SunaryCPU();
		} else if (type == 2) {
			return new SunxingMainBoard();
		} 
		return null;
	}

}
