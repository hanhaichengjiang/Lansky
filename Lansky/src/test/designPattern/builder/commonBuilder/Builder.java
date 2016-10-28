package test.designPattern.builder.commonBuilder;

import java.util.Collection;
import java.util.Map;

public interface Builder {
	public Builder buildHeader(HeaderDataMetal data);
	public Builder buildBody(Map<String, Collection<BodyDataMetal>> data);
	public Builder buildFooter(FooterDataMetal data);
}
