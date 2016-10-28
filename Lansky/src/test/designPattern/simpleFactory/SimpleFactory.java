package test.designPattern.simpleFactory;

public class SimpleFactory {
	public static ProductApi factoryMethod(int type) {
		switch (type) {
		case 1: {
			return new Product1();
		}
		case 2: {
			return new Product2();
		}
		default: {
			return null;
		}
		}
	}
}
