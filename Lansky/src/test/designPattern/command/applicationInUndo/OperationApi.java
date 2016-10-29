package test.designPattern.command.applicationInUndo;

public interface OperationApi {
	public void executePlus(int addend);
	public void executeSubstract(int subtrahend);
	public int getResult();
	public void setResult(int num);
}
