package springmvc.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import springmvc.entity.User;

public interface UserRep extends JpaRepository<User, Long>{

	User findByLogin(String login);
	User findByPassword(String password);
}
