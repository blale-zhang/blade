/**
 * 
 */
package org.blade.admin.entity.biz;

import org.blade.admin.entity.base.BaseEntity;

/**
 * @author blade
 *
 */
public class Goods extends BaseEntity<String> {

	private double price;
	
	private String name;
	
	private String picture;
	
	private long count;
	

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	
	
}
