/**
 * 
 */
package org.blade.admin.entity.biz;

import org.blade.admin.entity.base.BaseEntity;

/**
 * 商品项目
 * @author blade
 *
 */
public class Item extends BaseEntity<String> {
	/**
	 * 标记，给商品项目一个简单的描述
	 */
	private String remark;


	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
