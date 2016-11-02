/**
 * 
 */
package org.blade.admin.application;

import java.util.Date;

import javax.annotation.Resource;

import org.blade.admin.entity.biz.OrderDetail;
import org.blade.admin.service.biz.OrderDetailService;
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
public class OrderDetailController {

	@Resource
	private OrderDetailService orderDetailService;

	@RequestMapping("/biz/orderDetail/save")
	public String save(OrderDetail orderDetail) {
		OrderDetail orderDetail1 = new OrderDetail();
		orderDetail1.setCount(10);
		orderDetail1.setId(CodeUtils.generateUUID());
		orderDetail1.setUuid(CodeUtils.generateUUID());
		orderDetail1.setModifyTime(new Date());
		orderDetail1.setCreateTime(new Date());
		orderDetail1.setGoodsId(CodeUtils.generateUUID());
		orderDetail1.setPrice(10.8D);
		orderDetail1.setOrderId(CodeUtils.generateUUID());
		int i = orderDetailService.save(orderDetail1);
		return "{\"msg\":\"保存成功\",\"code\":\"1\"}";
	}

	@RequestMapping("/biz/orderDetail/update")
	public String update() {
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setCount(101);
		orderDetail.setId("53c949bf-6408-4e2b-8ffd-e881a02c90dc");
		orderDetail.setModifyTime(new Date());
		orderDetail.setOrderId(CodeUtils.generateUUID());
		orderDetail.setPrice(9.8D);
		orderDetail.setOrderId(CodeUtils.generateUUID());
		int i = orderDetailService.updateById(orderDetail);
		return "{\"msg\":\"保存成功\",\"code\":\"1\"}";
	}

	/**
	 * 查询
	 * @return
	 */
	@RequestMapping("/biz/orderDetail/query")
	public OrderDetail query() {
		return orderDetailService.queryById("53c949bf-6408-4e2b-8ffd-e881a02c90dc");
	}
}
