package test.designPattern.proxy.protectedProxy;

import java.util.List;

/** 
 * @ClassName: Client 
 * @Description: protected proxy
 * @author Lansky
 * @date 2016年10月28日 下午2:49:51 
 *  
 */
public class Client {
	public static void main(String[] args) {
		OrderManager manager = new OrderManager();
		List<OrderProxy> list = manager.getOrdersByUsername("Lansky");
		OrderApi order = list.get(0);
		
		System.out.println(order.getOrderId());
		System.out.println(order.getUsername());
		System.out.println(order.getAmount());
		System.out.println(order.getCreateTime());
		
		order.setCreateTime("licheng", "2016-01-01");
		order.setCreateTime("Lansky", "2016-02-02");
		System.out.println("修改订单时间之后...." + order.getCreateTime());
	}
}
