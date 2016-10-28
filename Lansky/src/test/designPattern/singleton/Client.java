package test.designPattern.singleton;

import org.junit.Test;

public class Client {
	@Test
	public void testClient() {
		Singleton2 s2 = Singleton2.INSTANCE;
		s2.method1();
		s2.method2();
		s2.method3();
		s2.method4();
	}
}
