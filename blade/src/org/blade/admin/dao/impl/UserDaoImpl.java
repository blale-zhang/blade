package org.blade.admin.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.blade.admin.dao.UserDao;
import org.blade.admin.entity.sys.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Resource
	private SqlSession sqlSession;
	
	@Override
	public User queryById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
