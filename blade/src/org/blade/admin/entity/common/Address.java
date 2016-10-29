/**
 * 
 */
package org.blade.admin.entity.common;

import org.blade.admin.entity.base.BaseEntity;

/**
 * @author blade
 *
 */
public class Address extends BaseEntity<String> {

	
	private String country;
	
	private String province;
	
	private String area;
	
	private String userId;
	
	private String detailAddress;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDetailAddress() {
		return detailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	
	
}
