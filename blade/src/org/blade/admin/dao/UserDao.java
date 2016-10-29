package org.blade.admin.dao;

import org.blade.admin.entity.sys.User;

public interface UserDao {

	public User queryById(String id);
}
