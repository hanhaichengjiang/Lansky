package test.designPattern.builder.buildComplexObject;

import java.util.Date;

public class Client {
	public static void main(String[] args) {
		InsuranceContractBuilder builder = new InsuranceContractBuilder("Lansky", "man", "Tooble");
		InsuranceContract insuranceContract = builder.setBeginDate(new Date()).setOtherData(new Object()).build();
		insuranceContract.someOperations();
	}
}
