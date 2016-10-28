package test.designPattern.factoryMethod;

import test.designPattern.simpleFactory.Product1;
import test.designPattern.simpleFactory.ProductApi;

public class Product1Operator extends FactoryMethodOperator {

	@Override
	public ProductApi factoryMehtod() {
		return new Product1();
	}

}
