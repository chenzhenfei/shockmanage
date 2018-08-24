package com.shock.psm.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shock.psm.dao.TestDao;
import com.shock.psm.domain.Num;

@Service("numberServiceImpl")
public class NumberServiceImpl implements NumberService {

	@Autowired
	private TestDao testDao;
	
	@Override
	public Num findNum() {
		return testDao.findById();
	}

	@Override
	@Transactional
	public void addNum(Num num) {
		 testDao.addNum(num);
	}

	@Override
	public int updateNum(Num num) {
		 return testDao.updateNum();
	}

	@Override
	public int deleteNumByid(String id) {
		return testDao.deleteNumByid(id);
	}

	@Override
	public List<Num> findAll() {
		return testDao.findAll();
	}

}
