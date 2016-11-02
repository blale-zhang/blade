/**
 * 
 */
package org.blade.admin.service.biz.impl;

import javax.annotation.Resource;

import org.blade.admin.entity.biz.Goods;
import org.blade.admin.mapper.biz.GoodsMapper;
import org.blade.admin.service.biz.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <h1>商品业务逻辑</h1>
 * <h3>提供商品信息的增删查改，上架，下架等业务操作</h3>
 * @version 1.0
 * @author blade
 *
 */
@Service
public class GoodsServiceImpl implements GoodsService {

	@Resource
	private GoodsMapper goodsMapper;
	
	/* (non-Javadoc)
	 * @see org.blade.admin.service.base.BaseService#save(org.blade.admin.entity.base.BaseEntity)
	 */
	@Override
	@Transactional
	public int save(Goods entity) {
		return goodsMapper.insert(entity);
	}

	/* (non-Javadoc)
	 * @see org.blade.admin.service.base.BaseService#updateById(java.lang.String)
	 */
	@Override
	@Transactional
	public int updateById(Goods entity) {
		return goodsMapper.updateById(entity);
	}

	/* (non-Javadoc)
	 * @see org.blade.admin.service.base.BaseService#queryById(java.lang.String)
	 */
	@Override
	public Goods queryById(String id) {
		return goodsMapper.selectById(id);
	}

	/* (non-Javadoc)
	 * @see org.blade.admin.service.base.BaseService#deleteById(java.lang.String)
	 */
	@Override
	@Transactional
	public int deleteById(String id) {
		return goodsMapper.deleteById(id);
	}

}
