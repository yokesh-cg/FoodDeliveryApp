package com.cg.project.fooddeliveryapp.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.fooddeliveryapp.entity.Login;
import com.cg.project.fooddeliveryapp.repository.LoginRepository;

@Service
public class ILoginServiceImpl implements ILoginService{

	@Autowired
	private LoginRepository iLoginRepository;
	
	@Override
	public Login signIn(String userName, String password) {
		// TODO Auto-generated method stub	
		if(iLoginRepository.signIn(userName, password) == null) {
			throw new EntityNotFoundException("User Not Found");
		}
		return iLoginRepository.signIn(userName, password);
	}

	@Override
	public Login signUp(Login login) {
		// TODO Auto-generated method stub
		return iLoginRepository.save(login);
	}
	

}
