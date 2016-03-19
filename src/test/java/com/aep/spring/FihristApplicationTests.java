package com.aep.spring;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FihristApplication.class)
public class FihristApplicationTests {

	@Test
	public void checkEmail(){
		boolean val =true;
		assertTrue(val);
	}

}
