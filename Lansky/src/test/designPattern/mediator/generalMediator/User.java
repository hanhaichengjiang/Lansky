package test.designPattern.mediator.generalMediator;

import org.junit.Test;

public class User {
	private String userId;
	private String name;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//delete a user
	public boolean deleteUser() {
		DeptUserMediator mediator = DeptUserMediator.INSTANCE;
		return mediator.dimission(this);
	}
}
