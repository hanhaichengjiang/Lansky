package test.designPattern.observer.pull;

import java.util.ArrayList;
import java.util.List;

/** 
 * @ClassName: Subject 
 * @Description: 场景：报社出版，订阅者阅读最新报纸。
 * 				  报纸一旦更新，如何马上通知所有的报纸订阅者。
 * 				 Subject(目标对象) -- 作为被观察者，即 报社
 * 				 Observer(观察者) -- 订阅报纸的读者
 * @author Lansky
 * @date 2016年10月28日 下午8:16:17 
 *  
 */
public class Subject {
	private List<Observer> readerList = new ArrayList<Observer>();
	public void addReader(Observer reader){
		readerList.add(reader);
	}
	public void deleteReader(Observer reader) {
		readerList.remove(reader);
	}
	public void notifyReader() {
		for (Observer reader : readerList) {
			reader.update(this);
		}
	}
}
