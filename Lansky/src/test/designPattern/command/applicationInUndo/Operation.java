package test.designPattern.command.applicationInUndo;

public class Operation implements OperationApi{
	private int result;
	public void executePlus(int addend) {
		this.result += addend;
	}
	public void executeSubstract(int subtrahend) {
		this.result -= subtrahend;
	}
	public int getResult(){
		return this.result;
	}
	public void setResult(int num) {
		this.result = num;
	}
}
