/**
 * 
 */
package org.blade.admin.service;

import org.blade.admin.entity.Role;

/**
 * @author blade
 *
 */
public interface RoleService {

	public Role queryById(Long id);
	
	public int save(Role role);
	
	public int removeById(Long id);
	
}
