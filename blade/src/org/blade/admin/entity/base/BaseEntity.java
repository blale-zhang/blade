package org.blade.admin.entity.base;

import java.util.Date;

/**
 * 基础实体
 * @author blade
 *
 * @param <ID>
 */
public class BaseEntity<ID> {

	/**
	 * id
	 */
	private ID id;
	
	/**
	 * 记录生成时间
	 */
	private Date createTime;
	
	/**
	 * 记录修改时间
	 */
	private Date modifyTime;
	
	/**
	 * uuid
	 */
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
