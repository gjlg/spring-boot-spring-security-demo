package com.mori.context.component;

import org.springframework.context.ApplicationEvent;

/**
 * @author yun_kai
 * @date 2022年07月21日, 0021
 */
public class UserRegisteredEvent extends ApplicationEvent {

    public UserRegisteredEvent(Object source) {
        super(source);
    }
}
