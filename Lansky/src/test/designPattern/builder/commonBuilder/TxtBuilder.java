package test.designPattern.builder.commonBuilder;

import java.util.Collection;
import java.util.Map;

public class TxtBuilder implements Builder {
	
	private StringBuffer buf = new StringBuffer();
	
	public Builder buildHeader(HeaderDataMetal data) {
		if (data != null) {
			buf.append(data.getLinkUrl() + data.getTitle() + data.getDate() + "\r\n");
		}
		return this;
	}

	public Builder buildBody(Map<String, Collection<BodyDataMetal>> data) {
		if (data != null) {
			for (String key : data.keySet()) {
				buf.append("tableName: " + key + "\r\n");
				Collection<BodyDataMetal> coll = data.get(key);
				for (BodyDataMetal metal : coll) {
					double price = metal.getPrice();
					String productCode = metal.getProductCode();
					String productName = metal.getProductName();
					buf.append("price-" + price + "..." + "productCode-" + productCode + "..." + "productName" + productName + "\r\n");
				}
			}
		}
		
		return this;
	}

	public Builder buildFooter(FooterDataMetal data) {
		if (data != null) {
			buf.append(data.getAuthor() + data.getMail() + data.getRightDeclaration() + "\r\n");
		}
		return this;
	}
	
	public String getResult() {
		return buf.toString();
	}

}
