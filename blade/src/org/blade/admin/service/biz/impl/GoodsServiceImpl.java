/**
 * 
 */
package org.blade.admin.service.biz.impl;

import javax.annotation.Resource;

import org.blade.admin.entity.biz.Goods;
import org.blade.admin.mapper.biz.GoodsMapper;
import org.blade.admin.service.biz.GoodsService;
import org.springframework.stereotype.Service;

/**
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
	public int save(Goods entity) {
		return goodsMapper.insert(entity);
	}

	/* (non-Javadoc)
	 * @see org.blade.admin.service.base.BaseService#updateById(java.lang.String)
	 */
	@Override
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
	public int deleteById(String id) {
		return goodsMapper.deleteById(id);
	}

}
