package test.designPattern.observer.practical;

public class WaterQuality extends WaterQualitySubject {

	private int polluteLevel;
	@Override
	public int getPolluteLevel() {
		return this.polluteLevel;
	}

	@Override
	public void notifyWatcher() {
		for (WatcherObserver observer : this.list) {
			if (this.getPolluteLevel() >= 0) {
				if (observer.getJob().equals("Lansky-Job-1")) {
					observer.update(this);
				}
			}
			if (this.getPolluteLevel() >= 1) {
				if (observer.getJob().equals("Lansky-Job-2")) {
					observer.update(this);
				}
			}
			if (this.getPolluteLevel() >= 2) {
				if (observer.getJob().equals("Lansky-Job-3")) {
					observer.update(this);
				}
			}
		}
	}
	
	public void setPolluteLevel(int polluteLevel) {
		this.polluteLevel = polluteLevel;
		notifyWatcher();
	}

}
