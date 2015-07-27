package springmvc.service;

import java.util.List;

import springmvc.entity.User;

public interface UserService {
	
   public User addUser(User user);
   public void deleteUser(String login);
   public User findByLogin(String login);
   public User findByPassword(String password);
   public List<User> findAll();
}
