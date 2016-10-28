package test.designPattern.paramFactoryMethod;

import test.designPattern.simpleFactory.Product1;
import test.designPattern.simpleFactory.Product2;
import test.designPattern.simpleFactory.ProductApi;

public abstract class ParamFactoryMethod2 {
	public ProductApi factoryMethod(int type) {
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
	
	public void productAction(int type) {
		factoryMethod(type).method();
	}
}
