package test.designPattern.builder.commonBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/** 
 * @ClassName: Client 
 * @Description: extract common part of steps with builder
 * @author Lansky
 *  
 */
public class Client {
	public static void main(String[] args) {
		TxtBuilder txtBuilder = new TxtBuilder();
		Director director = new Director(txtBuilder);
		
		BodyDataMetal bodyDataMetal1 = new BodyDataMetal();
		bodyDataMetal1.setPrice(2.0000);
		bodyDataMetal1.setProductCode("YYYYYYY");
		bodyDataMetal1.setProductName("product1");
		bodyDataMetal1.setWeight(2.010);
		
		BodyDataMetal bodyDataMetal2 = new BodyDataMetal();
		bodyDataMetal2.setPrice(2.1111);
		bodyDataMetal2.setProductCode("UUUUUU");
		bodyDataMetal2.setProductName("product2");
		bodyDataMetal2.setWeight(2.010);
		
		Collection<BodyDataMetal> coll0 = new ArrayList<BodyDataMetal>();
		coll0.add(bodyDataMetal1);
		coll0.add(bodyDataMetal2);
		
		BodyDataMetal bodyDataMetal3 = new BodyDataMetal();
		bodyDataMetal3.setPrice(2.222);
		bodyDataMetal3.setProductCode("IIIII");
		bodyDataMetal3.setProductName("product3");
		bodyDataMetal3.setWeight(2.010);
		
		Collection<BodyDataMetal> coll2 = new ArrayList<BodyDataMetal>();
		coll2.add(bodyDataMetal3);
		
		Map<String, Collection<BodyDataMetal>> bodyData = new HashMap<String, Collection<BodyDataMetal>>();
		bodyData.put("table1", coll0);
		bodyData.put("table2", coll2);
		
		HeaderDataMetal headerData = new HeaderDataMetal();
		headerData.setDate(new Date());
		headerData.setLinkUrl("www.github.com");
		headerData.setTitle("Chengge da ce shi");
		
		FooterDataMetal footerData = new FooterDataMetal();
		footerData.setAuthor("Lansky");
		footerData.setMail("Lansky@yahoo.cn");
		footerData.setRightDeclaration("All Right reserved by Lansky");
		
		director.construct(bodyData, headerData, footerData);
		String txtFileContent = txtBuilder.getResult();
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		Director director2 = new Director(xmlBuilder);
		director2.construct(bodyData, headerData, footerData);
		String xmlFileContent = xmlBuilder.getResult();
		
		System.out.println(txtFileContent);
		System.out.println("########################################");
		System.out.println(xmlFileContent);
	}
}
