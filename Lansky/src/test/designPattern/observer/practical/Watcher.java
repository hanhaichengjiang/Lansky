package test.designPattern.observer.practical;

public class Watcher implements WatcherObserver {
	
	private String job;

	@Override
	public void update(WaterQualitySubject subject) {
		int pollutionLevel = subject.getPolluteLevel();
		System.out.println("污染指数为：" + pollutionLevel + ", 已经通知job为：" + this.getJob());
	}

	@Override
	public String getJob() {
		return this.job;
	}

	@Override
	public void setJob(String job) {
		this.job = job;
	}

}
