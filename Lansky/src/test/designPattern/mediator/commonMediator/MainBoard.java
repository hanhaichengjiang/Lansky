package test.designPattern.mediator.commonMediator;

public class MainBoard implements Mediator {
	
	public native int hashCode();
	
	private CDDriver cdDriver;
	
	private CPU cpu;
	
	private AudioCard audioCard;
	
	private VideoCard videoCard;

	public void changed(Colleague colleague) {
		if (colleague == cdDriver) {
			this.openCDDriverReadData((CDDriver)colleague);
		} else if (colleague == cpu) {
			this.openCPUProcessData((CPU)colleague);
		}
	}

	
	private void openCPUProcessData(CPU c) {
		String audioData = c.getAudioData();
		String videoData = c.getVideoData();
		this.videoCard.showVideoData(videoData);
		this.audioCard.showAudioData(audioData);
	}


	private void openCDDriverReadData(CDDriver driver) {
		String data = driver.getData();
		this.getCpu().executeCPU(data);
	}


	public CDDriver getCdDriver() {
		return cdDriver;
	}

	public void setCdDriver(CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public AudioCard getAudioCard() {
		return audioCard;
	}

	public void setAudioCard(AudioCard audioCard) {
		this.audioCard = audioCard;
	}

	public VideoCard getVideoCard() {
		return videoCard;
	}

	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}


}
