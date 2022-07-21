package com.mori.context.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author yun_kai
 * @date 2022年07月21日, 0021
 */
@Component
@Slf4j
public class SendListener {

    @EventListener
    public void listener(UserRegister userRegister) {
        final Integer messageType = 1;
        final Integer emailType = 2;
        Integer type = userRegister.getType();
        if (messageType.equals(type)) {
            sendMessage();
        } else if(emailType.equals(type)) {
            sendEmail();
        }
        log.info("发送消息");
    }

    public void sendMessage() {
        log.info("发送消息");
    }

    public void sendEmail() {
        log.info("发送邮件");
    }

}
