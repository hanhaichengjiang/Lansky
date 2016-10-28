package test.designPattern.factoryMethod;

public class Client {
	public static void main(String[] args) {
		FactoryMethodOperator operator = new Product2Operator();
		operator.productAction();
	}
}
