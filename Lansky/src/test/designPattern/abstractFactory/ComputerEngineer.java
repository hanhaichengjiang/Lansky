package test.designPattern.abstractFactory;

public class ComputerEngineer {
	private CPUApi cpu = null;
	private MainBoardApi mainboard = null;
	CreatorAbstractFactory schema = null;
	
	ComputerEngineer(CreatorAbstractFactory schema) {
		this.schema = schema;
	}
	public void testHardward() {
		cpu = (CPUApi) schema.creator(1);
		mainboard = (MainBoardApi) schema.creator(2);
		cpu.calc();
		mainboard.cluster();
	}
}
