package test.designPattern.proxy.dynamicProxy;

import test.designPattern.proxy.staticProxy.protectedProxy.Order;
import test.designPattern.proxy.staticProxy.protectedProxy.OrderApi;

/** 
 * @ClassName: Client 
 * @Description: 这里的例子不能看出动态代理的好处。一般来说，在invoke方法里面可以添加一些功能，比如日志、事务控制
 * @author Lansky
 * @date 2016年10月28日 下午5:14:23 
 *  
 */
public class Client {
	public static void main(String[] args) {
		Order order = new Order();
		order.setOrderId("ORDER-ID-1");
		order.setUsername("Lansky");
		/*OrderApi proxyOrder = (OrderApi) Proxy.newProxyInstance(OrderApi.class.getClassLoader(), new Class[]{OrderApi.class}, new DynamicProxy(order));*/
		OrderApi proxy2 = new DynamicProxy().getProxyInterface(OrderApi.class, order);
		System.out.println(proxy2.getUsername());
		proxy2.setAmount("hanhaichengjiang", "321");
	}
}
