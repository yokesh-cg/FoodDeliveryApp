package com.cg.project.fooddeliveryapp.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.project.fooddeliveryapp.entity.Login;
import com.cg.project.fooddeliveryapp.service.ILoginService;



@Controller
@RequestMapping("/api/fooddelivery")
public class ILoginController {

	@Autowired
	ILoginService iLoginService;
	
	
	@PostMapping("/signin")
	public Login signIn(@RequestBody Login login) {
		return iLoginService.signIn(login);

	}
	
	@PostMapping("/signout")
	public Login signOut(@RequestBody Login login) {
		return iLoginService.signOut(login);
	}
}
