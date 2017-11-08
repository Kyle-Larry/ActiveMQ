package cn.itcast.activemq.producer.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * activeMQ整合Spring的queue生产者
 *
 * @author 张欠 ，13227060107
 * @version 2.0 ，2017-11-4 10:47:40
 */
@Service
public class TopicSender {

    // 注入jmsTemplate
    @Autowired
    @Qualifier("jmsTopicTemplate")
    private JmsTemplate jmsTemplate;

    public void send(String topicName, final String message){
        jmsTemplate.send(topicName, new MessageCreator() {

            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        });
    }
}
