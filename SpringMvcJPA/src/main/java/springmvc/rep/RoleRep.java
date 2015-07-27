package springmvc.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import springmvc.entity.Role;

public interface  RoleRep  extends JpaRepository<Role, Long>{

	Role findByName(String name);
}
