package springmvc.service;

import springmvc.entity.Role;

public interface RoleService {

	Role addRole(Role role);
	Role findByName(String name);
	void deleteRole(String name);
}
