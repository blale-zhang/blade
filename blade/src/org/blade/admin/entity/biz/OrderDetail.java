/**
 * 
 */
package org.blade.admin.entity.biz;

import org.blade.admin.entity.base.BaseEntity;

/**
 * 订单详情
 * @author blade
 *
 */
public class OrderDetail extends BaseEntity<String> {

	/**
	 * 单价
	 */
	private double price;
	
	/**
	 * 订单
	 */
	private Order order;
	
	/**
	 * 商品
	 */
	private Goods goods;
	
	/**
	 * 数量
	 */
	private long count;
	
	/**
	 * 详情总价
	 */
	private double detailTotalPrice;
	
	/**
	 * 获取详情总价
	 * @return
	 */
	public double getDetailTotalPrice() {
		return detailTotalPrice;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}
	
	public void setOrderId(String id){
		
		this.order = new Order();
		this.order.setId(id);
	}
	
	public void setGoodsId(String id){
		this.goods = new Goods();
		this.goods.setId(id);
	}
	
}
