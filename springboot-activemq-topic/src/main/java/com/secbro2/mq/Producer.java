package com.secbro2.mq;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.Topic;

/**
 * @author sec
 * @version 1.0
 * @date 2020/8/17
 **/
@Component
public class Producer {

	@Resource
	private JmsMessagingTemplate jmsMessagingTemplate;

	@Resource
	private Topic topic;

	public void sendTopic(String msg) {
		System.out.println("发送Topic消息内容 :" + msg);
		this.jmsMessagingTemplate.convertAndSend(this.topic, msg);
	}

}
