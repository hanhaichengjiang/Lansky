package test.designPattern.observer.practical;

import java.util.ArrayList;
import java.util.List;

public abstract class WaterQualitySubject {
	public abstract int getPolluteLevel();
	public abstract void notifyWatcher();
	List<WatcherObserver> list = new ArrayList<WatcherObserver>();
	public void addObserver(WatcherObserver observer) {
		list.add(observer);
	}
	public void deleteObserver(WatcherObserver observe) {
		list.remove(observe);
	}
}
