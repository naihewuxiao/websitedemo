package com.jialin.websitedemo;

import com.jialin.websitedemo.model.User;
import com.jialin.websitedemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebsitedemoApplicationTests {

	@Resource
	private UserService userService;
	@Test
	public void contextLoads() {
	}

	@Test
	public void queryTest() {
	}

}
