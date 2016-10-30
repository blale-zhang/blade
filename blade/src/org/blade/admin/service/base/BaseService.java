/**
 * 
 */
package org.blade.admin.service.base;

import org.blade.admin.entity.base.BaseEntity;

/**
 * @author blade
 *
 */
public interface BaseService<T extends BaseEntity<String>> {

	public int save(T entity);

	public int updateById(T id);

	public T queryById(String id);
	
	public int deleteById(String id);

}
