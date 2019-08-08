package com.github.fish.redis;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.ValueOperations;

import java.util.List;

public class CrudTest extends RedisApplicationTests {
    @Test
    public void string(){
        ValueOperations<String, String> valueOperations =
                stringRedisTemplate.opsForValue();

        valueOperations.set("key0001", "value0001");

        String value0001  = valueOperations.get("key0001");
        System.out.println(value0001);
        Assert.assertEquals(value0001, "value0001");
    }

    @Test
    public void list(){
        ListOperations<String, String> listListOperations =
                stringRedisTemplate.opsForList();

        for (int i = 0; i < 3; i++) {
            listListOperations.leftPush("listKey", "value" + i);
        }

        Assert.assertTrue( listListOperations.size("listKey") == 3);

        for (int i = 0; i < 3; i++) {
            System.out.println(listListOperations.rightPop("listKey"));
        }
    }
}
