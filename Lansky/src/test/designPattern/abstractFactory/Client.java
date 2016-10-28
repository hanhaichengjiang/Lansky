package test.designPattern.abstractFactory;

public class Client {
	public static void main(String[] args) {
		CreatorAbstractFactory schema1 = new Schema1();
		new ComputerEngineer(schema1).testHardward();
		
		CreatorAbstractFactory schema2 = new Schema2();
		new ComputerEngineer(schema2).testHardward();
	}
}
