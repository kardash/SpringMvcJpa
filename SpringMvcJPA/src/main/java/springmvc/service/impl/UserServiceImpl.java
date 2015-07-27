package springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springmvc.entity.Role;
import springmvc.entity.User;
import springmvc.rep.RoleRep;
import springmvc.rep.UserRep;
import springmvc.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
 @Autowired
 private UserRep ur;
 @Autowired
 private RoleRep rr;

@Override
public User addUser(User user) {
    if (rr.findByName("user")==null) {
		Role r = new Role("user");
		user.setRole(r);
		rr.save(r);
		return ur.save(user);
	}else{
		user.setRole(rr.findByName("user"));
	return ur.save(user);}
}

@Override
public User findByLogin(String login) {

	return ur.findByLogin(login);
}

@Override
public User findByPassword(String password) {
	return ur.findByPassword(password);
}

@Override
public List<User> findAll() {
	return ur.findAll();
}

@Override
public void deleteUser(String login) {
 ur.delete(findByLogin(login).getId());

}
 
 
}
