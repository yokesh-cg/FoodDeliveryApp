package com.cg.project.fooddeliveryapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.project.fooddeliveryapp.entity.Login;
import com.cg.project.fooddeliveryapp.repository.ILoginRepository;

@Service
public class ILoginServiceImpl implements ILoginService{

	@Autowired
	private ILoginRepository iLoginRepository;
	
	@Override
	public Login signIn(Login login) {
		// TODO Auto-generated method stub	
		return iLoginRepository.save(login);
	}

	@Override
	public Login signOut(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

}
