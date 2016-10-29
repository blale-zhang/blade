package org.blade.admin.entity.sys;

import org.blade.admin.entity.base.BaseEntity;

public class Role extends BaseEntity<Long>{

	private String name;
	
	private int type;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
