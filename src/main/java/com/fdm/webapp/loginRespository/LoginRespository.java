package com.fdm.webapp.loginRespository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fdm.webapp.login.Login;

@Repository
public interface LoginRespository extends JpaRepository<Login, Long> {
	
	List<Login> findByUsername(String username);

	Login findByLoginID(long loginID);

}
