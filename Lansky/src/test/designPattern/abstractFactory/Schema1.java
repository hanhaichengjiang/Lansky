package test.designPattern.abstractFactory;

public class Schema1 implements CreatorAbstractFactory {

	public Object creator(int type) {
		if (type == 1) {
			return new InterCPU();
		} else if (type == 2) {
			return new InterMainBoard();
		} 
		return null;
	}

}
