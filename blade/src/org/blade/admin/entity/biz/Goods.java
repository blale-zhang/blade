/**
 * 
 */
package org.blade.admin.entity.biz;

import java.util.List;

/**
 * @author blade
 *
 */
public class Goods extends Item {

	private double price;
	
	private String name;
	
	private List<GoodsPicture> goodsPictures;
	
	private long count;
	
	private String merchant;
	
	

	public String getMerchant() {
		return merchant;
	}

	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

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

	public List<GoodsPicture> getGoodsPictures() {
		return goodsPictures;
	}

	public void setGoodsPictures(List<GoodsPicture> goodsPictures) {
		this.goodsPictures = goodsPictures;
	}

}
