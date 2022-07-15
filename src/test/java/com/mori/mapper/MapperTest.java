package com.mori.mapper;

import com.mori.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author yun_kai
 * @date 2022年07月15日, 0015
 */
@Slf4j
@SpringBootTest
class MapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserMapper() {
        List<User> users = userMapper.selectList(null);
        log.info("users:{}", users);
    }
}
