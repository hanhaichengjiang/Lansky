package test.designPattern.simpleFactory;

public class Client {
	public static void main(String[] args) {
		ProductApi product = SimpleFactory.factoryMethod(2);
		product.method();
	}
}
