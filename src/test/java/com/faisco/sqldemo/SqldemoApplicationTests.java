package com.faisco.sqldemo;

import com.faisco.sqldemo.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SqldemoApplicationTests {
	@Autowired
	private RedisService redisService;

	@Test
	public void contextLoads() {
		boolean set = redisService.set("testLiwen", "hello");
		System.out.println(set);
	}

}
