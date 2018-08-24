package com.shock.psm.dao;

import java.util.List;

import com.shock.psm.domain.Num;

/**
 * 测试dao 接口
 * date: 2018年7月17日 下午2:35:26 <br/>  
 * @author czf
 * @version
 */
public interface TestDao {
	 public Num findById();

	public int updateNum();

	public int deleteNumByid(String id);

	public void addNum(Num num);

	public List<Num> findAll();
}
