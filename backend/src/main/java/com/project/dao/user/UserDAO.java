package com.project.dao.user;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.model.user.UserEntity;

public interface UserDAO extends JpaRepository<UserEntity, String> {
	
	UserEntity getUserByemail(String email);
	UserEntity getUserByupw(String upw);

}
