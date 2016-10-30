/**
 * 
 */
package org.blade.admin.application;

import java.util.Date;

import javax.annotation.Resource;

import org.blade.admin.entity.biz.Goods;
import org.blade.admin.service.biz.GoodsService;
import org.blade.utils.CodeUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author blade
 *
 */
@RestController
@Configuration
public class GoodsController {

	@Resource
	private GoodsService goodsService;

	@RequestMapping("/biz/goods/save")
	public String save(Goods goods) {
		goods = new Goods();
		goods.setCount(0);
		goods.setId(CodeUtils.generateUUID());
		goods.setUuid(CodeUtils.generateUUID());
		goods.setModifyTime(new Date());
		goods.setCreateTime(new Date());
		goods.setName("长T");
		goods.setPrice(10.8D);
		goods.setMerchant(CodeUtils.generateUUID());
		int i = goodsService.save(goods);
		return "{\"msg\":\"保存成功\",\"code\":\"1\"}";
	}

	@RequestMapping("/biz/goods/update")
	public String update() {
		Goods goods = new Goods();
		// goods.setCount(200);
		goods.setId("627592ec-2416-477f-823d-20b47c5ffa0f");
		goods.setUuid("627592ec-2416-477f-823d-20b47c5ffa0f");
		goods.setModifyTime(new Date());
		goods.setName("长T");
		goods.setPrice(123.8D);
		goods.setMerchant(CodeUtils.generateUUID());
		int i = goodsService.updateById(goods);
		return "{\"msg\":\"保存成功\",\"code\":\"1\"}";
	}

	/**
	 * 查询
	 * @return
	 */
	@RequestMapping("/biz/goods/query")
	public Goods query() {
		return goodsService.queryById("627592ec-2416-477f-823d-20b47c5ffa0f");
	}
}
