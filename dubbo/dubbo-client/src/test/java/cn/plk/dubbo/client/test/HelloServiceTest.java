/**
 * 
 */
package cn.plk.dubbo.client.test;

import java.rmi.RemoteException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.plk.dubbo.api.HelloAPI;

/**
 * @author {康培亮/AB052634}
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/context.xml")
public class HelloServiceTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private HelloAPI dubboService;
	
	@Test
	public void rpcUse() throws RemoteException {
		
		String greeting = dubboService.greeting("dubbo");
		
		System.out.println("greeting = " + greeting);

	}

}
