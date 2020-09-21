package com.project.service.user;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.dao.user.UserDAO;
import com.project.model.user.UserEntity;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	UserDAO userdao;
	
	public UserEntity login(String email, String password){
		if(email == null || password == null)
			return null;
		
		UserEntity u = userdao.getUserByemail(email);
		u = userdao.getUserByupw(password);
		
		return u;
	}

	@Override
	public UserDetails loadUserByUsername(String uid) throws UsernameNotFoundException {
		Optional<UserEntity> userEntityWrapper = userdao.findById(uid);
		UserEntity userEntity = userEntityWrapper.get();
		
		
		return null;
	}

	public void register(UserEntity user) {
		// TODO Auto-generated method stub
		
	}

	public List<UserEntity> detail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	public void modify(UserEntity user) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int uid) {
		// TODO Auto-generated method stub
		
	}

	public List<UserEntity> findpw(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
