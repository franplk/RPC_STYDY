package cn.plk.dubbo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author {康培亮/AB052634}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/dubbo.xml")
public class Server extends AbstractJUnit4SpringContextTests {

	@Test
	public void startServer() throws Exception {
		System.in.read();
	}

}
