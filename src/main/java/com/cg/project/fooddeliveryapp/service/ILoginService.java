package com.cg.project.fooddeliveryapp.service;

import com.cg.project.fooddeliveryapp.entity.Login;

public interface ILoginService {
	public Login signIn(String userName, String password);
	public Login signUp(Login login);

}
