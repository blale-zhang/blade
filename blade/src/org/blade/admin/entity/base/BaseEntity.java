package org.blade.admin.entity.base;

import java.util.Date;

/**
 * 
 * @author blade
 *
 * @param <ID>
 */
public class BaseEntity<ID> {

	private ID id;
	
	private Date createDate;
	
	private Date modifyDate;
	
	private String uuid;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
}
