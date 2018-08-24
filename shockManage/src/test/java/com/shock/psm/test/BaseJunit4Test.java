package com.shock.psm.test;

import javax.transaction.Transactional;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class) //spring-test junit4 测试
@ContextConfiguration(locations={
		"classpath*:/applicationContext.xml",
		"file:src/main/webapp/WEB-INF/cxf-servlet.xml",
		"file:src/main/webapp/WEB-INF/spring-mvc.xml"}
		)
@Transactional
public class BaseJunit4Test {
	
	/** 测试git
	**/
}
