package com.shock.psm.transactional;


import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shock.psm.dao.TestDao;
import com.shock.psm.domain.Num;
import com.shock.psm.services.NumberService;
import com.shock.psm.test.BaseJunit4Test;


@Transactional
public class TransactionalTest  extends BaseJunit4Test{
	private Logger log =Logger.getLogger(TransactionalTest.class);
	
	@Autowired
	private NumberService numberService;
	@Autowired
	private TestDao testDao;
	
	/**
	 * 隔离级别
	 */
	@Transactional(propagation=Propagation.REQUIRED) 
	public void methodA(){
		Num num =new Num();
		num.setNum(10000);
		numberService.addNum(num);
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void methodB(){
		log.info("开始");
		Num num =new Num();
		num.setNum(4000);
		System.out.println(numberService.findAll().size());
		testDao.addNum(num);
		System.out.println(numberService.findAll().size());
		System.out.println("methodB");
	}
	

}
