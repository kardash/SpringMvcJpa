package springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import springmvc.entity.Role;
import springmvc.rep.RoleRep;
import springmvc.service.RoleService;

public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleRep rr;
	
	@Override
	public Role addRole(Role role) {
		return rr.save(role);
	}

	@Override
	public Role findByName(String name) {
		return rr.findByName(name);
	}

	@Override
	public void deleteRole(String name) {
	 rr.delete(findByName(name).getId());;
	}

}
