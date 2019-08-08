package com.github.fish.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

    /**
     * key value 都是字符串的
     */
    @Autowired
    protected StringRedisTemplate stringRedisTemplate;

    /**
     * key value 都是对象的
     */
    @Autowired
    protected RedisTemplate redisTemplate;

    @Test
    public void contextLoads() {
    }

}
