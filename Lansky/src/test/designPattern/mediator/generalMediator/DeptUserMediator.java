package test.designPattern.mediator.generalMediator;

import java.util.ArrayList;
import java.util.Collection;

public enum DeptUserMediator {
	INSTANCE;
	private DeptUserMediator(){
		//private construction
		initData();
	}
	
	Collection<DeptUser> duBeans = null;
	
	private void initData() {
		duBeans = new ArrayList<DeptUser>();
		DeptUser du1 = new DeptUser();
		du1.setDeptId("Tencent");
		du1.setDeptUserId("du1");
		du1.setUserId("Lansky-id-1");
		
		DeptUser du2 = new DeptUser();
		du2.setDeptId("360");
		du2.setDeptUserId("du2");
		du2.setUserId("Lansky-id-2");
		
		DeptUser du3 = new DeptUser();
		du3.setDeptId("Tencent");
		du3.setDeptUserId("du3");
		du3.setUserId("Lansky-id-3");
		
		DeptUser du4 = new DeptUser();
		du4.setDeptId("Tencent");
		du4.setDeptUserId("du4");
		du4.setUserId("Lansky-id-2");
		
		DeptUser du5 = new DeptUser();
		du5.setDeptId("360");
		du5.setDeptUserId("du5");
		du5.setUserId("Lansky-id-1");
		
		DeptUser du6 = new DeptUser();
		du6.setDeptId("360");
		du6.setDeptUserId("du6");
		du6.setUserId("Lansky-id-4");
		
		duBeans.add(du1);
		duBeans.add(du2);
		duBeans.add(du3);
		duBeans.add(du4);
		duBeans.add(du5);
		duBeans.add(du6);
		
	}
	
	public boolean deleteDept(Dept dept) {
		Collection<DeptUser> temp = new ArrayList<DeptUser>();
		if (duBeans != null) {
			for (DeptUser deptUser : duBeans) {
				if (deptUser.getDeptId().equals(dept.getDeptId())) {
					temp.add(deptUser);
				}
			}
		}
		duBeans.removeAll(temp);
		return true;
	}
	
	public boolean dimission(User user) {
		Collection<DeptUser> temp = new ArrayList<DeptUser>();
		if (duBeans != null) {
			for (DeptUser deptUser : duBeans) {
				if (deptUser.getUserId().equals(user.getUserId())) {
					temp.add(deptUser);
				}
			}
		}
		duBeans.removeAll(temp);
		return true;
	}
	
	public void showUsersAtDept(Dept dept) {
		if (duBeans != null) {
			for (DeptUser deptUser : duBeans) {
				if (deptUser.getDeptId().equals(dept.getDeptId())) {
					System.out.println("deptId--" + dept.getDeptId() + " <<<<< " + deptUser.getUserId());
				}
			}
		}
	}
	public void showDeptsOnUser(User user) {
		if (duBeans != null) {
			for (DeptUser deptUser : duBeans) {
				if (deptUser.getUserId().equals(user.getUserId())) {
					System.out.println("userId--" + user.getUserId() + " <<<<< " + deptUser.getDeptId());
				}
			}
		}
	}
}
