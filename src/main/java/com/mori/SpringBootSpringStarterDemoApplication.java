package com.mori;

import com.mori.context.component.UserRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.lang.reflect.Field;

@SpringBootApplication
@MapperScan("com.mori.mapper")
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebMvc
public class SpringBootSpringStarterDemoApplication {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootSpringStarterDemoApplication.class, args);
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        Field singletonObjects = DefaultSingletonBeanRegistry.class.getDeclaredField("singletonObjects");
        singletonObjects.setAccessible(true);
        /*Map<String, Object> map = (Map<String, Object>) singletonObjects.get(beanFactory);
        map.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });*/
        /*System.out.println(context.getEnvironment().getProperty("java_home"));
        System.out.println(context.getEnvironment().getProperty("server.port"));*/
        context.getBean(UserRegister.class).register(1);
    }

}
