package test.designPattern.mediator.commonMediator;

public class Client {
	public static void main(String[] args) {
		MainBoard mainBoard = new MainBoard();
		CPU cpu = new CPU(mainBoard);
		CDDriver cdDriver = new CDDriver(mainBoard);
		VideoCard videoCard = new VideoCard(mainBoard);
		AudioCard audioCard = new AudioCard(mainBoard);
		
		mainBoard.setAudioCard(audioCard);
		mainBoard.setCdDriver(cdDriver);
		mainBoard.setCpu(cpu);
		mainBoard.setVideoCard(videoCard);
		
		cdDriver.readCD();
	}
}
