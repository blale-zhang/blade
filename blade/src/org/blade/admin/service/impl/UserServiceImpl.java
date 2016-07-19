package org.blade.admin.service.impl;

import javax.annotation.Resource;

import org.blade.admin.entity.User;
import org.blade.admin.mapper.UserMapper;
import org.blade.admin.service.UserService;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public User findById(String id) {
		return userMapper.selectById(id);
	}
	
	@Override
	public User findUserAndRoleById(String id) {
		return userMapper.selectUserAndRoleById(id);
	}
	
	@Override
	public User findUserByNameAndPassword(String userName, String password) {
		return userMapper.selectUserByNameAndPwd(userName, password);
	}

}
