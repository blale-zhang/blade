/**
 * 
 */
package org.blade.admin.service.impl;

import javax.annotation.Resource;

import org.blade.admin.entity.Role;
import org.blade.admin.mapper.RoleMapper;
import org.blade.admin.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * @author blade
 *
 */
@Service("RoleService")
public class RoleServiceImpl implements RoleService {

	@Resource 
	private RoleMapper roleMapper;
	
	@Override
	public Role queryById(Long id) {
		return roleMapper.selectById(id);
	}

	@Override
	public int save(Role role) {
		return roleMapper.insert(role);
	}

	@Override
	public int removeById(Long id) {
		return roleMapper.deleteById(id);
	}

}
