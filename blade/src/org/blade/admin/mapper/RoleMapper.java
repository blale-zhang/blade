/**
 * 
 */
package org.blade.admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.blade.admin.entity.Role;

/**
 * @author blade
 *
 */
@Mapper
public interface RoleMapper {

	public Role selectById(Long id);
	
	public int deleteById(Long id);
	
	public int insert(Role role);
}
