package test.designPattern.proxy.virtualProxy;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		Dept dept = new Dept();
		dept.setDeptId("Tencent");
		UserManager userManager = new UserManager();
		List<UserInterface> list = userManager.getUserListByDept(dept);
		UserInterface user1 = list.get(0);
		System.out.println(user1.getUserId());
		System.out.println(user1.getName());
		System.out.println(user1.getDeptId());
		System.out.println(user1.getSex());
		System.out.println(user1.getJob());
		System.out.println(user1.getAddress());
		
		System.out.println("#############################");
		
		UserInterface user2 = list.get(1);
		System.out.println(user2.getUserId());
		System.out.println(user2.getName());
		System.out.println(user2.getDeptId());
		System.out.println(user2.getSex());
		System.out.println(user2.getJob());
		System.out.println(user2.getAddress());
	}
}
