package test.designPattern.mediator.commonMediator;

public class CPU extends Colleague {
	
	private String videoData;
	private String audioData;

	public CPU(Mediator mediator) {
		super(mediator);
	}
	
	public void executeCPU(String data) {
		if (data != null) {
			String[] dataArray = data.split(",");
			videoData = dataArray[0];
			audioData = dataArray[1];
		}
		this.mediator.changed(this);
	}

	public String getVideoData() {
		return this.videoData;
	}
	
	public String getAudioData() {
		return this.audioData;
	}
}
