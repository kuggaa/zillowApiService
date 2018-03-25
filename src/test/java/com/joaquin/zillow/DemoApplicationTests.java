package com.joaquin.zillow;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.joaquin.zillow.controller.ZillowController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=ZillowController.class)
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
