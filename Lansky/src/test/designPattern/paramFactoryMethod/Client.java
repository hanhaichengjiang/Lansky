package test.designPattern.paramFactoryMethod;

public class Client {
	public static void main(String[] args) {
		//参数工厂方法1
		ParamFactoryMethod1 factory = new ParamFactoryMethod1();
		factory.productAction(2);
		
		//参数工厂方法2
		ParamFactoryMethod2 operator = new ProductOperator3();
		operator.productAction(3);
	}
}
