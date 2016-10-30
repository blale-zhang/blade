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
	
	private Date createTime;
	
	private Date modifyTime;
	
	private String uuid;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
}
