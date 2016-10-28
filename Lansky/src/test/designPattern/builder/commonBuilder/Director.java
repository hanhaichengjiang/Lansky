package test.designPattern.builder.commonBuilder;

import java.util.Collection;
import java.util.Map;

public class Director {
	private Builder builder;
	public Director(Builder builder) {
		this.builder = builder;
	}
	public void construct(Map<String, Collection<BodyDataMetal>> bodyData, HeaderDataMetal headerData, FooterDataMetal footerData) {
		builder.buildHeader(headerData);
		builder.buildBody(bodyData);
		builder.buildFooter(footerData);
	}
}
