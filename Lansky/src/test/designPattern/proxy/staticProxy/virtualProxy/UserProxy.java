package test.designPattern.proxy.staticProxy.virtualProxy;

public class UserProxy implements UserInterface{
	
	private User realUserObj = null;
	
	private boolean isLoad = false;
	
	public UserProxy(User user) {
		this.realUserObj = user;
	}
	
	//从数据库中查出全部字段
	private User reload() {
		return getAllColumnsFromDB(this);
	}

	private User getAllColumnsFromDB(UserInterface u) {
		User user = new User();
		user.setAddress("New York");
		user.setJob("programer");
		user.setSex("Male");
		user.setDeptId(u.getDeptId());
		user.setName(u.getName());
		user.setUserId(u.getUserId());
		isLoad = true;
		
		System.out.println("execute reload...");
		return user;
	}

	@Override
	public String getUserId() {
		return realUserObj.getUserId();
	}

	@Override
	public void setUserId(String userId) {
		realUserObj.setUserId(userId);
	}

	@Override
	public String getName() {
		return realUserObj.getName();
	}

	@Override
	public void setName(String name) {
		realUserObj.setName(name);
	}

	@Override
	public String getSex() {
		if (!isLoad) {
			realUserObj = reload();
		}
		return realUserObj.getSex();
	}

	@Override
	public void setSex(String sex) {
		realUserObj.setSex(sex);
	}

	@Override
	public String getAddress() {
		if (!isLoad) {
			realUserObj = reload();
		}
		return realUserObj.getAddress();
	}

	@Override
	public void setAddress(String address) {
		realUserObj.setAddress(address);
	}

	@Override
	public String getJob() {
		if (!isLoad) {
			realUserObj = reload();
		}
		return realUserObj.getJob();
	}

	@Override
	public void setJob(String job) {
		realUserObj.setJob(job);
	}

	@Override
	public String getDeptId() {
		return realUserObj.getDeptId();
	}

	@Override
	public void setDeptId(String deptId) {
		realUserObj.setDeptId(deptId);
	}

}
