package test.designPattern.proxy.protectedProxy;

public interface OrderApi {
	public String getOrderId();
	public String getAmount();
	public String getCreateTime();
	public String getUsername();
	public void setOrderId(String orderId);
	public void setAmount(String username, String amount);
	public void setCreateTime(String username, String createTime);
}
