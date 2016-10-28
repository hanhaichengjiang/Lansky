package test.designPattern.mediator.commonMediator;

public abstract class Colleague {
	Mediator mediator;
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	public Mediator getMedaitor() {
		return this.mediator;
	}
}
