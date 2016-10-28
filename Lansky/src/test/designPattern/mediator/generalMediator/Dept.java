package test.designPattern.mediator.generalMediator;

public class Dept {
	private String deptId;
	private String deptName;
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	//delete a department
	public boolean deleteDept() {
		DeptUserMediator mediator = DeptUserMediator.INSTANCE;
		return mediator.deleteDept(this);
	}
}
