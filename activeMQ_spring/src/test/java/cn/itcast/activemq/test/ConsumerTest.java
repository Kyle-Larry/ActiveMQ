package cn.itcast.activemq.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * activeMQ整合Spring的consumer测试类
 *
 * @author 张欠 ，13227060107
 * @version 2.0 ，2017-11-4 11:11:37
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-mq-consumer.xml")
public class ConsumerTest {

	@Test
	public void testConsumerMessage() {
		while (true) {
			// junit退出，防止进程死掉
		}
	}
}
