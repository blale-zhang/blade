package org.blade.test.biz;

import java.util.Date;

import javax.annotation.Resource;

import org.blade.admin.entity.biz.Goods;
import org.blade.admin.service.biz.GoodsService;
import org.blade.utils.CodeUtils;

public class GoodsServicerTester {
	
	@Resource
	private GoodsService goodsService;
	
	private void testSave(){
		
		Goods goods = new Goods();
		goods.setCount(0);
		goods.setId(CodeUtils.generateUUID());
		goods.setUuid(CodeUtils.generateUUID());
		goods.setModifyTime(new Date());
		goods.setCreateTime(new Date());
		goods.setName("长T");
		goods.setPrice(10.8D);
		goods.setMerchant(CodeUtils.generateUUID());
		int i = goodsService.save(goods);
		assert i > 0;
	}
}
