package test.designPattern.mediator.commonMediator;

public class CDDriver extends Colleague {
	
	private String data;

	public CDDriver(Mediator mediator) {
		super(mediator);
	}

	public void readCD() {
		data = "video���, audio���";
		this.mediator.changed(this);
	}
	
	public String getData() {
		return this.data;
	}
}
