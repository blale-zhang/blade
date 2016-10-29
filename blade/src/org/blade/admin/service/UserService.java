package org.blade.admin.service;

import org.blade.admin.entity.sys.User;

/**
 * 
 * @author blade
 *
 */
public interface UserService {

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public User findById(String id);
	
	/**
	 * 根据id查询用户，角色
	 * @param id
	 * @return
	 */
	public User findUserAndRoleById(String id);
	
	/**
	 * 根据用户名与密码查询
	 * @param userName
	 * @param password
	 * @return
	 */
	public User findUserByNameAndPassword(String userName,String password);
	
}
