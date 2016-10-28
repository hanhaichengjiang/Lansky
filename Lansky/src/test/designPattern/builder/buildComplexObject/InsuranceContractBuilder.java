package test.designPattern.builder.buildComplexObject;

import java.util.Date;

public class InsuranceContractBuilder {
	private String name;
	private String sex;
	private String company;
	private Date beginDate;
	private Date endDate;
	private Object otherData;
	
	public InsuranceContract build() {
		//validate properties you need here
		if (name == null) {
			System.out.println("name is null");
		}
		return new InsuranceContract(this);
	}
	
	//appoint three properties are needed
	public InsuranceContractBuilder(String name, String sex, String company) {
		this.name = name;
		this.sex = sex;
		this.company = company;
	}
	
	public String getName() {
		return name;
	}
	public InsuranceContractBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public String getSex() {
		return sex;
	}
	public InsuranceContractBuilder setSex(String sex) {
		this.sex = sex;
		return this;
	}
	public String getCompany() {
		return company;
	}
	public InsuranceContractBuilder setCompany(String company) {
		this.company = company;
		return this;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public InsuranceContractBuilder setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
		return this;
	}
	public Date getEndDate() {
		return endDate;
	}
	public InsuranceContractBuilder setEndDate(Date endDate) {
		this.endDate = endDate;
		return this;
	}
	public Object getOtherData() {
		return otherData;
	}
	public InsuranceContractBuilder setOtherData(Object otherData) {
		this.otherData = otherData;
		return this;
	}
}
