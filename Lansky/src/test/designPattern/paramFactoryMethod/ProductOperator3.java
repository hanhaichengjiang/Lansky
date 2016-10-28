package test.designPattern.paramFactoryMethod;

import test.designPattern.simpleFactory.ProductApi;

public class ProductOperator3 extends ParamFactoryMethod2 {
	public ProductApi factoryMethod(int type) {
		return type == 3 ? new Product3() : super.factoryMethod(type);
	}
}
