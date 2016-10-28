package test.designPattern.factoryMethod;

import test.designPattern.simpleFactory.Product2;
import test.designPattern.simpleFactory.ProductApi;

public class Product2Operator extends FactoryMethodOperator {

	@Override
	public ProductApi factoryMehtod() {
		return new Product2();
	}

}
