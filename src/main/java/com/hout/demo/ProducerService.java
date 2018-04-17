package com.hout.demo;

public interface ProducerService {
    /**
     * 发送queue文本消息
     * @param destination
     * @param message
     */
    public void sendMessage(String destinationName,String message);
    /**
     * 发送queue对象消息
     * @param destinationName
     * @param testMessage
     */
    public void sendMessage(String destinationName,TestMessage testMessage);
    /**
     * 发送topic文本消息
     * @param destinationName
     * @param message
     */
    public void sendTopicMessage(String destinationName, String message);
}
