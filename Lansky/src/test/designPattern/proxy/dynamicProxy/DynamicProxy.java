package test.designPattern.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import test.designPattern.proxy.staticProxy.protectedProxy.Order;
import test.designPattern.proxy.staticProxy.protectedProxy.OrderApi;

public class DynamicProxy implements InvocationHandler {
	
	private Order order = null;
	
	/*public DynamicProxy(Order realObj) {
		this.order = realObj;
	}*/
	
	/** 
	 * @Description: 获取代理对象--比较通用
	 * @param T：返回对象用什么接口去接住它
	 * @param realObj : 被代理对象
	 * @return T
	 */
	@SuppressWarnings("unchecked")
	public <T extends OrderApi> T getProxyInterface(Class<T> t, Order realObj) {
		this.order = realObj;
		T proxy = (T) Proxy.newProxyInstance(t.getClassLoader(), realObj.getClass().getInterfaces(), this);
		return proxy;
	}
	
	public OrderApi getProxyInterface(Order realObj) {
		this.order = realObj;
		OrderApi proxy = (OrderApi) Proxy.newProxyInstance(OrderApi.class.getClassLoader(), realObj.getClass().getInterfaces(), this);
		return proxy;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] objs) throws Throwable {
		
		return method.invoke(order, objs);
	}

}
