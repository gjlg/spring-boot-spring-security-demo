package com.mori.context.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author yun_kai
 * @date 2022年07月21日, 0021
 */
@Component
@Slf4j
public class UserRegister {

    @Autowired
    private ApplicationEventPublisher context;
    private Integer type;

    public void register(Integer type) {
        this.type = type;
        log.info("用户注册");
        context.publishEvent(new UserRegisteredEvent(this));
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}
