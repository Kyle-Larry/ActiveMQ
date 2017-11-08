package cn.itcast.activemq.test;

import cn.itcast.activemq.producer.queue.QueueSender;
import cn.itcast.activemq.producer.topic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * activeMQ整合Spring的producer测试类
 *
 * @author 张欠 ，13227060107
 * @version 2.0 ，2017-11-4 10:52:44
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-mq.xml")
public class ProducerTest {

    /** queue生产者对象 */
    @Autowired
    private QueueSender queueSender;

    /** topic生产者对象 */
    @Autowired
    private TopicSender topicSender;

    @Test
    public void testSendMessage(){
        queueSender.send("spring_queue", "你好，spring-queue");
        topicSender.send("spring_topic","你好，spring-topic");
    }
}
