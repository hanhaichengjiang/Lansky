package test.designPattern.proxy.staticProxy.virtualProxy;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
	public List<UserInterface> getUserListByDept(Dept dept) {
		//get userList by deptId from database in fact, but simplied code here for 	convenient
		UserProxy proxy1 = new UserProxy(new User());
		proxy1.setUserId("Lansky-id-1");
		proxy1.setName("Lansky");
		proxy1.setDeptId(dept.getDeptId());
		
		UserProxy proxy2 = new UserProxy(new User());
		proxy2.setUserId("Lansky-id-2");
		proxy2.setName("Lansky");
		proxy2.setDeptId(dept.getDeptId());
		
		List<UserInterface> proxyList = new ArrayList<UserInterface>();
		proxyList.add(proxy1);
		proxyList.add(proxy2);
		
		return proxyList;
	}
}
