/**
 * 
 */
package org.blade.admin.service.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.blade.admin.entity.biz.OrderDetail;
import org.blade.admin.mapper.biz.OrderDetailMapper;
import org.blade.admin.service.biz.OrderDetailService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 订单详情service
 * 提供订单详情相关的业务操作
 * @author blade
 *
 */
@Service
public class OrderDetailServiceImpl implements OrderDetailService {

	@Resource
	private OrderDetailMapper orderDetailMapper;
	
	/* (non-Javadoc)
	 * @see org.blade.admin.service.base.BaseService#save(org.blade.admin.entity.base.BaseEntity)
	 */
	@Override
	@Transactional
	public int save(OrderDetail entity) {
		return orderDetailMapper.insert(entity);
	}

	/* (non-Javadoc)
	 * @see org.blade.admin.service.base.BaseService#updateById(org.blade.admin.entity.base.BaseEntity)
	 */
	@Override
	@Transactional
	public int updateById(OrderDetail entity) {
		return orderDetailMapper.updateById(entity);
	}

	/* (non-Javadoc)
	 * @see org.blade.admin.service.base.BaseService#queryById(java.lang.String)
	 */
	@Override
	public OrderDetail queryById(String id) {
		
		return orderDetailMapper.selectById(id);
	}

	/* (non-Javadoc)
	 * @see org.blade.admin.service.base.BaseService#deleteById(java.lang.String)
	 */
	@Override
	@Transactional
	public int deleteById(String id) {
		return orderDetailMapper.deleteById(id);
	}

	@Override
	@Transactional
	public int batchSave(List<OrderDetail> entities) {
		return orderDetailMapper.batchInsert(entities);
	}

}
