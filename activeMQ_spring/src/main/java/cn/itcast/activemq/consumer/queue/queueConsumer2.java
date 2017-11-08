package cn.itcast.activemq.consumer.queue;

import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * activeMQ整合Sping的queue消费者类
 *
 * @author 张欠 ，13227060107
 * @version 2.0 ，2017-11-4 11:02:55
 */
@Service
public class queueConsumer2 implements MessageListener{
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            System.out.println("消费者QueueConsumer1获取消息:" + textMessage.getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
