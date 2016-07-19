package org.blade.admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.blade.admin.entity.User;

@Mapper
public interface UserMapper {

	/**
	 * 
	 * @param id
	 * @return
	 */
	public User selectById(String id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public User selectUserAndRoleById(String id);
	
	/**
	 * 
	 * @param name
	 * @param pwd
	 * @return
	 */
	public User selectUserByNameAndPwd(@Param("name")String name, @Param("pwd")String pwd);
}
