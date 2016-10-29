package test.designPattern.command.paramConfig;

/** 
 * @ClassName: Client 
 * @Description: 命令模式（参数化）-- 在这里还看不出这种模式有什么作用
 * @author Lansky
 * @date 2016年10月29日 下午5:21:33 
 *  
 */
public class Client {
	public static void main(String[] args) {
		IntelMainboard intelMainboard = new IntelMainboard();
		OpenCommand openCommand = new OpenCommand(intelMainboard);
		Box box = new Box();
		box.setOpenCommand(openCommand);
		
		SamsungMainboard sb = new SamsungMainboard();
		ResetCommand resetCommand = new ResetCommand(sb);
		box.setResetCommand(resetCommand);
		
		box.pressOpenButton();
		box.pressResetButton();
	}
}
