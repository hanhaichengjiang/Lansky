package test.designPattern.builder.buildComplexObject;

import java.util.Date;

public class InsuranceContract {
	private String name;
	private String sex;
	private String company;
	private Date beginDate;
	private Date endDate;
	private Object otherData;
	
	public InsuranceContract(InsuranceContractBuilder builder) {
		this.name = builder.getName();
		this.sex = builder.getSex();
		this.company = builder.getCompany();
		this.beginDate = builder.getBeginDate();
		this.endDate = builder.getEndDate();
		this.otherData = builder.getOtherData();
	}
	
	public void someOperations() {
		System.out.println("print xml or txt file which include..." + this.name + this.sex + this.company);
	}
}
