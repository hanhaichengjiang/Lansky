package test.designPattern.mediator.generalMediator;

public class Client {
	public static void main(String[] args) {
		User user1 = new User();
		user1.setName("Lansky1");
		user1.setUserId("Lansky-id-1");
		
		User user2 = new User();
		user2.setName("Lansky2");
		user2.setUserId("Lansky-id-2");
		
		User user3 = new User();
		user3.setName("Lansky3");
		user3.setUserId("Lansky-id-3");
		
		User user4 = new User();
		user4.setName("Lansky4");
		user4.setUserId("Lansky-id-4");
		
		Dept dept1 = new Dept();
		dept1.setDeptId("Tencent");
		
		Dept dept2 = new Dept();
		dept2.setDeptId("360");
		
		//在这里创建mediator对象是为了下面打印信息
		DeptUserMediator mediator = DeptUserMediator.INSTANCE;
		mediator.showDeptsOnUser(user1);
		mediator.showDeptsOnUser(user2);
		mediator.showDeptsOnUser(user3);
		mediator.showDeptsOnUser(user4);
		
		mediator.showUsersAtDept(dept1);
		mediator.showUsersAtDept(dept2);
		
		System.out.println("============================");
		user1.deleteUser();
		mediator.showUsersAtDept(dept1);
		
		/*dept1.deleteDept();
		mediator.showDeptsOnUser(user1);*/
	}
}
