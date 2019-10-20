package com.atguigu.boot.activemq.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

/**
 * 配置类
 * Program Name: activemq
 * Created by yanlp on 2019-10-19
 *
 * @author yanlp
 * @version 1.0
 */
@Component
@EnableJms //此注解表示,开启JMS适配的注解
public class ConfigBean {

    @Value("${mytopic}")
    private String myTopic;

    @Bean
    public Topic topic() {
        return new ActiveMQTopic(myTopic);
    }

}
