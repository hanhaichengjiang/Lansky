package test.designPattern.mediator.commonMediator;

public class VideoCard extends Colleague {

	public VideoCard(Mediator mediator) {
		super(mediator);
	}
	
	public void showVideoData(String data) {
		System.out.println("������Ƶ���: " + data);
	}

}
