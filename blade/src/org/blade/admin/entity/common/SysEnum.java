package org.blade.admin.entity.common;

import org.blade.admin.entity.base.BaseEntity;

/**
 * 
 * @author blade
 *
 */
public class SysEnum extends BaseEntity<String>{

	private int type;
	
	private String name;
	
	private int value;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
