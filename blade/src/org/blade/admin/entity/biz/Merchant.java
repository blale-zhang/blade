/**
 * 
 */
package org.blade.admin.entity.biz;

import org.blade.admin.entity.base.BaseEntity;

/**
 * 商户
 * @author blade
 *
 */
public class Merchant extends BaseEntity<String> {

	private String name;
	
	private int level;
	
	private int vip;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getVip() {
		return vip;
	}

	public void setVip(int vip) {
		this.vip = vip;
	}
	
	
	
}
