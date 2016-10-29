package org.blade.admin.mapper.base;

import java.util.List;

import org.blade.admin.entity.base.BaseEntity;

/**
 * 
 * @author blade
 *
 * @param <ID>
 * @param <T>
 */
public interface BeseMapper<ID,T extends BaseEntity<ID>> {

	
	public T selectById(ID id);
	
	public List<T> select(T entity);
	
	public int insert(T entity);
	
	public int batchInsert(List<T> entities);
	
	public int deleteById(ID id);
	
	public int update(T entity);
	
	public int batchUpdate(List<T> entities);
	
	
}
