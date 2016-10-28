package test.designPattern.builder.commonBuilder;

import java.util.Collection;
import java.util.Map;

public class XmlBuilder implements Builder {

	StringBuffer buf = new StringBuffer();
	
	public Builder buildHeader(HeaderDataMetal data) {
		buf.append("<price>" + data.getLinkUrl() + "</price>")
				.append("<productCode>" + data.getTitle() + "</productCode>")
				.append("<productName>" + data.getDate() + "</productName>");
		return this;
	}

	public Builder buildBody(Map<String, Collection<BodyDataMetal>> data) {
		if (data != null) {
			for (String key : data.keySet()) {
				buf.append("<tableName>" + key + "</tableName>");
				Collection<BodyDataMetal> coll = data.get(key);
				for (BodyDataMetal metal : coll) {
					String productCode = metal.getProductCode();
					double price = metal.getPrice();
					double weight = metal.getWeight();
					buf.append("<productCode>" + productCode + "</productCode>" + "<price>" + price + "</price>" + "<weight>" + weight + "</weight>");
				}
			}
		}

		return this;
	}

	public Builder buildFooter(FooterDataMetal data) {
		buf.append("<author>" + data.getAuthor() + "</author>").append("<mail>" + data.getMail() + "</mail>")
				.append("<rightDeclaration>" + data.getRightDeclaration() + "</rightDeclaration>");
		return this;
	}
	
	public String getResult() {
		return buf.toString();
	}

}
