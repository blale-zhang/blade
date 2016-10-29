/**
 * 
 */
package org.blade.admin.entity.biz;

import org.blade.admin.entity.base.BaseEntity;

/**
 * @author blade
 *
 */
public class OrderDetail extends BaseEntity<String> {

	private double price;
	
	private String orderId;
	
	private String goodsId;
	
	private long count;
	
}
