package org.blade.admin.entity.sys;

import org.blade.admin.entity.base.BaseEntity;

/**
 * 
 * @author blade
 *
 */
public class User extends BaseEntity<Long>{

	/**
	 * 
	 */
	public static final String NAME = User.class.getName();
	
	private Integer sex;

	private String password;

	private String name;

	private Integer age;

	private Role role;

	private Integer type;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

}
