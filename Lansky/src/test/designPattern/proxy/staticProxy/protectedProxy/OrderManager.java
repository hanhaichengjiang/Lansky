package test.designPattern.proxy.staticProxy.protectedProxy;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
	public List<OrderProxy> getOrdersByUsername(String username) {
		OrderProxy pOrder1 = new OrderProxy(new Order());
		pOrder1.setOrderId("ORDER-ID-1");
		pOrder1.setUsername(username);
		
		List<OrderProxy> list = new ArrayList<OrderProxy>();
		list.add(pOrder1);
		return list;
	}
}
