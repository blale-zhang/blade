/**
 * 
 */
package org.blade.admin.entity.biz;

import org.blade.admin.entity.base.BaseEntity;

/**
 * 商品图片
 * @author blade
 *
 */
public class GoodsPicture extends  BaseEntity<String> {

	private String goodsId;

	private String id;
	
	private Picture pic;

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Picture getPic() {
		return pic;
	}

	public void setPic(Picture pic) {
		this.pic = pic;
	}
	
	
}
