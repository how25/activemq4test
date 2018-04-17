package com.hout.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Resource
	private ProducerService producerService;

	@Test
	public void simpleSend(){
		producerService.sendMessage("study.queue.simple", "简单文本消息测试");
	}

	@Test
	public void ObjectSend(){
		TestMessage testMessage = new TestMessage();
		testMessage.setId(1);
		testMessage.setMsg("对象消息。。。");
		producerService.sendMessage("study.queue.object", testMessage);
	}

	@Test
	public void simpleTopicSend(){
		producerService.sendTopicMessage("study.topic.simple", "topic简单文本消息测试");
	}

}
