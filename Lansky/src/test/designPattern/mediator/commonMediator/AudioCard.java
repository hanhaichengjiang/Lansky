package test.designPattern.mediator.commonMediator;

public class AudioCard extends Colleague {

	public AudioCard(Mediator mediator) {
		super(mediator);
	}
	
	public void showAudioData(String data) {
		System.out.println("������Ƶ��ݣ�" + data);
	}

}
