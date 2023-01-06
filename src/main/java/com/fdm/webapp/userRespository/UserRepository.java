package com.fdm.webapp.userRespository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdm.webapp.user.User;

public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByName(String name);

	User findByUserID(int UserID);

}
