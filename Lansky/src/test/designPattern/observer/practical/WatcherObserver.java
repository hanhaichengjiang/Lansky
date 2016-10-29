package test.designPattern.observer.practical;

public interface WatcherObserver {
	public void update(WaterQualitySubject subject);
	public String getJob();
	public void setJob(String job);
}
