package test.designPattern.factoryMethod;

import test.designPattern.simpleFactory.ProductApi;

public abstract class FactoryMethodOperator {
	protected abstract ProductApi factoryMehtod();
	public void productAction() {
		factoryMehtod().method();
	}
}
