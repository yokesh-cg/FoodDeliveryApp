package com.cg.project.fooddeliveryapp.service;

import com.cg.project.fooddeliveryapp.entity.Login;

public interface ILoginService {
	public Login signIn(Login login);
	public Login signOut(Login login);

}
