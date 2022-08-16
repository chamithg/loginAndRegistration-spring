package com.codingdojo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.models.User;

public interface UserRepository extends CrudRepository <User,Long> {
	
	List <User> findByUserNameAndPassword(String userName, String password);
	Optional<User> findByEmail(String email);
	@SuppressWarnings("unchecked")
	User save(User user);
	

}
