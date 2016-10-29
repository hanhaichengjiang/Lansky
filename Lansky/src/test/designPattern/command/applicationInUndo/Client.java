package test.designPattern.command.applicationInUndo;

/** 
 * @ClassName: Client 
 * @Description: 命令模式应用场景一：撤销/恢复操作
 * @author Lansky
 * @date 2016年10月29日 下午9:09:35 
 *  
 */
public class Client {
	public static void main(String[] args) {
		Operation operation = new Operation();
		int addend = 17;
		PlusCommand plusCommand = new PlusCommand(operation, addend);
		
		int subtrahend = 8;
		SubstractCommand substractCommand = new SubstractCommand(operation, subtrahend);
		
		Calculator cal = new Calculator();
		cal.setPlusCommand(plusCommand);
		cal.setSubstractCommand(substractCommand);
		
		cal.pressAddButton();
		System.out.println(operation.getResult());//17
		cal.pressAddButton();
		System.out.println(operation.getResult());//34
		
		cal.undo();
		System.out.println(operation.getResult());//17
		
		cal.pressAddButton();
		System.out.println(operation.getResult());//34
		cal.pressSubstractButton();
		System.out.println(operation.getResult());//26
		cal.pressAddButton();
		System.out.println(operation.getResult());//43
		cal.pressSubstractButton();
		System.out.println(operation.getResult());//35
		
		cal.redo();
		System.out.println(operation.getResult());//52
	}
}
