package org.blade.admin.entity.biz;

import org.blade.admin.entity.base.BaseEntity;

/**
 * 订单实体
 * @author blade
 *
 */
public class Order extends BaseEntity<String>{

	
	public static int STATUS_NEW = 1;
	public static int STATUS_FINISH = 99;
	
	public Order(){
		this.status = STATUS_NEW;
	}
	
	private double totalPrice ;
	
	private int status;
	
	private String userId;

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setFinish(){
		this.status = STATUS_FINISH;
	}
	
	
}
