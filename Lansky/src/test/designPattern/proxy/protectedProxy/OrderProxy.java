package test.designPattern.proxy.protectedProxy;

public class OrderProxy implements OrderApi {
	
	Order realOrderObj = null;
	boolean isLoad = false;
	
	private Order reLoad(OrderApi obj) {
		//模拟从数据库中取出所有字段数据
		Order order = new Order();
		order.setAmount(obj.getUsername(), "230");
		order.setCreateTime(obj.getUsername(), "2016-10-28");
		order.setOrderId(obj.getOrderId());
		order.setUsername(obj.getUsername());
		isLoad = true;
		System.out.println("reload execute...");
		return order;
	}
	
	public OrderProxy(Order order) {
		this.realOrderObj = order;
	}
	@Override
	public String getOrderId() {
		return realOrderObj.getOrderId();
	}

	@Override
	public void setOrderId(String orderId) {
		this.realOrderObj.setOrderId(orderId);

	}

	@Override
	public String getAmount() {
		if (!isLoad) {
		realOrderObj = reLoad(this);
		}
		return realOrderObj.getAmount();
	}

	@Override
	public String getCreateTime() {
		if (!isLoad) {
			realOrderObj = reLoad(this);
		}
		return realOrderObj.getCreateTime();
	}
	@Override
	public void setAmount(String username, String amount) {
		if (this.realOrderObj.getUsername().equals(username)) {
			this.realOrderObj.setAmount(username, amount);
		} else {
			System.out.println(username + "没有权限修改订单金额");
		}
	}
	@Override
	public void setCreateTime(String username, String createTime) {
		if (this.realOrderObj.getUsername().equals(username)) {
			this.realOrderObj.setCreateTime(username, createTime);
		} else {
			System.out.println(username + "没有权限修改订单生成时间");
		}
	}

	@Override
	public String getUsername() {
		return this.realOrderObj.getUsername();
	}
	
	public void setUsername(String username) {
		this.realOrderObj.setUsername(username);
	}

}
